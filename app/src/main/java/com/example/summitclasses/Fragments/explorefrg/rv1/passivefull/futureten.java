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

        String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2012%20(quality%3D90).jpg?alt=media&token=ca4a5064-078f-49b8-beca-19ba56793dc2" ;
        String url2 =  "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2013%20(quality%3D90).jpg?alt=media&token=b0c20c67-7127-4471-84c8-8fc5902f9ac6" ;
        String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2014%20(quality%3D90).jpg?alt=media&token=471a10da-43c8-4d9f-8e60-b057037cf89b" ;
         featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));




        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}