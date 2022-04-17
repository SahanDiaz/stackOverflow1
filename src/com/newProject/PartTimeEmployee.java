package com.newProject;

public class PartTimeEmployee extends Employee{
    private double ratePerHour,wage;
    private int hoursWorked;

    public PartTimeEmployee(String name,double ratePerHour, int hoursWorked) {
        super(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }
    public double getWage(){
        return wage = this.ratePerHour * this.hoursWorked;
    }
}
