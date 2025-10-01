import java.util.Scanner;
public class IteratorPatternDemo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        BookCollection library = new BookCollection(n);

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for book " + i + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            library.addBook(new Book(title, author));
        }

        System.out.println("--- Starting Iteration ---");

        Iterator<Book> iterator = library.getIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Found: " + book);
        }

        System.out.println("--- Iteration Complete ---");
        scanner.close();

    }
}
