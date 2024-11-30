package Scrabble;

import java.util.HashMap;
import java.util.Map;


public class Ficha {
    private char letra;
    private int puntos;
    private boolean comodin;

    //Mapa para almacenar valores de las letras
    private static final Map<String, Integer>
        valores_letras = new HashMap<String, Integer>();

    static{
        valores_letras.put("A", 1);
        valores_letras.put("B", 4);
        valores_letras.put("C", 3);
        valores_letras.put("D", 3);
        valores_letras.put("E", 1);
        valores_letras.put("F", 5);
        valores_letras.put("G", 3);
        valores_letras.put("H", 5);
        valores_letras.put("I", 1);
        valores_letras.put("J", 10);
        valores_letras.put("L", 2);
        valores_letras.put("LL", 8);
        valores_letras.put("M", 3);
        valores_letras.put("N", 2);
        valores_letras.put("Ñ", 10);
        valores_letras.put("O", 1);
        valores_letras.put("P", 4);
        valores_letras.put("Q", 8);
        valores_letras.put("R", 2);
        valores_letras.put("RR", 8);
        valores_letras.put("S", 1);
        valores_letras.put("T", 2);
        valores_letras.put("U", 1);
        valores_letras.put("V", 4);
        valores_letras.put("X", 10);
        valores_letras.put("Y", 5);
        valores_letras.put("Z", 10);


    }

    public Ficha(char letra, int puntos, boolean comodin) {
        this.letra = letra;
        this.comodin = comodin;
        if (comodin){
            this.puntos = 2;
            this.letra= '*';
        }
        else {
            this.puntos = valores_letras.getOrDefault(letra,0);
        }
    }

    public char getLetra() {
        return letra;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean isComodin() {
        return comodin;
    }
}




