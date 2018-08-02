package com.example.maather.hajj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    db_data db = new db_data(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void btn_signin(View v )
    {
        if(v.getId() == R.id.buttonsignin)
        {
            EditText n = ( EditText) findViewById(R.id.editText2_name);
            EditText p = ( EditText) findViewById(R.id.editText_pass);

            String Name = n.getText().toString();
            String pass = p.getText().toString();

            String password = db.searchpass(Name);


            if(pass.equals(password))
            {
                contact c = new contact();
                Intent i = new Intent(login.this, interfaces.class);
                i.putExtra("Username",Name);
                i.putExtra("Email",c.getEmail());
                startActivity(i);
            }
            else
            {
                //popup msg
                Toast temp = Toast.makeText(login.this,"اسم المستخدم وكلمة المرور غير متطابقين",Toast.LENGTH_SHORT);
                temp.show();
            }
        }
    }

    public void btn_Participat(View v )
    {
        Intent intent = new Intent(login.this,personal_information.class);
        startActivity(intent);
    }
    public void btn_recovery(View v )
    {
        Intent intent = new Intent(login.this,recovery.class);
        startActivity(intent);
    }
}