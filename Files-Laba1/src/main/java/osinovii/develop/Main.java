package osinovii.develop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("File");
        Scanner FileScanner = new Scanner(file);
        Scanner SystemScanner = new Scanner(System.in);
        int num_of_option = 0;
//        Student osinovi = new Student("osinovi",427702,10,10,10);
        System.out.println("Menu:\n1.CreateFile\n2.AddToFile\n3.ViewFile\n4.SolveTask\n5.Exit");
        do {
            num_of_option = SystemScanner.nextInt();
            switch (num_of_option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;

            }
        } while (num_of_option != 5);


    }
}