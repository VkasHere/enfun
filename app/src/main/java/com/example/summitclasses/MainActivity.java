package com.example.summitclasses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Animation scaleup,scaledown,bottom;
    ImageView imganim;
    TextView txtanim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imganim=findViewById(R.id.imganim);
        txtanim=findViewById(R.id.txtanim);
      scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
      scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);
      bottom= AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottomtoup);


new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        imganim.setAnimation(bottom);
        txtanim.setAnimation(bottom);
    }
},1000);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
Intent intent= new Intent(MainActivity.this,Login_activity.class);
startActivity(intent);
finish();
          }
      },5000);

    }


}