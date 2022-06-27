package com.example.genshinappregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.stream.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class HELP_ACTIVITY extends AppCompatActivity {

    private static final String TAG = "CharactersChoose";
    private int trap;
    private int[] chosen_team = {12,12,12,12};
    private int[] rank = {10, 2, 6, 12, 3, 11, 8, 5, 1, 7, 9, 4};
    private int[] sub_dps = {1,0,0,0,0,1,1,0,0,0,1,0};
    private int[] support = {0,1,1,0,0,0,0,1,1,0,1,0};
    private String[] elements = {"geo", "cryo", "pyro", "pyro", "geo", "electro", "hydro", "cryo", "hydro", "cryo", "anemo", "geo"};
    private int[] icons = {R.drawable.albedo_icon,R.drawable.qiqi_icon,R.drawable.bennett_icon,R.drawable.diluc_icon,R.drawable.itto_icon,R.drawable.shogun_icon,
    R.drawable.tartaglia_icon,R.drawable.kkaeya_icon,R.drawable.xingqiu_icon,R.drawable.shenhe_icon,R.drawable.sayu_icon,R.drawable.diluc_icon,R.drawable.empty_png};
    private String[] ele = {"geo","pyro","cryo","electro","hydro","anemo"};
    private String[][] synergies = {
            {"geo buff","crystalize","crystalize","crystalize","crystalize","burn"},
            {"crystalize", "pyro buff", "melt", "overload", "vaporize", "swirl"},
            {"crystalize", "melt","cryo buff","superconduct","frozen","swirl"},
            {"crystalize","overload","superconduct","electro buff","electro-charge","swirl"},
            {"crystalzie", "vaporize","frozen","electro-charge","hydro buff","swirl"},
            {"crystalize","swirl","swirl","swirl","swirl","anemo buff"}};

    private ImageView view1, view2, view3, view4;
    private Button import_btn,info_btn;
    private int[] characters;
    private TextView sprawdz, infohel;
    private ImageButton ch1, ch2, ch3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        initViews();
        Intent i = getIntent();
        int sum= 0;
        int[] characters = i.getIntArrayExtra("inty");
        boolean isback = i.getBooleanExtra("recall",false);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            sum = IntStream.of(characters).sum();
        }
        else{
            sum = 0;
        }
        //sprawdz.setText(Arrays.toString(characters));
        if(isback && sum >=4 ){
            firstDPS(characters);
        }
        else{
            sprawdz.setText("Import characters first");
        }




    import_btn.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View view){
            Intent intent = new Intent(HELP_ACTIVITY.this,Characters_Choose.class);
            intent.putExtra("inty",characters);
            startActivity(intent);
        }
    });

    info_btn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            startActivity(new Intent(HELP_ACTIVITY.this,Pop.class));
        }
    });






    }
    private void healer(int[]characters){
        int chars = 0;

        for(int x = 0; x<12; x++) {
            if (characters[x] == 1 && support[x] == 1 && sub_dps[x]==0 && !(chosen_team[3]==x)){
                Log.d(TAG,"Dziala first dps");
                switch(chars){
                    case 0:
                        ch1.setImageResource(icons[x]);
                        int finalX = x;
                        ch1.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"pierwszy support");
                                choose(finalX,3);
                                secondhealer(characters);
                            }
                        });
                    case 1:
                        ch2.setImageResource(icons[x]);
                        int finalX1 = x;
                        ch2.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"drugi support");
                                choose(finalX1,3);
                                secondhealer(characters);
                            }
                        });
                    case 2:
                        ch3.setImageResource(icons[x]);
                        int finalX2 = x;
                        ch3.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"3ci support");
                                choose(finalX2,3);
                                secondhealer(characters);
                            }
                        });
                }
                chars++;
            }
        }
    }

    private void secondhealer(int[]characters){
        int chars = 0;

        for(int x = 0; x<12; x++) {
            if (characters[x] == 1 && support[x] == 1 && sub_dps[x]==0 && !(chosen_team[3]==x)){
                Log.d(TAG,"Dziala first dps");
                switch(chars){
                    case 0:
                        ch1.setImageResource(icons[x]);
                        int finalX = x;
                        ch1.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"pierwszy support");
                                choose(finalX,2);
                                complete();
                            }
                        });
                    case 1:
                        ch2.setImageResource(icons[x]);
                        int finalX1 = x;
                        ch2.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"drugi support");
                                choose(finalX1,2);
                                complete();
                            }
                        });
                    case 2:
                        ch3.setImageResource(icons[x]);
                        int finalX2 = x;
                        ch3.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"3ci support");
                                choose(finalX2,2);
                                complete();
                            }
                        });
                }
                chars++;
            }
        }
    }

    private void secondDPS(int[] characters){
        int chars = 0;

        for(int x = 0; x<12; x++) {
            if (characters[x] == 1 && support[x] == 0 && sub_dps[x]== 1){
                Log.d(TAG,"Dziala second dps");
                switch(chars){
                    case 0:
                        ch1.setImageResource(icons[x]);
                        int finalX = x;
                        ch1.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"PIERWSZY SUB DPS ZOSTAL WYBRANY");
                                choose(finalX,1);
                                healer(characters);

                            }
                        });
                    case 1:
                        ch2.setImageResource(icons[x]);
                        int finalX1 = x;
                        ch2.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"DRUGI SUB DPS ZOSTAL WYBRANY");
                                choose(finalX1,1);
                                healer(characters);

                            }
                        });
                    case 2:
                        ch3.setImageResource(icons[x]);
                        int finalX2 = x;
                        ch3.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"TRZECI SUB DPS ZOSTAL WYBRANY");
                                choose(finalX2,1);
                                healer(characters);
                            }
                        });
                }
                chars++;
            }
        }
    }

    private void firstDPS(int[] characters){
        int chars = 0;

        for(int x = 0; x<12; x++) {
            if (characters[x] == 1 && support[x] == 0 && sub_dps[x]==0){
                Log.d(TAG,"Dziala first dps");
                switch(chars){
                    case 0:
                        ch1.setImageResource(icons[x]);
                        int finalX = x;
                        ch1.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"pierwszy main dps");
                                choose(finalX,0);
                                secondDPS(characters);

                            }
                        });
                    case 1:
                        ch2.setImageResource(icons[x]);
                        int finalX1 = x;
                        ch2.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"drugi main dps");
                                choose(finalX1,0);
                                secondDPS(characters);
                            }
                        });
                    case 2:
                        ch3.setImageResource(icons[x]);
                        int finalX2 = x;
                        ch3.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                Log.d(TAG,"3ci main dps");
                                choose(finalX2,0);
                                secondDPS(characters);
                            }
                        });
                }
                chars++;
            }
        }
    }

    private void complete(){
        ch1.setVisibility(View.GONE);
        ch2.setVisibility(View.GONE);
        ch3.setVisibility(View.GONE);
        sprawdz.setText("Your loadout team is ready and some info:");
        String node1 = elements[chosen_team[0]];
        String node2 = elements[chosen_team[1]];
        String node3 = elements[chosen_team[2]];
        String node4 = elements[chosen_team[3]];
        int node_1 = 0, node_2 = 0, node_3=0,node_4=0;
        for(int e = 0; e<6; e++)
        {
            if(node1==ele[e]){
                node_1 = e;
            }
            if(node2==ele[e]){
                node_2 = e;
            }
            if(node3==ele[e]){
                node_3 = e;
            }
            if(node4==ele[e]){
                node_4 = e;
            }
        }
        String[] koniec = {"","","",""};
        koniec[0] = synergies[node_1][node_2];
        koniec[1] = synergies[node_3][node_4];
        koniec[2] = synergies[node_2][node_4];
        koniec[3] = synergies[node_1][node_4];
        String kon = koniec[0]+'\n'+koniec[1]+'\n'+koniec[2]+'\n'+koniec[3];
        infohel.setText(kon);

    }

    private void choose(int x,int z){
        //Log.d(TAG,"WYBRANO POSTAC POWSTARZAM WYBRANO POSTAC");
        ch1.setOnClickListener(null);
        ch3.setOnClickListener(null);
        ch2.setOnClickListener(null);
        ch1.setImageResource(R.drawable.empty_png);
        ch2.setImageResource(R.drawable.empty_png);
        ch3.setImageResource(R.drawable.empty_png);
        chosen_team[z] = x;
        update_team();

    }
    private void update_team(){
        view1.setImageResource(icons[chosen_team[0]]);
        view2.setImageResource(icons[chosen_team[1]]);
        view3.setImageResource(icons[chosen_team[2]]);
        view4.setImageResource(icons[chosen_team[3]]);

    }


    private void initViews(){
        import_btn = findViewById(R.id.buttonxd);
        sprawdz = findViewById(R.id.textfixed);
        ch1 = findViewById(R.id.choose1);
        ch2 = findViewById(R.id.choose2);
        ch3 = findViewById(R.id.choose3);
        view1 = findViewById(R.id.characterParty_);
        view2 = findViewById(R.id.characterParty_2);
        view3 = findViewById(R.id.characterParty_3);
        view4 = findViewById(R.id.characterParty_4);
        infohel = findViewById(R.id.infohelp);
        info_btn = findViewById(R.id.info_button);
    }

}