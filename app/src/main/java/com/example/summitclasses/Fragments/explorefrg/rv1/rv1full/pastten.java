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

        String url1="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%201%20(quality%3D90)_compress40.jpg?alt=media&token=79c702fb-55f0-44b4-816d-1b60977e3fe3";
        String url2="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%202%20(quality%3D90)_compress7.jpg?alt=media&token=a84c5459-45a9-444a-b539-9c8e5b01788f";
        String url3="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%203%20(quality%3D90)_compress14.jpg?alt=media&token=cf212233-f2ce-4a88-a705-9d08eefaa5f8";
        String url4="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%204%20(quality%3D90)_compress17.jpg?alt=media&token=d98f229f-365e-476c-b2d1-156ffabab8a9";
        String url5="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%205%20(quality%3D90)_compress22.jpg?alt=media&token=6363a580-e42a-435f-827d-9e119a45326f";
        String url6="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%206%20(quality%3D90)_compress43.jpg?alt=media&token=57510689-ad61-4c7b-b21a-93ac6ccd4f02";
        String url7="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%207%20(quality%3D90)_compress80.jpg?alt=media&token=06646fc9-596f-452b-a525-1898b08c887e";
        String url8="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%208%20(quality%3D90)_compress86.jpg?alt=media&token=d68c929e-4ec3-4534-a4d0-5b40bd948f58";
        String url9="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%209%20(quality%3D90)_compress98.jpg?alt=media&token=a5170c21-5cfe-4ed5-89f5-038430d35277";
        String url10="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpast%2FPage%2010%20(quality%3D90)_compress39.jpg?alt=media&token=8bc2ae2c-fc86-4305-b6ce-f147301571b0";
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



        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}