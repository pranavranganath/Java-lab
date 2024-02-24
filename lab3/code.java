import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numPages;

    // Parameterized constructor
    public Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // toString() method
    public String toString() {
        String nameStr = "Book name: " + this.name + "\n";
        String authorStr = "Author name: " + this.author + "\n";
        String priceStr = "Price: " + this.price + "\n";
        String numPagesStr = "Number of pages: " + this.numPages + "\n";
        return nameStr + authorStr + priceStr + numPagesStr;
    }
}

public class lab3 {
    public static void main(String args[]) {
        System.out.println("Enter the number of books in record");
        Scanner s = new Scanner(System.in);
        int n;
        
        // Step 5: Read the number of books
        n = s.nextInt();

        // Step 6: Define array
        Book b[];

        b = new Book[n];

        // Step 7: Apply for loop from 0 to n
        for (int i = 0; i < n; i++) {
            // Read details for each book
            System.out.println("Enter details for Book " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = s.next();
            
            System.out.print("Author: ");
            String author = s.next();
            
            System.out.print("Price: ");
            int price = s.nextInt();
            
            System.out.print("Number of Pages: ");
            int numPages = s.nextInt();

            // Create a Book object and store it in the array
            b[i] = new Book(name, author, price, numPages);
        }

        // Step 8: Apply for loop from 0 to n and display book details
        System.out.println("\nDetails of the Books:");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }

        s.close();
    }
}
