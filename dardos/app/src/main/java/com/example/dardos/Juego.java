package com.example.dardos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {

    private TextView puntuacion;
    private int puntuacionNumero;
    private int multiplicador = 1;
    private boolean doble = false;
    private boolean triple = false;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button25;
    private Button button50;
    private Button buttonDoble;
    private Button buttonTriple;
    private Button buttonSalir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        puntuacion = (TextView)findViewById(R.id.puntuacion);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button25 = (Button) findViewById(R.id.button25);
        button50 = (Button) findViewById(R.id.button50);
        buttonDoble = (Button) findViewById(R.id.buttonDoble);
        buttonTriple = (Button) findViewById(R.id.buttonTriple);
        buttonSalir = (Button) findViewById(R.id.buttonSalir);

        String dato = getIntent().getStringExtra("dato");

        buttonDoble.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                if(triple){
                    triple = false;
                    buttonTriple.setBackgroundColor(Color.parseColor("#D9DEDF"));
                }
                if(!doble){
                    doble = true;
                    multiplicador = 2;
                    buttonDoble.setBackgroundColor(Color.parseColor("#E2F6CD"));
                }else{
                    doble = false;
                    multiplicador = 1;
                    buttonDoble.setBackgroundColor(Color.parseColor("#D9DEDF"));
                }

            }
        });

        buttonTriple.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                if(doble){
                    doble = false;
                    buttonDoble.setBackgroundColor(Color.parseColor("#D9DEDF"));
                }
                if(!triple){
                    triple = true;
                    multiplicador = 3;
                    buttonTriple.setBackgroundColor(Color.parseColor("#E2F6CD"));
                }else{

                    triple = false;
                    multiplicador = 1;
                    buttonTriple.setBackgroundColor(Color.parseColor("#D9DEDF"));
                }

            }
        });

        button1.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 1*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button2.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 2*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button3.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 3*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button4.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 4*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button5.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 5*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button6.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 6*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button7.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 7*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button8.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 8*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button9.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 9*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button10.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 10*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button11.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 11*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button12.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 12*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button13.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 13*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button14.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 14*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button15.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 15*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button16.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 16*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button17.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 17*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button18.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 18*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button19.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 19*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button20.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 20*multiplicador;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button25.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 25;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        button50.setOnClickListener(new Button.OnClickListener(){ // +1 local
            public void onClick(View v){
                puntuacionNumero = Integer.parseInt(puntuacion.getText().toString());
                int puntuacionARestar = 50;

                if(puntuacionNumero-puntuacionARestar<0){
                    puntuacionNumero = puntuacionNumero;
                }else{
                    puntuacionNumero -= puntuacionARestar;
                }

                puntuacion.setText(Integer.toString(puntuacionNumero));

                if(puntuacionNumero == 0){
                    Toast cuadro =
                            Toast.makeText(getApplicationContext(),
                                    "Has ganado",Toast.LENGTH_SHORT);
                    cuadro.setGravity(Gravity.TOP|Gravity.LEFT, 30, 230);
                    cuadro.show();
                }
            }
        });

        puntuacion.setText(dato);
    }


    public void volverAInicio(View view){
        Intent cambioActivity = new Intent(this, MainActivity.class);
        startActivity(cambioActivity);
    }
}
