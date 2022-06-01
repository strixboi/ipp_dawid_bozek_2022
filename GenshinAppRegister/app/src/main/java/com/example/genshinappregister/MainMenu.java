package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    private Button testbutton, calendarButton;
    GridView gridView;

    String[] number = new String[50];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        initViews();

        for(int i = 0; i<number.length; i++)
        {
            number[i] = "numero" + i;
        }
        //TODO ogarnij ten syf
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_gallery_item,number);
        gridView.setAdapter(adapter);

        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, Calendar.class);
                startActivity(intent);
            }
        });

        testbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainMenu.this, Welcome.class);
                startActivity(intent);
            }
        });

    }
    private void initViews(){
        testbutton = findViewById(R.id.testbutton);
        calendarButton = findViewById(R.id.CalendarInto);
        gridView = findViewById(R.id.gridView);
    }
}