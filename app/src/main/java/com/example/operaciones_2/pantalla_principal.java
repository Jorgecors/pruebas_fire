package com.example.operaciones_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pantalla_principal extends AppCompatActivity {

    Button botonopcion;
    EditText valoropcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);
        valoropcion=findViewById(R.id.campo_op);
        botonopcion=findViewById(R.id.boton_op);
        botonopcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarpantalla();
            }
        });
    }
    public void cambiarpantalla(){
        int valoropci = Integer.parseInt(valoropcion.getText().toString());
        if(valoropci == 1) {
            Intent pantfibo = new Intent(this,pantalla_fibonacci.class);
            startActivity(pantfibo);
        }else if(valoropci == 2){
            Intent pantpoten = new Intent(this,pantalla_potencia.class);
            startActivity(pantpoten);
        }else if(valoropci == 3) {
            Intent pantmulti = new Intent(this, pantalla_multiplicacion.class);
            startActivity(pantmulti);
        }else if(valoropci == 4) {
            Intent pantubi = new Intent(this, Ubicacion_u.class);
            startActivity(pantubi);
        }else {
            Intent pant = new Intent(this, pantalla_principal.class);
            startActivity(pant);
        }
    }
}