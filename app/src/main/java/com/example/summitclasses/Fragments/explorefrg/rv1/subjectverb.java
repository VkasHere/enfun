package com.example.summitclasses.Fragments.explorefrg.rv1;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull.intro;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperadpterof;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperclassof;
import com.example.summitclasses.R;

import java.util.ArrayList;

public class subjectverb extends AppCompatActivity {
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
                subjectverb.super.onBackPressed();
                finish();
            }
        });

    }

    private void topicrecycledata() {
        topicrecycle.setHasFixedSize(true);
        topicrecycle.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ArrayList<helperclassof> featuredlocation = new ArrayList<>();


        String url1 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%201%20(quality%3D90).jpg?alt=media&token=dfd24264-573b-46b0-9d29-bb1fe201c556 " ;
        String url2 =" https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%202%20(quality%3D90).jpg?alt=media&token=59fcd88d-8397-4c5b-b1b8-a4297e44a422" ;
        String url3 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%203%20(quality%3D90).jpg?alt=media&token=d6578092-996c-4901-94c2-a7330539f273" ;
        String url4 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%204%20(quality%3D90).jpg?alt=media&token=e048c077-02b8-4c52-bbee-ad2570288868 " ;
        String url5 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%205%20(quality%3D90).jpg?alt=media&token=55929888-910e-44ce-ae75-f6e83e7f18e4" ;
        String url6 = " https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%206%20(quality%3D90).jpg?alt=media&token=0be2ad7a-f30e-4ce2-a0df-7da215cb9ed8" ;
        String url7="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%207%20(quality%3D90).jpg?alt=media&token=2bbf6928-86ab-4674-af17-0b37d3d1eef2";
        String url8 = " https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%208%20(quality%3D90).jpg?alt=media&token=8eff5ee7-3743-4506-bfcd-754b4b0b8df1" ;
        String url9 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%209%20(quality%3D90).jpg?alt=media&token=71ef8ba2-9c4f-4d1b-93c9-5a82fa7b7e83" ;
        String url10 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%2010%20(quality%3D90).jpg?alt=media&token=1a534128-e77b-4fe9-a618-2d3251805d16" ;
        String url11 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%2011%20(quality%3D90).jpg?alt=media&token=34885705-b9a4-40f0-a457-2261cff358f3" ;
        String url12= " https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%2012%20(quality%3D90).jpg?alt=media&token=118bef5c-b14b-4888-9a0a-b9227345f912" ;
        String url13 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%2013%20(quality%3D90).jpg?alt=media&token=b9ba79b1-97fb-4057-928c-3d1bd58f6c2e " ;
        String url14 = "https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2FSubject%20verb%20con.%20%2FPage%2014%20(quality%3D90).jpg?alt=media&token=e43078cf-311a-4298-a671-2c8d525a3166 " ;

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
        featuredlocation.add(new helperclassof(url14));


        adapter = new helperadpterof(featuredlocation);
        topicrecycle.setAdapter(adapter);

    }
}