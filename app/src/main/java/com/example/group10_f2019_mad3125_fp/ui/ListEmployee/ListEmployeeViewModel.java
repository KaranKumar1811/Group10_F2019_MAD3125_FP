package com.example.group10_f2019_mad3125_fp.ui.ListEmployee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ListEmployeeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ListEmployeeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}