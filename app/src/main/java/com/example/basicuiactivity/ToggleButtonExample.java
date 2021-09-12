package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonExample extends AppCompatActivity {

    ToggleButton tb1,tb2;
    Button btnGet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_example);
        tb1 = findViewById(R.id.toggle1);
        tb2 = findViewById(R.id.toggle2);
        btnGet =    findViewById(R.id.getBtn);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Toggle Button1 -  " + tb1.getText().toString() + " \n" + "Toggle Button2 - " + tb2.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
