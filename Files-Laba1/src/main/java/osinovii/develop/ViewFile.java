package osinovii.develop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViewFile {

    public void viewFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("File"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] param = line.split(",");
                System.out.println("Student: " + param[0]);
                System.out.println("Group number: " + param[1]);
                System.out.println("Physics: " + param[2]);
                System.out.println("Math: " + param[3]);
                System.out.println("Informatics: " + param[4]);
                System.out.println("Average score: " + param[5]);
                System.out.println("-------------------");
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
