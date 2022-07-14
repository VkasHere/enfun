package com.example.summitclasses.sessions;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class sessionmanager {
    SharedPreferences userssessions;
    SharedPreferences.Editor editor;
    Context context;



    public static final String IS_LOGIN = "IsLoggedIn";
    public static final String IS_phone = "Isphone";
    public static final String KEY_FULLNAME = "namefromdb";
    public static final String KEY_USERNAME = "usernamefromdb";
    public static final String KEY_EMAIL = "emailfromdb";
    public static final String KEY_PHONENUMBER = "mobilefromdb";
    public static final String KEY_PASSWORD = "Password";

    public sessionmanager(Context _context, String IS_LOGIN) {
        context = _context;
        userssessions = context.getSharedPreferences("userloginsession", Context.MODE_PRIVATE);
        editor = userssessions.edit();
    }

    public void createloginsession(String namefromdb, String usernamefromdb, String emailfromdb, String mobilefromdb) {

        editor.putBoolean(IS_LOGIN, true);
        editor.putString(KEY_FULLNAME, namefromdb);
        editor.putString(KEY_USERNAME, usernamefromdb);
        editor.putString(KEY_EMAIL, emailfromdb);
        editor.putString(KEY_PHONENUMBER, mobilefromdb);
        editor.commit();

    }

    public  HashMap<String, String> getuserdetailfromsession() {

        HashMap<String, String> userdata = new HashMap<String, String>();

        userdata.put(KEY_FULLNAME, userssessions.getString(KEY_FULLNAME, null));
        userdata.put(KEY_USERNAME, userssessions.getString(KEY_USERNAME, null));
        userdata.put(KEY_EMAIL, userssessions.getString(KEY_EMAIL, null));
        userdata.put(KEY_PHONENUMBER, userssessions.getString(KEY_PHONENUMBER, null));

        return userdata;
    }

    public boolean checklogin() {
        if (userssessions.getBoolean(IS_LOGIN, false)) {
            return true;
        } else return false;
    }

    public void logoutfromsession() {

        editor.clear();
        editor.commit();

    }

}


