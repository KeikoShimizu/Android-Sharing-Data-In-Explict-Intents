package com.example.sharingdatainexplictintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        //get bundle with this intent
        Bundle b = ((Intent) intent).getExtras();

        //get string from text field which is named "name"
        String name = b.getString("name");

        //update the result text
        textView.setText("Hello " + name + " !" );
    }
}

//getExtra() => getString (GET METHOD)
//putExtra() => putString (INPUT METHOD)