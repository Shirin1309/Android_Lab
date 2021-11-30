package com.example.shirin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user , pwd;
    String a ="sheri@123";
    String b ="sherin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v)
    {
        if(v.getId()==R.id.button)
        {
            user=(EditText)findViewById(R.id.username);
            pwd=(EditText)findViewById(R.id.password);
            String c=user.getText().toString();
            String d=pwd.getText().toString();
            if(c.equals(a) && d.equals(b))
            {
                Toast.makeText(this,"login successfull",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"inalid login",Toast.LENGTH_LONG).show();
            }
        }
    }
}
