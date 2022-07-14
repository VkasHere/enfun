package com.example.summitclasses.Fragments.explorefrg.rv2.paragraph;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.paragaphadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.speechadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class speech extends AppCompatActivity {
    RecyclerView topicrv1;
    RecyclerView.Adapter adapter;
    ImageView topicimg;
    LinearLayout layout;
    TextView topictxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv1fst);

        //hooks
        topicrv1 = findViewById(R.id.topicrv1);
        topicimg = findViewById(R.id.topicimg);
        topictxt = findViewById(R.id.topictxt);
        layout = findViewById(R.id.back);

        //intent get extras
        String topic = getIntent().getStringExtra("chap");
        String img = getIntent().getStringExtra("url");

        //back
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speech.super.onBackPressed();
                finish();
            }
        });

        //set topic and image
        topictxt.setText(topic);
        Glide.with(this).load(img).into(topicimg);

        //topicrv1 data method
        topicrv1data();
    }
    private void topicrv1data() {
        topicrv1.setHasFixedSize(true);
        topicrv1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<tpchelperclass> featuredlocation = new ArrayList<>();
        featuredlocation.add(new tpchelperclass("1.","Pets Need Unique Care and Handling",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2.","Pets Do Not Need Unique Care and Handling",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Ban the Profession of Snake Charmer",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","The Common Bond Between Plants and Animals",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Modern Age Is the Age of Computers",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","The Village Life",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("7.","My Duty as A Citizen of India",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("8.","The Mobile Handset to Students : A Boon or A Curse",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("9.","The Importance of Newspapers",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("10.","Importance of Forests/Trees",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("11.","Importance of Good Manners",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("12.","Teacher’s Day",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("13.","Joys of Playing Outdoor games",R.drawable.pngbarn));

        adapter= new speechadapter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}
