package osinovii.develop;

public class Student {
    private String lastname;
    private int groupNumber;
    private double physicsGrade;
    private double mathGrade;
    private double informaticsGrade;
    private double averageScore;

    public Student(String lastname, int groupNumber, double physicsGrade, double mathGrade, double informaticsGrade) {
        this.lastname = lastname;
        this.groupNumber = groupNumber;
        this.physicsGrade = physicsGrade;
        this.mathGrade = mathGrade;
        this.informaticsGrade = informaticsGrade;
    }

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

    public void averageScore() {
        this.averageScore = (physicsGrade + mathGrade + informaticsGrade) / 3.0;
    }

    @Override
    public String toString() {
        return String.join( ",",lastname,String.valueOf(groupNumber),String.valueOf(physicsGrade),String.valueOf(mathGrade),String.valueOf(informaticsGrade));
    }
}

