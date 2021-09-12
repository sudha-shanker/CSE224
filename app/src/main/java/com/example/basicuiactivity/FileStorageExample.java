package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStorageExample extends AppCompatActivity {
    Button b1, b2;

    EditText ed1,tv;

    String data;
    private String file = "mydata.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_storage_example);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.button2);

        ed1 = (EditText) findViewById(R.id.E11);
        tv = (EditText) findViewById(R.id.E2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                data = ed1.getText().toString();
                try {
                    FileOutputStream fOut = openFileOutput(file, MODE_PRIVATE);
                    fOut.write(data.getBytes());
                    fOut.close();
                    Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fin = openFileInput(file);
                    int c;
                    String temp = "";
                    while ((c = fin.read()) != -1) {
                        temp = temp + ((char) c);
                    }
                    tv.setText(temp);
                    Toast.makeText(getBaseContext(), "file read", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                }
            }
        });
    }
}