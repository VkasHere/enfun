package com.example.summitclasses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.InputFilter;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.summitclasses.forgetpassword.forgetpass;
import com.example.summitclasses.sessions.sessionmanager;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Login_activity extends AppCompatActivity {


    TextView loginbtn, singupbtn, frgtpass, icontxt, slgn;
    TextInputLayout username, password;
    EditText editnum, editpass;
    ProgressDialog progressDialog;
    Animation scaleup, scaledown;
    private Dialog loadingdialog;
    Integer STORAGE_PERMISSION_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        //hooks
        //textviews
        loginbtn = findViewById(R.id.Loginbtn);
        singupbtn = findViewById(R.id.singupbtn);
        frgtpass = findViewById(R.id.forpass);
        icontxt = findViewById(R.id.icontext);
        slgn = findViewById(R.id.slogan_name);
        //Textinputlayout
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        //Edittext
        editnum = findViewById(R.id.editnum);
        editpass = findViewById(R.id.editpass);
        //animations
        scaleup = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaledown = AnimationUtils.loadAnimation(this, R.anim.scale_down);


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
        //permission check
        if (ContextCompat.checkSelfPermission(Login_activity.this, Manifest.permission.READ_EXTERNAL_STORAGE) +
                ContextCompat.checkSelfPermission(Login_activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) +
                ContextCompat.checkSelfPermission(Login_activity.this,Manifest.permission.CALL_PHONE)+
                ContextCompat.checkSelfPermission(Login_activity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {

            loginbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    loginuser(view);
                }
            });
        } else {
            requeststorage();
        }
        //showing check network
        if (!check()) {
            customdialoge();
        }

        //direct login session
        sessionmanager sessionmanager = new sessionmanager(Login_activity.this, com.example.summitclasses.sessions.sessionmanager.IS_LOGIN);
        if (sessionmanager.checklogin()) {
            Intent intent = new Intent(getApplicationContext(), dashbord.class);
            startActivity(intent);
            finish();
        }

        //forget password
        frgtpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), forgetpass.class);
                startActivity(intent);
            }
        });

        //singup
        singupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_activity.this, Singup_activity.class);
                Pair[] pairs = new Pair[5];
                pairs[0] = new Pair<View, String>(slgn, "join_text");
                pairs[1] = new Pair<View, String>(username, "anim_username");
                pairs[2] = new Pair<View, String>(password, "anim_password");
                pairs[3] = new Pair<View, String>(loginbtn, "anim_go");
                pairs[4] = new Pair<View, String>(singupbtn, "anim_new");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login_activity.this, pairs);
                    startActivity(intent, options.toBundle());
                    finish();

                }


            }
        });

        //animation click
        loginbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    loginbtn.startAnimation(scaleup);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    loginbtn.startAnimation(scaledown);
                }
                return false;
            }
        });
        frgtpass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    frgtpass.startAnimation(scaleup);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    frgtpass.startAnimation(scaledown);
                }
                return false;
            }
        });


    }

    //fornetwork check
    private boolean check() {
        boolean have_WIFI = false;
        boolean have_MOBILE = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();

        for (NetworkInfo info : networkInfo) {
            if (info.getTypeName().equalsIgnoreCase("WIFI"))
                if (info.isConnected())
                    have_WIFI = true;
            if (info.getTypeName().equalsIgnoreCase("MOBILE"))
                if (info.isConnected())
                    have_MOBILE = true;

        }
        return have_WIFI || have_MOBILE;
    }

    //cutom dialoge for network
    private void customdialoge() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Login_activity.this);
        builder.setMessage("Please Connect to INTERNET to proceed further")
                .setCancelable(false)
                .setPositiveButton("connect", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Login_activity.this.finish();
                        System.exit(0);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

    // check username
    private Boolean validateusername() {

        String val = username.getEditText().getText().toString();

        if (val.isEmpty()) {

            username.setError("Field cannot be empty");
            loadingdialog.dismiss();


            return false;
        } else if (val.length() < 10) {
            username.setError("Invalid number");
            loadingdialog.dismiss();
            return false;
        } else {
            username.setError(null);
            username.setErrorEnabled(false);
            return true;
        }
    }

    //check password
    private Boolean validatepassword() {

        String val = password.getEditText().getText().toString();
        String pass = "^" +
                "(?= .*[a-zA-Z])" +
                "(?= .*[@#$%^&++])" +
                "(?=\\s+$)" +
                ".{4,}" +
                "$";

        if (val.isEmpty()) {

            password.setError("Field cannot be empty");
            loadingdialog.dismiss();
            return false;
        } else {
            password.setError(null);
            return true;
        }
    }

    //login profile
    public void loginuser(View view) {
        loadingdialog.show();
        //storing num
        String usrnum = username.getEditText().getText().toString();
        SharedPreferences sp1 = getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp1.edit();
        editor.putString("mobilenum", usrnum);
        editor.apply();

        if (!validateusername() | !validatepassword()) {
            return;
        } else {
            isuser();
        }
    }

    //match accounts
    private void isuser() {
        final String userenteredusername = username.getEditText().getText().toString().trim();
        final String userenteredpassword = password.getEditText().getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkuser = reference.orderByChild("mobileno").equalTo(userenteredusername);
        //storing num
        SharedPreferences sp1 = getSharedPreferences("phnumber", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp1.edit();
        editor.putString("mobilenum", userenteredusername);
        editor.apply();

        checkuser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()) {
                    username.setError(null);
                    username.setErrorEnabled(false);
                    String passwordfromdb = dataSnapshot.child(userenteredusername).child("password").getValue(String.class);
                    if (passwordfromdb.equals(userenteredpassword)) {
                        loadingdialog.dismiss();
                        password.setError(null);
                        password.setErrorEnabled(false);
                        String usernamefromdb = dataSnapshot.child(userenteredusername).child("username").getValue(String.class);
                        String namefromdb = dataSnapshot.child(userenteredusername).child("name").getValue(String.class);
                        String mobilefromdb = dataSnapshot.child(userenteredusername).child("mobileno").getValue(String.class);
                        String emailfromdb = dataSnapshot.child(userenteredusername).child("email").getValue(String.class);

                        //sessions
                        sessionmanager sessionmanager = new sessionmanager(Login_activity.this, com.example.summitclasses.sessions.sessionmanager.IS_LOGIN);
                        sessionmanager.createloginsession(usernamefromdb, namefromdb, mobilefromdb, emailfromdb);
                        Intent intentlogin = new Intent(getApplicationContext(), dashbord.class);
                        intentlogin.putExtra("phone", userenteredusername);
                        startActivity(intentlogin);
                        finish();
                    } else {
                        password.setError("wrong password");
                        password.requestFocus();
                        loadingdialog.dismiss();
                    }
                } else {
                    username.setError("this mobile number isn't exist, please Singup with this number");
                    username.requestFocus();
                    loadingdialog.dismiss();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    //permissions
    private void requeststorage() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.READ_EXTERNAL_STORAGE) ||
                ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) ||
                ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA) ||
                ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission needed")
                    .setMessage("This permission is needed to access media file in your phone  make a phone call")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(Login_activity.this,
                                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.CALL_PHONE,Manifest.permission.CAMERA}, STORAGE_PERMISSION_CODE);

                        }
                    })
                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create().show();
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.CALL_PHONE,Manifest.permission.CAMERA}, STORAGE_PERMISSION_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission GRANTED", Toast.LENGTH_SHORT).show();

                loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        loginuser(view);
                    }
                });
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}