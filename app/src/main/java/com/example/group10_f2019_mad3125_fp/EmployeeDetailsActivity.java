package com.example.group10_f2019_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.group10_f2019_mad3125_fp.R;
import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.io.Serializable;

public class EmployeeDetailsActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);

        Employee e= (Employee) getIntent().getSerializableExtra("employee");
        System.out.println(e.getName());


    }
}
