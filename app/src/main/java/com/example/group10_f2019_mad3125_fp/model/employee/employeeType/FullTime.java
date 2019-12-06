package com.example.group10_f2019_mad3125_fp.model.employee.employeeType;


import android.os.Build;

import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.io.Serializable;

import androidx.annotation.RequiresApi;

public class FullTime extends Employee implements Serializable {

    private double salary;
    private double bonus;

    public FullTime()
    {
        super();
    }

    public FullTime(String name, int age, double salary, double bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calEarnings()
    {
        return (getSalary() + getBonus());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void printMyData()
    {
        System.out.println("Name:           " + getName());
        System.out.println("Year of Birth:  " + getCalBirthYear());
        System.out.println("Employee is FullTime");
        System.out.println("\tSalary:         " +"C$"+ getSalary());
        System.out.println("\tBonus:          " +"C$"+getBonus());
        System.out.println("\tEarnings:       " +"C$"+ calEarnings());
    }
}
