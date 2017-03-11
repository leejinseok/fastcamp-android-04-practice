package com.example.d02_activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_MAIN = 2501;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void requestForResult(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST_MAIN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode != REQUEST_MAIN){
            return;
        }
        if(resultCode != RESULT_OK){
            setTitle(R.string.app_name);
        }
        else{
            setTitle(data.getStringExtra("result"));
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
