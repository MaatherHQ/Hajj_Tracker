package com.example.maather.hajj;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_hajji extends AppCompatActivity {

    private static final String TAG= "Hajj";

    EditText name,number,office;
    Button sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_hajji);
        name = (EditText)findViewById(R.id.name);
        number = (EditText)findViewById(R.id.number);
        office= (EditText)findViewById(R.id.office);
        sign = (Button)findViewById(R.id.sign);
        final String name1 = name.getText().toString();
        final String number1 = number.getText().toString();
        final String office1 = office.getText().toString();
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name1==""||number1==""||office1=="")
                {
                    Toast.makeText(login_hajji.this,"لم تقم بتعبئة كامل البيانات", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent features = new Intent(login_hajji.this, basic_features.class);
                    startActivity(features);
                    setContentView(R.layout.activity_basic_features);

                }
            }
        });


    }
}
