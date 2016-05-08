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


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText_identifiant;
    EditText editText_mdp;
    Button button_valider;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //iniitalisation des variable
        editText_identifiant = (EditText) findViewById(R.id.editText_identifiant);
        editText_mdp = (EditText) findViewById((R.id.editText_mdp));
        button_valider =(Button) findViewById(R.id.button_valider);

        button_valider.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId)
    }
}
