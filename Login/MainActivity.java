package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a, b;
    Button btn;
    String x = "sherin";
    String y = "sheri";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.bt);
        a = (EditText) findViewById(R.id.un);
        b = (EditText) findViewById(R.id.pwd);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p=a.getText().toString();
                String q=b.getText().toString();
                if(p.equalsIgnoreCase(x) && q.equalsIgnoreCase(y)) {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_LONG).show();


            }
        });

    }

}
