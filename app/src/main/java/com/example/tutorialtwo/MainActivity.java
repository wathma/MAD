package com.example.tutorialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textObj = findViewById(R.id.txtTwo);

        textObj.setText(R.string.Msg2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Life Cycle","onStart() called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Life Cycle","onResume() called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Life Cycle","onPaused() called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Life Cycle","onStop() called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Life Cycle","onDestroy() called");
    }
}