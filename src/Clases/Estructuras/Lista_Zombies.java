package Clases.Estructuras;

import Clases.Nodos.NodoPlantasZombies;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class Lista_Zombies {

    public NodoPlantasZombies nini;
    public NodoPlantasZombies nfin;
    public NodoPlantasZombies nanterior;
    public String nom, tipoa;
    public int puA, puD;
    public Icon imag;
    public String nlista = "lzombie";
    
    
    
    public Lista_Zombies (String nombre)
    {
        nini = null;
        nfin = null;
        nlista = nombre;
    }
    
    public boolean ListaVaciaZombies()
    {
        if (nini == null && nfin == null)
        {
            return true;
        }
        else
            return false;
    }
        
    public void insertarZombies (Icon im, String nom, String ta, int pa, int pd)
        {
         NodoPlantasZombies nuevo = new NodoPlantasZombies (im, nom, ta, pa, pd);   
            
         if (ListaVaciaZombies ())
         {
             nini = nuevo;
             nfin = nuevo;
             nuevo.npadre = nlista;
         }
         else
         {
             nuevo.npadre = nanterior.Nombre;
             nuevo.ant = nfin;
             nfin.sig = nuevo;
         }
          nuevo.nhijo = nuevo.Nombre;
         nfin = nuevo;
         nanterior = nuevo;
        }
        
          public String recorrer_Zombies()
    {
        String dato = "";
        NodoPlantasZombies aux = nini;
        
        while (aux != null)
          {
                dato += aux.Imagen +"," +aux.Nombre+","+aux.Tipo_Ataque+","+aux.Puntos_Ataque+","+aux.Puntos_Defensa + "\n";
                aux = aux.sig;
          }
        return dato;
    }
          
          public void vaciarListaZombies ()
          {
              nini = null;
              nfin = null;
          }
          
           public void sacarDatos()
      {
          if (nini != null)
          {
                nom = nini.Nombre;
                puA = nini.Puntos_Ataque;
                puD = nini.Puntos_Defensa;
                imag = nini.Imagen;
                tipoa = nini.Tipo_Ataque;
                
                nini = nini.sig;
                System.out.println("Nombre: " + nom);
          }
      }
        
    }
    

