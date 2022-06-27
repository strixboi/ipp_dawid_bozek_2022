package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Arrays;

public class Characters_Choose extends AppCompatActivity {

    private static final String TAG = "CharactersChoose";
    private Switch char1, char2, char3, char4, char5, char6, char7;
    private TextView textView;
    public int[] characters = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    private Button Back, nextpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters_choose);

        initViews();
        CharSwitch();
        Intent i = getIntent();
        int[] characters_b = i.getIntArrayExtra("inty");
        characters = characters_b;
        textView.setText(Arrays.toString(characters));


    }

    private void initViews(){
        char1 = findViewById(R.id.character_switch_1);
        char2 = findViewById(R.id.character_switch_2);
        char3 = findViewById(R.id.character_switch_3);
        char4 = findViewById(R.id.character_switch_4);
        char5 = findViewById(R.id.character_switch_5);
        char6 = findViewById(R.id.character_switch_6);
        char7 = findViewById(R.id.character_switch_13);
        textView = findViewById(R.id.textView11);
        Back = findViewById(R.id.back_btn);
        nextpage = findViewById(R.id.nextpage);
    }
    private void CharSwitch(){
        char1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText("Albedo wybrany");
                    characters[0] = 1;
                }else{
                    textView.setText("Albedo usunięty");
                    characters[0] = 0;
                    Bundle b = new Bundle();

                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });
        char2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText("Qiqi wybrana");
                    characters[1] = 1;

                }else{
                    textView.setText("Qiqi usunięta");
                    characters[1] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }});

        char3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText("Bennett dodany");
                    characters[2] = 1;
                }else{
                    textView.setText("Bennett usunięty");
                    characters[2] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }
        });
        char4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText("Diluc dodany");
                    characters[3] = 1;
                }else{
                    textView.setText("Diluc usunięty");
                    characters[3] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }
        });
        char5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("Itto wybrany");
                    characters[4] = 1;
                } else {
                    textView.setText("Itto usunięty");
                    characters[4] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }
        });

        char6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setText("Shogun wybrana");
                    characters[5] = 1;
                }else{
                    textView.setText("Shogun usunięta");
                    characters[5] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }



        });
        Back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Characters_Choose.this,HELP_ACTIVITY.class);
                i.putExtra("inty",characters);
                i.putExtra("recall", true);
                startActivity(i);
            }
        });
        nextpage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Characters_Choose.this,characters_choose_1.class);
                i.putExtra("inty",characters);
                startActivity(i);
            }
        });

    }
}