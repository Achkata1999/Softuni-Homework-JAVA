package CompanyRoster_02;

public class Employee {
    //: name, salary, position, department, email and age
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department) {

        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;

    }

    public Employee(String name, double salary, String position, String department, String email) {

        this(name, salary, position, department);
        this.email = email;
        this.age = -1;

    }

    public Employee(String name, double salary, String position, String department, int age) {

        this(name, salary, position, department);
        this.age = age;
        this.email = "n/a";

    }

    public Employee(String name, double salary, String position, String department, String email, int age) {

        this(name, salary, position, department);
        this.email = email;
        this.age = age;


    }


}