package com.example.andrluis.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = (Button) findViewById(R.id.btnCalcula);
        btnCalcular.setOnClickListener(calcularPeso());
    }

    private View.OnClickListener calcularPeso() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText editAltura = (EditText) findViewById(R.id.editAltura);
                TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
                RadioButton radioMasculino = (RadioButton) findViewById(R.id.radioMasculino);
                RadioButton radioFeminino = (RadioButton) findViewById(R.id.radioFeminino);
                if(radioMasculino.isChecked()){

                    float altura = Float.parseFloat(editAltura.getText().toString());

                        txtResultado.setText(String.valueOf("Seu peso ideal: " + (altura * 72.7 - 58)));
                }
                else if(radioFeminino.isChecked()){

                    float altura = Float.parseFloat(editAltura.getText().toString());

                    txtResultado.setText(String.valueOf("Seu peso ideal: " + (altura * 62.1 - 41.7)));
                }

            }
        };
    }
}
