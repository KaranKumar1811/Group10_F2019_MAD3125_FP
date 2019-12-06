package com.example.group10_f2019_mad3125_fp.ui.AddEmployee;

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

import com.example.group10_f2019_mad3125_fp.R;

public class AddEmployeeListFragment extends Fragment {

    private AddEmployeeListViewModel addEmployeeListViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addEmployeeListViewModel =
                ViewModelProviders.of(this).get(AddEmployeeListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_add_employee, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        addEmployeeListViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}