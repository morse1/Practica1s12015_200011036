package Clases.Estructuras;

import Clases.Nodos.Nodo_Usuario;

/*
 * @author MorseIván
 */
public class ListaUsuario {

    public Nodo_Usuario nfinal;
    public Nodo_Usuario ninicio;
    public Nodo_Usuario nanterior;
    public String cantidad;
    public String nlista = "Usuario";
 
 
    
    /*********************** constructor de la clase Lista **********************************************/
    
    public ListaUsuario ()
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
        Nodo_Usuario nuevo = new Nodo_Usuario(name, cant, campos, tipo);
        
        if (ListaVacia())
        {
         
         ninicio = nuevo;
         nfinal = nuevo; 
         ninicio.npadre = nlista;
        }
        else
        {
          nuevo.npadre = nanterior.Nombre;   
        }
         
          nuevo.nhijo = nuevo.Nombre;
          nuevo.ant = nfinal;
          nfinal.sig = nuevo;
          nfinal = nuevo;
        
         nanterior = nuevo;
    }
    /******************************* metodo que recorre la lista usuario *********************************/
    
    /**
     * metodo que recorre la lista usuario
     * @return
     */
    public String recorrer_cola()
    {
        String dato = "";
        Nodo_Usuario auxiliar = ninicio;
        
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
        Nodo_Usuario auxiliar = nfinal;
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

    public String getCant() {
        return cantidad;
    }

    public void setCant(String cant) {
        this.cantidad = cant;
    }
 
     
     
}