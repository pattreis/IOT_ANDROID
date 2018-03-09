package com.example.logonrm.a03_exercicio_increments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblNumero;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblNumero = findViewById(R.id.lblNumero);
        lblNumero.setText(String.valueOf(contador));
    }

    public void adicionar(View view) {
        if (contador < 10) {
            contador++;
            lblNumero.setText(String.valueOf(contador));
        }
    }

    public void remover(View view) {
        if (contador > 0) {
            contador--;
            lblNumero.setText(String.valueOf(contador));
        }
    }
}
