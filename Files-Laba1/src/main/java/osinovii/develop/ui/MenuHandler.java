package osinovii.develop.ui;

import osinovii.develop.constants.Constants;
import osinovii.develop.io.FileHandler;
import osinovii.develop.task.TaskSolver;

import java.io.IOException;
import java.util.Scanner;

public class MenuHandler {
    private final Scanner scanner;
    private final FileHandler fileHandler;
    private final StudentInputHandler inputHandler;
    private final TaskSolver taskSolver;

    public MenuHandler() {
        this.scanner = new Scanner(System.in);
        this.fileHandler = new FileHandler();
        this.inputHandler = new StudentInputHandler(scanner);
        this.taskSolver = new TaskSolver(scanner, fileHandler);
    }

    public void run() throws IOException {
        while (true) {
            System.out.println(Constants.MENU_TEXT);
            try {
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        fileHandler.createFile();
                        System.out.println("File created.");
                        break;
                    case 2:
                        fileHandler.addStudent(inputHandler.readStudent());
                        System.out.println("Student added.");
                        break;
                    case 3:
                        fileHandler.readStudents().forEach(System.out::println);
                        break;
                    case 4:
                        taskSolver.solveTask();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose 1-5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}