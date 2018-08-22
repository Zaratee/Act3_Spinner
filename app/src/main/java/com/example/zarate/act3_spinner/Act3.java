package com.example.zarate.act3_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Act3 extends AppCompatActivity {

    TextView Nombre,reg;
    Spinner spinn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        Nombre = (TextView) findViewById(R.id.txtV_NombreAct3);
        reg = (TextView) findViewById(R.id.txtV_registroAct3);
        spinn = (Spinner) findViewById(R.id.spin);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.semestres,android.R.layout.simple_spinner_item);
        spinn.setAdapter(adaptador) ;
    }
}
