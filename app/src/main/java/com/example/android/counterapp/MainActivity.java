package com.example.android.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int qty = 0;
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        eventHandler();
    }
    //handling events in application.
    private void eventHandler() {
        b.decBtn.setOnClickListener(v -> decqty());

        b.incBtn.setOnClickListener(v -> incqty());
    }

    //To increase the quantity
    private void incqty() {
        b.qty1.setText( "" + qty++);
    }

    //To decrease the quantity
    private void decqty() {
        b.qty1.setText("" + qty--);
    }
}