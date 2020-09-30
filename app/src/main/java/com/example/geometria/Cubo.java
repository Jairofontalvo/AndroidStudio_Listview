package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class Cubo extends AppCompatActivity {
    private EditText arista;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        arista = findViewById(R.id.txtArista);
        result = findViewById(R.id.lblresultado);
    }
    public void Calcular(View v){
        if(Validar()){
            Double resultado;
            String datos, nombre_operacion, arista_t ;
            Calculos ca;
            nombre_operacion = getString(R.string.lbl_vol_cubo);
            arista_t = arista.getText().toString();
            datos = getString(R.string.lbl_arista) + " " + arista_t  ;
            String temp;
            temp = String.format("%.2f", Math.pow( parseDouble(arista_t ), 3) );
            resultado =  parseDouble(temp);
            ca = new Calculos(nombre_operacion, datos, resultado );
            ca.guardar();
            result.setText(getString(R.string.mensaje_volumen) + " " +resultado);
        }
    }
    public void limpiar(View v){
        arista.setText("");
        result.setText("");
        arista.requestFocus();
    }
    public Boolean Validar(){
        arista = findViewById(R.id.txtArista);
        if(arista.getText().toString().isEmpty()){
            arista.setError(getString(R.string.error));
            arista.requestFocus();
            return  false;
        }
        return true;

    }
}