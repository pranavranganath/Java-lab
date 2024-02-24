package CIE;
import java.util.Scanner;

public class Internals extends Student {
    protected int marks[] = new int[5];

    // Method to input CIE marks
    public void inputCIEmarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CIE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = scanner.nextInt();
        }
    }
}
