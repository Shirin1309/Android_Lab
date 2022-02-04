package com.example.calc_eg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,add,eq,cl,b3,b4,mul;
    TextView tv;
    float r1;
    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        add=(Button)findViewById(R.id.add);
        mul=(Button)findViewById(R.id.mul);
        eq=(Button)findViewById(R.id.eq);
        cl=(Button)findViewById(R.id.clr);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().toString()+"4");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1=Float.parseFloat(tv.getText().toString());
                k=1;
                tv.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1=Float.parseFloat(tv.getText().toString());
                k=2;
                tv.setText("");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(k==1)
               {
                  Float jk=r1+Float.parseFloat(tv.getText().toString());
                   tv.setText(String.valueOf(jk));
               }
               if(k==2)
               {
                   Float rm=r1*Float.parseFloat(tv.getText().toString());
                   tv.setText(String.valueOf(rm));
               }

            }
        });
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
                r1=0f;
            }
        });

    }
}
