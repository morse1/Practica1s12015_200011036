package Clases;
/*
 * @author MorseIván
 */
public class Lista {

    Nodo_Lista cabeza;
   
    
    public Lista ()
    {
        cabeza = null;
    }
    
    public boolean ListaVacia ()
    {
        
        
        if (cabeza == null)
        {
            System.out.println("Lista vacia");
            return true;
        }
        else
        {
        return false;
        }
    }
    
    
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