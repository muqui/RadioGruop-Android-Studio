package com.example.mq12.radiogruop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private RadioGroup radioGroupColor , radioGroupEquipo, radioGroupTrasporte;
    private RadioButton radioButtonColor, radioButtonEquipo, radioButtonTransporte;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupColor = (RadioGroup) findViewById(R.id.radioGroupColor);
        radioGroupEquipo = (RadioGroup) findViewById(R.id.radioGroupEquipo);
        radioGroupTrasporte = (RadioGroup) findViewById(R.id.radioGroupTransporte);
        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
seleccion();
                break;

        }
    }

    private void seleccion() {

        int seleccionColor = radioGroupColor.getCheckedRadioButtonId();
        radioButtonColor =(RadioButton) findViewById(seleccionColor);

        int seleccionEquipo = radioGroupEquipo.getCheckedRadioButtonId();
        radioButtonEquipo =(RadioButton) findViewById(seleccionEquipo);

        int seleccionTransporte = radioGroupTrasporte.getCheckedRadioButtonId();
        radioButtonTransporte =(RadioButton) findViewById(seleccionTransporte);

        Toast.makeText(this, radioButtonColor.getText() + " \n" + radioButtonEquipo.getText() + "\n" + radioButtonTransporte.getText(), Toast.LENGTH_LONG).show();
    }
}

