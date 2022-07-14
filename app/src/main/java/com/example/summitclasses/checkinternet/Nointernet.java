package com.example.summitclasses.checkinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.summitclasses.R;
import com.example.summitclasses.dashbord;

public class Nointernet extends AppCompatActivity {
    LinearLayout rty,ext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nointernet);

        //hooks
        rty= findViewById(R.id.reload);
        ext= findViewById(R.id.ext);
        //onclicklistner
        //set onclick listener
        rty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), dashbord.class);
                startActivity(intent);
                finish();
            }
        });
        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nointernet.super.onBackPressed();
                finish(); }
        });
    }
}