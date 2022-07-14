package com.example.summitclasses.Fragments.explorefrg.rv2.paragraph;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.Introduction;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperadpterof;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperclassof;
import com.example.summitclasses.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class para extends AppCompatActivity {
    DatabaseReference reference;
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
        final String ref= getIntent().getStringExtra("chap");
        reference= FirebaseDatabase.getInstance().getReference().child("paragraph");
        //back
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                para.super.onBackPressed();
                finish();
            }
        });



                  String url=getIntent().getStringExtra("img");
                    topicrecycle.setHasFixedSize(true);
                    topicrecycle.setLayoutManager(new LinearLayoutManager(para.this,LinearLayoutManager.VERTICAL,false));
                    ArrayList<helperclassof> featuredlocation = new ArrayList<>();
                    featuredlocation.add(new helperclassof(url));
                    adapter= new helperadpterof(featuredlocation);
                    topicrecycle.setAdapter(adapter);


    }
}
