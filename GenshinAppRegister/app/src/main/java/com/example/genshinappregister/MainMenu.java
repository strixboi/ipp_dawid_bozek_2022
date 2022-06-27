package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainMenu extends AppCompatActivity {

    private Button testbutton, calendarButton, videoplayerbutton, Events, Party_Characters;
    GridView gridView;

    String[] number = new String[25];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        initViews();

        for(int i = 0; i<number.length; i++)
        {
            number[i] = "numero" + i;
        }
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

        videoplayerbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainMenu.this, video_player.class);
                startActivity(intent);
            }
        });

        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, Events.class);
                startActivity(intent);
            }
        });

        Party_Characters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, HELP_ACTIVITY.class);
                intent.putExtra("inty", new int[]{0,0,0,0,0,0,0,0,0,0,0,0});
                intent.putExtra("recall",false);
                startActivity(intent);
            }
        });

    }
    private void initViews(){
        testbutton = findViewById(R.id.testbutton);
        calendarButton = findViewById(R.id.CalendarInto);
        gridView = findViewById(R.id.gridView);
        videoplayerbutton = findViewById(R.id.VideoPlayer);
        Events = findViewById(R.id.Events);
        Party_Characters = findViewById(R.id.Character_Party_Creator);
    }
}