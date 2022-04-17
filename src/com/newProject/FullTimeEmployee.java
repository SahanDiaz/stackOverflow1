package com.newProject;

public class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name,double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
