package com.example.summitclasses.Fragments.explorefrg.rv1.passivefull;

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

public class pastten extends AppCompatActivity {
    RecyclerView topicrecycle;
    RecyclerView.Adapter adapter;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topicimage);
        //hooks
        topicrecycle= findViewById(R.id.textrecycle);
        layout=findViewById(R.id.back);
        topicrecycledata();
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pastten.super.onBackPressed();
                finish();
            }
        });
    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();

        String url1="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%208%20(quality%3D90).jpg?alt=media&token=98d87fde-5da0-4d3e-b897-27b71e932c69";
        String url2="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%209%20(quality%3D90).jpg?alt=media&token=221274ce-dfac-453a-8adb-2031b6fe52fa";
        String url3="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2010%20(quality%3D90).jpg?alt=media&token=bb62643a-abf4-4081-94d6-d63679c5d6d4" ;
        String url4="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2011%20(quality%3D90).jpg?alt=media&token=d9e74562-f04a-417d-9ba9-63da9da987c9" ;
       featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));
        featuredlocation.add(new helperclassof(url4));




        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}