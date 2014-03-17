package com.example.helloworld;

import android.app.Application;

import com.box.boxandroidlibv2.BoxAndroidClient;

public class HelloWorldApplication extends Application {

    public static final String CLIENT_ID = "hs8k9gu30co0rx5htt91gs0xcevntaxp";
    public static final String CLIENT_SECRET = "QvTijDGniBGv7Jhk26teeS45D6do0nBH";
    public static final String REDIRECT_URL = "";

    private BoxAndroidClient mClient;

    public void setClient(BoxAndroidClient client) {
        this.mClient = client;
    }

    /**
     * Gets the BoxAndroidClient for this app.
     * 
     * @return a singleton instance of BoxAndroidClient.
     */
    public BoxAndroidClient getClient() {
        return mClient;
    }
}
