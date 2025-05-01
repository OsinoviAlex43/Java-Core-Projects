package osinovii.develop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddToFile {
    public void addToFile(Student student) {
        try (FileWriter fileWriter = new FileWriter("File")) {
            fileWriter.write(student.toString());
            fileWriter.write("\n");
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }


}
