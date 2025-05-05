package osinovii.develop;

import osinovii.develop.io.FileHandler;
import osinovii.develop.model.Student;
import osinovii.develop.task.SolveTask;
import osinovii.develop.ui.AddStudentValue;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();
        SolveTask solveTask = new SolveTask();
        AddStudentValue addStudentValue = new AddStudentValue();

        int option = 0;

        System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");

        do {
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    fileHandler.createFile();
                    System.out.println("File was created");
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
                case 2:
                    Student student = new Student();
                    addStudentValue.addStudentValue(student);
                    fileHandler.addStudent(student);
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
                case 3:
                    fileHandler.readStudents().forEach(System.out::println);
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
                case 4:
                    solveTask.solveTask();
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect input");
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
            }
        } while (option != 5);


    }
}