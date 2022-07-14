package com.example.summitclasses.forgetpassword;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.example.summitclasses.R;
import com.example.summitclasses.dashbord;
import com.example.summitclasses.helperclasses.userhelper;
import com.example.summitclasses.mobileverification.singupverification;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class verifymobilepass extends AppCompatActivity {
    String Verificationcodebysystem;
    PinView pinview;
    TextView verify;
    DatabaseReference reference;
    FirebaseAuth mAuth;
    Animation scaleup,scaledown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singupverification);

        //hooks
        pinview=findViewById(R.id.pin_view);
        verify=findViewById(R.id.verify);
        mAuth=FirebaseAuth.getInstance();
        //animations
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);


        //get mobile number
        final String phoneno= getIntent().getStringExtra("phoneno");
        // sending otp
        sendverificationtouser(phoneno);


        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = pinview.getText().toString();
                if (code.equals("")){
                    pinview.setError("Please Enter OTP");
                    Toast.makeText(verifymobilepass.this, "Please Enter OTP", Toast.LENGTH_SHORT).show();

                }else {
                    verifycode(code);
                    ProgressDialog dialog =new  ProgressDialog(verifymobilepass.this);
                    dialog.setTitle("Verifying");
                    dialog.setMessage("Please wait........");
                    dialog.show();
                }

            }
        });
        verify.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    verify.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    verify.startAnimation(scaledown);
                }
                return false;
            }
        });
    }

    //otp send

    private void sendverificationtouser(String phoneno) {

        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber("+91"+phoneno)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(mCallbacks)          // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);

    }
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks= new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);

            Verificationcodebysystem= s;
        }

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
            String code = phoneAuthCredential.getSmsCode();
            if (code!=null){
                pinview.setText(code);
                View view = new View(verifymobilepass.this);
                dialog(view);
                verifycode(code);
            }


        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(verifymobilepass.this,"Something Went Wrong,Please try again",Toast.LENGTH_SHORT).show();

        }
    };
    private void dialog(View view) {

        final ProgressDialog dialog =new  ProgressDialog(this);
        dialog.setTitle("Verifying");
        dialog.setMessage("Please wait........");
        dialog.show();

    }


    private void  verifycode (String codebyuser){


        if (!Verificationcodebysystem.equals(codebyuser)){
            PhoneAuthCredential credential=PhoneAuthProvider.getCredential(Verificationcodebysystem,codebyuser);
            SingintheuserByCrendential(credential);
        }else {
            Toast.makeText(this,"Wrong OTP",Toast.LENGTH_LONG);
        }

    }
    private void SingintheuserByCrendential(PhoneAuthCredential credential) {

        final String phoneno= getIntent().getStringExtra("phoneno");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(verifymobilepass.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent = new Intent(getApplicationContext(),newpass.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            intent.putExtra("phoneno",phoneno);
                            startActivity(intent);
                            finish();
                        }else {
                            Toast.makeText(verifymobilepass.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }

                    }
                });

    }
}