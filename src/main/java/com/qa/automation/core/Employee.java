package com.qa.automation.core;

public class Employee {

    private final String name;
    private double salary;

    public Employee(String name, double salary) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name required");
        if (salary < 0) throw new IllegalArgumentException("Salary must be >= 0");
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalaryByPercent(double percent) {
        if (Double.isNaN(percent) || Double.isInfinite(percent)) {
            throw new IllegalArgumentException("Percent must be finite number");
        }
        double newSalary = salary * (1 + percent / 100);
        if (newSalary < 0) {
            throw new IllegalArgumentException("Resulting salary cannot be negative");
        }
        this.salary = newSalary;
    }

    public String getRole() {
        return "Employee";
    }

    @Override
    public String toString() {
        return getRole() + ": " + name + " ($" + salary + ")";
    }

}
