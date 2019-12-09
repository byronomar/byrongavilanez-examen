package com.example.byrongavilanez_examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editText,editText1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        editText=(EditText) findViewById(R.id.editText);
        editText1=(EditText) findViewById(R.id.editText1);


        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usu = editText.getText().toString();
                String contras = editText1.getText().toString();
                if (usu.equals("estudiante2019") && contras.equals(" uisrael2019 ")){

                    Intent intent=new Intent(getApplicationContext(),Registro.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}

