package Clases.Estructuras;

import Clases.Nodos.NodoPlantasZombies;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class Estructuras {

    public NodoPlantasZombies nfinal;
    public NodoPlantasZombies ninicio;
    public NodoPlantasZombies nanterior;
    public String nom, tipa;
    public int puA, puD;
    public Icon imag;
    public String nlista = "Raiz";
    
    public Estructuras (String nombre)
    {
        nfinal = null;
        ninicio = null;
        nlista = nombre;
    }

    /************************************ VERIFICA SI LA LISTA ESTA VACI
     * @return A*************/
    public boolean EstructuraVacia ()
    {
        if (nfinal == null && ninicio == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /************************** METODO INSERTAR A LISTA PLANTAS **********************************/
    
    public void Insertar(Icon im, String nom, String ta, int pa, int pd, int in)
    {
        NodoPlantasZombies nuevo = new NodoPlantasZombies(im, nom, ta, pa, pd, in);
        
        if (EstructuraVacia())
        {
            nuevo.npadre = nlista;
            ninicio = nuevo;
            nfinal = nuevo;
        }
        else
        {
            nuevo.npadre = nanterior.Nombre;
            nuevo.ant = nfinal;
            nfinal.sig = nuevo;
             
        }
            nuevo.nhijo= nuevo.Nombre;
            nfinal = nuevo;
            nanterior = nuevo;
           
    }
    
    /*************************** METODO PARA RECORRER LA LISTA
     * @return  ************************************/
    
      public String recorrer()
    {
        String dato = "";
        NodoPlantasZombies auxiliar = ninicio;
        
        while (auxiliar != null)
          {
                dato += auxiliar.Imagen +"," +auxiliar.Nombre+","+auxiliar.Tipo_Ataque+","+auxiliar.Puntos_Ataque+","+auxiliar.Puntos_Defensa + ", "+auxiliar.indice+"\n";
                auxiliar = auxiliar.sig;
          }
        return dato;
    }
    
      /*************************** METODO PARA VACIAR LA LISTA ************************************/
      
      public void vaciarEstructura ()
      {
          ninicio = null;
          nfinal = null;
      }
      
      /*************************** METODO PARA SACAR UN NODO DE LA LISTA ************************************/
      public void sacarLista()
      {
            
            if (ninicio != null)
            {
                nom = ninicio.Nombre;
                tipa = ninicio.Tipo_Ataque;
                puA = ninicio.Puntos_Ataque;
                puD = ninicio.Puntos_Defensa;
                imag = ninicio.Imagen;
                ninicio = ninicio.sig;
                System.out.println("Nombre" + nom);
                
            }
      }
      
     /*************************** METODO PARA SACAR NODO DE LA LISTA TIPO COLA ************************************/
      public void SacarCola()
      {
      if (ninicio != null )
        {
                nom = ninicio.Nombre;
                tipa = ninicio.Tipo_Ataque;
                puA = ninicio.Puntos_Ataque;
                puD = ninicio.Puntos_Defensa;
                imag = ninicio.Imagen;
                ninicio = ninicio.sig;
        }
      }
      
     /*************************** METODO PARA SACAR NODO DE LA LISTA TIPO PILA ************************************/
      public void SacarPila ()
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
}

