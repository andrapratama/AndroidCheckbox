package com.androidcheckbox.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnClick();
        addListenerToCheckBox();
    }

    public void addListenerToCheckBox() {
        cb1 = (CheckBox)findViewById(R.id.cb_football);
        cb2 = (CheckBox)findViewById(R.id.cb_futsal);
        cb3 = (CheckBox)findViewById(R.id.cb_swim);
        cb1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this, "Football is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this, "Futsal is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        cb3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this, "Swimming is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void addListenerOnClick() {
        cb1 = (CheckBox)findViewById(R.id.cb_football);
        cb2 = (CheckBox)findViewById(R.id.cb_futsal);
        cb3 = (CheckBox)findViewById(R.id.cb_swim);
        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StringBuffer result = new StringBuffer();
                        result.append("Football : ").append(cb1.isChecked());
                        result.append("\nFutsal : ").append(cb2.isChecked());
                        result.append("\nSwimming : ").append(cb3.isChecked());

                        Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
