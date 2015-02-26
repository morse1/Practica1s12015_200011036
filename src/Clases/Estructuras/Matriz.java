package Clases.Estructuras;

import Clases.Nodos.Nodo_Matriz;

public class Matriz {

    public Nodo_Matriz Raiz, ultimo;
    public int xfila;
    public int ycolumna;
    
    public Matriz(int fila, int columna)
            
            {
                Raiz = null;
                ultimo = null;
                xfila = fila;
                ycolumna = columna;
           }
    
    public void InsertarMatriz (Nodo_Matriz nuevo)
    {
        if (Raiz == null)
        {
            Raiz = nuevo;
            ultimo = nuevo;
            ultimo.abajo = nuevo;
        }
        else if (ultimo.fila <=nuevo.fila)
        {
            ultimo.sig = nuevo;
            nuevo.ant = ultimo;
            if (ultimo.arriba != null)
            {
                if (ultimo.arriba.sig != null)
                {
                    
                    nuevo.arriba = ultimo.arriba.sig;
                    ultimo.arriba.abajo = nuevo;
                    nuevo.abajo = ultimo.abajo;
                    
                }
            }
        }
        else 
        {
            nuevo.arriba = ultimo.abajo;
            ultimo.abajo.abajo = nuevo;
            nuevo.abajo = nuevo;
        }
        {
            ultimo.abajo = null;
            ultimo = nuevo;
        } 
       }
}
