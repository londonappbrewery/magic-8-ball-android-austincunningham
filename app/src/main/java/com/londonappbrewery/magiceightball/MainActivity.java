package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = findViewById(R.id.button);

        final ImageView eightBall = findViewById(R.id.eightBall);

        final int [] answerArray = { R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("EightBall", "Button has been clicked :) !!!!!!!!!!!!");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);
                Log.d("Dicee", "The Random number  : " + number);

                eightBall.setImageResource(answerArray[number]);


            }
        });
    }
}
