package Scrabble;
import java.util.LinkedList;
//importar la clase json.simple;


import java.util.Scanner;

public class Jugador {
    private String alias;
    private String email;
    Scanner opc = new Scanner(System.in);
    private static LinkedList<String> listaAlias = new LinkedList<>();
    private LinkedList<Character> listFichas = new LinkedList<>();


    public Jugador(String alias, String email) {
        this.alias = alias;
        this.email = email;
    }


    public String getAlias() {
        return alias;
    }


    public String getEmail() {
        return email;
    }

}
