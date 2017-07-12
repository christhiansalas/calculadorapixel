package com.christhiansalas.calculadorapixel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txv_proceso;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_plus, btn_minus, btn_por, btn_entre, btn_igual;
    Button btn_ac;
    String numero1 = "0";
    long numero2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv_proceso = (TextView) findViewById(R.id.tvw_proceso);
        btn_0 = (Button) findViewById(R.id.btn_0); //esto es un comentario probanr github
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4); //actualizacion
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_entre = (Button) findViewById(R.id.btn_entre);
        btn_por = (Button) findViewById(R.id.btn_por);
        btn_igual = (Button) findViewById(R.id.btn_igual);
        btn_ac = (Button) findViewById(R.id.btn_ac);



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "0";
                txv_proceso.setText(numero1);

            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "1";
                txv_proceso.setText(numero1);

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "2";
                txv_proceso.setText(numero1);

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "3";
                txv_proceso.setText(numero1);

            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "4";
                txv_proceso.setText(numero1);

            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "5";
                txv_proceso.setText(numero1);

            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "6";
                txv_proceso.setText(numero1);

            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = numero1 + "7";
                txv_proceso.setText(numero1);

            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = numero1 + "8";
                txv_proceso.setText(numero1);

            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = numero1 + "9";
                txv_proceso.setText(numero1);

            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                numero2 = numero2 + Long.parseLong(numero1);
                numero1 = "0" ;
                txv_proceso.setText("" + numero2);
                Log.e("Mas num1", numero1);
                Log.e("Mas num2", ""+numero2);



            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                numero2 = numero2 - Long.parseLong(numero1);
                numero1 = "0" ;
                txv_proceso.setText("" + numero2);

                Log.e("Menos num1", numero1);
                Log.e("Menos num2", ""+numero2);


            }
        });

        btn_por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                numero2 = numero2 * Long.parseLong(numero1);
                Long.toString(numero2);
                txv_proceso.setText("" + numero2);
                Log.e("Por num1", numero1);
                Log.e("Por num2", ""+numero2);


            }
        });



        btn_entre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                numero2 = numero2 / Long.parseLong(numero1);
                numero1 = "0" ;
                txv_proceso.setText("" + numero2);

                Log.e("Entre num1", numero1);
                Log.e("Entre num2",""+numero2);


            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                txv_proceso.setText("" + numero2);

                Log.e("Igual num1", numero1);
                Log.e("Igual num2",""+numero2);


            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1 = "0";
                numero2 = Long.parseLong("0");
                txv_proceso.setText("0");



            }
        });





    }

}
