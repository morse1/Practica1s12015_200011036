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
    public Icon imagen;
    public Estructuras objPlantas;
    public Estructuras objZombies;
    public String npadres;
    public String nhijo;
    
    public Nodo_Matriz()
    {
        
    }
    
}
