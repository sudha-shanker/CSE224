package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerExample extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    String[] users = { "India", "Australia", "USA", "SriLanka", "China" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_example);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
      // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.array_technology));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), "Selected Country: "+users[position] ,Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(), "Selected Subject: "+getResources().getStringArray(R.array.array_technology)[position] ,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }
}