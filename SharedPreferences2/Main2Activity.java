package com.example.shirin_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.tv);
        sp=getSharedPreferences("Details",MODE_PRIVATE);
        if(sp.contains("username"))
        {
            String b=sp.getString("username","no user");
            tv.setText(b);
        }
    }
}
