package com.example.group10_f2019_mad3125_fp;



import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.util.ArrayList;

public class Singleton {
    private static Singleton myObj;
    /**
     * Create private constructor
     */

    ArrayList<Employee> arrayListEmployee = new ArrayList<>();

    private Singleton() {
    }

    /**
     * Create a static method to get instance.
     *
     * @return
     */
    public static Singleton getInstance() {
        if (myObj == null) {
            myObj = new Singleton();
        }
        return myObj;
    }

    public void addEmployee(Employee e) {
        arrayListEmployee.add(e);
    }

    public Employee getEmployeeByIndex(int index) {
        if (index < arrayListEmployee.size()) {
            return arrayListEmployee.get(index);
        }
        return null;
    }

    public ArrayList<Employee> getEmployees() {
        if (arrayListEmployee.size() > 0) {

            return arrayListEmployee;

        }
        return null;
    }
}
