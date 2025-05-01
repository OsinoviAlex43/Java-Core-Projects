package osinovii.develop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddToFile {
    public void addToFile(Student student) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("File",true))) {
            bufferedWriter.write(student.toString());
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }


}
