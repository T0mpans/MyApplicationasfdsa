package com.example.myapplicationasfdsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int polub = 0;
    TextView textView;
    View widok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.polubiac);
        widok = findViewById(R.id.obrazek);
    }

    public void dodajLike(View view) {
        polub++;
        textView.setText(polub +" Polubien");
    }

    public void usunLike(View view) {
        polub--;
        textView.setText(polub+" Polubień");
    }

    public void usunObrazek(View view) {
        widok.setVisibility(View.INVISIBLE);
    }
}