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

public class presentten extends AppCompatActivity {
    RecyclerView topicrecycle;
    RecyclerView.Adapter adapter;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topicimage);

        //hooks for textview
        topicrecycle= findViewById(R.id.textrecycle);
        layout = findViewById(R.id.back);
        topicrecycledata();
        //back
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentten.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();
       String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%203%20(quality%3D90).jpg?alt=media&token=35d7f5ec-a3c8-4d71-93b4-ea702aaa7a4a";
       String url2 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%204%20(quality%3D90).jpg?alt=media&token=eaa95d64-31dc-455e-8a94-0266a2b44932";
       String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%205%20(quality%3D90).jpg?alt=media&token=2b4303fb-39ac-4797-9b8d-9d00cfcf4fe2";
       String url4 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%206%20(quality%3D90).jpg?alt=media&token=8ab5d799-c637-4ae1-98a1-87a7df6acaa6";
       String url5 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%207%20(quality%3D90).jpg?alt=media&token=08247e21-1c65-4587-b4fc-e28cb86cec15";
        featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));
        featuredlocation.add(new helperclassof(url4));
        featuredlocation.add(new helperclassof(url5));



        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);
    }
}
