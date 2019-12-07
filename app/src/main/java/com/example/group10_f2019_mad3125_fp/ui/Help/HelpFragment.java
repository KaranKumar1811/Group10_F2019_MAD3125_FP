package com.example.group10_f2019_mad3125_fp.ui.Help;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.group10_f2019_mad3125_fp.MainMenuActivity;
import com.example.group10_f2019_mad3125_fp.R;

public class HelpFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
            View root=null;
//        View root = inflater.inflate(R.layout.fragment_help, container, false);
            showDialog();
        return root;
    }
    public void showDialog()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
        alertDialogBuilder.setTitle("Alert Message");
        alertDialogBuilder.setMessage("Emergency contact details \n call:123456789 \n Email: employee@gmail.com");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                showMessage("Cancel - no");
            }
        });

        alertDialogBuilder.setPositiveButton("Call", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                makeCall();
                dialogInterface.dismiss();
                // TODO
                // change the class to whereeve the final destination
//                Intent mIntent = new Intent(MainTabActivity.this, HomeActivity.class);
//                startActivity(mIntent);
            }
        });

        alertDialogBuilder.setNeutralButton("Email", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                sendEmail();
            }
        });

        AlertDialog mAlertDialog = alertDialogBuilder.create();
        mAlertDialog.show();
    }

    void makeCall(){
        String phoneNo = "123456789";
        if(!TextUtils.isEmpty(phoneNo)) {
            String dial = "tel:" + phoneNo;
            Intent phoneItent = new Intent(Intent.ACTION_DIAL, Uri.parse(dial));
            if(phoneItent.resolveActivity(getContext().getPackageManager()) != null)
            {
                startActivity(phoneItent);
            }
            else
            {
                Toast.makeText(getContext(),"No application to handle Phone call",Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getContext(), "Enter a phone number", Toast.LENGTH_SHORT).show();
        }

    }

    void sendEmail(){
        String to = "employee@gmail.com";
        String subject = "Subject";
        String body = "Body";
        Intent emailIntent = new Intent(Intent.ACTION_SEND); //Intent.ACTION_SENDTO
        emailIntent.setType("text/plain");
//        emailIntent.setData(Uri.parse("mailto:" + to));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);
        emailIntent.setType("message/rfc822");

        if(emailIntent.resolveActivity(getContext().getPackageManager()) != null)
        {
            startActivity(Intent.createChooser(emailIntent, "Select Email Client"));
        }
        else
        {
            Toast.makeText(getContext(),"No application to handle Email",Toast.LENGTH_SHORT).show();
        }
    }
    public void showMessage(String msg)
    {
        Toast toast = Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}