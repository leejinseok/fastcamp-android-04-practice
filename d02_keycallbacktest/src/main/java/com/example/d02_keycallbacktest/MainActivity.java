package com.example.d02_keycallbacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Key!!", Toast.LENGTH_LONG).show();
//        super.onBackPressed();
    }

    @Override
    public void onUserLeaveHint(){
        Toast.makeText(this, "User Leave Hint", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume !!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop !!", Toast.LENGTH_SHORT).show();
    }
}
