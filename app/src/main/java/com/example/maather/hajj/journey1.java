package com.example.maather.hajj;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class journey1 extends AppCompatActivity {

    private static final String TAG= "Journey";
    CheckBox start, mak,mina,muzdalifa,haram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_journey);
    }
    //  super.onCreate(savedInstanceState);
    //  setContentView(R.layout.activity_journey);
    //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    //  setSupportActionBar(toolbar);

    //start = (CheckBox) findViewById(R.id.start) ;
    //haram = (CheckBox) findViewById(R.id.haram) ;
    //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });*/

    public void onCheckboxClicked(View View1) {
        // Is the view now checked?
        boolean checked = ((CheckBox) View1).isChecked();

        // Check which checkbox was clicked
        switch(View1.getId()) {
            case R.id.start:
                if (checked){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(journey1.this);
                    dialog.setTitle("تأكيد");
                    dialog.setMessage("هل تريد البدء ؟");
                    dialog.setPositiveButton("نعم",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface arg0, int arg1) {
                                    Toast.makeText(journey1.this,"رحلتك تبدأ الآن", Toast.LENGTH_LONG).show();
                                }
                            });

                    dialog.setNegativeButton("لا",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

                    AlertDialog alertDialog = dialog.create();
                    alertDialog.show();

                }

                // Remove the meat
                break;
                case R.id.haram:
                    if (checked){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(journey1.this);
                        dialog.setTitle("تأكيد");
                        dialog.setMessage("هل أنهيت الطواف والسعي ؟");
                        dialog.setPositiveButton("نعم",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {
                                        Toast.makeText(journey1.this,"لقد أنهيت الطواف والسعي، الخطوة التالية في انتظارك", Toast.LENGTH_LONG).show();
                                    }
                                });

                        dialog.setNegativeButton("لا",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });

                        AlertDialog alertDialog = dialog.create();
                        alertDialog.show();

                    }

                    // Remove the meat
                    break;
            // TODO: Veggie sandwich
        }
    }
}

