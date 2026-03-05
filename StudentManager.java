import java.util.*;
import java.io.*;

public class StudentManager {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addStudent(scanner);
                    break;

                case 2:
                    listStudents();
                    break;

                case 3:
                    searchStudent(scanner);
                    break;

            }

        } while (choice != 4);

    }

    static void addStudent(Scanner scanner) {

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, course);

        students.add(student);

        System.out.println("Student added!");

    }

    static void listStudents() {

        for (Student s : students) {

            System.out.println(
                    s.getId() + " - " +
                    s.getName() + " (" +
                    s.getCourse() + ")"
            );

        }

    }

    static void searchStudent(Scanner scanner) {

        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(name)) {

                System.out.println("Found: " + s.getName());
                return;

            }

        }

        System.out.println("Student not found.");

    }

}
