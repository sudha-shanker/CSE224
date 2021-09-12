package com.example.basicuiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditTextExample extends AppCompatActivity {
    Button btnSubmit;
    EditText name, password, email, dob, phoneno;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_example);
        name=findViewById(R.id.txtName);
        password =findViewById(R.id.txtPwd);
        email = findViewById(R.id.txtEmai);
        dob = findViewById(R.id.txtDate);
        phoneno= findViewById(R.id.txtPhone);
        btnSubmit =findViewById(R.id.btnSend);
        result = findViewById(R.id.resultView);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || password.getText().toString().isEmpty() || email.getText().toString().isEmpty() || dob.getText().toString().isEmpty()
                        || phoneno.getText().toString().isEmpty()) {
                    Toast.makeText(EditTextExample.this, "Enter all the details", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText("Name -  " + name.getText().toString() + " \n" + "Password -  " + password.getText().toString()
                            + " \n" + "E-Mail -  " + email.getText().toString() + " \n" + "DOB -  " + dob.getText().toString()
                            + " \n" + "Contact -  " + phoneno.getText().toString());
                }
            }
        });
    }
}


