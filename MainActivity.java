package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import static java.lang.Thread.sleep;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
        try {
            sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        //close activity
        finish();
    }
}