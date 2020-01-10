package com.example.studentqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class Login extends AppCompatActivity {

    CircularProgressButton loginButton;
    EditText regnumber,password;
    TextView forgotpassword;
    public static int CAMERA_REQUEST = 9999;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.Login_btn);
        regnumber = findViewById(R.id.edittext_RegNum);
        password = findViewById(R.id.edittext_password);
        forgotpassword = findViewById(R.id.textview_forgot_password);

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, ForgotPassword.class);
                startActivity(intent);

            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
                /*Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQUEST);

                 */

            }
            /*
            @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data){
                Login.super.onActivityResult(requestCode,resultCode,data);
                if (requestCode==CAMERA_REQUEST){
                    Bitmap bitmap =(Bitmap)data.getExtras().get("data");



                }
            }

             */
        });

    }
}
