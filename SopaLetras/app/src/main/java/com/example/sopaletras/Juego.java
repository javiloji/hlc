package com.example.sopaletras;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class Juego {

    private ArrayList<ArrayList<String>> tablero;
    private int ancho = 10;
    private int alto = 10;

    private int xAlmacenada;
    private int yAlmacenada;

    public int aciertos = 5;

    private ArrayList<Palabra> arrayPalabras = new ArrayList<>();

    public Juego(){
        tablero = new ArrayList<ArrayList<String>>();
        for(int i = 0; i<this.alto; i++){
            this.tablero.add(new ArrayList<String>());
            for(int j = 0; j<this.ancho; j++){
                this.tablero.get(i).add("#");

            }
        }
        generarTablero();
    }

    private void generarTablero(){
        boolean valido;
        int contador = 5;
        ArrayList<String> arrayPalabrasRepetidas = new ArrayList<String>();
        //arrayPalabrasRepetidas.add("EJEMPLO");
        do{
            Palabra palabra;
            do{
                valido = false;

                palabra = new Palabra();

                for(String pal : arrayPalabrasRepetidas){
                    if(pal == palabra.palabra){
                        valido = true;
                    }
                }

                if(!valido){
                    for(int i = 0; i< palabra.palabraArray.length; i++){
                        if(palabra.x < 0 || palabra.y <0 || palabra.x>=alto || palabra.y>=ancho){
                            valido = true;
                        }else{
                            if(this.tablero.get(palabra.x).get(palabra.y) != "#"){
                                if(this.tablero.get(palabra.x).get(palabra.y) != palabra.palabraArray[i]){
                                    valido = true;
                                }
                            }
                        }
                        palabra.calculaDireccion();
                    }
                }
            }while(valido);
            arrayPalabrasRepetidas.add(palabra.palabra);
            actualizarTablero(palabra);
            contador--;
        }while(contador != 0);
    }

    private void actualizarTablero(Palabra palabra){
        palabra.revertirPalabra();
        for(int i = 0; i< palabra.palabraArray.length; i++){
            this.tablero.get(palabra.x).set(palabra.y, palabra.palabraArray[i]);
            palabra.calculaDireccion();
        }
        palabra.retrocederDir();
        this.arrayPalabras.add(palabra);
    }

    private void actualizarTableroEncontrado(Palabra palabra){
        palabra.revertirPalabra();
        for(int i = 0; i< palabra.palabraArray.length; i++){
            this.tablero.get(palabra.x).set(palabra.y, palabra.palabraArray[i]+"*");
            palabra.calculaDireccion();
        }
        this.aciertos--;
    }

    public void setAlmacenado(int x, int y){
        this.xAlmacenada = x;
        this.yAlmacenada = y;

    }

    public boolean comprobarSeleccion(int x, int y){
        if(x != this.xAlmacenada || y != this.yAlmacenada){
            Palabra palabraCoincidente = new Palabra();
            boolean encontrado = false;
            for(Palabra palabra: this.arrayPalabras){
                if(palabra.xInicial == this.xAlmacenada){
                    if(palabra.yInicial == this.yAlmacenada){
                        palabraCoincidente = palabra;
                        encontrado = true;
                    }
                }
                if(palabra.x == this.xAlmacenada){
                    if(palabra.y == this.yAlmacenada){
                        palabraCoincidente = palabra;
                        encontrado = true;
                    }
                }
            }

            if(encontrado){
                for(Palabra palabra: this.arrayPalabras){
                    if(palabra.xInicial == x){
                        if(palabra.yInicial == y){
                            if(palabraCoincidente.palabra == palabra.palabra){
                                actualizarTableroEncontrado(palabra);
                                return true;
                            }

                        }
                    }if(palabra.x == x){
                        if(palabra.y == y){
                            if(palabraCoincidente.palabra == palabra.palabra){
                                actualizarTableroEncontrado(palabra);
                                return true;
                            }

                        }
                    }
                }
            }

        }
        return false;
    }

    public ArrayList<ArrayList<String>> getTablero(){
        return this.tablero;
    }



}
