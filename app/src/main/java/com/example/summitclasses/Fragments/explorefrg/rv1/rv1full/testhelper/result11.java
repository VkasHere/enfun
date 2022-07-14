package com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.testhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1fst;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.test11;
import com.example.summitclasses.R;
import com.example.summitclasses.dashbord;

public class result11 extends AppCompatActivity {
    TextView notattempt,scoretxt,outnum,outof,noout,noattemp,qut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result11);
        notattempt=findViewById(R.id.notattempt);
        outnum=findViewById(R.id.outnum);
        scoretxt=findViewById(R.id.scoretxt);
        outof=findViewById(R.id.outof);
        noout=findViewById(R.id.noout);
        noattemp=findViewById(R.id.noattemp);
        qut=findViewById(R.id.qut);

        int score=getIntent().getIntExtra("score",0);
        int wrong=getIntent().getIntExtra("wrong",0);
        int out=getIntent().getIntExtra("outof",0);
        int total= score + wrong;
        noattemp.setText(String.valueOf(out-total));
        noout.setText(String.valueOf(out));
        scoretxt.setText(String.valueOf(getIntent().getIntExtra("score",0)));
        notattempt.setText(String.valueOf(getIntent().getIntExtra("wrong",0)));
        outnum.setText(String.valueOf(getIntent().getIntExtra("outof",0)));
        outof.setText(String.valueOf(getIntent().getIntExtra("outof",0)));
        qut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        result11.super.onBackPressed();
                        finish();

            }
        });

    }
}