package com.example.shirin_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText un;
    Button btn;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText)findViewById(R.id.uname);
        btn=(Button)findViewById(R.id.bt);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt)
        {
           String a=un.getText().toString();
           sp=getSharedPreferences("Details",MODE_PRIVATE);
           SharedPreferences.Editor editor=sp.edit();
           editor.putString("username",a);
           editor.commit();
            Intent i=new Intent(this,Main2Activity.class);
            startActivity(i);
        }
    }
}
