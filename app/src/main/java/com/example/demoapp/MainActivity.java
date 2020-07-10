package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view)
    {

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        Log.i("Info", myTextField.getText().toString());
        Toast.makeText(MainActivity.this, "Hey there! " + myTextField.getText().toString(),Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
