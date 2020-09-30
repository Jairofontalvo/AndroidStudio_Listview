package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class Rectangulo extends AppCompatActivity {
    private EditText base,altura;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        base = findViewById(R.id.txtBaseRect);
        altura = findViewById(R.id.txtAlturaRect);
        result = findViewById(R.id.lblresultado);
    }
    public void CalcularT(View v){
        if(Verificar()){
            Double resultado;
            String datos, nombre_operacion, baseT, alturaT ;
            Calculos ca;
            nombre_operacion = getString(R.string.lbl_areaRectangulo);
            baseT = base.getText().toString();
            alturaT = altura.getText().toString();
            datos = getString(R.string.lblbase) + " " + baseT + ", " + getString(R.string.lbl_altura) + " " + alturaT ;
            String temp;
            temp = String.format("%.2f", parseDouble(baseT ) * parseDouble(alturaT) );
            resultado =  parseDouble(temp);
            ca = new Calculos(nombre_operacion, datos, resultado );
            ca.guardar();
            result.setText(getString(R.string.mensaje_area) + " " +resultado);
        }
    }
    public void limpiar(View v){
        base.setText("");
        altura.setText("");
        result.setText("");
        base.requestFocus();
    }
    public Boolean Verificar(){
        base = findViewById(R.id.txtBaseRect);
        altura = findViewById(R.id.txtAlturaRect);
        if(base.getText().toString().isEmpty()){
            base.setError(getString(R.string.error));
            base.requestFocus();
            return  false;
        }
        if(altura.getText().toString().isEmpty()){
            altura.setError(getString(R.string.error));
            altura.requestFocus();
            return  false;
        }
        return true;

    }
}