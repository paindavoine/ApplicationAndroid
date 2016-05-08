package com.example.quentin.fraiskilometrique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class accueil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        final Button deconnexion = (Button) findViewById(R.id.deconnexion);
        deconnexion.setOnClickListener(new View.OnClickListener() {
            //on annonce au clik
            public void onClick(View v) {
                //Prend le contenue du champ identifiant password

                Intent accueil = new Intent(accueil.this, MainActivity.class);  //Lancer l'activité DisplayVue
                startActivity(accueil);


            }
        });


        }
    }
