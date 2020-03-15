package Salary;

public class Employee {
    private double ratePerHour;
    private Integer workDays;


    public Employee(double ratePerHour, Integer workDays) {
        this.ratePerHour = ratePerHour;
        this.workDays = workDays;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public Integer getWorkDays() {
        return workDays;
    }

    public void setWorkDays(Integer workDays) {
        this.workDays = workDays;
    }
    public double getSalary (){
        return ratePerHour*workDays*8;

    }
}
