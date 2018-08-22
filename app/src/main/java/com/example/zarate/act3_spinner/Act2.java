package com.example.zarate.act3_spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    TextView cambiar;
    EditText nombre, reg;
    CheckBox uno,dos,tres,cuatro,cinco;
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        cambiar = (TextView) findViewById(R.id.txtV_cambiar);
        nombre = (EditText) findViewById(R.id.etxt_nombre);
        reg = (EditText) findViewById(R.id.etxt_cambiar);
        uno = (CheckBox) findViewById(R.id.chBx_1);
        dos = (CheckBox) findViewById(R.id.chBx_2);
        tres = (CheckBox) findViewById(R.id.chBx_3);
        cuatro = (CheckBox) findViewById(R.id.chBx_4);
        cinco = (CheckBox) findViewById(R.id.chBx_5);
        ingresar = (Button) findViewById(R.id.btn_ingresarAct2);

        ingresar.setOnClickListener(new View.OnClickListener() {
            Intent num = new Intent(Act2.this, Act3.class);
            @Override
            public void onClick(View v) {
                int valor1=0,valor2=0,valor3=0,valor4=0,valor5=0;
                if(uno.isChecked()) {
                    valor1 ++;
                    num.putExtra("valor1",valor1);
                }
                if(dos.isChecked()) {
                    valor2 ++;
                    num.putExtra("valor2",valor2);
                }
                if(tres.isChecked()) {
                    valor3 ++;
                    num.putExtra("valor3",valor3);
                }
                if(cuatro.isChecked()) {
                    valor4 ++;
                    num.putExtra("valor4",valor4);
                }
                if(cinco.isChecked()) {
                    valor5 ++;
                    num.putExtra("valor5",valor5);
                }
                startActivity(num);
            }
        });

        String estado = getIntent().getStringExtra("opc");
        cambiar.setText(estado);

    }
}
