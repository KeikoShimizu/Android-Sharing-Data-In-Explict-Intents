package com.example.sharingdatainexplictintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //references
    private Button submitBtn ;
    private EditText nameEditText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submitBtn);
        nameEditText = findViewById(R.id.nameEditText);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                Bundle b = new Bundle();
                b.putString("name", nameEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);*/
                passDataFirstMethod();
//                passDataSecondMethod();
            }
        });
    }

    //1. Method1 Put a data into bundle as b(bundle is same as onCreateActivity method)
    private void passDataFirstMethod() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        Bundle b = new Bundle();
        b.putString("name", nameEditText.getText().toString());
        intent.putExtras(b);

        startActivity(intent);
    }

    //2.Method2 put a data into intent activity
    private void passDataSecondMethod() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", nameEditText.getText().toString());
        startActivity(intent);
    }
}

//getExtra() => getString (GET METHOD)
//putExtra() => putString (INPUT METHOD)