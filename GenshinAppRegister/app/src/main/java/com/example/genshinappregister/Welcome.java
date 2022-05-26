package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {

    private Button btnLogin, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Welcome.this, Login.class);
            startActivity(intent);
        }
    });
    btnRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Welcome.this, MainActivity.class);
            startActivity(intent);
        }
    });

    }


    private void initViews(){
        btnLogin = findViewById(R.id.btnWelcomeLogin);
        btnRegister = findViewById(R.id.btnWelcomeRegister);
        //TODO jeżeli trzeba to dodać tutaj parenta, ale chyba nie trzeba
    }
}