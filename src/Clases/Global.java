package Clases;

import Clases.Estructuras.Lista;
import Clases.Estructuras.ListaPlantas;

/**
 * @author MorseIván
 */

/**************************Clase para globalizar variables *******************************************/

public class Global {
    
    private static Global instancia = null;
    
    protected Global ()
    {
    }
    
    public static Global getInstance(){
        if (instancia == null)
        {
            instancia = new Global();
        }
        return instancia;
    }

    
    public Lista usuario;
    public ListaPlantas plantas;
    
    
}
