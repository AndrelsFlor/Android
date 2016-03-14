package com.example.fatec.pescador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(calcular());


    }

    private View.OnClickListener calcular() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editPeso = (EditText) findViewById(R.id.editPeso);
                TextView txtTotal = (TextView) findViewById(R.id.editFinal);
                float peso = Float.parseFloat(editPeso.getText().toString());
                float excedente = peso-50;

                if(excedente <= 0){
                    txtTotal.setText(String.valueOf("Multa: R$" + 0 + "\n" + "Lucro: R$"+peso*3));
                }
                else if(excedente > 0){
                    float lucro = (peso*3)-(excedente*4);
                    txtTotal.setText(String.valueOf("Multa: R$" + excedente*4 +"\n" + "Lucro R$" + lucro));
                }

            }


        };
    }
}
