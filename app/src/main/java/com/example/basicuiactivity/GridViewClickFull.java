package com.example.basicuiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class GridViewClickFull extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_click_full);
        Intent i = getIntent();
        // Get Selected Image Id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = findViewById(R.id.imageview);
        imageView.setImageResource(imageAdapter.thumbImages[position]);
    }
}
