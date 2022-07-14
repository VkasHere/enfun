package com.example.summitclasses.Fragments;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.summitclasses.Fragments.profileedit.editprofile;
import com.example.summitclasses.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Context.MODE_PRIVATE;

public class Profile extends Fragment {
    FirebaseDatabase root__node;
    DatabaseReference reference;
    TextView nmm,unnm,emml,moon,top,edit;
    FirebaseAuth mauth;
    LinearLayout linearLayout;
    CircleImageView prof;
    Animation scaleup,scaledown;
    private final int api=3000;
    private Dialog loadingdialog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_profile, container, false);
        SharedPreferences sp= getActivity().getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        String vn = sp.getString("mobilenum","");
        //hooks
        //edit layouts
        nmm =v.findViewById(R.id.nm);
        unnm =v.findViewById(R.id.unm);
        emml =v.findViewById(R.id.eml);
        moon =v.findViewById(R.id.mon);
        top =v.findViewById(R.id.top);
        //button
        edit=v.findViewById(R.id.edit);
        linearLayout=v.findViewById(R.id.lay);
        //animations
        scaleup= AnimationUtils.loadAnimation(getActivity(),R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(getActivity(),R.anim.scale_down);
        //profile pic
        prof=v.findViewById(R.id.prof);
        mauth=FirebaseAuth.getInstance();
        root__node = FirebaseDatabase.getInstance();
        reference=root__node.getReference("users").child(vn);

        loadingdialog = new Dialog(getActivity());
        loadingdialog.setContentView(R.layout.customdialoge);
        loadingdialog.getWindow().setBackgroundDrawable(getActivity().getDrawable(R.drawable.dialoge));
        loadingdialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        loadingdialog.show();

        //anim
        edit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    edit.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    edit.startAnimation(scaledown);
                }
                return false;
            }
        });
        //details loading
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                loadingdialog.dismiss();
                linearLayout.setVisibility(View.VISIBLE);
                String eml= snapshot.child("email").getValue().toString();
                String nm= snapshot.child("fullname").getValue().toString();
                String unm= snapshot.child("username").getValue().toString();
                String mon= snapshot.child("mobileno").getValue().toString();

                nmm.setText(nm);
                unnm.setText(unm);
                emml.setText(eml);
                moon.setText(mon);
                top.setText(unm);

                HashMap<String,String> detail= new HashMap<>();
                detail.put("nma",nm);

                //storing num
                if (getActivity()!= null ){
                    SharedPreferences sp1= getActivity().getSharedPreferences("userdatas", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor= sp1.edit();
                    editor.putString("nma",nm);
                    editor.putString("usr",unm);
                    editor.putString("mob",mon);
                    editor.putString("email",eml);
                    editor.apply();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //edit button
        //edit
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), editprofile.class);
                startActivity(intent1);
            }
        });
        //get details
        getuserinfo();

        return v;
    }


    private void getuserinfo() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if (snapshot.exists()&&snapshot.getChildrenCount()>0){
                    if (snapshot.hasChild("image")){
                        String images= snapshot.child("image").getValue().toString();
                        Picasso.get().load(images).placeholder(R.drawable.st).into(prof);
                    }
                }

            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}