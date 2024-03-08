package com.example.calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AtividadeCalculadora extends AppCompatActivity {
    @Override
    public void onCreate (Bundle bundle) {
        super.onCreate(bundle);

        TextView texto = new TextView(this);
        texto.setText("Calculadora");
        setContentView(texto);

        EditText numberEdit = findViewById(R.id.camponumero);
        Button button0 = findViewById(R.id.numero0);
        Button button1 = findViewById(R.id.numero1);
        Button button2 = findViewById(R.id.numero2);
        Button button3 = findViewById(R.id.numero3);
        Button button4 = findViewById(R.id.numero4);
        Button button5 = findViewById(R.id.numero5);
        Button button6 = findViewById(R.id.numero6);
        Button button7 = findViewById(R.id.numero7);
        Button button8 = findViewById(R.id.numero8);
        Button button9 = findViewById(R.id.numero9);
        Button buttonIgual = findViewById(R.id.igual);
        Button buttonMais = findViewById(R.id.mais);
        Button buttonMenos = findViewById(R.id.menos);
        Button buttonDividir = findViewById(R.id.dividir);
        Button buttonMulti = findViewById(R.id.multiplicar);
        Button buttonPorcem = findViewById(R.id.porcentagem);
        Button buttonDecimal = findViewById(R.id.virgula);

        setContentView(R.layout.calculadora_layout);
    }
}
