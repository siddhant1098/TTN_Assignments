package assignment.java2;
import java.util.*;
public class Q1_LibraryManagement_System {
    public interface Library {
        void issueBooks();
        void returnBooks();
    }
    public static class Librarian implements Library {
        String name;
        int id;
        int bookscount;

        @Override
        public void issueBooks() {
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter number of books present : ");
            bookscount= sc.nextInt();
            System.out.println("Enter Book Name : ");
            name = sc.next();
            System.out.println("Enter Book Id : ");
            id = sc.nextInt();
            bookscount--;
            System.out.println("Total Books Issued: " + bookscount);
        }

        @Override
        public void returnBooks() {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Book Id : ");
            id = sc.nextInt();

            System.out.println("books returned successfully"+" "+"having book id " + id );
            bookscount++;
            System.out.println("Total Books Issued: " + bookscount);
        }


    }
    public static void main(String args[]) {
        Librarian librarian = new Librarian();
        do {
            System.out.println("MENU");
            System.out.println("1.Issue books");
            System.out.println("2.Return books");
            System.out.println("3.Exit");
            System.out.println("Enter choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    librarian.issueBooks();
                    break;
                case 2:
                    librarian.returnBooks();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }




}
