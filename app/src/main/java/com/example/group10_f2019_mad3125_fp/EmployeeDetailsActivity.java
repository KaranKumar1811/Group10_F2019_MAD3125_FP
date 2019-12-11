package com.example.group10_f2019_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.group10_f2019_mad3125_fp.model.employee.Employee;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.FullTime;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.Intern;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.PartTime;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.partTime.CommissionBasedPartTime;
import com.example.group10_f2019_mad3125_fp.model.employee.employeeType.partTime.FixedBasedPartTime;
import com.example.group10_f2019_mad3125_fp.model.vehicle.Car;

import java.io.Serializable;

public class EmployeeDetailsActivity extends AppCompatActivity  {

    TextView vehicles,name,age,empType,schoolName,totalSalary,bonus,basicSalaryFT,totalSalaryFT,hoursWorked,rate,commissionPer,fixedAmount,totalSalaryComPt,totalSalaryFixPt;
    ConstraintLayout intern,ftLayout,ptLayout,cmPtLayout,fbPtlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);

        name=findViewById(R.id.txtName);
        age=findViewById(R.id.txtAge);
        empType=findViewById(R.id.txtEType);
        schoolName=findViewById(R.id.txtSchoolName);
        totalSalary=findViewById(R.id.txtTotalSalary);
        bonus=findViewById(R.id.txtBonus);
        basicSalaryFT=findViewById(R.id.txtSalary);
        totalSalaryFT=findViewById(R.id.txtFTotalSalary);
        hoursWorked=findViewById(R.id.txtHrsWorked);
        rate=findViewById(R.id.txtRate);
        commissionPer=findViewById(R.id.txtCommPer);
        fixedAmount=findViewById(R.id.txtFixedAmnount);
        totalSalaryComPt=findViewById(R.id.txtComPTotalSalary);
        totalSalaryFixPt=findViewById(R.id.txtFixPTotalSalary);
        vehicles=findViewById(R.id.txtVehicleDetails);

        intern=findViewById(R.id.InternLayout);
        ftLayout=findViewById(R.id.FullTmLayout);
        ptLayout=findViewById(R.id.PartTmLayout);
        cmPtLayout=findViewById(R.id.PTCommLayout);
        fbPtlayout=findViewById(R.id.PTFixLayout);


        intern.setVisibility(View.GONE);
        ftLayout.setVisibility(View.GONE);
        ptLayout.setVisibility(View.GONE);
        cmPtLayout.setVisibility(View.GONE);
        fbPtlayout.setVisibility(View.GONE);


        Employee e= (Employee) getIntent().getSerializableExtra("employee");
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getEmployee());

        name.setText(String.valueOf(e.getName()));
        age.setText(String.valueOf(e.getAge()));
        empType.setText(String.valueOf(e.getEmployee()));
        if(e instanceof Intern) {

            intern.setVisibility(View.VISIBLE);
            schoolName.setText(((Intern) e).getSchoolName());
            totalSalary.setText(String.valueOf(e.calEarnings()));
        }
        if(e instanceof FullTime){
            ftLayout.setVisibility(View.VISIBLE);
            bonus.setText(String.valueOf(((FullTime)e).getBonus()));
            basicSalaryFT.setText(String.valueOf(((FullTime)e).getSalary()));
            totalSalaryFT.setText(String.valueOf(((FullTime)e).calEarnings()));


        }
        if(e instanceof PartTime)
        {
            ptLayout.setVisibility(View.VISIBLE);
            hoursWorked.setText(String.valueOf(((PartTime)e).getHoursWorked()));
            rate.setText(String.valueOf(((PartTime)e).getRate()));

            if(e instanceof CommissionBasedPartTime)
            {
                cmPtLayout.setVisibility(View.VISIBLE);

                commissionPer.setText(String.valueOf(((CommissionBasedPartTime)e).getCommissionPercentage()));
                totalSalaryComPt.setText(String.valueOf(((CommissionBasedPartTime)e).calEarnings()));
            }
            else
            {
                fbPtlayout.setVisibility(View.VISIBLE);
                fixedAmount.setText(String.valueOf(((FixedBasedPartTime)e).getFixedAmount()));
                totalSalaryFixPt.setText(String.valueOf(((FixedBasedPartTime)e).calEarnings()));
            }


        }

        this.vehicles.setText(e.getVehicle() == null ? "null" : e.getVehicle() instanceof Car ? "CAR" : "MOTER CYCLE");
        vehicles.setText("Employee Has a : "+e.getVehicleType()+"\n\n");
        vehicles.append("Make : "+e.getVehicle().getCompany()+"\n\n");
        vehicles.append("Plate : "+e.getVehicle().getPlate()+"\n");



    }
}
