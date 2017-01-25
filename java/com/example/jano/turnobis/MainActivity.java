package com.example.jano.turnobis;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    String colorcillo="";
    private final int REQUEST_CODE=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == REQUEST_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {

                //Recogemos el dato del intent que nos han enviado
                colorcillo=(String)data.getStringExtra("color");

                //Variable que usaremos para poner el color de fondo
                int color=0;

                //Instanciamos un TextView para poner un mensaje
                TextView tv =(TextView) findViewById(R.id.tv1);
                View v = findViewById(R.id.activity_main);

                //Puesto que estamos en el onCreate quizas no se obtenga nada del intent,
                //por lo que verificamos si es null o está vacío
                if (colorcillo != null && !colorcillo.equals("")) {
                    tv.setText("Has seleccionado el color: " + colorcillo );
                    //Aquí dentro sabemos que la variable String en la que recogimos el mensaje del intent ha dado algo
                    //así que procedemos a modificar el fondo dependiendo de su contenido
                    if (colorcillo.equalsIgnoreCase("verde")) {v.setBackgroundColor(Color.parseColor("#2EFE2E"));}
                    else if (colorcillo.equalsIgnoreCase("azul")) {v.setBackgroundColor(Color.parseColor("#0000FF"));;}
                    else if (colorcillo.equalsIgnoreCase("rojo")) {v.setBackgroundColor(Color.parseColor("#FF0000"));}
                    else if (colorcillo.equalsIgnoreCase("amarillo")) {v.setBackgroundColor(Color.parseColor("#FFFF00"));}

                }

            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.confi) {

            Intent i = new Intent(this, configuracion.class );
            startActivityForResult(i, REQUEST_CODE);

        }

        else if (id == R.id.inicio){
            Intent i = new Intent(this, MainActivity.class );
            startActivity(i);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }


}
