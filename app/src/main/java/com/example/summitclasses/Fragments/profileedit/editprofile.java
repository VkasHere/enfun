package com.example.summitclasses.Fragments.profileedit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.summitclasses.R;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.squareup.picasso.Picasso;
import com.theartofdev.edmodo.cropper.CropImage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class editprofile extends AppCompatActivity {
    TextInputLayout full_name, user_name, Email, mobile;
    ImageView vks;
    FirebaseDatabase root__node;
    DatabaseReference reference;
    TextView top,update;
    EditText editnum;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    FirebaseAuth mauth;
    DatabaseReference databaseReference;
    CircleImageView prof;
    LinearLayout layout,back;
    private final int api=2000;
    ProgressBar pgrb;
    private Uri uri;
    private String myuri="";
    private StorageTask uploadTask;
    ProgressDialog progressDialog;
    Animation scaleup,scaledown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        SharedPreferences sp = getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        final String vn = sp.getString("mobilenum", "");
        //hooks
        full_name = findViewById(R.id.fullname);
        user_name = findViewById(R.id.user);
        prof = findViewById(R.id.prof);
        Email = findViewById(R.id.email);
        vks = findViewById(R.id.vks);
        mobile = findViewById(R.id.mobile);
        update = findViewById(R.id.update);
        top = findViewById(R.id.top);
        editnum=findViewById(R.id.editnum);
        pgrb=findViewById(R.id.pgrr);
        layout=findViewById(R.id.layd);
        back=findViewById(R.id.back);
        //animations
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);

        //reference
        firebaseStorage= FirebaseStorage.getInstance();
        storageReference= firebaseStorage.getReference().child("profileimage");
        mauth =FirebaseAuth.getInstance();
        databaseReference=FirebaseDatabase.getInstance().getReference().child("users");
        root__node = FirebaseDatabase.getInstance();
        reference = root__node.getReference("users").child(vn);

         //max input code
        editnum.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(10)
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pgrb.setVisibility(View.GONE);
                layout.setVisibility(View.VISIBLE);
            }
        },api);        //progress bar
        //editpic
        vks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CropImage.activity().setAspectRatio(1,1).start(editprofile.this);

            }
        });
        //backicon
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editprofile.super.onBackPressed();
                finish();
            }
        });
        //anim
        update.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    update.startAnimation(scaleup);
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    update.startAnimation(scaledown);
                }
                return false;
            }
        });
        //update data
        SharedPreferences sp1 = getSharedPreferences("userdatas", Context.MODE_PRIVATE);
        final String namee = sp1.getString("nma", "");
        final String usernamee = sp1.getString("usr", "");
        final String mobilee = sp1.getString("mob", "");
        final String emaille = sp1.getString("email", "");

        user_name.getEditText().setText(usernamee);
        full_name.getEditText().setText(namee);
        Email.getEditText().setText(emaille);
        mobile.getEditText().setText(mobilee);
        top.setText(usernamee);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateuserpic();


                String mob= mobile.getEditText().getText().toString();


                if (!validatename() | !validateusername() | !validateemail() | !validatenmobileno()) {
                    return;
                }else {
                    reference.child("email").setValue(Email.getEditText().getText().toString());
                    reference.child("username").setValue(user_name.getEditText().getText().toString());
                    reference.child("fullname").setValue(full_name.getEditText().getText().toString());
                    Toast.makeText(getApplicationContext(),"Profile updated",Toast.LENGTH_SHORT).show();
                    editprofile.super.onBackPressed();
                    finish();
                }



            }

            private Boolean validatename() {

                String val = full_name.getEditText().getText().toString();

                if (val.isEmpty()) {

                    full_name.setError("Field cannot be empty");
                    return false;
                } else {
                    full_name.setError(null);
                    full_name.setErrorEnabled(false);
                    return true;
                }
            }

            private Boolean validateusername() {

                String val = user_name.getEditText().getText().toString();
                String nowhitespace = "\\A\\w{4,20}\\z";

                if (val.isEmpty()) {

                    user_name.setError("Field cannot be empty");
                    return false;
                } else if (val.length() >= 15) {

                    user_name.setError("Username is too long");
                    return false;
                } else if (!val.matches(nowhitespace)) {

                    user_name.setError("White space is not allowed");
                    return false;
                } else {
                    user_name.setError(null);
                    user_name.setErrorEnabled(false);
                    return true;
                }
            }

            private Boolean validateemail() {

                String val = Email.getEditText().getText().toString();
                String pattern = getString(R.string.pattern);

                if (val.isEmpty()) {

                    Email.setError("Field cannot be empty");
                    return false;
                } else if (!val.matches(pattern)) {
                    Email.setError("Invalid email address");
                    return false;

                } else {
                    Email.setError(null);
                    Email.setErrorEnabled(false);
                    return true;
                }
            }

            private Boolean validatenmobileno() {

                String val = mobile.getEditText().getText().toString();


                if (val.isEmpty()) {

                    mobile.setError("Field cannot be empty");
                    return false;
                } else {
                    mobile.setError(null);
                    return true;
                }
            }
        });

        //getuserinfo
        getuserinfo();

    }
    private void getuserinfo() {

        SharedPreferences sp = getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        final String vn = sp.getString("mobilenum", "");


        databaseReference.child(vn).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()&& snapshot.getChildrenCount()>0){
                    if (snapshot.hasChild("image")){

                        String images= snapshot.child("image").getValue().toString();
                        Picasso.get().load(images).into(prof);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void updateuserpic() {
        SharedPreferences sp = getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        final String vn = sp.getString("mobilenum", "");
        final ProgressDialog dialog =new  ProgressDialog(this);
        dialog.setTitle("uploading image....");
        dialog.setMessage("Please wait while we are setting your data");
        if (uri !=null){
            final StorageReference fileref= storageReference.child(vn+".jpg");
            uploadTask =fileref.putFile(uri);
            uploadTask.continueWithTask(new Continuation() {
                @Override
                public Object then(@NonNull Task task) throws Exception {
                    if (!task.isSuccessful()){
                        throw task.getException();
                    }
                    return fileref.getDownloadUrl();
                }
            }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                @Override
                public void onComplete(@NonNull Task<Uri> task) {
                    if (task.isSuccessful()){
                        Uri downloaduri = task.getResult();
                        myuri= downloaduri.toString();

                        HashMap<String,Object> userhashmap =new HashMap<>();
                        userhashmap.put("image",myuri);
                        databaseReference.child(vn).updateChildren(userhashmap);
                    }
                }
            });

        }
        else {
            dialog.dismiss();

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE  && resultCode  == RESULT_OK && data !=null){

            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            uri=result.getUri();
            prof.setImageURI(uri);
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            Toast.makeText(this,"error,try again",Toast.LENGTH_SHORT).show();
        }
    }

}