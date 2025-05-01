package osinovii.develop;

import java.util.Scanner;

public class AddStudentValue {
    Scanner scanner = new Scanner(System.in);

    public void addStudentValue(Student student){
        System.out.println("Enter Student lastname,group number and 3 marks ");
        student.setLastname(scanner.nextLine());
        student.setGroupNumber(scanner.nextInt());
        student.setPhysicsGrade(scanner.nextDouble());
        student.setMathGrade(scanner.nextDouble());
        student.setInformaticsGrade(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Information successfully received");
        student.setAverageScore();
    }
}
