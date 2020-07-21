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

    public String addBook(Book newBook){
        if(getStockCount() < this.capacity){
            this.bookStock.add(newBook);
            return "Book added successfully";
        }else
            return "Stock full";
    }

    public Boolean checkIfBookInStock(Book bookToCheck){
        for(Book book : this.bookStock){
            if(book == bookToCheck) {
                return true;
            }

        }
        return false;
    }

    public Book lendBook(Book bookToLend) {
        if(checkIfBookInStock(bookToLend) == true){
            int index = this.bookStock.indexOf(bookToLend);
            this.bookStock.remove(index);
            return bookToLend;
        }else
            return null;
    }

}
