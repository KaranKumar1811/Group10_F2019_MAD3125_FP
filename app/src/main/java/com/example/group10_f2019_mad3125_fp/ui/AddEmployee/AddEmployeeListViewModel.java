package com.example.group10_f2019_mad3125_fp.ui.AddEmployee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddEmployeeListViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddEmployeeListViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}