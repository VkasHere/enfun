package com.example.summitclasses.Fragments.explorefrg.rv1.passivefull;

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
        topicrecycle = findViewById(R.id.textrecycle);
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
        topicrecycle.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 =" https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%201%20(quality%3D90).jpg?alt=media&token=93447ad8-1ed3-4aa4-b27e-7e38172f73ed" ;
        String url2 =" https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FPassive%20voice%20%2FPage%202%20(quality%3D90).jpg?alt=media&token=5d37124c-7de4-4b85-9110-66cff9991528" ;
        featuredlocation.add(new helperclassof(url1));
        featuredlocation.add(new helperclassof(url2));


        adapter = new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);
    }
}
