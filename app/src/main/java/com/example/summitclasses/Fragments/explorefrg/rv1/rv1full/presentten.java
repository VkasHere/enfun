package com.example.summitclasses.Fragments.explorefrg.rv1.rv1full;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1fst;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperadpterof;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.helperof.helperclassof;
import com.example.summitclasses.Fragments.helperadapter.helperadapter;
import com.example.summitclasses.Fragments.helperclass.helperclass1;
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
       String url1 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%201%20(quality%3D90)_compress83.jpg?alt=media&token=0f90d3e1-9d29-4a20-9462-b1597b1df621";
       String url2 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%202%20(quality%3D90)_compress22.jpg?alt=media&token=eabf2c35-f7ca-4ca8-a346-7411f1c93ba2";
       String url3 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%203%20(quality%3D90)_compress6.jpg?alt=media&token=9d9a9322-1eec-4159-a632-c0f85f821dd5";
       String url4 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%204%20(quality%3D90)_compress61.jpg?alt=media&token=69559fbf-c042-4364-b12c-5bbd5179c362";
       String url5 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%205%20(quality%3D90)_compress66.jpg?alt=media&token=fbe88dc4-7ea1-45f8-9b89-32b4a55d500b";
       String url6 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%206%20(quality%3D90)_compress79.jpg?alt=media&token=c69b07a4-5a71-4181-b202-a34a4ecd1b51";
       String url7 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%207%20(quality%3D90)_compress19.jpg?alt=media&token=e5f921a0-9778-44b3-8736-e0bada9954d9";
       String url8 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%208%20(quality%3D90)_compress39.jpg?alt=media&token=06492a59-7966-4b99-8643-d20180868606";
       String url9 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%209%20(quality%3D90)_compress70.jpg?alt=media&token=255fd4b9-0b19-470f-bec0-9f4372a69124";
       String url10 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%2010%20(quality%3D90)_compress86.jpg?alt=media&token=c98d9597-42a2-4806-bdb6-39def5eb0941";
       String url11 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%2011%20(quality%3D90)_compress6.jpg?alt=media&token=6708c230-e180-4a8e-b65f-4eb82412b3eb";
       String url12 ="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/chapters%2Fcv%2Fpresent%20%2FPage%2012%20(quality%3D90)_compress38.jpg?alt=media&token=5a9480c4-39db-4b89-a483-1b4af8da5be9";
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
