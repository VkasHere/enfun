package com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull;

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

public class DtoIRules extends AppCompatActivity {
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
                DtoIRules.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%202%20(quality%3D90).jpg?alt=media&token=082f2c0f-42ec-4395-9798-dc1d8e858264";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%203%20(quality%3D90).jpg?alt=media&token=f550c401-c767-4b37-bab0-cc3491606762";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%204%20(quality%3D90).jpg?alt=media&token=b6b3981d-6316-4a63-9f22-95fb66492553";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%205%20(quality%3D90).jpg?alt=media&token=8e0e3321-e4ab-465a-a4f8-875fdb4d3c47";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%206%20(quality%3D90).jpg?alt=media&token=e34ee325-48c5-44f4-82b7-096fe513066f";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%207%20(quality%3D90).jpg?alt=media&token=7941f5bb-f387-480b-b901-7b7776f78451";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%208%20(quality%3D90).jpg?alt=media&token=95d869be-561e-4ea9-aa18-8ecea214026f";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%209%20(quality%3D90).jpg?alt=media&token=47f6dd5e-95d0-4657-a95c-c7a17e801dd8";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2010%20(quality%3D90).jpg?alt=media&token=5ada1980-f0fa-4925-a725-36754093a847";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2011%20(quality%3D90).jpg?alt=media&token=4a5ba25a-b766-47f4-bdad-3470993df777";
        String url11="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2012%20(quality%3D90).jpg?alt=media&token=996d9dcd-75ad-41a0-a03e-d44f549dcb8c";
        String url12 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FNarration%2FPage%2013%20(quality%3D90).jpg?alt=media&token=5c02e689-e142-4260-86d5-275d7058ccc3";
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
        featuredlocation.add(new helperclassof(url12));


        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}
