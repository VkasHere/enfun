package com.example.summitclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1fst;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.Exercise2;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.Exercise3;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.test11;

public class Test extends AppCompatActivity implements View.OnClickListener {
    TextView topic,topic2,topic3,Excer1,Excer2,Excer3,dtiExcer1,dtiExcer2,dtiExcer3;
    LinearLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        topic=findViewById(R.id.topic);
        back=findViewById(R.id.back);
        topic2=findViewById(R.id.topic2);
        topic3=findViewById(R.id.topic3);
        Excer1=findViewById(R.id.Excer1);
        Excer2=findViewById(R.id.Excer2);
        Excer3=findViewById(R.id.Excer3);
        dtiExcer1=findViewById(R.id.dtiExcer1);
        dtiExcer2=findViewById(R.id.dtiExcer2);
        dtiExcer3=findViewById(R.id.dtiExcer3);

        topic.setOnClickListener(Test.this);
        topic2.setOnClickListener(Test.this);
        topic3.setOnClickListener(Test.this);
        Excer1.setOnClickListener(Test.this);
        Excer2.setOnClickListener(Test.this);
        Excer3.setOnClickListener(Test.this);
        dtiExcer1.setOnClickListener(Test.this);
        dtiExcer2.setOnClickListener(Test.this);
        dtiExcer3.setOnClickListener(Test.this);
        //back
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test.super.onBackPressed();
                finish();
            }
        });

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.topic:
                Intent intent=new Intent(Test.this, test11.class);
                startActivity(intent);
                break;
            case R.id.topic2:
                Intent intent1=new Intent(Test.this, Exercise2.class);
                startActivity(intent1);
                break;
            case R.id.topic3:
                Intent intent2=new Intent(Test.this, Exercise3.class);
                startActivity(intent2);
                break;
            case R.id.Excer1:
                Intent intent3=new Intent(Test.this, com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.test11.class);
                startActivity(intent3);
                break;
            case R.id.Excer2:
                Intent intent4=new Intent(Test.this, com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.Exercise2.class);
                startActivity(intent4);
                break;
            case R.id.Excer3:
                Intent intent5=new Intent(Test.this, com.example.summitclasses.Fragments.explorefrg.rv1.passivefull.Exercise3.class);
                startActivity(intent5);
                break;
            case R.id.dtiExcer1:
                Intent intent6=new Intent(Test.this, com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.test11.class);
                startActivity(intent6);
                break;
            case R.id.dtiExcer2:
                Intent intent7=new Intent(Test.this, com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.Exercise2.class);
                startActivity(intent7);
                break;
            case R.id.dtiExcer3:
                Intent intent8=new Intent(Test.this, com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.Exercise3.class);
                startActivity(intent8);
                break;
        }
    }
}