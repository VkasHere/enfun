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

public class Pronoun extends AppCompatActivity {
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
                Pronoun.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%201%20(quality%3D90).jpg?alt=media&token=67f1d2b5-42e2-47ae-aec7-336016acf612" ;
        String url2 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%202%20(quality%3D90).jpg?alt=media&token=e19a3a5a-d1cf-4de2-bf46-24e72f6899e0" ;
        String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%203%20(quality%3D90).jpg?alt=media&token=098e8394-c8ca-4dd6-aa2e-c5da9122a68c" ;
        String url4 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%204%20(quality%3D90).jpg?alt=media&token=0114070e-0f13-47b0-8b69-ceea4843f673" ;
        String url5 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%205%20(quality%3D90).jpg?alt=media&token=29076783-3b44-414d-a27f-d481fff604bc" ;
        String url6 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%206%20(quality%3D90).jpg?alt=media&token=9328a117-afdb-4f7b-a1b7-74e233319ecc" ;
        String url7 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%207%20(quality%3D90).jpg?alt=media&token=59e755a8-18d8-4db6-a118-e9dc4487b06a" ;
        String url8 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%208%20(quality%3D90).jpg?alt=media&token=5360c3a1-64d1-4e4b-9a90-ac959880ee95" ;
        String url9 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%209%20(quality%3D90).jpg?alt=media&token=fe2a480c-7f42-4069-9e04-23347d7a26d2" ;
        String url10 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%2010%20(quality%3D90).jpg?alt=media&token=3a309113-e7dd-45be-8cdf-7a8d075fb07a" ;
        String url11 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPronoun%2FPage%2011%20(quality%3D90).jpg?alt=media&token=dad0e75c-3e53-43ac-8fc8-d83520892735" ;
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


        adapter = new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}