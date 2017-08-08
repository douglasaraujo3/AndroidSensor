package com.araujo.douglas.androidsensor;

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

    public void getAceleromter(View view) {
        Intent i = new Intent(this, AceleromterActivity.class);
        startActivity(i);


    }

    public void getTTS(View view) {
        Intent i = new Intent(this,TTSActivity.class);
        startActivity(i);
    }

    public void getSTT(View view) {
        Intent i = new Intent(this,STTAcitvity.class);
        startActivity(i);
    }

    public void getAll(View view) {
        Intent i = new Intent(this,AllActivity.class);
        startActivity(i);
    }
}
