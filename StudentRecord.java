/**
 * Represents a college student's record.
 * Stores basic student information and calculates the letter grade for a course.
 */
public class StudentRecord {
    private String firstName;
    private String lastName;
    private int studentId;
    private double gradeCourseOne;

    // Default constructor
    public StudentRecord() {
    }

    // Parameterized constructor
    public StudentRecord(String firstName, String lastName, int studentId, double gradeCourseOne) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gradeCourseOne = gradeCourseOne;
    }

    // Setters and getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setGradeCourseOne(double gradeCourseOne) {
        this.gradeCourseOne = gradeCourseOne;
    }

    public double getGradeCourseOne() {
        return gradeCourseOne;
    }

    // Method to convert numeric grade to letter grade
    public String getLetterGradeCourseOne() {
        if (gradeCourseOne >= 90) return "A";
        else if (gradeCourseOne >= 80) return "B";
        else if (gradeCourseOne >= 70) return "C";
        else if (gradeCourseOne >= 60) return "D";
        else if (gradeCourseOne >= 50) return "E";
        else return "F";
    }

    // Method to count the number of vowels in the first name (for names with exactly five letters)
    public int getVowelsNumber() {
        if (firstName.length() != 5) return 0;

        int vowelsNumber = 0;
        String lowerCaseName = firstName.toLowerCase();
        for (int i = 0; i < 5; i++) {
            char ch = lowerCaseName.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsNumber++;
            }
        }
        return vowelsNumber;
    }
}
