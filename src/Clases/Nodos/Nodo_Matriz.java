package Clases.Nodos;

import Clases.Estructuras.ListaPlantas;
import Clases.Estructuras.Lista_Zombies;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class Nodo_Matriz {

    public int fila;
    public int columna;
    public Nodo_Matriz sig;
    public Nodo_Matriz ant;
    public Icon imagen;
    public Nodo_Matriz arriba;
    public Nodo_Matriz abajo;
    public ListaPlantas objPlantas;
    public Lista_Zombies objZombies;
    
    
    public Nodo_Matriz()
    {
        
    }
    
}
