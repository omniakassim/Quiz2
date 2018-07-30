package com.example.nour.quiz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void result(View view) {


        CheckBox yesCheckBox = findViewById(R.id.Yes);
        boolean yesAnswer = yesCheckBox.isChecked();

        CheckBox noCheckBox = findViewById(R.id.No);
        boolean noAnswer = noCheckBox.isChecked();


        if (yesAnswer) {
            ImageView imageView = findViewById(R.id.android_pyramids_image_view);
            imageView.setImageResource(R.drawable.pyramids_hdpi);

            Toast.makeText(getApplicationContext(), "Congratulations! YOU won a trip to Egypt.", Toast.LENGTH_LONG).show();

        }

       if (noAnswer)

            Toast.makeText(getApplicationContext(), "Hard Luck this time!.", Toast.LENGTH_LONG).show();

        }


    }






