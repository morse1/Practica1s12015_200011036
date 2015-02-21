package Clases.Nodos;
/**
 * @author MorseIván
 */
public class Nodo_Zombies {

    public String Imagen;
    public String Nombre;
    public String Tipo_Ataque;
    public int Puntos_Ataque;
    public int Puntos_Defensa;
    Nodo_Zombies sig;
    
    public Nodo_Zombies (String im, String nom, String ta, int pa, int pd)
    {
        Imagen = im;
        Nombre = nom;
        Tipo_Ataque = ta;
        Puntos_Ataque = pa;
        Puntos_Defensa = pd;
    }
}
