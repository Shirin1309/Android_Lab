package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button) findViewById(R.id.btn1);
        t1=(EditText)findViewById(R.id.et1) ;
        t2=(EditText)findViewById(R.id.et2);
        sp=getSharedPreferences("Store",MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=t1.getText().toString();
                String b=t2.getText().toString();
                String c=sp.getString("Uname","").toString();
                String d= sp.getString("pwd","").toString();
                if(a.equals(c) && b.equals(d)){
                    View l= LayoutInflater.from(MainActivity2.this).inflate(R.layout.custom,null);
                    Toast t=new Toast(getApplicationContext());
                    t.setDuration(Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER,0,180);
                    t.setView(l);
                    t.show();
                }
               else
                {
                    Toast.makeText(MainActivity2.this, "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
