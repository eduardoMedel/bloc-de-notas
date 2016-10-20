/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import static java.util.Locale.filter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alumno
 */
public class Archivo 

{
    private JFileChooser fileChooser;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Texto","txt");
    private File file = null;
    private boolean isopen =false;//bandera de control para saber si se abrio un archivo
    private ArrayList contenido = new ArrayList();//almacena los registros leidos de *.txt
    private int index = 0;
    
    public void Nuevo()
    {
        
    }
    public void abrir(String ruta)
    {
        JFileChooser selector_a = new JFileChooser();
        selector_a.showOpenDialog(selector_a);
        ruta = selector_a.getSelectedFile().getAbsolutePath();
        String texto;
        try
        {
            FileReader lectorArchivo = new FileReader(ruta);
            BufferedReader lectorBuffer;
            lectorBuffer = new BufferedReader(lectorArchivo);
            while (lectorBuffer.ready()){
                texto = lectorBuffer.readLine();
                JOptionPane.showMessageDialog(null, ""+texto);
        }
        lectorBuffer.close();
        }
        catch(Exception e)
        {
            System.err.println("Error: "+e);
        }
    
    }
    public void Guardar(String texto)
    {
        fileChooser = new JFileChooser();
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){
                this.isopen = false;
                this.contenido.clear();
                this.index=1;
                if ( escribir( fileChooser.getSelectedFile(),  texto) )
                {
                    JOptionPane.showMessageDialog(null, "Archivo ' " + fileChooser.getSelectedFile().getName() + "' guardado ");
                    this.isopen=true;
                }
        }
    }
    
    public void Guardar_como(String texto)
    {
        fileChooser = new JFileChooser();
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){
                this.isopen = false;
                this.contenido.clear();
                this.index=1;
                if ( escribir( fileChooser.getSelectedFile(),  texto) )
                {
                    JOptionPane.showMessageDialog(null, "Archivo ' " + fileChooser.getSelectedFile().getName() + "' guardado ");
                    this.isopen=true;
                }
        }
    
    }
    
    public void Config_pag()
    {
        
    }
    
    public void Inprimir(String ruta)
    {
        JFileChooser selector_a = new JFileChooser();
        selector_a.showOpenDialog(selector_a);
        ruta = selector_a.getSelectedFile().getAbsolutePath();
        String texto;
        try
        {
            FileReader lectorArchivo = new FileReader(ruta);
            BufferedReader lectorBuffer;
            lectorBuffer = new BufferedReader(lectorArchivo);
            while (lectorBuffer.ready()){
                texto = lectorBuffer.readLine();
                JOptionPane.showMessageDialog(null, "   Imprimiendo...");

        }
        lectorBuffer.close();
        }
        catch(Exception e)
        {
            System.err.println("Error: "+e);
        }
    }
    
    public void salir()
    {
        System.exit(0);
    }
    public String getFileName()
    {
        if( file != null)
            return file.getName();
        else
            return "Sin Titulo";
    }
    private boolean escribir(File fichero, String texto)
    {
        boolean res=false;        
        PrintWriter writer = null;
        try {
            String f = fichero.toString();
            //verifica que extension exista sino lo agrega
            if(!f.substring( f.length()-4, f.length()).equals(".txt") )
            {
                f = f + ".txt";
                fichero = new File(f);
            }            
            writer = new PrintWriter( fichero );
            //si hay un archivo abierto
            if( this.isopen )
            {   //añade primero linea por linea conenido anterior
                Iterator It = contenido.iterator();
                while (It.hasNext())
                {
                    writer.println( It.next() );
                }
                //se añade fila de texto al archivo
                writer.println( texto );
                this.contenido.add(texto);
            }
            else //esta guardando por primera vez
            {
                this.contenido.add(texto);
                writer.println( texto );    
            }            
            this.file = fichero;
            writer.close();            
            res = true;
        } catch (FileNotFoundException ex) {
            System.out.println("Error:" + ex);
        } finally {
            writer.close();
        }
        return res;
    }
    public void Actualizar(String texto)
    {
        //Si existe archivo abierto
        if( this.file != null)
        {
            if ( escribir( this.file ,  texto) )
            {
                JOptionPane.showMessageDialog(null, "Archivo '" + this.file.getName() + "' actualizado ");
            }                        
        }

    }
    
}
