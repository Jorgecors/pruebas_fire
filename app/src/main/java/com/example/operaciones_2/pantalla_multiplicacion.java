package com.example.operaciones_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pantalla_multiplicacion extends AppCompatActivity {

    EditText valormul1;
    EditText valormul2;
    Button botonmul;
    TextView resulmul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_multiplicacion);
        valormul1=findViewById(R.id.valor_multi_1);
        valormul2=findViewById(R.id.valor_multi_2);
        resulmul=findViewById(R.id.text_resul_multi);
        botonmul=findViewById(R.id.boton_multi);
        botonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numeromul1 = Integer.parseInt(valormul1.getText().toString());
                int numeromul2 = Integer.parseInt(valormul2.getText().toString());
                multiplicacion(numeromul1,numeromul2);
                int multiplicacion1 = multiplicacion(numeromul1,numeromul2);
                resulmul.setText("Multiplicacion de: "+numeromul1+" y "+numeromul2+" el resultado es: "+multiplicacion1);
            }
        });
    }
    public int multiplicacion(int valormulti1, int valormulti2) {
        return valormulti1 *  valormulti2;
    }
}