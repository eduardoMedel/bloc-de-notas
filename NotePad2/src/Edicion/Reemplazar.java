/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edicion;

import Edicion.Claseprincipal;
import notepad.Principal;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea.*;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;
import notepad.Principal;

/**
 *
 * @author jonathan
 */
public class Reemplazar extends javax.swing.JDialog {
  
  
    Claseprincipal ver=new Claseprincipal();
     Principal parent;
     String data,fin,rep;
     JTextArea jta;
     String orientation;
     int start=0;
     int checkcase,replaceall;
     int repcase=0;
     
     
    public void centrar(){
       
      setLocationRelativeTo(null);
    }
    
   
  void Find(int replace){
    
    try{
           data=jta.getText().trim();
           fin=texto_buscar.getText().trim();
           rep=texto_reemplazar.getText().trim();
                                                
                            if(rep.length()!=0&& repcase==1) { 
                           jta.replaceSelection(rep);
                           JOptionPane.showMessageDialog(null, "reemplazado");
                           repcase=0;}

                            System.out.println(data); 
                            if(data.contains(fin)){
                             start=data.indexOf(fin,start);
                              System.out.println(fin+start); 
                             if(start==-1){
                            JOptionPane.showMessageDialog(null, start);
                             start=0;
                             start=data.indexOf(fin,start);
                             }
                             if(start!=0){
                            JOptionPane.showMessageDialog(null, " x"+start);
                           jta.select(start,start+fin.length());} 
                           
                           start+=fin.length()+1;  
                            }
                            
      
    }catch(Exception e){}
    
  
    }
    
    public Reemplazar(Principal parent,boolean modal) {
         
        super(parent,modal);      
        initComponents();
        Principal ver=new Principal();
        centrar();
        this.parent=parent;
        jta=parent.jTextArea1; //modificar en code para que sea publico   propiedades del textarea y ir a code y dejarlo en public ya q por defecto viene en private !!!
        start=0;
        boton_buscar_siguiente.setEnabled(false);
        boton_reemplazar.setEnabled(false);
        boton_reemplazar_todo.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coincidir_todo = new javax.swing.JCheckBox();
        texto_buscar = new javax.swing.JTextField();
        texto_reemplazar = new javax.swing.JTextField();
        boton_buscar_siguiente = new javax.swing.JButton();
        boton_reemplazar = new javax.swing.JButton();
        boton_reemplazar_todo = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();

        jButton4.setText("jButton4");

        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setText("Buscar:");

        jLabel2.setText("Reemplazar por:");

        coincidir_todo.setText("Coincidir mayúsculas y minúsculas");
        coincidir_todo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coincidir_todoItemStateChanged(evt);
            }
        });

        texto_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_buscarActionPerformed(evt);
            }
        });
        texto_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texto_buscarKeyPressed(evt);
            }
        });

        boton_buscar_siguiente.setText("Buscar siguiente");
        boton_buscar_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscar_siguienteActionPerformed(evt);
            }
        });

        boton_reemplazar.setText("Reemplazar");
        boton_reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reemplazarActionPerformed(evt);
            }
        });

        boton_reemplazar_todo.setText("Reemplazar todo");
        boton_reemplazar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reemplazar_todoActionPerformed(evt);
            }
        });

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coincidir_todo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_reemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_buscar_siguiente)
                    .addComponent(boton_reemplazar_todo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_reemplazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(texto_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_buscar_siguiente)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_reemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_reemplazar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_reemplazar_todo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(coincidir_todo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_cancelar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
       start=0;
       jta=parent.jTextArea1;
       jta.setCaretPosition(start);
        boton_reemplazar.setEnabled(false);
        boton_reemplazar_todo.setEnabled(false);
        boton_buscar_siguiente.setEnabled(false);
        this.setLocationRelativeTo(this);
        this.setVisible(false);
        
       
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_buscar_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscar_siguienteActionPerformed
  
        Find(0);
       
    }//GEN-LAST:event_boton_buscar_siguienteActionPerformed

    private void texto_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_buscarActionPerformed
 
        
        
   
        
        
    }//GEN-LAST:event_texto_buscarActionPerformed

    private void texto_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto_buscarKeyPressed
     // evento para cuando escriba algo se habilite una acción
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          Find(0);
        }
        
        
        String texto=texto_buscar.getText();
         
        if(texto.isEmpty()==false){
             boton_buscar_siguiente.setEnabled(true);
             boton_reemplazar.setEnabled(true);
             boton_reemplazar_todo.setEnabled(true);
        }else{
        
             boton_buscar_siguiente.setEnabled(true);
             boton_reemplazar.setEnabled(true);
             boton_reemplazar_todo.setEnabled(true);
        }
    }//GEN-LAST:event_texto_buscarKeyPressed

    private void boton_reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reemplazarActionPerformed
       
        
        repcase=1;
        Find(repcase);
    }//GEN-LAST:event_boton_reemplazarActionPerformed

    private void coincidir_todoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coincidir_todoItemStateChanged
       
        if(coincidir_todo.isSelected()){
          checkcase=1;
        }else{
         checkcase=0;
        }
       texto_buscar.requestFocus();
    }//GEN-LAST:event_coincidir_todoItemStateChanged

    private void boton_reemplazar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reemplazar_todoActionPerformed
       
         data=jta.getText().trim();
           fin=texto_buscar.getText().trim();
           rep=texto_reemplazar.getText().trim();
       data= data.replaceAll(fin,rep);  /// ver
  jta.setText(data);
        
    }//GEN-LAST:event_boton_reemplazar_todoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        jta=parent.jTextArea1;
        start=0;
        //start=jta.getCaretPosition();
         jta.setCaretPosition(start);
        boton_reemplazar.setEnabled(false);
        boton_reemplazar_todo.setEnabled(false);
        boton_buscar_siguiente.setEnabled(false);
        this.setLocationRelativeTo(this);
        
        
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reemplazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reemplazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reemplazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reemplazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              Reemplazar dialog=new Reemplazar(new Principal(),true);
              dialog.addWindowListener(
              
              new java.awt.event.WindowAdapter() {
                  
                  public void windowClosing(java.awt.event.WindowEvent e){
                  System.exit(0);
                  }
                  
}
              
              );
              dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar_siguiente;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_reemplazar;
    private javax.swing.JButton boton_reemplazar_todo;
    private javax.swing.JCheckBox coincidir_todo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField texto_buscar;
    public javax.swing.JTextField texto_reemplazar;
    // End of variables declaration//GEN-END:variables
}
