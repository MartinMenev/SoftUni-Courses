package JAVA_ADVANCED.Defining_Classes.CompanyRoster;

public class Employee {
    private final String name;
    private final double salary;
    private final String department;
    private String email;
    private int age;

    public Employee (String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }


    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
