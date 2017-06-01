package com.bignerdranch.android.nongc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                setContentView(R.layout.layout1);

        setContentView(R.layout.layout1);

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                setContentView(R.layout.layout2);
                        setContentView(R.layout.layout2);
                Button button = (Button) findViewById(R.id.button);
                       button.setOnClickListener(new View.OnClickListener() {

                           @Override
                           public void onClick(View v) {
                                 setContentView(R.layout.layout1);
                           }
                       } );
            }

        });
    }
        });
    }
}

