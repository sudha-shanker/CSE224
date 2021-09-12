package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageViewExample extends AppCompatActivity {
    ImageView monkey,android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_example);
        monkey = findViewById(R.id.monkey1);
        android = findViewById(R.id.android1);
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "monkey", Toast.LENGTH_LONG).show();
            }
        });
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "android", Toast.LENGTH_LONG).show();
            }
        });

    }
}
