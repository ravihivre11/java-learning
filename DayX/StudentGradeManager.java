package DayX;
import java.util.Scanner;

public class StudentGradeManager {

    static final int MAX_STUDENTS = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[MAX_STUDENTS];
        int[] grades = new int[MAX_STUDENTS];

        int studentCount = 0;
        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("     STUDENT GRADE MANAGER");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Find Highest Grade");
            System.out.println("5. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                System.out.print("Enter your choice: ");
            }

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    studentCount = addStudent(
                        sc, names, grades, studentCount
                    );
                    break;

                case 2:
                    viewStudents(names, grades, studentCount);
                    break;

                case 3:
                    calculateAverage(grades, studentCount);
                    break;

                case 4:
                    findHighest(names, grades, studentCount);
                    break;

                case 5:
                    System.out.println("Exiting Student Grade Manager.");
                    break;

                default:
                    System.out.println("Invalid choice! Select 1-5.");
            }

        } while (choice != 5);

        sc.close();
    }

    // Method to add a student
    static int addStudent(
            Scanner sc,
            String[] names,
            int[] grades,
            int studentCount) {

        if (studentCount >= names.length) {
            System.out.println("Student limit reached!");
            return studentCount;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return studentCount;
        }

        System.out.print("Enter grade (0-100): ");

        while (!sc.hasNextInt()) {
            System.out.println("Grade must be a number.");
            sc.next();
            System.out.print("Enter grade (0-100): ");
        }

        int grade = sc.nextInt();
        sc.nextLine();

        if (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100.");
            return studentCount;
        }

        names[studentCount] = name;
        grades[studentCount] = grade;
        studentCount++;

        System.out.println("Student added successfully!");

        return studentCount;
    }

    // Method to display all students
    static void viewStudents(
            String[] names,
            int[] grades,
            int studentCount) {

        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n--------- STUDENT LIST ---------");
        System.out.printf("%-5s %-20s %-10s%n",
                          "No.", "Name", "Grade");
        System.out.println("--------------------------------");

        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-5d %-20s %-10d%n",
                              i + 1, names[i], grades[i]);
        }
    }

    // Method to calculate the average grade
    static void calculateAverage(
            int[] grades,
            int studentCount) {

        if (studentCount == 0) {
            System.out.println("No grades available.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < studentCount; i++) {
            sum += grades[i];
        }

        double average = (double) sum / studentCount;

        System.out.printf("Average Grade: %.2f%n", average);
    }

    // Method to find the student with the highest grade
    static void findHighest(
            String[] names,
            int[] grades,
            int studentCount) {

        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        int highestIndex = 0;

        for (int i = 1; i < studentCount; i++) {
            if (grades[i] > grades[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("\n--------- TOP STUDENT ---------");
        System.out.println("Name  : " + names[highestIndex]);
        System.out.println("Grade : " + grades[highestIndex]);
    }
}
