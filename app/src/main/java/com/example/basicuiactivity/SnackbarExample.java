package com.example.basicuiactivity;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnackbarExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_example);

        Button button = (Button) findViewById(R.id.callback);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                View view = findViewById(R.id.callback);
                String message = "Snackbar message example displayed";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });
    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }

}