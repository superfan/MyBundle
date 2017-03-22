package com.sh3h.mybundle;

import android.app.Application;
import android.util.Log;

/**
 * Created by superfan on 2017/3/21.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("APP","MyApplication on create");
    }
}
