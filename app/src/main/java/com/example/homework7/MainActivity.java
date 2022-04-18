package com.example.homework7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton excellentRadio, gooRadio, okayRadio, poorRadio;
    CheckBox reallyCheckBox, willCheckBox, wouldCheckBox, satiffCheckBox;
    Button jiberuBtn;

    String lessonTuri, suggestion1, suggestion2, suggestion3, suggestion4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        excellentRadio = findViewById(R.id.excellentRadio);
        gooRadio = findViewById(R.id.gooRadio);
        okayRadio = findViewById(R.id.okayRadio);
        poorRadio = findViewById(R.id.poorRadio);


        reallyCheckBox = findViewById(R.id.reallyCheckBox);
        willCheckBox = findViewById(R.id.willCheckBox);
        wouldCheckBox = findViewById(R.id.wouldCheckBox);
        satiffCheckBox = findViewById(R.id.satiffCheckBox);


        jiberuBtn = findViewById(R.id.jiberuBtn);



        jiberuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (excellentRadio.isChecked()) {
                    lessonTuri = "EXCELLENT";
                } else if (gooRadio.isChecked()) {
                    lessonTuri = "GOOD";
                } else if (okayRadio.isChecked()) {
                    lessonTuri = "OKAY";
                } else if (poorRadio.isChecked()) {
                    lessonTuri = "POOR";
                }


                if (reallyCheckBox.isChecked()) {
                   suggestion1 = "Yes";
                }

                if (willCheckBox.isChecked()) {
                    suggestion2 = "Yes";
                }
                if (wouldCheckBox.isChecked()) {
                    suggestion3 = "Yes";
                }

                if (satiffCheckBox.isChecked()) {
                    suggestion4 = "Yes";
                }


                String result ="osenka: "+lessonTuri+"\n"+
                        reallyCheckBox.getText()+": "+suggestion1+"\n"+
                        willCheckBox.getText()+": "+suggestion2+"\n"+
                        wouldCheckBox.getText()+": "+suggestion3+"\n"+
                        satiffCheckBox.getText()+": "+suggestion4+"\n";
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();


                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }
}