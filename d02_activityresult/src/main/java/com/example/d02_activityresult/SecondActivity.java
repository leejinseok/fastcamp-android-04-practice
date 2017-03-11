package com.example.d02_activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second Activity");
    }

//    button 클릭!
    public void returnResult(View view){
        Intent resultIntent = new Intent();
        resultIntent.putExtra("result", "결과값입니다");
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
