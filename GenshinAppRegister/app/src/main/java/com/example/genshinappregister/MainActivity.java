package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private EditText edttxtName, edtTxtEmail, edttxtPassword, edtTxtPassRepeat;
    private Button btnPickImage, btnRegister;
    private TextView txtWarnName, txtwarnEmail, txtWarnPassword, txtWarnPassRepeat;
    private RadioGroup rgGender;
    private CheckBox agreementcheck;
    private ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnPickImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this,"Yet to talk about",Toast.LENGTH_SHORT).show();
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                initRegister();
            }
        });
    }
    private void initRegister(){
        Log.d(TAG,"initRegister: Started");


        if (validateData()) {
            if (agreementcheck.isChecked()) {
                showSnackBar();
            }else{
                Toast.makeText(this,"You need to agree to the licence agreement",Toast.LENGTH_SHORT).show();
            }
        }


    }
    private void showSnackBar(){
        Log.d(TAG,"ShowSnackBar: Started");
        txtWarnName.setVisibility(View.GONE);
        txtwarnEmail.setVisibility(View.GONE);
        txtWarnPassword.setVisibility(View.GONE);
        txtWarnPassRepeat.setVisibility(View.GONE);


    String name = edttxtName.getText().toString();
    String email = edtTxtEmail.getText().toString();
    String gender = "";
    switch(rgGender.getCheckedRadioButtonId()){
        case R.id.rgMale:
            gender = "Male";
            break;
        case R.id.rgFemale:
            gender = "Female";
            break;
        case R.id.rgOther:
            gender = "Other";
            break;
        default:
            gender = "Unknown";
            break;
    }


    String snackText = "Name: " + name + "\n" + "Email: " + email +"\n" + "Gender: " + gender + "\n";

    Log.d(TAG,"showSnackBar: Snack Bar Text: " + snackText);

        Snackbar.make(parent, snackText, Snackbar.LENGTH_INDEFINITE)
                .setAction("Continue",new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        edttxtName.setText("");
                        edttxtPassword.setText("");
                        edtTxtPassRepeat.setText("");
                        edtTxtEmail.setText("");
                    }
                }).show();
        Intent intent = new Intent(MainActivity.this, MainMenu.class);
        startActivity(intent);
    }
    private boolean validateData(){
        Log.d(TAG,"validateData: started");
        if(edttxtName.getText().toString().equals("")) {
            txtWarnName.setVisibility(View.VISIBLE);
            txtWarnName.setText("Enter your Login");
            return false;
        }
        if (edtTxtEmail.getText().toString().equals("")){
            txtwarnEmail.setVisibility(View.VISIBLE);
            txtwarnEmail.setText("Enter your email");
            return false;
        }
        if (edttxtPassword.getText().toString().equals("")){
            txtWarnPassword.setVisibility(View.VISIBLE);
            txtWarnPassword.setText("Enter password");
            return false;
        }
        if (edtTxtPassRepeat.getText().toString().equals("")|| !edtTxtPassRepeat.getText().toString().equals(edttxtPassword.getText().toString())){
            txtWarnPassRepeat.setVisibility(View.VISIBLE);
            txtWarnPassRepeat.setText("Passwords arent the same");
            return false;
        }

        return true;
    }
    private void initViews(){
        Log.d(TAG,"initViews: Started");
        edttxtName = findViewById(R.id.edtTxtName);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);
        edttxtPassword = findViewById(R.id.edtTxtPass);
        edtTxtPassRepeat = findViewById(R.id.edtTxtPassCheck);

        btnPickImage = findViewById(R.id.btnPickImage);
        btnRegister = findViewById(R.id.btnRegister);

        txtWarnName = findViewById(R.id.txtWarnName);
        txtwarnEmail = findViewById(R.id.txtWarnEmail);
        txtWarnPassword = findViewById(R.id.txtWarnPAss);
        txtWarnPassRepeat = findViewById(R.id.txtWarmPassCheck);

        rgGender = findViewById(R.id.rgGender);
        agreementcheck = findViewById(R.id.agreementCheck);
        parent = findViewById(R.id.parent);




    }
}