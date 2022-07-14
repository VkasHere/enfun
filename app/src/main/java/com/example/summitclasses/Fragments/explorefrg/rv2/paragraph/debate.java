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
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.debateadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.paragaphadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class debate extends AppCompatActivity {
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
                debate.super.onBackPressed();
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
        featuredlocation.add(new tpchelperclass("1.","Are We Happier than Our Forefathers?",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2.","English Education: A Boon or a Bane for Our Children",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Television (TV)",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","Urban Life Versus Rural Life",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Dowry: A Token of Love or a Curse",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","Media",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("7.","Commercialization of Education",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("8.","Hope alone sustains life",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("9.","Man is the Centre of the Universe. Arguments in favor",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("10."," Experiments On Animals ban in Labs",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("11.","Science is God",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("12.","Internet is a panacea",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("13.","Hard work pays in the long run",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("14.","Destiny favors the brave",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("15.","If you want peace, be prepared for war",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("16.","Your freedom ends where my nose begins",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("17.","Money makes the mare go",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("18.","Health is wealth",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("19.","Man proposes so shall you reap",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("20.","As you sow, so shall you reap",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("21.","Salute your duty and you need not salute anyone else",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("22.","Old age is the best part of life",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("23.","Spare the rad, spoil the child",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("24.","Weigh before you speak",R.drawable.pngbarn));
        adapter= new debateadapter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}
