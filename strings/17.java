import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private int regNumber;
    private String fullName;
    private short semester;
    private float cgpa;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int regNumber, String fullName, short semester, float cgpa) {
        this.regNumber = regNumber;
        this.fullName = fullName;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    // Display method to print student record
    public void display() {
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }

    // Sort student records by CGPA
    public static void sortByCGPA(Student[] students) {
        Arrays.sort(students, Comparator.comparingDouble(Student::getCgpa).reversed());
    }

    // Sort student records by name
    public static void sortByName(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getFullName));
    }

    // Getter methods
    public int getRegNumber() {
        return regNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public short getSemester() {
        return semester;
    }

    public float getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array to store student records
        Student[] students = new Student[5];

        // Input student records
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Semester: ");
            short semester = scanner.nextShort();
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            // Create student object and add to array
            students[i] = new Student(regNumber, fullName, semester, cgpa);
        }

        // Displaying student records
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        // Sorting student records by CGPA
        sortByCGPA(students);
        System.out.println("\nStudent Records Sorted by CGPA:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        // Sorting student records by name
        sortByName(students);
        System.out.println("\nStudent Records Sorted by Name:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        scanner.close();
    }
}


