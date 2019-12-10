package com.example.group10_f2019_mad3125_fp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Serializable
{
int pos;

    private List<Employee> employeeList;
    public RecyclerViewAdapter(List<Employee> employeeList)
    {
        this.employeeList=employeeList;
    }

    public RecyclerViewAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

//        System.out.println(position);

        final Employee mEmployee=employeeList.get(position);
        holder.empName.setText(mEmployee.getName());
        holder.empType.setText(mEmployee.getEmployee());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos=position;
                Toast.makeText(holder.itemView.getContext(),mEmployee.getName(),Toast.LENGTH_LONG).show();
                Intent in = new Intent(holder.itemView.getContext(),EmployeeDetailsActivity.class);
                in.putExtra("employee", (Serializable) mEmployee);
                in.putExtra("pos",(Serializable) position);
                holder.itemView.getContext().startActivity(in);
            }
        });
    }

    public int getPos() {
        return pos;
    }

    @Override
    public int getItemCount() {
        //return 1;
        return employeeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView empType;
        TextView empName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            empType=itemView.findViewById(R.id.txtEmpType);
            empName=itemView.findViewById(R.id.txtEmpName);
        }
    }
}
