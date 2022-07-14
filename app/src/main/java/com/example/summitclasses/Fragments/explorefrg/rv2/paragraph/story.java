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
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.storyadapter;
import com.example.summitclasses.Fragments.explorefrg.topichelperclass.tpchelperclass;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class story extends AppCompatActivity {
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
                story.super.onBackPressed();
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
        featuredlocation.add(new tpchelperclass("1.","My Dream in Life",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("2.","My Favourite Teacher ",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("3.","Prize Distribution",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("4.","School Library",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("5.","Exclamatory Rules",R.drawable.pngbarn));
        featuredlocation.add(new tpchelperclass("6.","Test ",R.drawable.pngbarn));

        adapter= new storyadapter(featuredlocation);
        topicrv1.setAdapter(adapter);

    }
}
