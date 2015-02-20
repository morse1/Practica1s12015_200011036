package Clases;
/*
 * @author MorseIván
 */
public class Nodo_Lista {
    
    public String Nombre;
    public int Cantidad;
    public String Campos;
    public Nodo_Lista sig;

    
    Nodo_Lista(String nom, int cant, String camp)
    {
        Nombre = nom;
        Cantidad = cant;
        Campos = camp;
        sig = null;
    }
}
