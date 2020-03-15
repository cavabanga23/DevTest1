package Salary;

import java.util.HashSet;
import java.util.Set;

public class Company extends SalaryService {
    private String name;
    private double budget;
    private Set<Employee> employees = new HashSet<>();

    public Company(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public SalaryService getSalaryService() {
        return new SalaryService() {
            @Override
            public void pay(Company company) {
                for (Employee employee : employees) {
                    double salaryBudget = +employee.getSalary();
                    double salaryBalance = company.getBudget() - salaryBudget;
                }

            }
        };
    }
}

