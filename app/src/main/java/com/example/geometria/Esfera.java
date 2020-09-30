package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Esfera extends AppCompatActivity {
    private EditText radio;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = findViewById(R.id.txtRadioEs);
        result = findViewById(R.id.lblresultado);
    }

    public void Calcular(View v) {
        if (Verificar()) {
            Double resultado;
            String datos, nombre_operacion, radioC;
            Calculos ca;
            nombre_operacion = getString(R.string.lbl_vol_esfera);
            radioC = radio.getText().toString();
            datos = getString(R.string.radio) + " " + radioC;
            String temp;
            temp = String.format("%.2f", (4 * PI * Math.pow(parseDouble(radioC), 3)) / 3);
            resultado = parseDouble(temp);
            ca = new Calculos(nombre_operacion, datos, resultado);
            ca.guardar();
            result.setText(getString(R.string.mensaje_volumen) + " " +resultado);
        }
    }

    public void limpiar(View v) {
        radio.setText("");
        result.setText("");
        radio.requestFocus();
    }

    public Boolean Verificar() {
        radio = findViewById(R.id.txtRadioEs);
        if (radio.getText().toString().isEmpty()) {
            radio.setError(getString(R.string.error));
            radio.requestFocus();
            return false;
        }
        return true;

    }
}