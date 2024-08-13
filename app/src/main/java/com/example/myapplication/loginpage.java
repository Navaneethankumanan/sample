package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginpage extends AppCompatActivity {
    Button submit;
    EditText email;
    EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        submit=findViewById(R.id.submitbtn);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);

        submit.setOnClickListener((v->{
            loginoperation();
        }));
    }

    private void loginoperation() {
        String emaila=email.getText().toString();
        if (emaila=="sanjithms@gmail.com"){
            Intent intent=new Intent(loginpage.this,homepage.class);
            startActivity(intent);
            finish();
        }
    }

}
