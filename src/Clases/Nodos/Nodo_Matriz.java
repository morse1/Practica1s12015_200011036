package Clases.Nodos;

import Clases.Estructuras.Estructuras;
//import Clases.Estructuras.Lista_Zombies;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class Nodo_Matriz {

    public int fila;
    public int columna;
    public Nodo_Matriz sig;
    public Nodo_Matriz ant;
    public Nodo_Matriz arriba;
    public Nodo_Matriz abajo;
    public Nodo_Matriz aux1;
    public Nodo_Matriz aux2;
    public Estructuras personaje;
    public String npadres;
    public String nhijo;
    
    public Nodo_Matriz(int x, int y, String nom)
    {   sig =null;
        ant = null;
        arriba = null;
        abajo = null;
        fila = x;
        columna = y;
        personaje = new Estructuras(nom);
    }
    
}
