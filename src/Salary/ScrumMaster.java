package Salary;

public class ScrumMaster extends Employee {
    public ScrumMaster(double ratePerHour, Integer workDays) {
        super(ratePerHour, workDays);
    }

    @Override
    public double getRatePerHour() {
        return super.getRatePerHour();
    }

    @Override
    public void setRatePerHour(double ratePerHour) {
        super.setRatePerHour(ratePerHour);
    }

    @Override
    public Integer getWorkDays() {
        return super.getWorkDays();
    }

    @Override
    public void setWorkDays(Integer workDays) {
        super.setWorkDays(workDays);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
