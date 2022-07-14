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
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.invitationadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.paragaphadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class Invitation extends AppCompatActivity {
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
                Invitation.super.onBackPressed();
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
        featuredlocation.add(new tpchelperclass("1.","Accepting Dinner party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2.","Accepting Ekadashi udhyapan invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Declining Birthday party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","Accepting Annual function invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Declining Birthday party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","Declining Dinner party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("7.","Declining Diwali Party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("8.","Declining inauguration ceremony invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("9.","Accepting Dinner party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("10.","Accepting get-together invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("11.","Accepting inauguration ceremony invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("12.","Declining Sister's engagement invitation ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("13.","Accepting sister's engagement invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("14.","Accepting invitation of spending summer vacation together ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("15.","Accepting success party invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("16.","Declining Ekadashi udhyapan invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("17.","Declining get-together invitation",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("18.","Accepting invitation of sister wedding ceremony",R.drawable.pngbarn));

        adapter= new invitationadapter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}
