package Clases;
import java.io.*;
import javax.swing.JOptionPane;



/**
 * @author MorseIván
 */
public class Archivos {

    
    File archivo;
        FileWriter escribir;
        BufferedWriter bf;
        PrintWriter pe;
      
    public void CrearArchivo (String grafica)
    {
        
        try
        {
            archivo = new File (grafica);
            escribir = new FileWriter (archivo);
            bf = new BufferedWriter(escribir);
            pe = new PrintWriter(bf);
            
            
           
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Se produjo un error:  " +  e);
        }
            
        
    }
    
    public void Escribir(String texto)
    {
        try 
        {
            pe.write(texto);
            pe.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }
    }
    
    public void Graficar ()
    {
        try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\MorseIván\\Documents\\NetBeansProjects\\Practica1s12015_200011036\\src\\Archivo_Graficas\\grafica.txt";
      String fileOutputPath = "C:\\Users\\MorseIván\\Documents\\NetBeansProjects\\Practica1s12015_200011036\\src\\Archivo_Graficas\\grafica.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    }
}
