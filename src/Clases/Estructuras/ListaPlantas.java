package Clases.Estructuras;



import Clases.Nodos.NodoPlantasZombies;

//import Clases.Nodos.Nodo_Plantas;
import javax.swing.Icon;

/**
 * @author MorseIván
 */
public class ListaPlantas {

    public NodoPlantasZombies nfinal;
    public NodoPlantasZombies ninicio;
    public NodoPlantasZombies nanterior;
    public String nom, tipa;
    public int puA, puD;
    public Icon imag;
    public String nlista = "lplanta";
    
    public ListaPlantas (String nombre)
    {
        nfinal = null;
        ninicio = null;
        nlista = nombre;
    }

    /************************************ VERIFICA SI LA LISTA ESTA VACIA*************/
    public boolean ListaPlantaVacia ()
    {
        if (nfinal == null && ninicio == null)
        {
            System.out.println("vacia");
            return true;
        }
        else
        {
            System.out.println("llena");
            return false;
        }
    }
    
    /************************** METODO INSERTAR A LISTA PLANTAS **********************************/
    
    public void insertarPlantas(Icon im, String nom, String ta, int pa, int pd)
    {
        NodoPlantasZombies nuevo = new NodoPlantasZombies(im, nom, ta, pa, pd);
        
        if (ListaPlantaVacia())
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
    
      public String recorrer_Plantas()
    {
        String dato = "";
        NodoPlantasZombies auxiliar = ninicio;
        
        while (auxiliar != null)
          {
                dato += auxiliar.Imagen +"," +auxiliar.Nombre+","+auxiliar.Tipo_Ataque+","+auxiliar.Puntos_Ataque+","+auxiliar.Puntos_Defensa + "\n";
                auxiliar = auxiliar.sig;
          }
        return dato;
    }
    
      /*************************** METODO PARA VACIAR LA LISTA ************************************/
      
      public void vaciarListaPlantas ()
      {
          ninicio = null;
          nfinal = null;
      }
      
      public void sacarDatosNodo()
      {
            
            if (ninicio != null)
            {
                nom = ninicio.Nombre;
                tipa = ninicio.Tipo_Ataque;
                puA = ninicio.Puntos_Ataque;
                puD = ninicio.Puntos_Defensa;
                imag = ninicio.Imagen;
                ninicio = ninicio.sig;
                
            }
      }
}

