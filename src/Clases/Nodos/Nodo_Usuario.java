package Clases.Nodos;
/*
 * @author MorseIván
 */
import Clases.Estructuras.Estructuras;

public class Nodo_Usuario {
    
    public String Nombre;
    public int Cantidad;
    public String Campos;
    public int tipo;
    public Nodo_Usuario sig;
    public Nodo_Usuario ant;
    public Estructuras objplantas;
    public Estructuras objzombies;
    public String npadre;
    public String nhijo;
  
    
    public Nodo_Usuario(String nom, int cant, String camp, int tip)
    {
        this.Nombre = nom;
        this.Cantidad = cant;
        this.Campos = camp;
        this.tipo  = tip;
        sig = null;
        ant =  null;
        objplantas = new Estructuras(nom);
        objzombies = new Estructuras(nom);
    }
}
