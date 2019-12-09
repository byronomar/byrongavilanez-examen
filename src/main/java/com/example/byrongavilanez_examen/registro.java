package com.example.byrongavilanez_examen;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class registro extends AppCompatActivity {


    EditText num1;
    Button button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        num1=(EditText)findViewById(R.id.editText2);

        Button siguiente=(Button) findViewById(R.id.button2);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                    Intent intent=new Intent(getApplicationContext(),Encuesta.class);
                    startActivity(intent);
                }
            }
        });


        Button operar =(Button) findViewById(R.id.button);
        final TextView resultado = (TextView)findViewById(R.id.textView5);


        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = new Float(num1.getText().toString());

                resultado.setText("Resultado:"+ (3000-num1/5));
            }
        });



    }


}