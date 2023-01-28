package com.example.pi_lsbackpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonexit;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonexit = (Button) findViewById(R.id.buttonexit);
        buttonexit.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }
        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.button2:
                    startActivity(new Intent(MainActivity.this, Statistics.class));
                    break;
                case R.id.buttonexit:
                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                    break;

            }
        }
    }
