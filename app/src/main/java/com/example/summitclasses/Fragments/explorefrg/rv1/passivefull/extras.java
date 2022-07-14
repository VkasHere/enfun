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

public class extras extends AppCompatActivity {
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
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                extras.super.onBackPressed();
                finish();
            }
        });
    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();

        String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2015%20(quality%3D90).jpg?alt=media&token=9238ed50-f3dc-4857-a765-0faedaf3b7b5";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2016%20(quality%3D90).jpg?alt=media&token=62a26f37-bf6d-4a4a-be39-90dc26006ff2";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2017%20(quality%3D90).jpg?alt=media&token=bd03fd7f-e94c-4059-8df4-81e918b06a18";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2018%20(quality%3D90).jpg?alt=media&token=5df3107d-83fe-494b-b047-f928648f952f";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2019%20(quality%3D90).jpg?alt=media&token=1d84e7d1-e731-4701-b982-97e1391022db";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2020%20(quality%3D90).jpg?alt=media&token=72d51b1a-d20f-4a3e-84a3-4d77aab6329c";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2021%20(quality%3D90).jpg?alt=media&token=bce70b5e-0b50-450a-8e2c-7586e303abda";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%2022%20(quality%3D90).jpg?alt=media&token=9f5dc16a-ebea-4b45-8b9a-b7525bc914d0";
        featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));
        featuredlocation.add(new helperclassof(url3));
        featuredlocation.add(new helperclassof(url4));
        featuredlocation.add(new helperclassof(url5));
        featuredlocation.add(new helperclassof(url6));
        featuredlocation.add(new helperclassof(url7));
        featuredlocation.add(new helperclassof(url8));




        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}
