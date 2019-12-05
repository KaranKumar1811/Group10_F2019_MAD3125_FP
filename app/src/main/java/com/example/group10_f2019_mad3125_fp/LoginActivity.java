package com.example.group10_f2019_mad3125_fp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button loginBtn;
    private void showAlert() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Error");
        alertDialogBuilder.setMessage("Wrong Credentials!");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialogBuilder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog nAlertDialog = alertDialogBuilder.create();
        nAlertDialog.show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.edtUserName);
        password=findViewById(R.id.edtPassword);
        loginBtn=findViewById(R.id.btnLogin);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("user@employee.com")
                        && password.getText().toString().equals("s3cr3t")){

                    Intent i=new Intent(LoginActivity.this,MainMenuActivity.class);
                    startActivity(i);

                }

                else{
                    showAlert();

                }


            }
        });
    }
}
