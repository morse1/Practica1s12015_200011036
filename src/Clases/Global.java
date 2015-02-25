package Clases;

//import Clases.Estructuras.Cola;
import Clases.Estructuras.ListaUsuario;
import Clases.Estructuras.Estructuras;
//import Clases.Estructuras.Lista_Zombies;
import Clases.Estructuras.Matriz;
//import Clases.Estructuras.Pila;
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

    
    public ListaUsuario usuario;
    public Estructuras plantas;
    public Estructuras zombies;
    public Matriz tablero;
    public Estructuras cola;
    public Estructuras pila;
    public int cantidad_Planta;
    public String nombre_Us_Planta;
    public int cantidad_Zombie;
    public String nombre_Us_Zombie;
    public int Col;
    public int fil;
   
}
