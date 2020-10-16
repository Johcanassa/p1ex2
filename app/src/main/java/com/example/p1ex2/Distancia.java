package com.example.p1ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Distancia extends AppCompatActivity {
   EditText etkm;
   TextView Milhares,Metros,Centimetros,Milimetros,Nano;
   Button btOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        carregateladistancia();
    }
    public void carregateladistancia(){
        setContentView(R.layout.activity_distancia);
        carregawidgets();
    }
    public void carregawidgets(){
        etkm=(EditText)findViewById(R.id.edtkm);
        Milhares=(TextView)findViewById(R.id.txtmilhas);
        Centimetros=(TextView)findViewById(R.id.txtcentimetros);
        Metros=(TextView)findViewById(R.id.txtmetros);
        Milimetros=(TextView)findViewById(R.id.txtmilimetros);
        Nano=(TextView)findViewById(R.id.txtnanometros);
        btOk=(Button)findViewById(R.id.btnOK);


        carregaResultado();

    }
    public void carregaResultado(){
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double KM,MILHAS,METROS,CENTI,MILIMETROS,NANO;
                KM=Double.valueOf(etkm.getText().toString());
                MILHAS=KM / 1.60934;
                METROS=KM * 1000;
                CENTI=KM *100000;
                MILIMETROS=KM *1000000;
                NANO=KM * Math.pow(10,12);


                Milhares.setText(KM +  " KM Equivale a :" +MILHAS+ " Milhas ".toString());
                Metros.setText(KM +  "Km Equivale a :"  + METROS+ "  Metros".toString());
                Centimetros.setText(KM  + " Km equivale a : "+CENTI+" Centimetros ".toString());
                Milimetros.setText(KM +"KM equivale a : "+MILIMETROS+" Milimetros ".toString());
                Nano.setText(KM +"KM Equivale a : "+ NANO + " Nanômetros ".toString());


            }
        });



    }
}
