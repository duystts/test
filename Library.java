import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    private List<User> users;
    public Library(){
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No book in library");
        }
        else{
            for(Book i: books){
                System.out.println(i);
            }
        }
    }

    public void displayUser(){
        if(users.isEmpty()){
            System.out.println("No one use ur library haha");
        }
        else{
            for(User i: users){
                System.out.println(i);
            }
        }
    }
    public Book findBookByID(int id){
        for(Book i: books){
            if(i.getID() == id){
                return i;
            }
        }
        return null;
    }

    public User findUserByNumberphone(String number){
        for(User i: users){
            if(i.getPhoneNumber().equals(number)){
                return i;
            }
        }
        return null;
    }
}
