package com.example.group10_f2019_mad3125_fp.ui.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.group10_f2019_mad3125_fp.R;

import java.text.DateFormat;
import java.util.Date;

public class HomeFragment extends Fragment {

   // private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView dateTextView = root.findViewById(R.id.text_date);

        Date todayDate = new Date();

        //Get an instance of the formatter
        DateFormat dateFormat = DateFormat.getDateInstance();

        //If you want to show only the date then you will use
        //DateFormat dateFormat = DateFormat.getDateInstance();

        //Format date
        String todayDateTimeString = dateFormat.format(todayDate);

        //display Date

        dateTextView.setText(todayDateTimeString);


        return root;
    }
}