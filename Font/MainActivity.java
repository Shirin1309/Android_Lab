package com.example.shirin_font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);

        Typeface myFont=Typeface.createFromAsset(getAssets(),"font/LucyTheCatRegular.ttf");
        tv.setTypeface(myFont);
    }
}
