import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("The Book of Joy", "Dalai Lama", "Other");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Book of Joy", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Dalai Lama", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Other", book.getGenre());
    }
}
