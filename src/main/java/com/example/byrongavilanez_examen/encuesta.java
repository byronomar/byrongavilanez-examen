package com.example.byrongavilanez_examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    CheckBox checkBox,checkBox2,checkBox3;
    RadioButton radioButton,radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        checkBox= (CheckBox) findViewById(R.id.checkBox);
        checkBox2= (CheckBox) findViewById(R.id.checkBox2);
        checkBox3= (CheckBox) findViewById(R.id.checkBox3);

        radioButton= (RadioButton) findViewById(R.id.radioButton);
        radioButton2= (RadioButton) findViewById(R.id.radioButton2);


    }

    public void onclick (View v) {
        if (v.getId()==R.id.button4){
            verificar();
        }
    }

    public void verificar () {
        String cad="Seleccionado: \n";
        if (checkBox.isChecked()==true){
            cad+="Fútbol";
        }

        if (checkBox2.isChecked()==true){
            cad+="Natación";

        }

        if (checkBox3.isChecked()==true){
            cad+="Ciclismo";

        }

        if (radioButton.isChecked()==true){
            cad+="Si";

        }

        if (radioButton2.isChecked()==true){
            cad+="No";

        }

        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }


}
