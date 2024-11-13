package Scrabble;
import java.util.LinkedList;

import java.util.Scanner;

public class Jugador {
    private String alias;
    private String email;
    Scanner opc = new Scanner(System.in);



    public Jugador(String alias, String email) {
        this.alias = alias;
        this.email = email;
    }

    public String nombre_usuario(String nombre, Scanner opc){
        System.out.println("Ingrese el alias que desea usar en esta partida: ");
        nombre = opc.next();
        return nombre;
    }

    public String leertxt (String nombre, String correo){
        //forma de leer el txt. INVESTIGAR
        return nombre;
    }

    public void lista(String nombre){
        LinkedList<String> jugadores= new LinkedList<String>();

    }
}
