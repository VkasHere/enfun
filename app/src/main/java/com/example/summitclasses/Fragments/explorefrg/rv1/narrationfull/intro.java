package com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.Introduction;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperadpterof;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperclassof;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class intro extends AppCompatActivity {
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
                intro.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%201%20(quality%3D90).jpg?alt=media&token=6cc4b1ad-7ec3-4383-bfa9-fe19a2e6647c";
        String url2 ="";
        String url3 ="";
        featuredlocation.add(new helperclassof(url1));


        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}
