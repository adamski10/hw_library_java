import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int getBorrowedBooks(){
        return this.collection.size();
    }

    public void borrowBook(Book book, Library library){
       if(library.lendBook(book) != null) {
           this.collection.add(book);
       }
    }

}
