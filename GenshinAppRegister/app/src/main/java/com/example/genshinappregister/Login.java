package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Login extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private EditText edttxtName, edtTxtPassword;
    private Button btnLogin;
    private TextView txtWelcome;
    private ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ initLogin();}
        });
    }


    private void initLogin(){
        Log.d(TAG,"initLogin: Started");


        if(validateLoginData()){
            //TODO showSnackBar() w polu do logowania
            Intent intent = new Intent(Login.this, MainMenu.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Wprowadź dane do logowania",Toast.LENGTH_SHORT).show();
        }
    }
    private boolean validateLoginData(){
            Log.d(TAG,"validateData: started on login");
            if(edttxtName.getText().toString().equals(""))
            {
                return false;
            }
            if(edtTxtPassword.getText().toString().equals("")){
                return false;
            }
            return true;
    }

    /*private void showSnackBar(){
        Log.d(TAG,"ShowSnackBar: Started");
        String name = edttxtName.getText().toString();
        String email = edtTxtPassword.getText().toString();
        String snackText = "Logged as: " + name;
        Log.d(TAG,"showsnackbar: snackbartext: "+ snackText);

        Snackbar.make(parent,snackText,Snackbar.LENGTH_INDEFINITE)
                .setAction("Continue",new View.OnClickListener(){
                   @Override

                });
    }*/

    private void initViews(){
        Log.d(TAG, "InitViews_LOGIN: Started");
         edttxtName = findViewById(R.id.edtTxtName_LOGIN);
         edtTxtPassword = findViewById(R.id.edtTxtPassword_LOGIN);

         btnLogin = findViewById(R.id.btnLogin);
         txtWelcome = findViewById(R.id.textWelcome);

         parent = findViewById(R.id.parent_Login);
    }
}
