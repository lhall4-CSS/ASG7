package com.ljedesign.landonhall.asg7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Screen2Activity extends AppCompatActivity {
//assign var names
TextView roomLengthTV;
TextView roomWidthTV;
TextView totalNeededTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        //initialize variables
        roomLengthTV = findViewById(R.id.lengthTextView);
        roomWidthTV= findViewById(R.id.widthTextView);
        totalNeededTV = findViewById(R.id.totalTextView);
        //get Intent
        Intent intent = getIntent();
        //Parse double value from extras
        Double roomWidth = Double.parseDouble(intent.getStringExtra(MainActivity.ROOM_WIDTH_KEY));
        Double roomLength = Double.parseDouble(intent.getStringExtra(MainActivity.ROOM_LENGTH_KEY));
        //calculate total needed
        Double totalNeeded = roomLength * roomWidth;
        //set text values
        roomWidthTV.setText(roomWidth.toString());
        roomLengthTV.setText(roomLength.toString());
        totalNeededTV.setText(totalNeeded.toString());
        

    }
}
