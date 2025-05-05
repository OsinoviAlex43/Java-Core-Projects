package osinovii.develop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SolveTask {
    Scanner scanner = new Scanner(System.in);

    public void solveTask() {
        System.out.println("Enter a group number");
        String groupName = scanner.nextLine();
        System.out.println("Enter the average score");
        double average_score_st = scanner.nextDouble();
        scanner.nextLine();
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("File"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] param = line.split(",");
                if (param[1].equals(groupName) && Double.parseDouble(param[5]) > average_score_st) {
                    count++;
                    System.out.println("Student: " + param[0]);
                    System.out.println("Group number: " + param[1]);
                    System.out.println("Physics: " + param[2]);
                    System.out.println("Math: " + param[3]);
                    System.out.println("Informatics: " + param[4]);
                    System.out.println("Average score: " + param[5]);
                    System.out.println("-------------------");
                }
            }
            if (count == 0) {
                System.out.println("There is no students with this parameters");
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
