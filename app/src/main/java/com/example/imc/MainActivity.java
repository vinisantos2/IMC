package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * Claudiomar oliveira
     * Diego Andrade
     * Heberth Matos
     * Rafael Henrique
     * Vinicius Vidal
     * marcus vinicius
     * daniel silva
     *
     * **/

    EditText edtPeso;
    EditText edtAltura;
    TextView txtResultado;
    double peso, altura, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPeso = findViewById(R.id.editTextPeso);
        edtAltura = findViewById(R.id.editTextTextAltura);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularIMC(View v){
        if(edtPeso.getText().length() == 0&& edtAltura.getText().length() == 0){
            Toast.makeText(getApplicationContext(), "Informe Altura e peso!!!", Toast.LENGTH_SHORT).show();
        }else{

            peso = Double.parseDouble(edtPeso.getText().toString());
            altura = Double.parseDouble(edtAltura.getText().toString());
            resultado = peso/ (altura * altura);
            txtResultado.setText("Imc: "+ resultado);
            if(resultado < 18.5){
                txtResultado.setText("Imc: "+ resultado + " abaixo do peso");
            }else if(resultado <= 24.9){
                txtResultado.setText("Imc: "+ resultado + " peso normal");
            } else if(resultado <= 30){
                txtResultado.setText("Imc: "+ resultado + " sobrepeso");
            }else {
                txtResultado.setText("Imc: "+ resultado + " obesidade");
            }
        }
    }


}

    /*RF001 Captar os dados do usuário
        RF002 Calcular o IMC
        RF003 Informar o IMC
        RF004 Mostrar ao usuário que faixa o IMC se encontra
     */