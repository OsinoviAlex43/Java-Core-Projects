package osinovii.develop.ui;

import osinovii.develop.model.Student;

import java.util.Scanner;

public class StudentInputHandler {
    private final Scanner scanner;

    public StudentInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student readStudent() {
        Student student = new Student();
        student.setLastname(readValidLastname());
        student.setGroupNumber(readValidGroupNumber());
        student.setPhysicsGrade(readValidGrade("Physics"));
        student.setMathGrade(readValidGrade("Math"));
        student.setInformaticsGrade(readValidGrade("Informatics"));
        student.calculateAverageScore();
        System.out.println("Student information successfully received.");
        return student;
    }

    private String readValidLastname() {
        while (true) {
            System.out.println("Enter student lastname:");
            String lastname = scanner.nextLine().trim();
            if (!lastname.isEmpty()) {
                return lastname;
            }
            System.out.println("Lastname cannot be empty.");
        }
    }

    private int readValidGroupNumber() {
        while (true) {
            System.out.println("Enter group number:");
            try {
                int groupNumber = Integer.parseInt(scanner.nextLine());
                if (groupNumber > 0) {
                    return groupNumber;
                }
                System.out.println("Group number must be positive.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private double readValidGrade(String subject) {
        while (true) {
            System.out.println("Enter " + subject + " grade (0-10):");
            try {
                double grade = Double.parseDouble(scanner.nextLine());
                if (grade >= 0 && grade <= 10) {
                    return grade;
                }
                System.out.println("Grade must be between 0 and 10.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}