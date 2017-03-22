package com.sh3h.mybundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTest1(View view) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.sh3h.mylibrary.TestActivity");
        startActivity(intent);
    }
}
