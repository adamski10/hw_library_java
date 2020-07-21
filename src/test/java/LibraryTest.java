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

}
