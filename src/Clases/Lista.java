package Clases;
/*
 * @author MorseIván
 */
public class Lista {

    public Nodo_Lista cabeza;
   
    /*********************** constructor de la clase Lista **********************************************/
    
    public Lista ()
    {
        cabeza = null;
    }
    
    /******************** método para verificar si la lista usuario esta vacía *************************/
    public boolean ListaVacia ()
    {
        
    if (cabeza == null)
        {
        return true;
        }
        else
        {
        return false;
        }
    }
    
    /************************** método insertar en lista usuario **************************************/
    
    public void insertar(String name, int cant, String campos)
    {
        Nodo_Lista nuevo = new Nodo_Lista(name, cant, campos);
        
        if (ListaVacia())
        {
         cabeza = nuevo;   
        }
        
        else
        {
          nuevo.sig = cabeza;
          cabeza = nuevo;
        }
    }
    /******************************* metodo que recorre la lista usuario *********************************/
    
    public String recorrer()
    {
         String dato = "";
        Nodo_Lista auxiliar = cabeza;
        
        while (auxiliar != null)
          {
              
                dato += auxiliar.Nombre + ", " + auxiliar.Cantidad + ", " + auxiliar.Campos + "\n";
                auxiliar = auxiliar.sig;
          }
        return dato;
    }
}