package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxExample extends AppCompatActivity {

    CheckBox Java,Python,DS,Algo;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example);

        Java = findViewById(R.id.chkJava);
        Python = findViewById(R.id.chkPython);
        DS = findViewById(R.id.chkDS);
        Algo = findViewById(R.id.chkAlg);
        btn = findViewById(R.id.but1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Courses";
                if(Java.isChecked()){
                    result += "\nJava";
                }
                if(Python.isChecked()){
                    result += "\nPython";
                }
                if(DS.isChecked()){
                    result += "\nData Structure";
                }
                if(Algo.isChecked()){
                    result += "\nAlgorithms";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chkJava:
                str = checked?"Java Selected":"Java Deselected";
                break;
            case R.id.chkPython:
                str = checked?"Python Selected":"Python Deselected";
                break;
            case R.id.chkDS:
                str = checked?"Data Structure Selected":"Data Structure Deselected";
                break;
            case R.id.chkAlg:
                str = checked?"Algorithm Selected":"Algorithm Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

    }

