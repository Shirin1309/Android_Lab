package com.example.shirin_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent it , chooser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View v)
    {
        if(v.getId() == R.id.LaunchMap)
        {
           it=new Intent (Intent.ACTION_VIEW);
           it.setData(Uri.parse("geo:10.065206,76.629128"));
           chooser = it.createChooser(it,"Launch Maps");
           startActivity(chooser);
        }
        if(v.getId() == R.id.GPlay)
        {
            it=new Intent (Intent.ACTION_VIEW);
            it.setData(Uri.parse("market://details?id=com.google.android.youtube&hl=en_IN&gl=US"));
            chooser = it.createChooser(it,"Launch Google Play");
            startActivity(chooser);
        }
        if(v.getId() == R.id.Email)
        {
            it=new Intent (Intent.ACTION_SEND);
            it.setData(Uri.parse("mailto"));
            String to[]={"shirinshiyas13@gmail.com"};
            it.putExtra(Intent.EXTRA_EMAIL,to);
            it.putExtra(Intent.EXTRA_SUBJECT,"From emulator");
            it.setType("message/rfc822");
            chooser = it.createChooser(it,"Launch Email");
            startActivity(chooser);
        }
        if(v.getId() == R.id.sendImage)
        {
            it = new Intent(Intent.ACTION_SEND);
            Uri imageUri = Uri.parse("android.resource://Shirin_Intent/drawable/" + R.drawable.hi);
            it.setType("image/*");
            it.putExtra(it.EXTRA_STREAM, imageUri);
            it.putExtra(it.EXTRA_TEXT, "image");
            chooser = it.createChooser(it, "Messenger");
            startActivity(chooser);
        }
    }

}
