// A program to calculate grades
class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input to create a Student object
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(name, marks);
        GradeCalculator gc = new GradeCalculator();

        // Compute the grade
        String grade = gc.calculateGrade(marks);

        // Display details and grade
        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
