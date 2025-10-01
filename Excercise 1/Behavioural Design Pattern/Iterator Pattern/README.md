# Iterator Pattern Demo

This project demonstrates the **Iterator Design Pattern** in Java using a simple book collection example.

## Structure
- `Book.java`: Represents a book with title and author.
- `BookCollection.java`: Stores an array of books and provides an iterator.
- `BookIterator.java`: Implements iteration logic for the book collection.
- `Container.java`: Generic interface for collections that can provide an iterator.
- `Iterator.java`: Generic iterator interface.
- `IteratorPatternDemo.java`: Main class. Accepts user input for books and iterates through the collection.
- `Class_Diagram.png`: UML diagram of the pattern (if provided).

## How It Works
1. **User Input**: The program prompts for the number of books, then for each book's title and author.
2. **Collection**: Books are stored in a fixed-size array in `BookCollection`.
3. **Iteration**: The custom iterator (`BookIterator`) is used to traverse the collection and print book details.

## How to Run
1. Compile all `.java` files:
   ```powershell
   javac *.java
   ```
2. Run the demo:
   ```powershell
   java IteratorPatternDemo
   ```
3. Follow the prompts to enter book details.

## Example Output
```
Enter number of books: 2
Enter details for book 1:
Title: The Alchemist
Author: Paulo Coelho
Enter details for book 2:
Title: 1984
Author: George Orwell
--- Starting Iteration ---
Found: Book [Title: The Alchemist, Author: Paulo Coelho]
Found: Book [Title: 1984, Author: George Orwell]
--- Iteration Complete ---
```

## Notes
- The collection size is fixed at the number of books entered.
- If you try to add more books than the specified number, an error message is shown.
- The iterator traverses all books in the collection.

## Design Pattern
This example follows the **Iterator Pattern**:
- **Iterator**: Provides a way to access elements of a collection sequentially without exposing its underlying representation.
- **Container**: Interface for collections that can return an iterator.

---
Created for educational purposes.
