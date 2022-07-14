package com.example.summitclasses.Fragments.explorefrg.rv3;

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
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.reportadpter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class Report extends AppCompatActivity {
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
                Report.super.onBackPressed();
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
        featuredlocation.add(new tpchelperclass("1.","Morning Prayer Session in a School",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2.","A boy saves Friend's Life ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Poor Facilities of Games and Sports",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","Poor Water Supply Keeps Dundlod Thirsty",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Ambedkar School Celebrates Independence Day Function",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","A House on Fire",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("7.","Thieves Arrested",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("8.","Guest Team Wins Cricket Match in Chaksu",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("9.","A Jobless Man Kills Himself",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("10.","Robbers Loot Punjab National Bank",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("11.","Flower Exhibition Pulls People",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("12.","Political Meeting Add Colors to Electioneering",R.drawable.pngbarn));
        adapter= new reportadpter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}
