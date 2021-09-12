package com.example.basicuiactivity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_example);
        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogExample.this);
                builder.setTitle("Login Alert")
                        .setMessage("Are you sure, you want to continue ?")
                        .setCancelable(true)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogExample.this,"Selected Option: YES", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("Yes1", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogExample.this,"Selected Option: YES1", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogExample.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                            }
                        });

                //Creating dialog box
                AlertDialog dialog  = builder.create();
                dialog.show();
            }
        });
    }
}
