package com.example.p1ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CapacidadeLitros extends AppCompatActivity {
    EditText etlt;
    TextView Quilolitro,Hectolitro,Decalitro,Decilitro,Centilitro,Mililitro;
    Button btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

           carregatelalitros();
        }
        public void carregatelalitros (){
            setContentView(R.layout.activity_capacidade_litros);
            carregawidgets();
        }
        public void carregawidgets(){
            etlt=(EditText)findViewById(R.id.edtlitro);
            Quilolitro=(TextView)findViewById(R.id.txtquilolitros);
            Hectolitro=(TextView)findViewById(R.id.txthectalitros);
            Decalitro=(TextView)findViewById(R.id.txtdecalitro);
            Decilitro=(TextView)findViewById(R.id.txtdecilitro);
            Centilitro=(TextView)findViewById(R.id.txtcentilitro);
            Mililitro=(TextView)findViewById(R.id.txtmililitros);
            btOk=(Button)findViewById(R.id.btnOK);


            carregaResultado();

        }
        public void carregaResultado(){
            btOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double QUILOLITROS,LT,HECTOLITRO,DECALITRO,DECILITRO,CENTILITROS,MILILITROS;
                    LT=Double.valueOf(etlt.getText().toString());
                    QUILOLITROS=LT / 1000;
                    HECTOLITRO=LT / 100;
                    DECALITRO=LT * 0.1;
                    DECILITRO=LT *10;
                    CENTILITROS=LT * 100 ;
                    MILILITROS=LT *1000;


                    Quilolitro.setText(LT +  " Litro's  Equivale a :" + QUILOLITROS + " Quilolitros ".toString());
                    Hectolitro.setText(LT +  "Litro's  Equivale a :"  + HECTOLITRO + "Hectolitros".toString());
                    Decalitro.setText(LT +  " Litro's  Equivale a :"+ DECALITRO +" Decalitros ".toString());
                    Decilitro.setText(LT +  " Litro's  Equivale a :"+ DECILITRO+ " Decilitros ".toString());
                    Centilitro.setText(LT +  " Litro's  Equivale a :"+ CENTILITROS + " Centilitro ".toString());
                    Mililitro.setText(LT +  " Litro's  Equivale a :"+ MILILITROS+ " Mililitros ".toString());



                }
            });



        }
    }


