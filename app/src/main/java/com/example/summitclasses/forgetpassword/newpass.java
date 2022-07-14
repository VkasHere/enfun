package com.example.summitclasses.forgetpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.summitclasses.Login_activity;
import com.example.summitclasses.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class newpass extends AppCompatActivity {
    EditText usr, mn;
    TextView setpass;
    LinearLayout back;
    TextInputLayout ps,cps;
    private final int api=3000;
    ProgressDialog progressDialog;
    FirebaseDatabase root__node;
    DatabaseReference reference;
    Animation scaleup,scaledown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpass);
        //shared preference
        SharedPreferences sp = getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        final String vn = sp.getString("mobilenum", "");
        final String phoneno= getIntent().getStringExtra("phoneno");
        //hooks
        ps = findViewById(R.id.ps);
        cps = findViewById(R.id.cps);
        usr = findViewById(R.id.usr);
        mn = findViewById(R.id.mn);
        back = findViewById(R.id.back);
        setpass = findViewById(R.id.setpas);
        root__node = FirebaseDatabase.getInstance();
        reference = root__node.getReference("users").child(phoneno);
        //animations
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newpass.super.onBackPressed();
                finish();
            }
        });

        //animation click
        setpass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    setpass.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    setpass.startAnimation(scaledown);
                }
                return false;
            }
        });
    }
    public void confirm(View view) {

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Changing password");
        progressDialog.setMessage("Please wait while loading");
        progressDialog.show();

        final String userenteredpass= ps.getEditText().getText().toString().trim();

        if (matchpass()){
            ps.setError("Passwords do not match");
            cps.setError("Passwords do not match");
        }else {
            reference.child("password").setValue(userenteredpass);
            Toast.makeText(getApplicationContext() ,"Password has been changed", Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(getApplicationContext(), Login_activity.class);
            startActivity(intent);
            finish();
        }


    }

    private boolean matchpass() {
        final String userenteredpass= ps.getEditText().getText().toString().trim();
        final String confirmpass= cps.getEditText().getText().toString().trim();
        return !userenteredpass.equals(confirmpass);
    }
}