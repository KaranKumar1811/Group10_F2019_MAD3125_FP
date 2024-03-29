package com.example.group10_f2019_mad3125_fp.model.employee;


import android.os.Build;

import com.example.group10_f2019_mad3125_fp.model.vehicle.Vehicle;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import androidx.annotation.RequiresApi;

public class Employee implements Serializable {

    private String name;
    private int age;
    private Vehicle vehicle;
    private String employee;
    private int employeeId;
    private String vehicleType;


    public String getVehicleType() {
        vehicleType=vehicle.getVtype();
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Employee()
    {

    }
    public Employee(String EName,String Etype){
        this.name=EName;
        this.employee=Etype;
    }

    public Employee(String name, int age ,String EType) {
        this.name = name;
        this.age = age;
        this.employee=EType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        int curDate= Calendar.getInstance().get(Calendar.YEAR);
        age=curDate-age;
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCalBirthYear(int age)
    {
        this.age = age;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public int getCalBirthYear()
    {
        Calendar now = new GregorianCalendar();
        return now.getWeekYear() - age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double calEarnings()
    {
        return 1000;
    }

    public void printMyData()
    {

    }

}

