package com.example.group10_f2019_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.group10_f2019_mad3125_fp.R;
import com.example.group10_f2019_mad3125_fp.model.employee.Employee;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.Intern;

import java.io.Serializable;

public class EmployeeDetailsActivity extends AppCompatActivity  {

    TextView name,age,empType,schoolName,totalSalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);

        name=findViewById(R.id.txtName);
        age=findViewById(R.id.txtAge);
        empType=findViewById(R.id.txtEType);
        schoolName=findViewById(R.id.txtSchoolName);
        totalSalary=findViewById(R.id.txtTotalSalary);

        

//        Employee e= (Employee) getIntent().getSerializableExtra("employee");
//        System.out.println(e.getName());
//        System.out.println(e.getAge());
//        System.out.println(e.getEmployee());
//
//        name.setText(String.valueOf(e.getName()));
//        age.setText(String.valueOf(e.getAge()));
//        empType.setText(String.valueOf(e.getEmployee()));
        //schoolName.setText();


    }
}
