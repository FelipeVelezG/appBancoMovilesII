package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        TextView usuarioC = findViewById(R.id.tvusuarioc);
        usuarioC.setText(usuarioC.getText().toString() + getIntent().getStringExtra("sName") + getIntent().getStringExtra("sRol"));
    }
}