package com.example.studentqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class ForgotPassword extends AppCompatActivity {

    CircularProgressButton SubmitBtn, ChangeBtn;
    TextView statement;
    TextInputLayout EmailLayout, CodeLayout, NewPasswordLayout,ConfirmpasswordLayout;
    EditText email, code,newpassword,confirmpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        SubmitBtn = findViewById(R.id.submit_btn);
        ChangeBtn =findViewById(R.id.change_btn);
        EmailLayout = findViewById(R.id.textInputEmail);
        CodeLayout = findViewById(R.id.textInputCode);
        NewPasswordLayout= findViewById(R.id.textInputnewpasswor);
        ConfirmpasswordLayout =findViewById(R.id.textInputConfirmPassword);
        email = findViewById(R.id.edittext_email);
        code = findViewById(R.id.edittext_code);
        newpassword = findViewById(R.id.edittext_new_password);
        confirmpassword = findViewById(R.id.edittext_confirm_password);
        statement= findViewById(R.id.instruction);

       SubmitBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SubmitBtn.setVisibility(View.GONE);
               EmailLayout.setVisibility(View.GONE);
               email.setVisibility(View.GONE);
               statement.setVisibility(View.GONE);
               ChangeBtn.setVisibility(View.VISIBLE);
               CodeLayout.setVisibility(View.VISIBLE);
               NewPasswordLayout.setVisibility(View.VISIBLE);
               ConfirmpasswordLayout.setVisibility(View.VISIBLE);
               code.setVisibility(View.VISIBLE);
               newpassword.setVisibility(View.VISIBLE);
               confirmpassword.setVisibility(View.VISIBLE);
               statement.setVisibility(View.GONE);
           }
       });

       ChangeBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =new Intent(ForgotPassword.this, Login.class);
               startActivity(intent);
           }
       });

    }

}
