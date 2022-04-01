package com.example.uivalidations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    EditText et;
    TextView tv;
    CheckBox cb;
    LinearLayout ll;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et);
        tv=findViewById(R.id.tv);
        cb=findViewById(R.id.cb);
        ll=findViewById(R.id.ll);
        tb=findViewById(R.id.tb);
        et.addTextChangedListener(this);
        cb.setOnClickListener(this);
        tb.setOnCheckedChangeListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        String s=editable.toString();
        Float num=0f;
        if(s!=null && !s.isEmpty())
        {
            num=Float.parseFloat(s);
        }
        if(num>100)
        {
            editable.replace(0,editable.length(),"100");
        }

    }

    @Override
    public void onClick(View view) {
        if(cb.isChecked()) {
            Toast.makeText(getApplicationContext(), "TErms njhh", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(getApplicationContext(),"Accept terms",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b)
        {
            ll.setBackgroundColor(Color.BLUE);
            tv.setTextColor(Color.BLACK);
            et.setTextColor(Color.BLACK);
            cb.setTextColor(Color.BLACK);
        }
        else
        {
            ll.setBackgroundColor(Color.BLACK);
            tv.setTextColor(Color.WHITE);
            et.setTextColor(Color.WHITE);
            cb.setTextColor(Color.WHITE);
        }

    }
}
