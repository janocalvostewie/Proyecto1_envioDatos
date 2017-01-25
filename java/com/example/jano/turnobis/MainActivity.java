package com.example.jano.turnobis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.confi) {

            Intent i = new Intent(this, configuracion.class );
            startActivity(i);
        }

        else if (id == R.id.inicio){
            Intent i = new Intent(this, MainActivity.class );
            startActivity(i);
        }
        else if (id == R.id.consultas) {

        }


        return super.onOptionsItemSelected(item);
    }
}