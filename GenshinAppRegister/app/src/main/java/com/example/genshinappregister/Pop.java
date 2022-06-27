package com.example.genshinappregister;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;


public class Pop extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TextView text = findViewById(R.id.textView12);
//        String maciej = "Buff - wzmocnienie jednego elementu poprzez zdwojenie \nCrystalize - dodatkowe obrazenia w postaci odłamków \nMelt - osłabienie wytrzymałości przeciwnika \n Overload - Wybuch obszarowy \n Vaporize - wysuszenie/wyssanie obrony \n Swirl - atak przemieszczający oponentów \nsuperconduct - zadaje obrażenia wewnętrzne \nBurn - spalenie";
//
//        text.setText("maciej");
        setContentView(R.layout.popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
    }

}
