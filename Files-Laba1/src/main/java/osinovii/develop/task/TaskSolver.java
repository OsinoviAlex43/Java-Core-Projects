package osinovii.develop.task;

import osinovii.develop.io.FileHandler;
import osinovii.develop.model.Student;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static osinovii.develop.constants.Constants.RESULT_FILE;

public class TaskSolver {
    private final Scanner scanner;
    private final FileHandler fileHandler;

    public TaskSolver(Scanner scanner, FileHandler fileHandler) {
        this.scanner = scanner;
        this.fileHandler = fileHandler;
    }

    public void solveTask() throws IOException {
        System.out.println("Enter group number:");
        String groupNumber = scanner.nextLine();
        System.out.println("Enter minimum average score:");
        double minAverageScore = readValidDouble();

        List<Student> students = fileHandler.readStudents();
        List<Student> filtered = students.stream()
                .filter(s -> String.valueOf(s.getGroupNumber()).equals(groupNumber))
                .filter(s -> s.getAverageScore() > minAverageScore)
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("No students found with the specified criteria.");
        } else {
            fileHandler.writeResults(filtered, RESULT_FILE);
            System.out.println("Results written to task_result.txt");
            filtered.forEach(System.out::println);
        }
    }

    private double readValidDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number:");
            }
        }
    }
}