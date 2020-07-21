import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("The Book of Joy", "Dalai Lama", "Other");
        book2 = new Book("Clean Code", "Robert C. Martin", "Programming");
        book3 = new Book("Introduction to algorithms", "Thomas H. Cormen", "Programming" );
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void canNotAddBookIfStockFull(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals("Stock full", library.addBook(book3));
    }

    @Test
    public void canCheckIfBookIsInStock(){
        library.addBook(book1);
        assertEquals(true, library.checkIfBookInStock(book1));
    }

    @Test
    public void canCheckIfBookIsNotInStock(){
        library.addBook(book1);
        assertEquals(false, library.checkIfBookInStock(book2));
    }
    @Test
    public void canLendBookIfBookInStock() {
        library.addBook(book1);
        library.lendBook(book1);
        assertEquals(0, library.getStockCount());

    }

    @Test
    public void canNotLendBookIfBookNotInStock() {
        library.addBook(book1);
        assertEquals(null, library.lendBook(book2));

    }

}
