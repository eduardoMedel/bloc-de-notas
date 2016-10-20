
package Edicion;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import notepad.Principal;
import java.io.IOException;



public class Claseprincipal extends Principal {
    
   
    JTextArea area_principal;
    
    
    
     public int encontrartexto(JTextField texto_buscar,int posicion,Component frame){
      
        try{
             String palabra="";
             String textobuscado="";
             
             palabra=texto_buscar.getText();
             textobuscado=area_principal.getText();
             
             posicion=textobuscado.indexOf(palabra,posicion);
             
             if(posicion!=-1){
                area_principal.select(posicion,posicion + palabra.length());
               
             }else{
                JOptionPane.showMessageDialog(frame, "No se ha encontrado: " + palabra);
        
             }
             
        }catch(Exception ex){
        
        
        } 
        
        
    return posicion;
    
    }
    
      
      
      
      
    
}
