package com.example.genshinappregister;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.genshinappregister.databinding.ActivityCharactersChoose1Binding;

import java.util.Arrays;

public class characters_choose_1 extends AppCompatActivity {

    private static final String TAG = "charactersChoose1";
    private AppBarConfiguration appBarConfiguration;
    private ActivityCharactersChoose1Binding binding;
    private Switch char7, char8, char9, char10, char11, char12;
    public int[] characters = {0,0,0,0,0,0,0,0,0,0,0,0};
    private Button back, before;
    private TextView sprawdz;
    Bundle b = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters_choose1);
        initViews();
        CharSwitch();
        Intent i = getIntent();
        int [] characters_b = i.getIntArrayExtra("inty");
        characters = characters_b;
        sprawdz.setText(Arrays.toString(characters));


    }


    private void initViews() {
        back = findViewById(R.id.back2);
        sprawdz = findViewById(R.id.logview);
        char7 = findViewById(R.id.character_switch_7);
        char8 = findViewById(R.id.character_switch_8);
        char9 = findViewById(R.id.character_switch_9);
        char10 = findViewById(R.id.character_switch_10);
        char11 = findViewById(R.id.character_switch_11);
        char12 = findViewById(R.id.character_switch_12);
        before = findViewById(R.id.pagebefore);
    }
    private void CharSwitch(){
        char7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sprawdz.setText("Tartaglia wybrany");
                    characters[6] = 1;
                }else{
                    sprawdz.setText("Tartaglia usunięty");
                    characters[6] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });
        char8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sprawdz.setText("Kaeya wybrany");
                    characters[7] = 1;
                }else{
                    sprawdz.setText("Kaeya usunięty");
                    characters[7] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });
        char9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sprawdz.setText("Xinqiu wybrany");
                    characters[8] = 1;
                }else{
                    sprawdz.setText("Xinqiu usunięty");
                    characters[8] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });
        char10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sprawdz.setText("Shenhe wybrana");
                    characters[9] = 1;
                }else{
                    sprawdz.setText("Shenhe usunięta");
                    characters[9] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });
        char11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sprawdz.setText("Sayu wybrana");
                    characters[10] = 1;
                }else{
                    sprawdz.setText("Sayu usunięta");
                    characters[10] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });
        char12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    sprawdz.setText("gorou wybrany");
                    characters[11] = 1;
                }else{
                    sprawdz.setText("Gorou usunięty");
                    characters[11] = 0;
                }
                Log.d(TAG, Arrays.toString(characters));
            }

        });

    back.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent i = new Intent(characters_choose_1.this,HELP_ACTIVITY.class);
            i.putExtra("inty",characters);
            i.putExtra("recall", true);
            startActivity(i);
        }
    });


    before.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent i = new Intent(characters_choose_1.this,Characters_Choose.class);
            i.putExtra("inty",characters);

            startActivity(i);
        }
    });
    }



}