package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn);
        t1=(EditText)findViewById(R.id.us);
        t2=(EditText) findViewById(R.id.pwd);
        sp=getSharedPreferences("Store",MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor e=sp.edit();
                String a=t1.getText().toString();
                String b=t2.getText().toString();
                e.putString("Uname",a);
                e.putString("pwd",b);
                e.apply();

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }
}