package com.example.basicuiactivity;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CustomSnackBarExample extends AppCompatActivity {

    Button one, two, three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_snack_bar_example);

        one = findViewById(R.id.button);
        two=findViewById(R.id.button2);
        three=findViewById(R.id.button3);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view1 = findViewById(R.id.button);
                Snackbar snackbar = Snackbar
                        .make(view1, "Welcome to Android", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              final View view2 = findViewById(R.id.button2);
                Snackbar snackbar = Snackbar
                        .make(view2, "Message is deleted", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(view2, "Message is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
            }

        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick(View v) {
                    final View view3 = findViewById(R.id.button3);

                    Snackbar snackbar = Snackbar
                            .make(view3, "Try again!", Snackbar.LENGTH_LONG)
                            .setAction("RETRY", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Toast.makeText(CustomSnackBarExample.this, "Colored Snackbar", Toast.LENGTH_SHORT).show();
                                }
                            });
                    snackbar.setActionTextColor(Color.RED);
                    View sbView = snackbar.getView();
                    TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.YELLOW);
                    snackbar.show();
                }
            });
            }


            }


