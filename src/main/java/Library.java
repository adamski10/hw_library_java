import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> bookStock;

    public Library(int capacity){
        this.capacity = capacity;
        this.bookStock = new ArrayList<Book>();
    }

    public int getStockCount(){
        return this.bookStock.size();
    }

    public String addBook(Book book){
        if(getStockCount() < this.capacity){
            this.bookStock.add(book);
            return "Book added successfully";
        }else
            return "Stock full";
    }

}
