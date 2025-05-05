package osinovii.develop.io;

import osinovii.develop.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static osinovii.develop.constants.Constants.STUDENT_FILE;

public class FileHandler {

    /**
     * Creates or clears the student data file.
     */
    public void createFile() throws IOException {
        try (FileWriter fileWriter = new FileWriter(STUDENT_FILE)) {
            // Empty file
        }
    }

    /**
     * Appends a student record to the file.
     */
    public void addStudent(Student student) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(STUDENT_FILE, true))) {
            bufferedWriter.write(student.toString());
            bufferedWriter.newLine();
        }
    }

    public List<Student> readStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        File file = new File(STUDENT_FILE);
        if (!file.exists()) {
            return students;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    Student student = new Student();
                    student.setLastname(parts[0]);
                    student.setGroupNumber(Integer.parseInt(parts[1]));
                    student.setPhysicsGrade(Double.parseDouble(parts[2]));
                    student.setMathGrade(Double.parseDouble(parts[3]));
                    student.setInformaticsGrade(Double.parseDouble(parts[4]));
                    student.calculateAverageScore();
                    students.add(student);
                }
            }
        }
        return students;
    }

    public void writeResults(List<Student> students, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }


}
