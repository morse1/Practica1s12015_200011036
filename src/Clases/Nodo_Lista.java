package Clases;
/*
 * @author MorseIván
 */
public class Nodo_Lista {
    
    String Nombre;
    int Cantidad;
    String Campos;
    Nodo_Lista sig;

    
    Nodo_Lista(String nom, int cant, String camp)
    {
        Nombre = nom;
        Cantidad = cant;
        Campos = camp;
        sig = null;
    }
    
    
}
