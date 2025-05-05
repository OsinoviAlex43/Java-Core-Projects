package osinovii.develop.ui;

import osinovii.develop.model.Student;

import java.util.Scanner;

public class AddStudentValue {
    Scanner scanner = new Scanner(System.in);

    public void addStudentValue(Student student) {
        System.out.println("Enter Student lastname,group number and 3 marks ");
        student.setLastname(scanner.nextLine());

        while (true) {
            int groupNumber = scanner.nextInt();
            if ( groupNumber > 0) {
                 student.setGroupNumber(groupNumber);
                break;
            } else {
                System.out.println("Invalid value");
            }
        }

        while (true) {
            double physicsGrade = scanner.nextDouble();
            if (physicsGrade >= 0 && physicsGrade <= 10) {
                student.setPhysicsGrade(physicsGrade);
                break;
            } else {
                System.out.println("Invalid value");
            }
        }

        while (true) {
            double mathGrade = scanner.nextDouble();
            if (mathGrade >= 0 && mathGrade <= 10) {
                student.setMathGrade(mathGrade);
                break;
            } else {
                System.out.println("Invalid value");
            }
        }

        while (true) {
            double informaticsGrade = scanner.nextDouble();
            if (informaticsGrade >= 0 && informaticsGrade <= 10) {
                student.setInformaticsGrade(informaticsGrade);
                break;
            } else {
                System.out.println("Invalid value");
            }
        }
        scanner.nextLine();

        System.out.println("Information successfully received");
        student.calculateAverageScore();
    }
}
