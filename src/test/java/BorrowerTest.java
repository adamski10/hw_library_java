import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before(){
    borrower = new Borrower();
    library = new Library(2);
    book1 = new Book("The Book of Joy", "Dalai Lama", "Other");
    book2 = new Book("Clean Code", "Robert C. Martin", "Programming");
    book3 = new Book("Introduction to algorithms", "Thomas H. Cormen", "Programming" );
    library.addBook(book1);
    library.addBook(book2);
    }


    @Test
    public void canBorrowBookIfBookInStock(){
        borrower.borrowBook(book1, library);
        assertEquals(1, borrower.getBorrowedBooks());
    }

    @Test
    public void canNotBorrowBookIfBookNotInStock(){
        borrower.borrowBook(book3, library);
        assertEquals(0, borrower.getBorrowedBooks());
    }


}
