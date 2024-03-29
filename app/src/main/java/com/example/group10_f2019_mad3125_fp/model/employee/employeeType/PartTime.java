package com.example.group10_f2019_mad3125_fp.model.employee.employeeType;


import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.io.Serializable;

public abstract class PartTime extends Employee implements Serializable {

    private double rate;
    private double hoursWorked;

    public PartTime()
    {
        super();
    }

    public PartTime(String name, int age, double rate, double hoursWorked ,String etype) {
        super(name, age ,etype);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public abstract double calEarnings();

    @Override
    public void printMyData()
    {

    }
}

