import java.util.Scanner;
public class QuanLiThuVien {
    public static void main(String[] args) {
        Library library =  new Library();
        Scanner sc =  new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. Add book");
            System.out.println("2. Delete book");
            System.out.println("3. Display books");
            System.out.println("4. Borrow book");
            System.out.println("5. Return book");
            System.out.println("6. Add user");
            System.out.println("7. Display users");
            System.out.println("8. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Book book = new Book(title, author, id);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter ID of the book to remove: ");
                    int idRemove = sc.nextInt();
                    Book bookRemove = library.findBookByID(idRemove);
                    if(bookRemove == null){
                        System.out.println("Book not found");
                    }
                    else{
                        library.removeBook(bookRemove);
                        System.out.println("Remove book successfully");
                    }
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter your number:");
                    String phoneNumber = sc.nextLine();
                    User user = library.findUserByNumberphone(phoneNumber);
                    if(user == null){
                        System.out.println("User not found");
                    }
                    else{
                        System.out.print("Enter ID of the book to borrow: ");
                        int idBorrow = sc.nextInt();
                        Book bookBorrow = library.findBookByID(idBorrow);
                        if(bookBorrow == null){
                            System.out.println("Book not found");
                        }
                        else{
                            user.borrowBook(bookBorrow);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter your number:");
                    String phoneNumberReturn = sc.nextLine();
                    User userReturn = library.findUserByNumberphone(phoneNumberReturn);
                    if(userReturn == null){
                        System.out.println("User not found");
                    }
                    else{
                        System.out.print("Enter ID of the book to return: ");
                        int idReturn = sc.nextInt();
                        Book bookReturn = library.findBookByID(idReturn);
                        if(bookReturn == null){
                            System.out.println("Book not found");
                        }
                        else{
                            userReturn.returnBook(bookReturn);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumberAdd = sc.nextLine();
                    User userAdd = new User(name, phoneNumberAdd);
                    library.addUser(userAdd);
                    break;
                case 7:
                    library.displayUser();
                    break;
                case 8:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again(1-8)");
            }
            System.out.println("Press Enter to continue...");
            sc.nextLine();
        }
    }
}
