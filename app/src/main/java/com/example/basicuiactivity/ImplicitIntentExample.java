package com.example.basicuiactivity;

import android.content.Intent;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitIntentExample extends AppCompatActivity {

    EditText et1;
    Button btn,btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_example);

        et1 = findViewById(R.id.urlText);
        btn = findViewById(R.id.btnNavigate);
        btn1 = findViewById(R.id.btnCamera);
        btn2 = findViewById(R.id.call);
        btn3 = findViewById(R.id.contact);
        btn4= findViewById(R.id.gallery);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = et1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(camera_intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCallLog = new Intent(Intent.ACTION_VIEW);
                intentCallLog.setType(CallLog.Calls.CONTENT_TYPE);
                startActivity(intentCallLog);
            }
        });
    }
}
