package com.example.operaciones_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pantalla_potencia extends AppCompatActivity {

    EditText valorpote1;
    EditText valorpote2;
    Button botonpote;
    TextView resulpote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_potencia);
        valorpote1=findViewById(R.id.valor_poten1);
        valorpote2=findViewById(R.id.valor_poten2);
        resulpote=findViewById(R.id.text_resul_poten);
        botonpote=findViewById(R.id.boton_poten);
        botonpote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numerobase = Integer.parseInt(valorpote1.getText().toString());
                int numeroexp = Integer.parseInt(valorpote2.getText().toString());
                potencia(numerobase,numeroexp);
                int potencia1 = potencia(numerobase,numeroexp);
                resulpote.setText("Potencia(La base: "+numerobase+" y el exponente2"+numeroexp+")"+potencia1);
            }
        });
    }
    private int potencia(int valorbase, int valorexp) {
        if (valorexp == 0) {
            return 1;
        } else {
            return valorbase * potencia(valorbase, valorexp - 1);
        }
    }
}