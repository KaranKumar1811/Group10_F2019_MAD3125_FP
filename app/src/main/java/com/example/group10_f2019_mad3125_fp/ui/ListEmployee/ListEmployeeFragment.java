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

import com.example.group10_f2019_mad3125_fp.R;

public class ListEmployeeFragment extends Fragment {

    private ListEmployeeViewModel listEmployeeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        listEmployeeViewModel =
                ViewModelProviders.of(this).get(ListEmployeeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_list_emloyee, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        listEmployeeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}