package com.example.maather.hajj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class recovery extends AppCompatActivity {
    db_data db = new db_data(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
    }
    public void btn_recoverpass(View v) {
        if (v.getId() == R.id.button4) {
            EditText Name = (EditText) findViewById(R.id.editText5);
            String name = Name.getText().toString();

            TextView textView = (TextView) findViewById(R.id.textView8);
            String resultText = new String(db.searchpass(name)).toString();
            textView.setText(resultText);
        }
    }
}
