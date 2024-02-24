import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    char grade;

    // Constructor for Subject class
    Subject() {
        subjectMarks = 0;
        credits = 0;
        grade = ' ';
    }
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject[] subjects;

    // Constructor for Student class
    Student() {
        name = "";
        usn = "";
        SGPA = 0.0;
        s = new Scanner(System.in);
        subjects = new Subject[8]; // Assuming there are 8 subjects
        for (int i = 0; i < 8; i++) {
            subjects[i] = new Subject();
        }
    }

    // Method to get student details (name and usn)
    void getStudentDetails() {
        System.out.print("Enter student name: ");
        name = s.nextLine();
        System.out.print("Enter student USN: ");
        usn = s.nextLine();
    }

    // Method to get marks and credits for each subject
    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter details for Subject " + (i + 1));
            System.out.print("Enter marks: ");
            subjects[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits: ");
            subjects[i].credits = s.nextInt();

            // Simple grading logic (adjust as needed)
            if (subjects[i].subjectMarks >= 40) {
                if (subjects[i].subjectMarks >= 90) {
                    subjects[i].grade = 'A';
                } else if (subjects[i].subjectMarks >= 80) {
                    subjects[i].grade = 'B';
                } else {
                    subjects[i].grade = 'C';
                }
            } else {
                subjects[i].grade = 'F';
            }
        }
    }

    // Method to compute SGPA
    void computeSGPA() {
        double totalCredits = 0.0;
        double weightedGradePoints = 0.0;

        for (int i = 0; i < 8; i++) {
            totalCredits += subjects[i].credits;
            switch (subjects[i].grade) {
                case 'A':
                    weightedGradePoints += 4.0 * subjects[i].credits;
                    break;
                case 'B':
                    weightedGradePoints += 3.0 * subjects[i].credits;
                    break;
                case 'C':
                    weightedGradePoints += 2.0 * subjects[i].credits;
                    break;
                // Add more cases as needed for other grades
            }
        }

        // Avoid division by zero
        if (totalCredits > 0) {
            SGPA = weightedGradePoints / totalCredits;
        } else {
            System.out.println("Error: Total credits is zero.");
        }
    }

    // Display student details and SGPA
    void displayResult() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }
}

public class lab2 {
    public static void main(String[] args) {
        // Create a new student object
        Student s1 = new Student();

        // Call methods to get details, marks, and compute SGPA
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();

        // Display the result
        s1.displayResult();
    }
}
