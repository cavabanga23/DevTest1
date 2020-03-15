package Salary;

public class Developer extends Employee{
    private double Bonus;

    public Developer(double ratePerHour, Integer workDays, double bonus) {
        super(ratePerHour, workDays);
        Bonus = bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
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
        return super.getSalary()+getBonus();
    }
}
