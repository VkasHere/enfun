package com.example.summitclasses.Fragments.explorefrg.rv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.Fragments.profileedit.editprofile;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class rv1fst extends AppCompatActivity {
    RecyclerView topicrv1;
    RecyclerView.Adapter adapter;
    ImageView topicimg;
    LinearLayout layout;
    TextView topictxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv1copy);

        //hooks
        topicrv1=findViewById(R.id.topicrv1);
        topicimg=findViewById(R.id.topicimg);
        topictxt=findViewById(R.id.topictxt);
        layout=findViewById(R.id.back);

        //intent get extras
      String topic=getIntent().getStringExtra("chap");
      String img=getIntent().getStringExtra("url");

      //back
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rv1fst.super.onBackPressed();
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
        featuredlocation.add(new tpchelperclass("1.","Introduction",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2.","Present Tense",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Past Tense",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","Future Tense",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Extra Rules",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","Exercise 1 ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("7.","Exercise 2 ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("8.","Exercise 3 ",R.drawable.pngbarn));

        adapter= new tpchelperadapter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}