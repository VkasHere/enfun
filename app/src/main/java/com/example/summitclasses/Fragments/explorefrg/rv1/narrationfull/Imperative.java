package com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperadpterof;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperclassof;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class Imperative extends AppCompatActivity {
    RecyclerView topicrecycle;
    RecyclerView.Adapter adapter;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topicimage);

        //hooks
        topicrecycle= findViewById(R.id.textrecycle);
        layout = findViewById(R.id.back);
        topicrecycledata();
        //back
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Imperative.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2014%20(quality%3D90).jpg?alt=media&token=95ad7889-374c-489e-9df0-ad3160e2cd52";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2015%20(quality%3D90).jpg?alt=media&token=464f99cc-9e50-4e5c-aa80-ee7204605781";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2016%20(quality%3D90).jpg?alt=media&token=4f0c48e2-3ea5-406c-887c-86527bdf5647";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2017%20(quality%3D90).jpg?alt=media&token=82c56036-e6b0-45d8-96dd-15eb29a8c0ef";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2018%20(quality%3D90).jpg?alt=media&token=b01a5e00-182c-45f0-bfc2-ac6ae87143755";
        featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));
        featuredlocation.add(new helperclassof(url4));
        featuredlocation.add(new helperclassof(url5));


        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}
