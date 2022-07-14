package com.example.summitclasses.Fragments.explorefrg.rv1.narrationfull;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.testhelper.result11;
import com.example.summitclasses.Fragments.explorefrg.rv1.rv1full.testhelper.testhelperc;
import com.example.summitclasses.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 extends AppCompatActivity {
    TextView num,que,quit,next;
    TextView opt1,opt2,opt3,opt4,indicator;
    LinearLayout container,layout;
     int score =0;
     int wrong=0;
    DatabaseReference reference;
    private int count =0;
    private int position =0;
    private List<testhelperc> list;
    private Dialog loadingdialog;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test11);
        num= findViewById(R.id.num);
        que= findViewById(R.id.ques);
        opt1= findViewById(R.id.opt1);
        opt2= findViewById(R.id.opt2);
        opt3= findViewById(R.id.opt3);
        opt4= findViewById(R.id.opt4);
        indicator= findViewById(R.id.indicator);
        quit= findViewById(R.id.quit);
        next= findViewById(R.id.next);
        container= findViewById(R.id.option_container);
        layout= findViewById(R.id.back);


        loadingdialog = new Dialog(this);
        loadingdialog.setContentView(R.layout.customdialoge);
        loadingdialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialoge));
        loadingdialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        loadingdialog.setCancelable(false);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exercise2.super.onBackPressed();
                finish();
            }
        });
     list = new ArrayList<>();

        setquestion();
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercise2.this, result11.class);
                intent.putExtra("score",score);
                intent.putExtra("wrong",wrong);
                intent.putExtra("outof",list.size());
                startActivity(intent);
                finish();
            }
        });

    }
    private void  enableoption(boolean enable){
        for (int i =0; i<4; i++){
           container.getChildAt(i).setEnabled(enable);
           if (enable){
               container.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#696969")));
               opt1.setTextColor(ColorStateList.valueOf(Color.parseColor("#696969")));
               opt2.setTextColor(ColorStateList.valueOf(Color.parseColor("#696969")));
               opt3.setTextColor(ColorStateList.valueOf(Color.parseColor("#696969")));
               opt4.setTextColor(ColorStateList.valueOf(Color.parseColor("#696969")));

           }
        }
    }
    private void setquestion() {
        loadingdialog.show();
        reference = FirebaseDatabase.getInstance().getReference("Test").child("Direct to Indirect").child("Exercise 2");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot snapshot1:snapshot.getChildren()){
                    testhelperc test= snapshot1.getValue(testhelperc.class);
                    list.add(test);
                }

                if (list.size()>0){

                    for (int i =0; i<4; i++){
                        container.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                checkAnswer((TextView) view);
                            }
                        });
                    }

                    Playanim(que,0,list.get(position).getQue());
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            next.setEnabled(false);
                            next.setAlpha(0.7f);
                            enableoption(true);
                            position++;
                            if (position==list.size()){
                                Intent intent = new Intent(Exercise2.this, result11.class);
                                intent.putExtra("score",score);
                                intent.putExtra("wrong",wrong);
                                intent.putExtra("outof",list.size());
                                startActivity(intent);
                                finish();
                               enableoption(false);
                            }else {
                                count = 0;
                                Playanim(que, 0, list.get(position).getQue());
                            }
                        }
                    });
                }else {
                    finish();
                    Toast.makeText(Exercise2.this,"no ques",Toast.LENGTH_SHORT).show();
                }
                loadingdialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                loadingdialog.dismiss();
                finish();
            }
        });
    }
    private void checkAnswer(TextView selectedanswer) {
        enableoption(false);
        next.setEnabled(true);
        next.setAlpha(1);
        if (selectedanswer.getText().toString().equals(list.get(position).getRight())){
            //correct
            score++;
            selectedanswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4caf50")));
            selectedanswer.setTextColor(ColorStateList.valueOf(Color.parseColor("#4caf50")));
        }else {
            //incorrect
            wrong++;
            selectedanswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#ff0000")));
            selectedanswer.setTextColor(ColorStateList.valueOf(Color.parseColor("#ff0000")));
                TextView correctans= (TextView) container.findViewWithTag(list.get(position).getRight());
                if (correctans!=null){
                    correctans.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4caf50")));
                    correctans.setTextColor(ColorStateList.valueOf(Color.parseColor("#4caf50")));

                }
           }

    }
    private void Playanim(final View view , final int value, final String data){
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

                if (value==0 && count<4){
                    String option = "";
                    if (count==0){
                        option=list.get(position).getOp1();

                    }else if (count==1){
                        option=list.get(position).getOp2();

                    }else if (count==2){
                        option=list.get(position).getOp3();

                    }else if (count==3){
                        option=list.get(position).getOp4();

                    }
                    Playanim(container.getChildAt(count),0,option);
                    count++;
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {

                if (value==0){
                    //data change
                    try {
                        ((TextView)view).setText(data);
                        indicator.setText(position+1+"/"+list.size());
                    }catch (ClassCastException ex){
                        ((Button)view).setText(data);
                    }
                    view.setTag(data);
                    Playanim(view,1,data);
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

    }
}