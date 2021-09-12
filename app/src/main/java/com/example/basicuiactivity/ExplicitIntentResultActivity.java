package com.example.basicuiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntentResultActivity extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_result);
        result = findViewById(R.id.resultView);
        Intent intent = getIntent();
        Bundle b1 = intent.getExtras();

     String addition = (String)intent.getSerializableExtra("SUM");
        result.setText(addition);
    }
}
