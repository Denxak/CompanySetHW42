package ait.employee.model;

public class WageEmoloyee extends Employee {
    private double wage;

    public WageEmoloyee(int id, String firstName, String lastname, double hours, double wage) {
        super(id, firstName, lastname, hours);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double calcSalary() {
        double salary = wage * hours;
        return ensureSalary(salary);
    }
}
