package Clases.Nodos;

import javax.swing.Icon;
/**
 * @author MorseIván
 */
public class NodoPlantasZombies {

    public Icon Imagen;
    public String Nombre;
    public String Tipo_Ataque;
    public int Puntos_Ataque;
    public int Puntos_Defensa;
    public NodoPlantasZombies sig;
    public NodoPlantasZombies ant;
    public String npadre;
    public String nhijo;
    public int indice;

public NodoPlantasZombies(Icon im, String nom, String ta, int pa, int pd, int in)
 {
    Imagen = im;
    Nombre = nom;
    Tipo_Ataque = ta;
    Puntos_Ataque = pa;
    Puntos_Defensa = pd;
    indice = in;
 }
}
