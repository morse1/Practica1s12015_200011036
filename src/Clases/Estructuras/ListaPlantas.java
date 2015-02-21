package Clases.Estructuras;

import Clases.Nodos.Nodo_Plantas;

/**
 * @author MorseIván
 */
public class ListaPlantas {

    public Nodo_Plantas nfinal;
    public Nodo_Plantas ninicio;
    
    public ListaPlantas ()
    {
        nfinal = null;
        ninicio = null;
    }

    /************************************ VERIFICA SI LA LISTA ESTA VACIA*************/
    public boolean ListaPlantaVacia ()
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
    
    public void insertar(String im, String nom, String ta, int pa, int pd)
    {
        Nodo_Plantas nuevo = new Nodo_Plantas(im, nom, ta, pa, pd);
        
        if (ListaPlantaVacia())
        {
            ninicio = nuevo;
            nfinal = nuevo;
        }
            nuevo.ant = nfinal;
            nfinal.sig = nuevo;
            nfinal = nuevo;
    }
    
    /*************************** METODO PARA RECORRER LA LISTA ************************************/
    
    
    
}

