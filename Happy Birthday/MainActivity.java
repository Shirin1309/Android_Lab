package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
LinearLayout ll;
ImageView img;
Button hbd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=findViewById(R.id.ll);
        img=findViewById(R.id.img);
        hbd=findViewById(R.id.hbd);
        hbd.setOnClickListener(this);
        img.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.img)
        {
            img.setVisibility(View.GONE);
            ll.setVisibility(View.VISIBLE);
        }
        else
        {
            img.setVisibility(View.VISIBLE);
            ll.setVisibility(View.GONE);
        }

    }
}
