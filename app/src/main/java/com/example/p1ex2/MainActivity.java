package com.example.p1ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mddistancia:
                Unidade_Distancia();
                return (true);
            case R.id.mdcapacidade:
                Unidade_Capacidade();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void Unidade_Distancia(){
        Intent intent= new Intent(MainActivity.this,Distancia.class);
        startActivity(intent);
    }
    public void Unidade_Capacidade(){
        Intent intent= new Intent(MainActivity.this,CapacidadeLitros.class);
        startActivity(intent);
    }
}



