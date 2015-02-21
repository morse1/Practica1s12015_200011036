package Clases.Estructuras;

import Clases.Nodos.Nodo_Lista;

/*
 * @author MorseIván
 */
public class Lista {

    public Nodo_Lista nfinal;
    public Nodo_Lista ninicio;
   
    /*********************** constructor de la clase Lista **********************************************/
    
    public Lista ()
    {
        nfinal = null;
        ninicio = null;
    }
    
    /******************** método para verificar si la lista usuario esta vacía *************************/
    public boolean ListaVacia ()
    {
        
    if (nfinal == null && ninicio== null)
        {
        return true;
        }
        else
        {
        return false;
        }
    }
    
    /************************** método insertar en lista usuario **************************************/
    
    public void insertar(String name, int cant, String campos, int tipo)
    {
        Nodo_Lista nuevo = new Nodo_Lista(name, cant, campos, tipo);
        
        if (ListaVacia())
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
    /******************************* metodo que recorre la lista usuario *********************************/
    
    /**
     * metodo que recorre la lista usuario
     * @return
     */
    public String recorrer_cola()
    {
        String dato = "";
        Nodo_Lista auxiliar = ninicio;
        
        while (auxiliar != null)
          {
                dato += auxiliar.Nombre + ", " + auxiliar.Cantidad + ", " + auxiliar.Campos + "\n";
                auxiliar = auxiliar.sig;
          }
        return dato;
    }
    
    
     public String recorrer_pila()
    {
        String dato = "";
        Nodo_Lista auxiliar = nfinal;
        while (auxiliar != null)
          {
                dato += auxiliar.Nombre + ", " + auxiliar.Cantidad + ", " + auxiliar.Campos + "\n";
                auxiliar = auxiliar.ant;
          }
        return dato;
    }
    

/****************************** metodo para vaciar la lista ***************************************/     
     
     public void vaciarLista()
     {
         ninicio = nfinal = null;
     }
     
    }