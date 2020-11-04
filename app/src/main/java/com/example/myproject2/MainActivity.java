package com.example.myproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView signIn, signInView, socialText;
    EditText username, password;
    Button btnSignIn, btnCreate, btnGoogle, btnFB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signIn = findViewById(R.id.signIn);
        signInView = findViewById(R.id.signInView);
        socialText = findViewById(R.id.socialText);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        btnSignIn = findViewById(R.id.btnSignIn);
        btnCreate = findViewById(R.id.btnCreate);
        btnFB = findViewById(R.id.btnFB);
        btnGoogle = findViewById(R.id.btnGoogle);

        final String myName = "kofi scale";
        final String pasword = "1234";
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText();
                password.getText();

                if (!myName.equals(username) && !pasword.equals(password)){
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainPage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCreate.getText();
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,sign_up.class);
                startActivity(intent);
            }
        });
    }
}