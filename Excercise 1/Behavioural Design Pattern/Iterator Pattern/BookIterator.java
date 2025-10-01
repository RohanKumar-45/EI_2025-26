public class BookIterator implements Iterator<Book> {

    
    private Book[] bookList;
    private int index; 

    public BookIterator(Book[] bookList) {
        this.bookList = bookList;
        this.index = 0; 
    }

    @Override
    public boolean hasNext() {
        return index < bookList.length;
    }

    @Override
    public Book next() {
        if (this.hasNext()){
            
            return bookList[index++];
        }
        System.err.println("Error: No more elements to iterate.");
        return null;
    }
}
