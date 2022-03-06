package com.example.menu_intent_assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        textView.setText("Your are on the Home page");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_sample, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.java:
                Intent i = new Intent(MainActivity.this,java.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Studying java",Toast.LENGTH_LONG).show();break;
            case R.id.python:
                Intent ij = new Intent(MainActivity.this,python.class);
                startActivity(ij);
                Toast.makeText(getApplicationContext(),"Studying python",Toast.LENGTH_LONG).show();break;
            case R.id.kotlin:
                Intent ijk = new Intent(MainActivity.this,kotlin.class);
                startActivity(ijk);
                Toast.makeText(getApplicationContext(),"Studying Kotlin",Toast.LENGTH_LONG).show();break;
        }
        return true;
    }
}