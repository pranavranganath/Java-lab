package CIE;
import java.util.Scanner;

public class Student {
    protected String usn;
    public String name;
    protected int sem;

    // Method to input student details
    public void inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USN: ");
        this.usn = scanner.nextLine();
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Semester: ");
        this.sem = scanner.nextInt();
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("USN: " + this.usn);
        System.out.println("Name: " + this.name);
        System.out.println("Semester: " + this.sem);
    }
}
