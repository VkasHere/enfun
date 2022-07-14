package com.example.summitclasses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
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

import com.example.summitclasses.mobileverification.singupverification;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Singup_activity extends AppCompatActivity {
    TextView singup,loginalr,icontxt,slgn;
    TextInputLayout full_name,user_name,Email,mobile,Password;
    EditText editnum,editpass;
    ProgressDialog progressDialog;
    Animation scaleup,scaledown;
    private Dialog loadingdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_activity);

        //hooks
        //textviews
        singup=findViewById(R.id.register);
        loginalr=findViewById(R.id.loginalr);
        icontxt=findViewById(R.id.icontext);
        slgn=findViewById(R.id.slogan_name);
        //Textinputlayout
        full_name=findViewById(R.id.fullname);
        user_name=findViewById(R.id.username);
        Email=findViewById(R.id.email);
        Password=findViewById(R.id.password);
        mobile=findViewById(R.id.mobileno);
        //Edittext
        editnum=findViewById(R.id.editnum);
        editpass=findViewById(R.id.editpass);
        // animations
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);

        //max input code
        editnum.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(10)
        });

        editpass.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(15)
        });

        loadingdialog = new Dialog(this);
        loadingdialog.setContentView(R.layout.customdialoge);
        loadingdialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.dialoge));
        loadingdialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        loadingdialog.setCancelable(false);

        //already have account
        loginalr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Singup_activity.this,Login_activity.class);
                startActivity(intent);
                finish(); }
        });

        //animation click
        loginalr.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    loginalr.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    loginalr.startAnimation(scaledown);
                }
                return false;
            }
        });
        singup.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    singup.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    singup.startAnimation(scaledown);
                }
                return false;
            }
        });

    }

    //check username
    private Boolean validatename () {

        String  val= full_name.getEditText().getText().toString();

        if (val.isEmpty()) {

            full_name.setError("Field cannot be empty");
            loadingdialog.dismiss();
            return false;
        }
        else {
            full_name.setError(null);
            full_name.setErrorEnabled(false);
            return true;
        }
    }
    //check username
    private Boolean validateusername () {

        String  val= user_name.getEditText().getText().toString();
        String nowhitespace ="\\A\\w{4,20}\\z";

        if (val.isEmpty()) {

            user_name.setError("Field cannot be empty");
            loadingdialog.dismiss();
            return false;
        }else if (val.length() >=15){

            user_name.setError("Username is too long");
            loadingdialog.dismiss();
            return false;
        }
        else if (!val.matches(nowhitespace)){

            user_name.setError("White space is not allowed");
            loadingdialog.dismiss();
            return false;
        }

        else {
            user_name.setError(null);
            user_name.setErrorEnabled(false);
            return true;
        }
    }
    //check email
    private Boolean validateemail () {

        String  val= Email.getEditText().getText().toString();
        String pattern =getString(R.string.pattern);

        if (val.isEmpty()) {

            Email.setError("Field cannot be empty");
            loadingdialog.dismiss();
            return false;
        }
        else if (!val.matches(pattern)){
            Email.setError("Invalid email address");
            loadingdialog.dismiss();
            return false;

        }
        else {
            Email.setError(null);
            Email.setErrorEnabled(false);
            return true;
        }
    }
    //check mobile no.
    private Boolean validatenmobileno () {

        String  val= mobile.getEditText().getText().toString();



        if (val.isEmpty()) {

            mobile.setError("Field cannot be empty");
            loadingdialog.dismiss();
            return false;
        }

        else {
            mobile.setError(null);
            return true;
        }
    }
    //check password
    private Boolean validatepassword () {

        String  val= Password.getEditText().getText().toString();
        String pass = "^"+
                "(?=.*[a-zA-Z])" +
                ".{4,}" +
                "$";

        if (val.isEmpty()) {

            Password.setError("Field cannot be empty");
            loadingdialog.dismiss();
            return false;
        } else if (!val.matches(pass)){
            Password.setError("Password is too weak,please use alphabet letters and numbers");
            loadingdialog.dismiss();
            return false; }
        else {
            Password.setError(null);
            Password.setErrorEnabled(false);
            return true;
        }
    }

    // register user
    public void registeruser (View view) {
        loadingdialog.show();
        if (!validatename() |!validateusername() |!validateemail()|!validatenmobileno()|!validatepassword())
        {return;
        }
        final String  name= full_name.getEditText().getText().toString();
        final String  username= user_name.getEditText().getText().toString();
        final String  email= Email.getEditText().getText().toString();
        final String  phoneno= mobile.getEditText().getText().toString();
        final String  password= Password.getEditText().getText().toString();
        //storing num
        SharedPreferences sp1=getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sp1.edit();
        editor.putString("mobilenum",phoneno);
        editor.putString("name",name);
        editor.apply();
        // checking
        final DatabaseReference reference= FirebaseDatabase.getInstance().getReference("users");
        Query checkmobileno = reference.orderByChild("mobileno").equalTo(phoneno);
        checkmobileno.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    mobile.setError("Phone number already exists,Please try with another number");
                    loadingdialog.dismiss();
                } else {
                    Intent intentsingup=new Intent(getApplicationContext(), singupverification.class);
                    loadingdialog.dismiss();
                    intentsingup.putExtra("phoneno",phoneno);
                    intentsingup.putExtra("name",name);
                    intentsingup.putExtra("email",email);
                    intentsingup.putExtra("username",username);
                    intentsingup.putExtra("password",password);
                    startActivity(intentsingup);
                    finish();
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}