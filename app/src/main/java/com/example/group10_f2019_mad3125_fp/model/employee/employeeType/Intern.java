package com.example.group10_f2019_mad3125_fp.model.employee.employeeType;


import android.os.Build;

import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.io.Serializable;

import androidx.annotation.RequiresApi;

public class Intern extends Employee implements Serializable {

    private String schoolName;

    public Intern()
    {
        super();
    }

    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double calEarnings()
    {
        return 1000;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void printMyData()
    {
        System.out.println("Name:           " + getName());
        System.out.println("Year of Birth:  " + getCalBirthYear());
        System.out.println("Employee is Intern");
        System.out.println("\tSchoolName:     " + getSchoolName());
        System.out.println("\tEarnings:       " + "C$"+calEarnings());
    }
}
