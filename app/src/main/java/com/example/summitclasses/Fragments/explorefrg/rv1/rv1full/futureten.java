package com.example.summitclasses.Fragments.explorefrg.rv1.rv1full;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperadpterof;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperclassof;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class futureten extends AppCompatActivity {

    RecyclerView topicrecycle;
    RecyclerView.Adapter adapter;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topicimage);

        //hooks
        topicrecycle= findViewById(R.id.textrecycle);
        layout= findViewById(R.id.back);
        topicrecycledata();
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                futureten.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();

        String url1 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%201%20(quality%3D90)_compress60.jpg?alt=media&token=a88015e4-a83e-45e3-adba-f519a78b8135";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%202%20(quality%3D90)_compress55.jpg?alt=media&token=ebaac04c-a159-410d-b83a-67fb4d35ac31";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%203%20(quality%3D90)_compress40.jpg?alt=media&token=899524dc-6e32-4a90-8dbd-a100f006aae7";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%204%20(quality%3D90)_compress24.jpg?alt=media&token=b25137f8-df00-4db3-abb2-64c1787c59ee";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%205%20(quality%3D90)_compress17.jpg?alt=media&token=53ac397f-2026-4322-80df-230425d3c0b6";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%206%20(quality%3D90)_compress46.jpg?alt=media&token=5f788f01-46fb-4030-9aa7-9b2c73f990bc";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%207%20(quality%3D90)_compress46.jpg?alt=media&token=4bccd9a3-5033-4b29-b08b-b90528ece33b";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%208%20(quality%3D90)_compress42.jpg?alt=media&token=bea7e317-43e8-454d-a524-98b08f1541be";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%209%20(quality%3D90)_compress95.jpg?alt=media&token=54a62443-1bad-4286-b705-a8a7ac98328c";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%2010%20(quality%3D90)_compress84.jpg?alt=media&token=cd033cc5-8bca-40e5-8284-34c7f46731fd";
        String url11= "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Ffuture%2FPage%2011%20(quality%3D90)_compress88.jpg?alt=media&token=dafc1030-683d-4723-a5e4-9ab911cee5d0";
        featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));
        featuredlocation.add(new helperclassof(url4));
        featuredlocation.add(new helperclassof(url5));
        featuredlocation.add(new helperclassof(url6));
        featuredlocation.add(new helperclassof(url7));
        featuredlocation.add(new helperclassof(url8));
        featuredlocation.add(new helperclassof(url9));
        featuredlocation.add(new helperclassof(url10));
        featuredlocation.add(new helperclassof(url11));



        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}