package com.example.myproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {
    TextView signUp, textView2, socialText2;
    EditText signName, signUpPassword, confirmPassword;
    Button btnSignUp, btnForgotPassword, btbGoogle2, btnFb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUp = findViewById(R.id.signUp);
        textView2 = findViewById(R.id.textView2);
        socialText2 = findViewById(R.id.socialText2);

        signName = findViewById(R.id.signName);
        signUpPassword = findViewById(R.id.signUpPassword);
        confirmPassword = findViewById(R.id.confirmPassword);

        btnSignUp = findViewById(R.id.btnSignUp);
        btnForgotPassword = findViewById(R.id.btnForgotPassword);
        btbGoogle2 = findViewById(R.id.btnGoogle2);
        btnFb = findViewById(R.id.btnFb);

        final String name = "Kofi Scale";
        final String passwrd = "1234";
        final String confm = "1234";

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.equals(signName) && passwrd.equals(signUpPassword)){
                    Toast.makeText(sign_up.this, "Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(sign_up.this, MainPage.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(sign_up.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}