package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;
import static java.lang.Math.PI;

public class Circulo extends AppCompatActivity {
    private EditText radio;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio = findViewById(R.id.txtRadioCir);
        result = findViewById(R.id.lblresultado);
    }
    public void Calcular(View v){
        if(Verificar()){
            Double resultado;
            String datos, nombre_operacion, radioC ;
            Calculos ca;
            nombre_operacion = getString(R.string.lbl_area_circulo);
            radioC = radio.getText().toString();
            datos = getString(R.string.radio) + " " + radioC  ;
            String temp;
            temp = String.format("%.2f", PI * ( parseDouble(radioC ) * parseDouble(radioC ) ) );
            resultado =  parseDouble(temp);
            ca = new Calculos(nombre_operacion, datos, resultado );
            ca.guardar();
            result.setText(getString(R.string.mensaje_area) + " " +resultado);
        }
    }
    public void limpiar(View v){
        radio.setText("");
        result.setText("");
        radio.requestFocus();
    }
    public Boolean Verificar(){
        radio = findViewById(R.id.txtRadioCir);
        if(radio.getText().toString().isEmpty()){
            radio.setError(getString(R.string.error));
            radio.requestFocus();
            return  false;
        }
        return true;
    }
}