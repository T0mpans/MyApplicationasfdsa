package com.example.myapplicationasfdsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int polub = 0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.polubiac);
    }

    public void dodajLike(View view) {
        polub++;
        textView.setText(polub +" Polubien");
    }

    public void usunLike(View view) {
        polub--;
        textView.setText(polub+" Polubień");
    }
}