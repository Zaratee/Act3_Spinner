package com.example.zarate.act3_spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radGrupo;
    RadioButton Alumno,Maestro;
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radGrupo = (RadioGroup) findViewById(R.id.radgrupo);
        Alumno = (RadioButton) findViewById(R.id.rdBtn_alumnos);
        Maestro = (RadioButton) findViewById(R.id.rdBtn_maestros);
        ingresar = (Button) findViewById(R.id.btn_ingresarAct1);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent opc = new Intent(MainActivity.this, Act2.class);
                if(Alumno.isChecked()) {
                    String opcc="Registro";
                    opc.putExtra("opc",opcc);
                }
                if(Maestro.isChecked()) {
                    String opcc="Nomina";
                    opc.putExtra("opc",opcc);
                }
                startActivity(opc);
            }
        });
    }
}
