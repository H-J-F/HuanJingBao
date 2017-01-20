package com.example.a11691.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by 11691 on 2016/11/15.
 */

public class SetupActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setup_layout);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SetupActivity.this, LoginActivity.class);
                SetupActivity.this.startActivity(mainIntent);
                SetupActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}
