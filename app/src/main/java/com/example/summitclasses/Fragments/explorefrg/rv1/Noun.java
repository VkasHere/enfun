package com.example.summitclasses.Fragments.explorefrg.rv1;

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

public class Noun extends AppCompatActivity {
    RecyclerView topicrecycle;
    RecyclerView.Adapter adapter;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topicimage);

        //hooks
        topicrecycle = findViewById(R.id.textrecycle);
        layout = findViewById(R.id.back);
        topicrecycledata();
        //back
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Noun.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNoun%2FPage%201%20(quality%3D90).jpg?alt=media&token=517b46eb-02bb-4a9e-99a9-31e4c44eea46";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNoun%2FPage%202%20(quality%3D90).jpg?alt=media&token=21781aee-55b4-40c3-8349-5d5d8a6bf916" ;
        String url3 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNoun%2FPage%203%20(quality%3D90).jpg?alt=media&token=7442cad6-c8a7-4277-b315-470d276e42c8";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNoun%2FPage%204%20(quality%3D90).jpg?alt=media&token=fc10f49e-3fb5-4cf8-9085-2e25c2b85635";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNoun%2FPage%205%20(quality%3D90).jpg?alt=media&token=53c1c75c-c2e3-4466-bf8f-345e73527ad9";
        featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));
        featuredlocation.add(new helperclassof(url4));
        featuredlocation.add(new helperclassof(url5));


        adapter = new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}