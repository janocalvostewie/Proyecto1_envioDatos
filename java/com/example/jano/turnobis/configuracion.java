package com.example.jano.turnobis;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);


    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    /*
    *Método onclick que generará un intent a la Main_Activity
    * Este intent enviará un String dependiendo del RadioButton seleccionado
     */
    public void Enviar(View v){

        Intent i =new Intent(this, MainActivity.class);
        String color ="";


        RadioButton rd1 = (RadioButton)findViewById(R.id.rbVerde);
        boolean estado1 = rd1.isChecked();
        RadioButton rd2 = (RadioButton)findViewById(R.id.rbAmarillo);
        boolean estado2 = rd2.isChecked();
        RadioButton rd3 = (RadioButton)findViewById(R.id.rbRojo);
        boolean estado3 = rd3.isChecked();
        RadioButton rd4 = (RadioButton)findViewById(R.id.rbAzul);
        boolean estado4 = rd4.isChecked();
        if(estado1 == true){color="verde";}
        else if(estado2 == true){color="amarillo";}
        else if(estado3 == true){color="rojo";}
        else if(estado4 == true){color="azul";}
        else{color="0";}
        i.putExtra("color", color);
        startActivity(i);
        finish();

    }

}
