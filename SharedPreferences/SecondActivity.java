package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences sp;
    TextView name,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sp = getSharedPreferences("My Pref",MODE_PRIVATE);
        name=(TextView) findViewById(R.id.name1);
        email=(TextView) findViewById(R.id.email1);
        if (sp.contains("Name"))
            name.setText(sp.getString("Name","None"));
        if (sp.contains("Email"))
            email.setText(sp.getString("Email","None"));

    }
    public  void firstActivity(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}