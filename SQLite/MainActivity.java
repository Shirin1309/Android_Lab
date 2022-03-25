package com.example.shirin_sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;
    TextView textView3;
    Button b1,b2;


    database dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        textView3 = findViewById(R.id.textView3);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String user = editText.getText().toString();
                String role = editText1.getText().toString();
                long id = dd.insertData(user, role);
                if (id < 0)
                    Toast.makeText(getApplicationContext(),"Unsucessfull",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"sucessfull",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String st = dd.display();
                textView3.setText(st);
            }
        });
        dd = new database(this,"shop",null,2);
        dd.getWritableDatabase();
    }
}
