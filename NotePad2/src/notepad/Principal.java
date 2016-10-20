
package notepad;

//-----------------------------
import Funcionalidad.Archivo;
import Edicion.Reemplazar;
import Edicion.Claseprincipal;
import java.awt.Font; 
import formato.Fuente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import jnotepad.Form_Acercadejnotepad;
import jnotepad.Form_Verayuda;
//-----------------------------



public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Bloc de notas");
        
        constructorEdicion();
    }
    
    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    
    public static String caja1;
    public static int caja2;
    public static String caja3;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        ArchivoNuevo_ = new javax.swing.JMenuItem();
        ArchivoAbrir_ = new javax.swing.JMenuItem();
        ArchivoGuardar_ = new javax.swing.JMenuItem();
        ArchivoGuardarComo_ = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ArchivoConfigurarPagina_ = new javax.swing.JMenuItem();
        ArchivoImprimir_ = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ArchivoSalir_ = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        EdicionDeshacer_ = new javax.swing.JMenuItem();
        EdicionCortar_ = new javax.swing.JMenuItem();
        EdicionCopiar_ = new javax.swing.JMenuItem();
        EdicionPegar_ = new javax.swing.JMenuItem();
        EdicionEliminar_ = new javax.swing.JMenuItem();
        EdicionBuscar_ = new javax.swing.JMenuItem();
        EdicionBuscarSiguiente_ = new javax.swing.JMenuItem();
        EdicionReemplazar_ = new javax.swing.JMenuItem();
        EdicionIrA_ = new javax.swing.JMenuItem();
        EdicionSeleccionarTodo_ = new javax.swing.JMenuItem();
        EdicionHoraFecha_ = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        FormatoAjustesLinea_ = new javax.swing.JCheckBoxMenuItem();
        FormatoFuente_ = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        AyudaVerlaAyuda_ = new javax.swing.JMenuItem();
        AyudaAcercaDelBlocdeNotas_ = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu4.setText("Archivo");

        ArchivoNuevo_.setText("Nuevo");
        ArchivoNuevo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoNuevo_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoNuevo_);

        ArchivoAbrir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AbrirCarpetaa.jpg"))); // NOI18N
        ArchivoAbrir_.setText("Abrir");
        ArchivoAbrir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoAbrir_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoAbrir_);

        ArchivoGuardar_.setText("Guardar");
        ArchivoGuardar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoGuardar_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoGuardar_);

        ArchivoGuardarComo_.setText("Guardar como...");
        ArchivoGuardarComo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoGuardarComo_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoGuardarComo_);
        jMenu4.add(jSeparator2);

        ArchivoConfigurarPagina_.setText("Configurar pagina...");
        ArchivoConfigurarPagina_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoConfigurarPagina_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoConfigurarPagina_);

        ArchivoImprimir_.setText("Imprimir");
        ArchivoImprimir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoImprimir_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoImprimir_);
        jMenu4.add(jSeparator1);

        ArchivoSalir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salirr.png"))); // NOI18N
        ArchivoSalir_.setText("Salir");
        ArchivoSalir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoSalir_ActionPerformed(evt);
            }
        });
        jMenu4.add(ArchivoSalir_);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edicion");

        EdicionDeshacer_.setText("Deshacer");
        EdicionDeshacer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionDeshacer_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionDeshacer_);

        EdicionCortar_.setText("Cortar");
        EdicionCortar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionCortar_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionCortar_);

        EdicionCopiar_.setText("Copiar");
        EdicionCopiar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionCopiar_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionCopiar_);

        EdicionPegar_.setText("Pegar");
        EdicionPegar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionPegar_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionPegar_);

        EdicionEliminar_.setText("Eliminar");
        EdicionEliminar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionEliminar_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionEliminar_);

        EdicionBuscar_.setText("Buscar...");
        EdicionBuscar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionBuscar_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionBuscar_);

        EdicionBuscarSiguiente_.setText("Buscar siguiente");
        EdicionBuscarSiguiente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionBuscarSiguiente_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionBuscarSiguiente_);

        EdicionReemplazar_.setText("Reemplazar");
        EdicionReemplazar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionReemplazar_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionReemplazar_);

        EdicionIrA_.setText("Ir a...");
        EdicionIrA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionIrA_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionIrA_);

        EdicionSeleccionarTodo_.setText("Seleccionar todo");
        EdicionSeleccionarTodo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionSeleccionarTodo_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionSeleccionarTodo_);

        EdicionHoraFecha_.setText("Hora y fecha");
        EdicionHoraFecha_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdicionHoraFecha_ActionPerformed(evt);
            }
        });
        jMenu5.add(EdicionHoraFecha_);

        jMenuBar2.add(jMenu5);

        jMenu2.setText("Formato");

        FormatoAjustesLinea_.setSelected(true);
        FormatoAjustesLinea_.setText("Ajustes de Línea");
        FormatoAjustesLinea_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatoAjustesLinea_ActionPerformed(evt);
            }
        });
        jMenu2.add(FormatoAjustesLinea_);

        FormatoFuente_.setText("Fuente...");
        FormatoFuente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatoFuente_ActionPerformed(evt);
            }
        });
        jMenu2.add(FormatoFuente_);

        jMenuBar2.add(jMenu2);

        jMenu6.setText("Ayuda");

        AyudaVerlaAyuda_.setText("Ver la ayuda");
        AyudaVerlaAyuda_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaVerlaAyuda_ActionPerformed(evt);
            }
        });
        jMenu6.add(AyudaVerlaAyuda_);

        AyudaAcercaDelBlocdeNotas_.setText("Acerca del Bloc de notas");
        AyudaAcercaDelBlocdeNotas_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaAcercaDelBlocdeNotas_ActionPerformed(evt);
            }
        });
        jMenu6.add(AyudaAcercaDelBlocdeNotas_);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int num = 0;
    
    private void FormatoAjustesLinea_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatoAjustesLinea_ActionPerformed
        
        switch(num){
            case 0: {
                jTextArea1.setLineWrap(true); 
                num = 1;
                break;
            }
            case 1: {
                jTextArea1.setLineWrap(false);
                num = 0;
                break;
            }
        }
    }//GEN-LAST:event_FormatoAjustesLinea_ActionPerformed

    private void FormatoFuente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatoFuente_ActionPerformed
        
        Fuente dialog = new Fuente(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

        if((caja1 == null) && (caja3 == null)){
            
        }
        else{
            int tamaño = Integer.parseInt(caja3);
            Font font = new Font(caja1, caja2, tamaño);
            jTextArea1.setFont(font);
        }
    }//GEN-LAST:event_FormatoFuente_ActionPerformed

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    
    private void ArchivoNuevo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoNuevo_ActionPerformed
        int e = 0;
        if (e == 0){
        jTextArea1.setText("");
        }else{
            if (e == -1){
                System.currentTimeMillis();
            }
        }
    }//GEN-LAST:event_ArchivoNuevo_ActionPerformed

    private void ArchivoAbrir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoAbrir_ActionPerformed
        String ruta = this.jTextArea1.getText();
        Archivo maxql=new Archivo();
        maxql.abrir(ruta);
        this.setTitle("" + maxql.getFileName() ); 
    }//GEN-LAST:event_ArchivoAbrir_ActionPerformed

    private void ArchivoGuardar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoGuardar_ActionPerformed
        String datos = this.jTextArea1.getText();
        Archivo maxql=new Archivo();
        maxql.Guardar(datos);
        this.setTitle("" + maxql.getFileName() );    
    }//GEN-LAST:event_ArchivoGuardar_ActionPerformed

    private void ArchivoGuardarComo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoGuardarComo_ActionPerformed
        String datos = this.jTextArea1.getText();
        Archivo maxql=new Archivo();
        maxql.Guardar_como(datos);
        this.setTitle("" + maxql.getFileName() );
    }//GEN-LAST:event_ArchivoGuardarComo_ActionPerformed

    private void ArchivoConfigurarPagina_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoConfigurarPagina_ActionPerformed
        
    }//GEN-LAST:event_ArchivoConfigurarPagina_ActionPerformed

    private void ArchivoImprimir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoImprimir_ActionPerformed
        //PaginationExample pagination = new PaginationExample();
        //pagination.imprimirnomina();  
    }//GEN-LAST:event_ArchivoImprimir_ActionPerformed

    private void ArchivoSalir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoSalir_ActionPerformed
        Archivo arch = new Archivo();
        arch.salir();
    }//GEN-LAST:event_ArchivoSalir_ActionPerformed

    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    
    public void constructorEdicion(){
        
        deshacer();
        EdicionCortar_.setEnabled(false);
        EdicionCopiar_.setEnabled(false);
        EdicionEliminar_.setEnabled(false);
        EdicionBuscar_.setEnabled(false);
        EdicionBuscarSiguiente_.setEnabled(false);
    }
    
    UndoManager undo=new UndoManager(); 
    
    public void deshacer(){
        jTextArea1.getDocument().addUndoableEditListener(
        
            new UndoableEditListener() {

            @Override
            public void undoableEditHappened(UndoableEditEvent uee) {
                
                undo.addEdit(uee.getEdit());
             
            }
        });
       jTextArea1.setCaretPosition(0); 
       
    }
    
    private void EdicionDeshacer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionDeshacer_ActionPerformed
        try{
           undo.undo();
           }catch(CannotUndoException ex){
             ex.printStackTrace();
           }
    }//GEN-LAST:event_EdicionDeshacer_ActionPerformed

    private void EdicionCortar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionCortar_ActionPerformed
        jTextArea1.cut();
    }//GEN-LAST:event_EdicionCortar_ActionPerformed

    private void EdicionCopiar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionCopiar_ActionPerformed
         jTextArea1.copy();
    }//GEN-LAST:event_EdicionCopiar_ActionPerformed

    private void EdicionPegar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionPegar_ActionPerformed
        jTextArea1.paste();
    }//GEN-LAST:event_EdicionPegar_ActionPerformed

    private void EdicionEliminar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionEliminar_ActionPerformed
        String area=jTextArea1.getText();
           
           if(area.isEmpty()==false){
              
                 jTextArea1.setText("");
           }
    }//GEN-LAST:event_EdicionEliminar_ActionPerformed

    private void EdicionBuscar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionBuscar_ActionPerformed
        String msj;
         try{ 
       			
		msj = JOptionPane.showInputDialog("Buscar");			
		while(!jTextArea1.getText().contains(msj)){				
                JOptionPane.showMessageDialog(null,"No Se Encontró : " +msj+"" ,"Block de notas",JOptionPane.WARNING_MESSAGE );
			msj = JOptionPane.showInputDialog("Buscar");
			}			
		jTextArea1.select(jTextArea1.getText().indexOf(msj),
		jTextArea1.getText().indexOf(msj) + msj.length());
		}
		catch(Exception ex){
		 
		}
    }//GEN-LAST:event_EdicionBuscar_ActionPerformed

    private void EdicionBuscarSiguiente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionBuscarSiguiente_ActionPerformed
        String Msj="";
      
            try{
        jTextArea1.select(jTextArea1.getText().indexOf(Msj,jTextArea1.getText().indexOf(Msj)+1),
		jTextArea1.getText().indexOf(Msj,jTextArea1.getText().indexOf(Msj)+1));
      }
      catch (Exception ex){
          JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
      
      }
    }//GEN-LAST:event_EdicionBuscarSiguiente_ActionPerformed

    private void EdicionReemplazar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionReemplazar_ActionPerformed
        Reemplazar ver=new Reemplazar(this,true);
        ver.setVisible(true);
    }//GEN-LAST:event_EdicionReemplazar_ActionPerformed

    private void EdicionIrA_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionIrA_ActionPerformed
        
    }//GEN-LAST:event_EdicionIrA_ActionPerformed

    private void EdicionSeleccionarTodo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionSeleccionarTodo_ActionPerformed
        jTextArea1.selectAll();
          
          EdicionEliminar_.setEnabled(true);
          EdicionCortar_.setEnabled(true);
          EdicionCopiar_.setEnabled(true);
         
          EdicionSeleccionarTodo_.setEnabled(false);
    }//GEN-LAST:event_EdicionSeleccionarTodo_ActionPerformed

    private void EdicionHoraFecha_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdicionHoraFecha_ActionPerformed
        Date dato=new Date();
        DateFormat hora_fecha=new SimpleDateFormat("HH:mm  dd-MM-yyyy");
        jTextArea1.setText(hora_fecha.format(dato));
    }//GEN-LAST:event_EdicionHoraFecha_ActionPerformed

    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxXXXXXXXXXXXxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    
    private void AyudaVerlaAyuda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaVerlaAyuda_ActionPerformed
        Form_Verayuda ju = new Form_Verayuda();
        ju.setVisible(true);
        ju.setLocationRelativeTo(null);
    }//GEN-LAST:event_AyudaVerlaAyuda_ActionPerformed

    private void AyudaAcercaDelBlocdeNotas_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaAcercaDelBlocdeNotas_ActionPerformed
        Form_Acercadejnotepad ju = new Form_Acercadejnotepad();
        ju.setVisible(true);
        ju.setLocationRelativeTo(null);     
    }//GEN-LAST:event_AyudaAcercaDelBlocdeNotas_ActionPerformed

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ArchivoAbrir_;
    private javax.swing.JMenuItem ArchivoConfigurarPagina_;
    private javax.swing.JMenuItem ArchivoGuardarComo_;
    private javax.swing.JMenuItem ArchivoGuardar_;
    private javax.swing.JMenuItem ArchivoImprimir_;
    private javax.swing.JMenuItem ArchivoNuevo_;
    private javax.swing.JMenuItem ArchivoSalir_;
    private javax.swing.JMenuItem AyudaAcercaDelBlocdeNotas_;
    private javax.swing.JMenuItem AyudaVerlaAyuda_;
    private javax.swing.JMenuItem EdicionBuscarSiguiente_;
    private javax.swing.JMenuItem EdicionBuscar_;
    private javax.swing.JMenuItem EdicionCopiar_;
    private javax.swing.JMenuItem EdicionCortar_;
    private javax.swing.JMenuItem EdicionDeshacer_;
    private javax.swing.JMenuItem EdicionEliminar_;
    private javax.swing.JMenuItem EdicionHoraFecha_;
    private javax.swing.JMenuItem EdicionIrA_;
    private javax.swing.JMenuItem EdicionPegar_;
    private javax.swing.JMenuItem EdicionReemplazar_;
    private javax.swing.JMenuItem EdicionSeleccionarTodo_;
    private javax.swing.JCheckBoxMenuItem FormatoAjustesLinea_;
    private javax.swing.JMenuItem FormatoFuente_;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
