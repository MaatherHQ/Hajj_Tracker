package com.example.maather.hajj;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Hajj extends AppCompatActivity {

    private static final String TAG= "Hajj";
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj);
        enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Languages = new Intent(Hajj.this, Languages.class);

                startActivity(Languages);
                setContentView(R.layout.activity_languages);

            }
        });


    }
}
