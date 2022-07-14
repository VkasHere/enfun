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
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.noticeadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.paragaphadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class Notice extends AppCompatActivity {
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
                Notice.super.onBackPressed();
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
        featuredlocation.add(new tpchelperclass("1.","A Cultural Program",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2","Annual Prize Distribution",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Articles For Magazine",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","Blood Donation Camp",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Cultural Week Celebrations",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","Changing in School Timings",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("7.","Children's Day",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("8.","A Debate Competition",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("9.","District Level Cricket Tournament",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("10.","Drama : Maharana Pratap",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("11.","Educational Tour",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("12.","Excursion to Goa",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("13.","Friendly Cricket Match",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("14.","Gandhi Jayanti",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("15.","Holi Holiday",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("16.","International Yoga Day",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("17.","Importance Of Yoga",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("18.","Inter-School Debate Competition",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("19.","Lost",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("20.","Medical Check up ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("21.","One Act play",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("22.","Quiz Competition",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("23.","Students' Union meeting" ,R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("24.","Swachh Bharat Awareness Camp",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("25.","Tour of Mt.abu",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("26.","Tour of Chittorgarh",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("27.","International Yoga day celebration",R.drawable.pngbarn));

        adapter= new noticeadapter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}
