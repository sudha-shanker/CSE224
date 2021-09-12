package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonExample extends AppCompatActivity {

    RadioButton android, java, angular, python;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_example);
        android = findViewById(R.id.rdbAndroid);
        angular = findViewById(R.id.rdbAngular);
        java = findViewById(R.id.rdbJava);
        python = findViewById(R.id.rdbPython);
        Button btn = findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Course: ";
                result+= (android.isChecked())?"Android":(angular.isChecked())?"AngularJS":(java.isChecked())?"Java":(python.isChecked())?"Python":"";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rdbAndroid:
                if(checked)
                    str = "Android Selected";
                break;
            case R.id.rdbAngular:
                if(checked)
                    str = "AngularJS Selected";
                break;
            case R.id.rdbJava:
                if(checked)
                    str = "Java Selected";
                break;
            case R.id.rdbPython:
                if(checked)
                    str = "Python Selected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

    }
    public void reset(View view)
    {
        android.setChecked(false);
        java.setChecked(false);
        angular.setChecked(false);
        python.setChecked(false);

    }
}
