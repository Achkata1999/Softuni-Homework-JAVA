package Students;

public class Students {
    private String firstName;
    private String secondName;
    private double grade;

    public Students(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public double getGrade() {
        return this.grade;
    }


}
