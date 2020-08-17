package com.example.ingrid.calc_operacoes_basicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.R;


public class MainActivity extends AppCompatActivity {

    private EditText txtNum1;
    private EditText txtNum2;
    private Button btnmais;
    private Button btnmenos;
    private Button btnmult;
    private Button btndiv;
    private TextView txtResultado;
    private double num1;
    private double num2;


    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        btnmais = (Button) findViewById(R.id.btnmais);
        btnmenos = (Button) findViewById(R.id.btnmenos);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmult = (Button) findViewById(R.id.btnmult);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

        btnmais.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                num1 = Double.parseDouble(txtNum1.getText().toString());
                num2 = Double.parseDouble(txtNum2.getText().toString());
                txtResultado.setText(num1+num2+"");
            }
        });

        btnmenos.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                num1 = Double.parseDouble(txtNum1.getText().toString());
                num2 = Double.parseDouble(txtNum2.getText().toString());
                txtResultado.setText(num1-num2+"");
            }
        });


        btnmult.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                num1 = Double.parseDouble(txtNum1.getText().toString());
                num2 = Double.parseDouble(txtNum2.getText().toString());
                txtResultado.setText(num1*num2+"");
            }
        });


        btndiv.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                num1 = Double.parseDouble(txtNum1.getText().toString());
                num2 = Double.parseDouble(txtNum2.getText().toString());
                txtResultado.setText(num1/num2+"");
            }
        });


    }



}