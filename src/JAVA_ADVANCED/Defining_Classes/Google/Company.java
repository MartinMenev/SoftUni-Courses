package JAVA_ADVANCED.Defining_Classes.Google;

public class Company {
    private final String companyName;
    private final String department;
    private final double salary;

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        String result = "Company:";

        if (!companyName.isEmpty()) {
            return String.format("Company:%n%s %s %.2f", companyName, department, salary);
        }

        return result;
    }
}