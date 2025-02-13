public class Book{
    private String title;
    private String author;
    private int id;
    private boolean isBorrowed;
    
    public Book(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.isBorrowed = false;
    }

    public boolean borrow(){
        if(isBorrowed)
            return false;
        isBorrowed = true;
        return true;
    }

    public boolean returnBook(){
        if(isBorrowed){
            isBorrowed =  false;
            System.out.println("Return book successfully");
            return true;
        }
        else{
            System.out.println("This book is not borrowed");
            return false;
        }
    }

    public String getTittle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }

    public int getID(){
        return id;
    }
    @Override
    public String toString() {
        String status = isBorrowed ? "Borrowed" : "Available";
        return title + " - " + author + " - " + id + " - " + status;
    }
}
