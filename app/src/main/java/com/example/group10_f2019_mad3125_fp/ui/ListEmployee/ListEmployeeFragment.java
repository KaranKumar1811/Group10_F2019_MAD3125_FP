package com.example.group10_f2019_mad3125_fp.ui.ListEmployee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group10_f2019_mad3125_fp.R;
import com.example.group10_f2019_mad3125_fp.RecyclerViewAdapter;
import com.example.group10_f2019_mad3125_fp.Singleton;
import com.example.group10_f2019_mad3125_fp.model.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeeFragment extends Fragment {

    private RecyclerView rvEmployeeList;
    private List<Employee> employeeList;
    Singleton singleton=Singleton.getInstance();
    RecyclerViewAdapter recyclerViewAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_emloyee, container, false);
        rvEmployeeList=root.findViewById(R.id.empListRV);
        initViews();
        return root;
    }


    private void initViews() {
        populateData();

        recyclerViewAdapter = new RecyclerViewAdapter(employeeList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        rvEmployeeList.setLayoutManager(layoutManager);
        rvEmployeeList.setAdapter(recyclerViewAdapter);
    }
    private void populateData()
    {
        employeeList = new ArrayList<>();


        employeeList=singleton.getEmployees();





    }

}