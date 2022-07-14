package com.example.summitclasses.checkinternet;

import android.app.Application;

public class mynet extends Application {
    private static mynet mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance=this;
    }

    public static synchronized mynet getInstance(){
        return mInstance;

    }
    public void setconnectivityListner(connectivityreceiver.ConnectivityrReceiverListner listner){
        connectivityreceiver.connectivityrReceiverListner=listner;
    }

}
