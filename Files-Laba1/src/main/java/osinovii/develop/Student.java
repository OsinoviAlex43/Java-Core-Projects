package osinovii.develop;

public class Student {
    
    /**
     * Represents a student with personal and academic information.
     */
    private String lastname;
    private int groupNumber;
    private double physicsGrade;
    private double mathGrade;
    private double informaticsGrade;
    private double averageScore;



    public Student() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getInformaticsGrade() {
        return informaticsGrade;
    }

    public void setInformaticsGrade(double informaticsGrade) {
        this.informaticsGrade = informaticsGrade;
    }

    public double getAverageScore() {
        return averageScore;
    }

    /**
     * Calculates the average score based on grades.
     */
    public void calculateAverageScore() {
        this.averageScore = (physicsGrade + mathGrade + informaticsGrade) / 3.0;
    }

    @Override
    public String toString() {
        return String.join( ",",lastname,
                String.valueOf(groupNumber),
                String.valueOf(physicsGrade),
                String.valueOf(mathGrade),
                String.valueOf(informaticsGrade),
                String.valueOf(averageScore));
    }

    /**
     * Creates a Student from a CSV line.
     */
    public static Student fromCsv(String line) {
        String[] parts = line.split(",");
        if (parts.length != 6) {
            throw new IllegalArgumentException("Invalid CSV format: " + line);
        }
        Student student = new Student();
        student.setLastname(parts[0]);
        student.setGroupNumber(Integer.parseInt(parts[1]));
        student.setPhysicsGrade(Double.parseDouble(parts[2]));
        student.setMathGrade(Double.parseDouble(parts[3]));
        student.setInformaticsGrade(Double.parseDouble(parts[4]));
        student.calculateAverageScore();
        return student;
    }

}

