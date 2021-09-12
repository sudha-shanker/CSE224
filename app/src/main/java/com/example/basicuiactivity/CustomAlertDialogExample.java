package com.example.basicuiactivity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class CustomAlertDialogExample extends AppCompatActivity {
    Button b1;
    Button yes,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog_example);

        b1 = findViewById(R.id.Click);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog v1 = new Dialog(CustomAlertDialogExample.this);
                v1.setContentView(R.layout.custom_alert_dialog_layout);
                v1.setCancelable(false);
              // View v2=getLayoutInflater().inflate(R.layout.custom_alert_dialog_layout,null,false);
               // v1.setContentView(v2);

                yes = v1.findViewById(R.id.yes);
                no = v1.findViewById(R.id.no);

                yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(CustomAlertDialogExample.this, "Yes selected", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });

                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(CustomAlertDialogExample.this, "No Selected", Toast.LENGTH_SHORT).show();
                        v1.dismiss();
                        //v1.cancel();
                    }
                });
                v1.show();
                Window w=v1.getWindow();
                w.setLayout(700,280);
            }
        });
    }
}
