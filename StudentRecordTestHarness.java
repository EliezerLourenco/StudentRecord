import java.util.Scanner;

/**
 * Test harness for the StudentRecord class.
 * Demonstrates the creation and display of student records.
 */
public class StudentRecordTestHarness {
    public static void main(String[] args) {
        // Creating the first student record
        StudentRecord studentOne = new StudentRecord("john", "smith", 45454545, 99);
        System.out.println("The student's first name is " + studentOne.getFirstName());
        System.out.println("The student's last name is " + studentOne.getLastName());
        System.out.println("The student's ID is " + studentOne.getStudentId());
        System.out.println("The student's grade is " + studentOne.getLetterGradeCourseOne());

        // Creating a second student record with user input
        Scanner input = new Scanner(System.in);
        StudentRecord studentTwo = new StudentRecord();

        System.out.println("\nenter first name (five letters): ");
        String firstName = input.nextLine();
        studentTwo.setFirstName(firstName);

        System.out.println("enter last name: ");
        String lastName = input.nextLine();
        studentTwo.setLastName(lastName);

        System.out.println("enter student ID: ");
        int studentId = input.nextInt();
        studentTwo.setStudentId(studentId);

        System.out.println("enter the grade: ");
        double gradeCourseOne = input.nextDouble();
        studentTwo.setGradeCourseOne(gradeCourseOne);

        // Closing the scanner
        input.close();

        // Printing second student's info
        System.out.println("\nThe student's first name is " + studentTwo.getFirstName());
        System.out.println("The student's last name is " + studentTwo.getLastName());
        System.out.println("The student's ID is " + studentTwo.getStudentId());
        System.out.println("The student's grade is " + studentTwo.getLetterGradeCourseOne());
        System.out.println("The number of vowels in the student's name is " + studentTwo.getVowelsNumber());
    }
}
