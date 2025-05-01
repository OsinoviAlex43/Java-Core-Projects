package osinovii.develop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner SystemScanner = new Scanner(System.in);

        AddToFile addToFile = new AddToFile();
        CreateFile createFile = new CreateFile();
        SolveTask solveTask = new SolveTask();
        ViewFile viewFile = new ViewFile();
        AddStudentValue addStudentValue = new AddStudentValue();
        ArrayList<Student> students = new ArrayList<>();

        int num_of_option = 0;


        System.out.println("Menu:\n1.Create File\n2.Add to File\n3.View File\n4.Solve Task\n5.Exit");

        do {
            num_of_option = SystemScanner.nextInt();
            switch (num_of_option) {
                case 1:
                    createFile.createFile();
                    break;
                case 2:
                    Student student = new Student();
                    addStudentValue.addStudentValue(student);
                    addToFile.addToFile(student);
                    students.add(student);
                    break;
                case 3:
                    viewFile.viewFile();
                    break;
                case 4:
                    solveTask.solveTask();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        } while (num_of_option != 5);


    }
}