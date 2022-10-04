package JAVA_ADVANCED.Defining_Classes.CompanyRoster;


import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];

            Employee employee = new Employee(name, salary, position, department);
            employee.setEmail("n/a");
            employee.setAge(-1);

            if (data.length == 5) {
                if (data[4].length() == 2) {
                    employee.setAge(Integer.parseInt(data[4]));
                } else {
                    employee.setEmail(data[4]);
                }
            } else if (data.length == 6) {
                employee.setAge(Integer.parseInt(data[5]));
                employee.setEmail(data[4]);
            }
            employees.add(employee);
        }

        String highestAvgSalaryDept = "";
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            double avgSalary = getAverageSalary(employees, employee.getDepartment());
            if (avgSalary > maxSalary) {
                maxSalary = avgSalary;
                highestAvgSalaryDept = employee.getDepartment();
            }
        }

        System.out.println("Highest Average Salary: " + highestAvgSalaryDept);

        String finalHighestAvgSalaryDept = highestAvgSalaryDept;
        Predicate<Employee> getMaxSalaryDept = employee -> employee.getDepartment().equals(finalHighestAvgSalaryDept);

        employees
                .stream()
                .filter(getMaxSalaryDept)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }

    private static double getAverageSalary(List<Employee> employees, String department) {
        Predicate<Employee> getDept = employee -> employee.getDepartment().equals(department);
        return employees
                .stream().filter(getDept)
                .mapToDouble(Employee::getSalary)
                .average().orElse(0);
    }
}
