/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikel
 * @version 1.0 beta
 * 
 */

public class menu extends javax.swing.JFrame {

    /**
     * constructor menú principal
     */
    public menu() {
        cerrar();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clients = new javax.swing.JButton();
        fabricants = new javax.swing.JButton();
        articles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clients.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        clients.setText("Clientes");
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });

        fabricants.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        fabricants.setText("Fabricantes");
        fabricants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricantsActionPerformed(evt);
            }
        });

        articles.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        articles.setText("Artículos");
        articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articlesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("PROGRAMA DE GESTIÓN");

        pedidos.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pedidos.setText("Pedidos");
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articles, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabricants, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clients, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(clients, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fabricants, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(articles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
        try {
            Clientes cli=new Clientes();
            cli.setVisible(true);
            this.setVisible(false);
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clientsActionPerformed

    private void fabricantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricantsActionPerformed
        try {
            Fabricantes fabri=new Fabricantes();
            fabri.setVisible(true);
            this.setVisible(false);
            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fabricantsActionPerformed

    private void articlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articlesActionPerformed
        try {
            Articulos art=new Articulos();
            art.setVisible(true);
            this.setVisible(false);
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_articlesActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        // TODO add your handling code here:
        try {
            Pedidos pedi=new Pedidos();
            pedi.setVisible(true);
            this.setVisible(false);
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_pedidosActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    
        /**
         * método para cerrar la aplicación
         * @deprecated
         */
        public void cerrar(){ 
            try {
                this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                addWindowFocusListener(new WindowAdapter() {
                    public void windowClossing(WindowEvent e){
                        confirmarSalida();
                    }                 
});
                this.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
         
        /**
         * método que confirma si quieres cerrar la aplicación
         */
        
        public void confirmarSalida(){
            int valor = JOptionPane.showConfirmDialog(this,"¿Estás seguro de cerrar?","ADVERTENCIA",JOptionPane.YES_NO_OPTION);
            if(valor==JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(null,"Gracias por su visita","Gracias",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton articles;
    private javax.swing.JButton clients;
    private javax.swing.JButton fabricants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pedidos;
    // End of variables declaration//GEN-END:variables
}
