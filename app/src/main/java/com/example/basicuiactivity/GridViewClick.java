package com.example.basicuiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridViewClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_click);
        GridView gv = findViewById(R.id.griddetail);
        gv.setAdapter(new ImageAdapter(this));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), GridViewClickFull.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });

    }
}
