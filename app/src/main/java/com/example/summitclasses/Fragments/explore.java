package com.example.summitclasses.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.Fragments.helperadapter.helperadapter;
import com.example.summitclasses.Fragments.helperadapter.heperadapter2;
import com.example.summitclasses.Fragments.helperadapter.heperadapter3;
import com.example.summitclasses.Fragments.helperclass.helperclass1;
import com.example.summitclasses.R;
import com.example.summitclasses.helperclasses.userhelper;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class explore extends Fragment {
    RecyclerView rv1,rv2,rv3;
    RecyclerView.Adapter adapter;
    TextView username;
    ImageView hello;
    DatabaseReference reference;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_explore, container, false);
        //hooks
        rv1=v.findViewById(R.id.rv1);
        rv2=v.findViewById(R.id.rv2);
        rv3=v.findViewById(R.id.rv3);
        hello=v.findViewById(R.id.hello);
        username=v.findViewById(R.id.usrshow);
        // image load
        String image="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fhelloe-removebg-preview.png?alt=media&token=22dc0686-ff39-4fb9-813f-38acdf5eb02f";
        Glide.with(getActivity()).load(image).into(hello);
        SharedPreferences sp1= getActivity().getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        final String vn = sp1.getString("mobilenum","");
        reference= FirebaseDatabase.getInstance().getReference().child("users").child(vn);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                  String user= snapshot.child("fullname").getValue().toString();
                  username.setText(user);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        //data
        rv1data();
        rv2data();
        rv3data();

        return  v;
    }

    private void rv1data() {
        rv1.setHasFixedSize(true);
        rv1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        ArrayList<helperclass1> featuredlocation = new ArrayList<>();
        String url1="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2F11070_compress12.jpg?alt=media&token=072a37ea-f043-48bb-ad3f-50da86670c15";
        String url2="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2F10741_compress36.jpg?alt=media&token=51f5c2d7-94ab-466b-a9ad-9983aa87a0d4";
        String url3="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2F10088_compress78.jpg?alt=media&token=6cd11ca9-d453-4447-89f3-c8feda070e10";
        String url4="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2F3255474_compress47.jpg?alt=media&token=a3013764-ca4e-4130-b376-cf0b22974f2f";
        String url5="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-keep-yourself-busy-in-isolation.png?alt=media&token=a9347a22-f6a4-46d0-be42-38767a726e55";
        String url6="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-online-education-4.png?alt=media&token=b384960d-a608-4787-ac29-2cf6cdc65670";

        featuredlocation.add(new helperclass1(url1, "Correct form of the Verbs"));
        featuredlocation.add(new helperclass1(url2,"Direct and Indirect narration"));
        featuredlocation.add(new helperclass1(url3,"Active and Passive Voice"));
        featuredlocation.add(new helperclass1(url4,"Noun"));
        featuredlocation.add(new helperclass1(url5,"Pronoun"));
        featuredlocation.add(new helperclass1(url6,"Subject verb agreement"));

        adapter= new helperadapter(featuredlocation);
        rv1.setAdapter(adapter);
    }
    private void rv2data() {
        rv2.setHasFixedSize(true);
        rv2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        ArrayList<helperclass1> featuredlocation = new ArrayList<>();
        String url1="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-reading-books.png?alt=media&token=9f30f917-b2f7-467c-81f8-9ba4c027b2ed";
        String url2="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-reading-of-books-1.png?alt=media&token=ca7acb7c-4747-47fb-aa27-d2512edf8506";
        String url3="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-remote-learning.png?alt=media&token=c9020132-9fe9-4f0c-a7f9-ce1d46ef29fb";
        String url4="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-school-assignment.png?alt=media&token=fbf7bca1-5e5e-4477-99db-42cf467e674b";
       featuredlocation.add(new helperclass1(url1, "Short Paragraphs"));
        featuredlocation.add(new helperclass1(url2,"Speech writing"));
        featuredlocation.add(new helperclass1(url3,"Argument Writing"));

        adapter= new heperadapter2(featuredlocation);
        rv2.setAdapter(adapter);
    }
    private void rv3data() {
        rv3.setHasFixedSize(true);
        rv3.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        ArrayList<helperclass1> featuredlocation = new ArrayList<>();
       String url1="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-school-meditation.png?alt=media&token=82a56ecb-54ae-4a58-b08a-9c3e6dccf754";
       String url2="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-schoolteacher-near-the-blackboard.png?alt=media&token=af0d1f34-ba9f-4b30-9426-ca3e4bffed75";
       String url3="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-solving-math-problem.png?alt=media&token=c4d37a30-dfcf-49b8-b4d1-cb0ec7e84601";
        String url5="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-school-assignment.png?alt=media&token=fbf7bca1-5e5e-4477-99db-42cf467e674b";
        String url4="https://firebasestorage.googleapis.com/v0/b/summitclasses12.appspot.com/o/images%2Fui%20images%2Fclip-start-up-preparation.png?alt=media&token=f34c9166-2d13-49d2-a4ec-16242d8d01ec";
         featuredlocation.add(new helperclass1(url1, "Advertisement writing"));
        featuredlocation.add(new helperclass1(url2,"Notice Writing"));
        featuredlocation.add(new helperclass1(url3,"Formal Invitations"));
        featuredlocation.add(new helperclass1(url5,"Informal Invitations"));
        featuredlocation.add(new helperclass1(url4,"Report Writing"));

        adapter= new heperadapter3(featuredlocation);
        rv3.setAdapter(adapter);
    }

}