package com.janegasp.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText PrexoAlcool;
    private EditText PrexoGasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrexoAlcool = findViewById(R.id.prexo_alcool);
        PrexoGasolina = findViewById(R.id.prexo_gasolina);
        resultado = findViewById(R.id.textoResultado);

    }

    public void calcularPrexo(View v){

        Double prexo_do_alcool = Double.parseDouble(PrexoAlcool.getText().toString());
        Double prexo_da_gasolina = Double.parseDouble(PrexoGasolina.getText().toString());

        Double total_prexo = prexo_do_alcool / prexo_da_gasolina;

        if(total_prexo >= 0.7 ){
            resultado.setText("A melhor opção é a Gasolina ");
        }
        else{
            resultado.setText("A melhor opção é o Alcool ");
        }

    }

}