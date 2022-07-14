package com.example.summitclasses.checkinternet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class connectivityreceiver extends BroadcastReceiver {

    public static  ConnectivityrReceiverListner connectivityrReceiverListner;

    public connectivityreceiver() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager cm= (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);

        NetworkInfo activenetwork=cm.getActiveNetworkInfo();

        boolean isconnected=activenetwork!=null&& activenetwork.isConnectedOrConnecting();

        if (connectivityrReceiverListner!=null){
            connectivityrReceiverListner.OnNetworkconnectionchanged(isconnected);
        }

        }

        public static boolean isconnected(){

        ConnectivityManager cm= (ConnectivityManager) mynet
                                                 .getInstance()
                                                 .getApplicationContext()
                                                 .getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo activenetwork=cm.getActiveNetworkInfo();

            return activenetwork!=null && activenetwork.isConnectedOrConnecting();

        }
    //interface
    public interface ConnectivityrReceiverListner{
        void OnNetworkconnectionchanged(boolean isconnected);
    }

}
