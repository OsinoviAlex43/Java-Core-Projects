package osinovii.develop;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void createFile() {
        try (FileWriter fileWriter = new FileWriter("File")) {
        } catch (IOException e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
