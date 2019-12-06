package com.example.group10_f2019_mad3125_fp.model.employee.employeeType.partTime;


import android.os.Build;

import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.PartTime;

import java.io.Serializable;

import androidx.annotation.RequiresApi;

public class CommissionBasedPartTime extends PartTime implements Serializable {

    private double commissionPercentage;

    public CommissionBasedPartTime()
    {
        super();
    }

    public CommissionBasedPartTime(String name, int age, double rate, double hoursWorked, double commissionPercentage) {
        super(name, age, rate, hoursWorked);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public double calEarnings(){
        return ((getRate()*getHoursWorked()) + ((commissionPercentage/100) *(getRate()*getHoursWorked())));
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void printMyData()
    {
        System.out.println("Name:           " + getName());
        System.out.println("Year of Birth:  " + getCalBirthYear());
        System.out.println("Employee is PartTime/Commissioned ");
        System.out.println("\tRate per hour:  " + getRate());
        System.out.println("\tHours Worked:   " + getHoursWorked());
        System.out.println("\tCommission:     " + getCommissionPercentage() +"%");
        System.out.println("\tEarning in CAD: " + "C$" +calEarnings());

    }

}

