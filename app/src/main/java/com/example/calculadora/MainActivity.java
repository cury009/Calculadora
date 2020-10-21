package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_numero1 = null;
    EditText edt_numero2 = null;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1 = findViewById(R.id.edt_numero1);
        edt_numero2 = findViewById(R.id.edt_numero2);
        txt_resultado = findViewById(R.id.txt_resultado);
    }

    public void restar(View view) {
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        try {
            String textoNumero1 = String.valueOf(edt_numero1.getText().toString());
            numero1 = Double.valueOf(textoNumero1);
        }catch (Exception e) {
            edt_numero1.setError("numero incorrecto");
            return;
        }

        //----------------------------------------------------------
        try {
            String textoNumero2 = String.valueOf(edt_numero2.getText().toString());
            numero2 = Double.valueOf(textoNumero2);
        }catch (Exception e) {
            edt_numero2.setError("numero incorrecto");
            return;
        }
            //----------------------------------------------------------
            resultado = (numero1 - numero2);
            //----------------------------------------------------------
            double resultadoRedondeado = Math.round(resultado*100.0)/100.0;
            //----------------------------------------------------------
            txt_resultado.setText((String.valueOf(resultadoRedondeado)));

    } //fin restar

    public void sumar(View view) {
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;

        try {
            String textoNumero1 = String.valueOf(edt_numero1.getText().toString());
            numero1 = Double.valueOf(textoNumero1);
        }catch (Exception e) {
            edt_numero1.setError("numero incorrecto");
            return;
        }

        //----------------------------------------------------------
        try {
            String textoNumero2 = String.valueOf(edt_numero2.getText().toString());
            numero2 = Double.valueOf(textoNumero2);
        }catch (Exception e) {
            edt_numero2.setError("numero incorrecto");
            return;
        }
        //----------------------------------------------------------
            resultado = numero1 + numero2;
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado*100.0)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    } // fin sumar

    public void multiplicar(View view) {
            double numero1 = 0;
            double numero2 = 0;
            double resultado = 0;
            try {
                String textoNumero1 = String.valueOf(edt_numero1.getText().toString());
                numero1 = Double.valueOf(textoNumero1);
            }catch (Exception e) {
                edt_numero1.setError("numero incorrecto");
                return;
            }

            //----------------------------------------------------------
            try {
                String textoNumero2 = String.valueOf(edt_numero2.getText().toString());
                numero2 = Double.valueOf(textoNumero2);
            }catch (Exception e) {
                edt_numero2.setError("numero incorrecto");
                return;
            }

            //----------------------------------------------------------
                resultado = numero1 * numero2;
                //----------------------------------------------------------
                double resultadoRedondeado = Math.round(resultado*100.0)/100.0;
                //----------------------------------------------------------
                txt_resultado.setText(String.valueOf(resultadoRedondeado));

    } //fin multiplicar

    public void porcentaje(View view) {
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        try {
            String textoNumero1 = String.valueOf(edt_numero1.getText().toString());
            numero1 = Double.valueOf(textoNumero1);
        }catch (Exception e) {
            edt_numero1.setError("numero incorrecto");
            return;
        }
        //----------------------------------------------------------
        resultado = (numero1*100)/100;
        //----------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado)/100.0;
        //----------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    } //fin porcentaje

    public void dividir(View view) {
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
            try {
                String textoNumero1 = String.valueOf(edt_numero1.getText().toString());
                numero1 = Double.valueOf(textoNumero1);
            }catch (Exception e) {
                edt_numero1.setError("numero incorrecto");
                return;
            }

            //----------------------------------------------------------
            try {
                String textoNumero2 = String.valueOf(edt_numero2.getText().toString());
                numero2 = Double.valueOf(textoNumero2);
            }catch (Exception e) {
                edt_numero2.setError("numero incorrecto");
                return;
            }

        if (numero2 == 0) {
                    edt_numero2.setError("el numero 2 no puede ser cero");
                    return;
        }
                //----------------------------------------------------------
                resultado = numero1 /numero2;
                //----------------------------------------------------------
                double resultadoRedondeado = Math.round(resultado*100.0)/100.0;
                //----------------------------------------------------------
                txt_resultado.setText(String.valueOf(resultadoRedondeado));

    } //fin dividir
} //fin programa