package com.example.maather.hajj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Languages extends AppCompatActivity {

    private static final String TAG= "Languages";
    Button arabic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        arabic = (Button)findViewById(R.id.arabic);

        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feature = new Intent(Languages.this, features.class);
                startActivity(feature);
                setContentView(R.layout.activity_features);
            }
        });
    }
}
