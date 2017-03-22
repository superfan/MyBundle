package com.sh3h.mylibrary;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onTest6(View view) {
        Toast.makeText(this, Toast.LENGTH_LONG, "ok").show();
    }
}
