# Template Pattern Game Loader Demo

This project demonstrates the **Template Method** design pattern in Java using a game loading scenario. The Template Method pattern defines the skeleton of an algorithm in a base class, allowing subclasses to override specific steps without changing the overall process.

## Structure

- `GameLoader.java`: Abstract base class defining the template method `loadGame()` and common steps for loading a game.
- `OfflineGameLoader.java`: Concrete subclass for loading a simple offline game. Implements graphics, assets, and configuration loading steps.
- `MMOGameLoader.java`: Concrete subclass for loading a complex online MMO game. Implements advanced graphics, asset streaming, network checks, and configuration loading.
- `TemplatePatternGameDemo.java`: Main class to run the demo, showing both offline and MMO game loading scenarios.
- `Class_Diagram.png`: UML diagram illustrating the class relationships and template pattern structure.

## How It Works

1. The `GameLoader` class provides the `loadGame()` method, which outlines the steps for loading any game:
    - Initialize graphics
    - Load assets
    - Load configuration
    - (Optional) Check network connection
    - Start the game
2. Subclasses (`OfflineGameLoader`, `MMOGameLoader`) override specific steps to provide game-specific behavior.
3. The demo (`TemplatePatternGameDemo`) runs both loaders, showing the output for each scenario.

## Usage

1. Compile all `.java` files:
   ```powershell
   javac *.java
   ```
2. Run the demo:
   ```powershell
   java TemplatePatternGameDemo
   ```

## Output Example

```
--- Scenario 1: Loading a Simple Offline Game ---
--- Starting Game Loading Process ---
  1. Initializing 2D renderer and basic audio system.
  2. Loading all sprites and level data from local disk cache.
  3. Reading local settings file (volume, difficulty, keybindings).
  5. Executing final startup script and launching main menu.
--- Game Ready! ---

--- Scenario 2: Loading a Complex Online MMO Game ---
--- Starting Game Loading Process ---
  1. Initializing high-end 3D engine, shader compilation, and Dolby audio.
  2. Streaming high-resolution textures and character models from CDN.
  3. Fetching user profile and game world instance ID from server API.
  4. Establishing secure socket connection and performing authentication handshake.
  5. Executing final startup script and launching main menu.
--- Game Ready! ---
```

