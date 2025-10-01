public class BookCollection implements Container<Book> {
    private Book[] books;
    private int numberOfBooks;
    int MAX_BOOKS;

    public BookCollection(int MAX_BOOKS) {
        books = new Book[MAX_BOOKS];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < MAX_BOOKS) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Collection is full. Cannot add " + book.getTitle());
        }
    }
    
    @Override
    public Iterator<Book> getIterator() {
        return new BookIterator(books);
    }
}