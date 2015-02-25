package Clases.Estructuras;

import Clases.Nodos.NodoPlantasZombies;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class Lista_Zombies {

    public NodoPlantasZombies nini;
    public NodoPlantasZombies nfin;
    public String nom, tipoa;
    public int puA, puD;
    public Icon imag;
    public String nlista = "lplanta";
    
    
    
    public Lista_Zombies ()
    {
        nini = null;
        nfin = null;
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
         }
         
         nuevo.ant = nfin;
         nfin.sig = nuevo;
         nfin = nuevo;
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
    

