package osinovii.develop;

import osinovii.develop.io.FileHandler;
import osinovii.develop.model.Student;
import osinovii.develop.task.SolveTask;
import osinovii.develop.ui.StudentInputHandler;

import java.io.IOException;
import java.util.Scanner;

import static osinovii.develop.constants.Constants.MENU_TEXT;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();
        SolveTask solveTask = new SolveTask();
        StudentInputHandler inputHandler = new StudentInputHandler(new Scanner(System.in));

        int option = 0;

        System.out.println(MENU_TEXT);

        do {
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    fileHandler.createFile();
                    System.out.println("File was created");
                    System.out.println(MENU_TEXT);
                    break;
                case 2:
                    Student student = inputHandler.readStudent();
                    fileHandler.addStudent(student);
                    System.out.println(MENU_TEXT);
                    break;
                case 3:
                    fileHandler.readStudents().forEach(System.out::println);
                    System.out.println(MENU_TEXT);
                    break;
                case 4:
                    solveTask.solveTask();
                    System.out.println(MENU_TEXT);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect input");
                    System.out.println(MENU_TEXT);
                    break;
            }
        } while (option != 5);


    }
}