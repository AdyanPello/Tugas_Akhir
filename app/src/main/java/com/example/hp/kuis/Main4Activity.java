package com.example.hp.kuis;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Main4Activity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);


    }

    public void onRadioButton(View view) {

        Boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    tampilDialog();
                break;

            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }


    }

    public void tampilDialog() {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat !!!");
        builder.setMessage("Jawaban kamu benar : Korea Selatan");
        builder.setPositiveButton("LANJUT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });

        builder.create().show();

    }
    public void jawabanSalah(){

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Jawaban Salah");
        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radiogroup.clearCheck();
            }
        });


        builder.create().show();

    }

}