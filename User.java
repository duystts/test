import java.util.List;
import java.util.ArrayList;
public class User {
    private String name;
    private String phoneNumber;
    private List<Book> borrowedBooks;
    public User(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        borrowedBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public boolean borrowBook(Book book){
        if(book.borrow()){
            borrowedBooks.add(book);
            System.out.println("Borrow book successfully");
            return true;
        }
        else{
            System.out.println("This book is borrowed");
            return false;
        }

    }
    
    public boolean returnBook(Book book){
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            return true;
        }
        else{
            System.out.println("You don't borrow this book but thanks for ur book hehe:>");
            return false;
        }
    }
    @Override
    public String toString(){
        return name + " - " + phoneNumber;
    }
}
