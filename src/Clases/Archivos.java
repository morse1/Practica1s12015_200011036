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
    
    
    public void abrir()
    {
        
    }
    
    public void Graficar (String txt, String jpg)
    {
        try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
   
      
      String fileInputPath = "C:\\Varios\\" + txt + ".txt";
      String fileOutputPath = "C:\\varios\\" + jpg + ".jpg";
      
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
      Thread.sleep(300);
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    }
}
