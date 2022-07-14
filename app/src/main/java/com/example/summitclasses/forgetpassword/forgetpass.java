package com.example.summitclasses.forgetpassword;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.summitclasses.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class forgetpass extends AppCompatActivity {

    EditText user, pass;
    LinearLayout back;
    TextView verifypas;
    TextInputLayout editusr,editnum;
    private final int api=3000;
    ProgressDialog progressDialog;
    Context context;
    Animation scaleup,scaledown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpass);

        //hooks
        //edittext
        editusr = findViewById(R.id.usr);
        editnum = findViewById(R.id.mn);
        //editlayout
        user = findViewById(R.id.username);
        pass = findViewById(R.id.mobileno);
        //verify button
        verifypas = findViewById(R.id.verifypas);
        //back
        back = findViewById(R.id.back);
        //animations
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgetpass.super.onBackPressed();
                finish();
            }
        });

        //max input code
        user.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(20)
        });
        pass.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(12)
        });
        verifypas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    verifypas.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    verifypas.startAnimation(scaledown);
                }
                return false;
            }
        });

    }
    private Boolean validateusername() {

        String val = editusr.getEditText().getText().toString();

        if (val.isEmpty()) {

            editusr.setError("Field cannot be empty");
            return false;
        } else {
            editusr.setError(null);
            editusr.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatepassword () {

        String  val= editnum.getEditText().getText().toString();

        if (val.isEmpty()) {

            editnum.setError("Field cannot be empty");
            return false;
        }
        else {
            editnum.setError(null);
            return true;
        }
    }

    public void  loginuser(View view) {

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("change password");
        progressDialog.setMessage("Please wait while loading");
        progressDialog.show();
        if (!validateusername() | !validatepassword()){
            return;
        } else {
            isuser();
        }
    }

    private void isuser() {
        final String userenteredusername= editusr.getEditText().getText().toString().trim();
        final String userenteredno= editnum.getEditText().getText().toString().trim();
        SharedPreferences sp= getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        final String vn = sp.getString("mobilenum","");
        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("users");
        Query checkuser = reference.orderByChild("mobileno").equalTo(userenteredno);
        checkuser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    editnum.setError(null);
                    editnum.setErrorEnabled(false);
                    String passwordfromdb= dataSnapshot.child(userenteredno).child("username").getValue(String.class);
                    if (passwordfromdb.equals(userenteredusername)){
                        editusr.setError(null);
                        editusr.setErrorEnabled(false);
                        Intent intentlogin = new Intent(getApplicationContext(),verifymobilepass.class);
                        intentlogin.putExtra("phoneno",userenteredno);
                        startActivity(intentlogin);
                        finish();
                    }
                    else {
                        editusr.setError("Can't find such username");
                        editusr.requestFocus();
                    }
                }
                else {
                    editnum.setError("This Mobile no is not Registered with this username");
                    editnum.requestFocus();
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}