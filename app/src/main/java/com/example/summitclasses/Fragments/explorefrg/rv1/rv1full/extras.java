package com.example.summitclasses.Fragments.explorefrg.rv1.rv1full;

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

        String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%201%20(quality%3D90)_compress97.jpg?alt=media&token=dce2bf65-0b37-4c1d-b27b-06ba94093e3a";
        String url2 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%202%20(quality%3D90)_compress79.jpg?alt=media&token=6e42f4fa-3e93-4d0a-861f-6a86d6aa0f05";
        String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%203%20(quality%3D90)_compress73.jpg?alt=media&token=f7f0c3c0-7915-4a5d-ad4f-4d5a67743486";
        String url4 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%204%20(quality%3D90)_compress63.jpg?alt=media&token=365ea7cb-c5fd-4907-a223-ce201f65dc65";
        String url5 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%205%20(quality%3D90)_compress30.jpg?alt=media&token=31600f88-c0b8-4818-99bb-46daf7339b20";
        String url6 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%206%20(quality%3D90)_compress19.jpg?alt=media&token=20f56514-fcfb-476c-8dcf-4a8432beb7d9";
        String url7 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%207%20(quality%3D90)_compress91.jpg?alt=media&token=891da9cb-ba0c-4ad6-a50a-654943ab4c54";
        String url8 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%208%20(quality%3D90)_compress73.jpg?alt=media&token=b333fe2b-874f-4dbc-bf90-bb060096cd37";
        String url9 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%209%20(quality%3D90)_compress55.jpg?alt=media&token=6a27821d-0226-42d1-aadd-aa40de143ca1";
        String url10 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%2010%20(quality%3D90)_compress50.jpg?alt=media&token=35e0429e-6788-4523-8de7-a3a547bc04df";
        String url11 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%2011%20(quality%3D90)_compress12.jpg?alt=media&token=2eef846a-9f6b-4c11-a4cd-67fc1d990e35";
        String url12 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%2012%20(quality%3D90)_compress29.jpg?alt=media&token=cf4a4f9b-31dd-4267-9bae-56abb28d9f4a";
        String url13 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fextra%2FPage%2013%20(quality%3D90)_compress28.jpg?alt=media&token=da0fb746-24e1-4d62-940c-5a61ea74ceec";
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
        featuredlocation.add(new helperclassof(url13));



        adapter= new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}
