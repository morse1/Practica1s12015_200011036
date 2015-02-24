package Clases.Estructuras;

import Clases.Nodos.NodoPlantasZombies;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class Pila {

    public NodoPlantasZombies ninicio;
    public NodoPlantasZombies nfinal;
    public String nom, tipa;
    public int puA, puD;
    public Icon imag;

    
    public Pila ()
    {
        ninicio = null;
        nfinal = null;
    }
    
    public boolean PilaVacia ()
    {
        if (ninicio == null && nfinal == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void insertarPila (Icon im, String nom, String tp, int pa, int pd)
    {
        NodoPlantasZombies nuevo = new NodoPlantasZombies(im, nom, tp, pa, pd);
        
        if (PilaVacia())
        {
            ninicio = nuevo;
            nfinal = nuevo;
        }
        else 
        {
            nuevo.ant = nfinal;
            nfinal.sig = nuevo;
            nfinal = nuevo;
        }
    }
    
    public void sacarPila ()
    {
        if (nfinal != null)
        {
            nom = ninicio.Nombre;
            tipa = ninicio.Tipo_Ataque;
            puA = ninicio.Puntos_Ataque;
            puD = ninicio.Puntos_Defensa;
            imag = ninicio.Imagen;
            nfinal = nfinal.ant;
        }
    }
    
    public String recorrer_pila()
    {
        String dato = "";
        NodoPlantasZombies auxiliar = ninicio;
        
        while (auxiliar != null)
          {
                dato += auxiliar.Imagen +" , "+auxiliar.Nombre+", "+auxiliar.Tipo_Ataque+", "+auxiliar.Puntos_Ataque+", "+auxiliar.Puntos_Defensa + "\n";
                auxiliar = auxiliar.sig;
          }
        return dato;
    }
    
    
}
