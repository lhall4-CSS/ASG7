package com.ljedesign.landonhall.asg7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String ROOM_WIDTH_KEY = "LJE_ROOM_WIDTH";
    public static final String ROOM_LENGTH_KEY = "LJE_ROOM_LENGTH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateResult(View view) {
        //create new intent
        Intent intent = new Intent(this, Screen2Activity.class);
        //grab room width and length vars
        EditText roomWidth = (EditText) findViewById(R.id.roomWidth);
        EditText roomLength = (EditText) findViewById(R.id.roomLength);
        //grab vars stings
        String roomWidthVal = roomWidth.getText().toString();
        String roomLengthVal = roomLength.getText().toString();
        //add string values to intent
        intent.putExtra(ROOM_WIDTH_KEY, roomWidthVal);
        intent.putExtra(ROOM_LENGTH_KEY, roomLengthVal);
        //start activity
        startActivity(intent);
    }
}
