package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public final class EventLogger {
    private static final Logger LOGGER = Logger.getLogger("MarsRoverSystem");
    private static boolean initialized = false;

    private EventLogger() {}

    public static synchronized void initializeDefault() {
        if (initialized) {
            return;
        }
        try {
            Path logsDir = Paths.get("logs");
            if (!Files.exists(logsDir)) {
                Files.createDirectories(logsDir);
            }

            String date = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
            Path logFile = logsDir.resolve("app-" + date + ".log");

            LOGGER.setUseParentHandlers(false);
            LOGGER.setLevel(Level.FINE);

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.INFO);
            consoleHandler.setFormatter(createFormatter(false));
            LOGGER.addHandler(consoleHandler);

            FileHandler fileHandler = new FileHandler(logFile.toString(), true);
            fileHandler.setLevel(Level.FINE);
            fileHandler.setFormatter(createFormatter(true));
            LOGGER.addHandler(fileHandler);

            initialized = true;
        } catch (IOException e) {
            // Fallback to simple console logging
            LOGGER.setUseParentHandlers(true);
            LOGGER.log(Level.SEVERE, "Failed to initialize file logging", e);
        }
    }

    private static Formatter createFormatter(boolean withThread) {
        return new Formatter() {
            private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

            @Override
            public String format(LogRecord record) {
                String timestamp = sdf.format(new Date(record.getMillis()));
                String thread = withThread ? (" [" + Thread.currentThread().getName() + "]") : "";
                String message = formatMessage(record);
                String throwable = "";
                if (record.getThrown() != null) {
                    throwable = System.lineSeparator() + getStackTrace(record.getThrown());
                }
                return String.format("%s%s %-7s %s%s%n",
                        timestamp,
                        thread,
                        record.getLevel().getName(),
                        message,
                        throwable);
            }
        };
    }

    private static String getStackTrace(Throwable t) {
        StringBuilder sb = new StringBuilder();
        sb.append(t.toString()).append('\n');
        for (StackTraceElement el : t.getStackTrace()) {
            sb.append("\tat ").append(el.toString()).append('\n');
        }
        return sb.toString();
    }

    public static void debug(String message, Object... args) {
        log(Level.FINE, message, args);
    }

    public static void info(String message, Object... args) {
        log(Level.INFO, message, args);
    }

    public static void warn(String message, Object... args) {
        log(Level.WARNING, message, args);
    }

    public static void error(String message, Object... args) {
        log(Level.SEVERE, message, args);
    }

    public static void error(Throwable t, String message, Object... args) {
        if (!initialized) initializeDefault();
        LOGGER.log(Level.SEVERE, String.format(message, args), t);
    }

    private static void log(Level level, String message, Object... args) {
        if (!initialized) initializeDefault();
        if (LOGGER.isLoggable(level)) {
            String msg = args != null && args.length > 0 ? String.format(message, args) : message;
            LOGGER.log(level, msg);
        }
    }
}


