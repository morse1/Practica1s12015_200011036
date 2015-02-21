package Clases.Nodos;
/*
 * @author MorseIván
 */
import Clases.Estructuras.ListaPlantas;
import Clases.Estructuras.Lista_Zombies;

public class Nodo_Lista {
    
    public String Nombre;
    public int Cantidad;
    public String Campos;
    public int tipo;
    public Nodo_Lista sig;
    public Nodo_Lista ant;
    public ListaPlantas objplantas;
    public Lista_Zombies objzombies;
   
  
    
    public Nodo_Lista(String nom, int cant, String camp, int tip)
    {
        this.Nombre = nom;
        this.Cantidad = cant;
        this.Campos = camp;
        this.tipo  = tip;
        sig = null;
        ant =  null;
        objplantas = new ListaPlantas();
        objzombies = new Lista_Zombies();
    }
}
