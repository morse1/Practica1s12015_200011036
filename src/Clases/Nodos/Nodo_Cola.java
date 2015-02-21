package Clases.Nodos;
/**
 * @author MorseIván
 */
public class Nodo_Cola {

        
    public String Imagen;
    public String Nombre;
    public String Tipo_Ataque;
    public int Puntos_Ataque;
    public int Puntos_Defensa;
    public Nodo_Cola sig;
    public Nodo_Cola ant;
    

public Nodo_Cola(String im, String nom, String ta, int pa, int pd)
{
    Imagen = im;
    Nombre = nom;
    Tipo_Ataque = ta;
    Puntos_Ataque = pa;
    Puntos_Defensa = pd;

}
    
}
