package osinovii.develop;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        AddToFile addToFile = new AddToFile();
        CreateFile createFile = new CreateFile();
        SolveTask solveTask = new SolveTask();
        ViewFile viewFile = new ViewFile();
        AddStudentValue addStudentValue = new AddStudentValue();

        int option = 0;

        System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");

        do {
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    createFile.createFile();
                    System.out.println("File was created");
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
                case 2:
                    Student student = new Student();
                    addStudentValue.addStudentValue(student);
                    addToFile.addToFile(student);
                    System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");
                    break;
                case 3:
                    viewFile.viewFile();
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