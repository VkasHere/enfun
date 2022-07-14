package com.example.summitclasses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.summitclasses.Fragments.Achievement;
import com.example.summitclasses.Fragments.Notice;
import com.example.summitclasses.Fragments.Profile;
import com.example.summitclasses.Fragments.explore;
import com.example.summitclasses.checkinternet.Nointernet;
import com.example.summitclasses.checkinternet.connectivityreceiver;
import com.example.summitclasses.checkinternet.mynet;
import com.example.summitclasses.sessions.sessionmanager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import static java.lang.Boolean.TRUE;

public class dashbord extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,connectivityreceiver.ConnectivityrReceiverListner{

    ChipNavigationBar chipNavigationBar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView navbar,poweroff,cross;
    LinearLayout contentview;
    DatabaseReference reference;
    DownloadManager downloadManager;
    //varriables
    static final float End_scale =0.7f;
    String apk= "1.0.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        //hooks
        //side bar cross
        cross=findViewById(R.id.cls_nav);
        //chipbottom bar
        chipNavigationBar = findViewById(R.id.menu);
        chipNavigationBar.setItemSelected(R.id.expr,true);
        //navbaricon
        navbar=findViewById(R.id.sidebar);
        //logout
        poweroff=findViewById(R.id.poweoff);
        //drawer
        //hooks for drawer
        drawerLayout=findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.navigationview);
        contentview=findViewById(R.id.container);
        //fragments
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new explore()).commit();
        bottommenu();
        //drawer java code
        //calling navigation drawer function
        navigationdrawer();
        //drawer animation
        animatenavigationdrawer();
        //check latest version
        reference= FirebaseDatabase.getInstance().getReference("version");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    String ver= snapshot.child("appversion").getValue().toString();
                    if (!apk.equals(ver)){
                        String link=  snapshot.child("link").getValue().toString();
                        customdialoge(link);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //logout
        poweroff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sessionmanager sessionmanager = new sessionmanager(dashbord.this, com.example.summitclasses.sessions.sessionmanager.IS_LOGIN);
                sessionmanager.logoutfromsession();
                Intent intent = new Intent(dashbord.this,Login_activity.class);
                startActivity(intent);
                finish();
            }
        });
        //navigation drawer onclickevents
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_icon:
                        startSupportChat();
                        break;
                    case R.id.Classes:
                        Intent intent2 = new Intent(dashbord.this, Test.class);
                        startActivity(intent2);
                        break;
                    case R.id.Acedemic_result:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Achievement()).commit();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        chipNavigationBar.setItemSelected(R.id.Achievements,TRUE);
                        break;
                    case R.id.About:
                        Intent intent3 = new Intent(dashbord.this, About.class);
                        startActivity(intent3);
                        break;
                    case R.id.login:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Profile()).commit();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        chipNavigationBar.setItemSelected(R.id.profile,TRUE);
                        break;
                    case R.id.logout:
                        sessionmanager sessionmanager = new sessionmanager(dashbord.this, com.example.summitclasses.sessions.sessionmanager.IS_LOGIN);
                        sessionmanager.logoutfromsession();
                        Intent intent = new Intent(dashbord.this,Login_activity.class);
                        startActivity(intent);
                        finish();
                }
                return(true);
            }
        });
        //side nav cross
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        //check net
        //internet
        checkinternet();

    }
    //cutom dialoge for network
    private void customdialoge(final String link) {

        AlertDialog.Builder builder= new AlertDialog.Builder(dashbord.this);
        builder.setMessage("You are using old version please download the new version !")
                .setCancelable(false)
                .setPositiveButton("Download" ,new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      download(link);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dashbord.this.finish();
                        System.exit(0);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
//download latest version
    private void download(String link) {
        downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri =Uri.parse(link);
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"summitclasses.apk");
        Long refrence =downloadManager.enqueue(request);


    }

    //bottom navigation
    private void bottommenu() {
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment= null;
                switch (i){
                    case R.id.expr:
                        fragment=new explore();
                        break;
                    case R.id.notice:
                        fragment=new Notice();
                        break;
                    case R.id.Achievements:
                        fragment=new Achievement();
                        break;
                    case R.id.profile:
                        fragment=new Profile();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            }
        });

    }
    //side drawer
    //whatsapp chat
    private void startSupportChat() {
        try {
            String headerReceiver = "Namste";// Replace with your message.
            String bodyMessageFormal = ",sir";// Replace with your message.
            String whatsappContain = headerReceiver + bodyMessageFormal;
            String trimToNumner = "+919887849405"; //10 digit number
            Intent intent = new Intent ( Intent.ACTION_VIEW );
            intent.setData ( Uri.parse ( "https://wa.me/" + trimToNumner + "/?text=" + whatsappContain ) );
            startActivity ( intent );
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
    //animation code for drawer
    private void animatenavigationdrawer() {
        drawerLayout.setScrimColor(getResources().getColor(R.color.bluee));
        drawerLayout.addDrawerListener((new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                // scale the view based on current side offset
                final float diffscaledoffset = slideOffset*(1-End_scale);
                final float offset= 1-diffscaledoffset;
                contentview.setScaleX(offset);
                contentview.setScaleY(offset);

                // translate the view , accounting for the scale width
                final float xoffset=drawerView.getWidth()*slideOffset;
                final  float xoffsetdiff =contentview.getWidth()*diffscaledoffset/2;
                final  float xtranslation =xoffset-xoffsetdiff;
                contentview.setTranslationX(xtranslation);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        }));

    }
    private void navigationdrawer() {

        // navigation drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.home_icon);

        navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);

            }
        });
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }
    //internet check
    private void checkinternet() {
        boolean isconnected= connectivityreceiver.isconnected();
        if (!isconnected){
            changeactivity();
        }

    }
    private void changeactivity() {
        Intent intent=new Intent(this, Nointernet.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onResume() {
        super.onResume();
        final IntentFilter intentFilter= new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        connectivityreceiver connectivityreceiver= new connectivityreceiver();
        registerReceiver(connectivityreceiver,intentFilter);
        mynet.getInstance().setconnectivityListner(this);

    }
    private void showsnackbar(boolean isconnected) {
        String msg;
        int color;
        int back;
        if (isconnected){

            msg="you are online";
            color= Color.GREEN;
        }else {

            msg="you are offline";
            color=Color.RED;
        }
        Snackbar snackbar=Snackbar.make(findViewById(R.id.contentt),msg,Snackbar.LENGTH_SHORT);

        View view=snackbar.getView();
        TextView textView=view.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setTextColor(color);
        snackbar.show();

    }
    @Override
    public void OnNetworkconnectionchanged(boolean isconnected) {
        if (!isconnected){
            changeactivity();
        }

    }

}