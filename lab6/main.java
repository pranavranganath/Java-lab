import SEE.Externals;

public class Main {

    public static void main(String args[]) {

        int numOfStudents = 2;
        Externals finalMarks[] = new Externals[numOfStudents];

        // Input data for each student
        for (int i = 0; i < numOfStudents; i++) {
            finalMarks[i] = new Externals();
            finalMarks[i].inputStudentDetails();
            System.out.println("Enter CIE marks for " + finalMarks[i].name);
            finalMarks[i].inputCIEmarks();
            System.out.println("Enter SEE marks for " + finalMarks[i].name);
            finalMarks[i].inputSEEmarks();
        }

        System.out.println("Displaying data:\n");

        // Display final marks for each student
        for (int i = 0; i < numOfStudents; i++) {
            finalMarks[i].calculateFinalMarks();
            finalMarks[i].displayFinalMarks();
        }
    }
}
