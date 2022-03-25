package com.example.leycafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String ice[] = {"Puttu Icecream","Fruit Short","Fruit Salad","Spanish Delight"};
    ListView list;
    ImageView img;
    Button b;
    Spinner spin;
    SharedPreferences sp;
    int cost[]={150,200,180,170};
    int top[]={50,60,70};
    int image[]={R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        img=(ImageView)findViewById(R.id.img1);
        b=(Button)findViewById(R.id.pay) ;
        sp=getSharedPreferences("pref",MODE_PRIVATE);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ice);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        img.setImageResource(image[i]);
        SharedPreferences.Editor edit=sp.edit();

    }
}
