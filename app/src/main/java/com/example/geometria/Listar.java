package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Calculos> registros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        tabla = findViewById(R.id.tblRegistros);
        registros = Datos.obtener();

        for (int i = 0; i < registros.size() ; i++) {
            TableRow fila = new TableRow(this);

            TextView columna_uno = new TextView(this);
            TextView columna_dos = new TextView(this);
            TextView columna_tres = new TextView(this);
            TextView columna_cuatro = new TextView(this);

            columna_uno.setText(""+(i+1));
            columna_dos.setText(registros.get(i).getNombre_operacion());
            columna_tres.setText(registros.get(i).getDatos());
            columna_cuatro.setText(""+ registros.get(i).getResultado());

            fila.addView(columna_uno);
            fila.addView(columna_dos);
            fila.addView(columna_tres);
            fila.addView(columna_cuatro);

            tabla.addView(fila);

        }
    }
}