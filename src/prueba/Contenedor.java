/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueba.RegistrarEmpleado;


public class Contenedor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Contenedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelIzquierdo = new javax.swing.JPanel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnRegistroVehiculos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegistroHerramientas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelScroll = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        Administrador = new javax.swing.JMenuItem();
        itemCliente = new javax.swing.JMenuItem();
        Vendedor = new javax.swing.JMenuItem();
        Mecanico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("Consecionario de Vehiculos");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Wilson Cassia Cucho");

        jLabel4.setText("Codigo:");

        jLabel5.setText("000001");

        javax.swing.GroupLayout panelSuperioLayout = new javax.swing.GroupLayout(panelSuperio);
        panelSuperio.setLayout(panelSuperioLayout);
        panelSuperioLayout.setHorizontalGroup(
            panelSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSuperioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(601, Short.MAX_VALUE))
            .addGroup(panelSuperioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelSuperioLayout.setVerticalGroup(
            panelSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(panelSuperio, java.awt.BorderLayout.PAGE_START);

        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setText("Registrar Empleados");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnRegistroVehiculos.setText("Registrar Vehiculo");
        btnRegistroVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroVehiculosActionPerformed(evt);
            }
        });

        jButton4.setText("Registrar Empleado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        btnRegistroHerramientas.setText("Registrar Heramientas");
        btnRegistroHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroHerramientasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistroVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistroHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistroVehiculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistroHerramientas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelIzquierdo, java.awt.BorderLayout.LINE_START);

        panelScroll.setLayout(new javax.swing.BoxLayout(panelScroll, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelScroll);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        jMenuItem2.setLabel("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        Cliente.setText("Usuario");

        Administrador.setLabel("Administrador");
        Cliente.add(Administrador);

        itemCliente.setLabel("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        Cliente.add(itemCliente);

        Vendedor.setLabel("Vendedor");
        Cliente.add(Vendedor);

        Mecanico.setText("Mecanico");
        Cliente.add(Mecanico);

        jMenuBar1.add(Cliente);

        jMenu2.setText("Buscar");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistroHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroHerramientasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroHerramientasActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemClienteActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        panelScroll.removeAll();
        panelScroll.add(new RegistrarEmpleado());
        //panelScroll.add(new RegistrarEmpleado());
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        panelScroll.removeAll();;
        try {
            panelScroll.add(new RegistrarCliente());
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistroVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroVehiculosActionPerformed
      panelScroll.removeAll();
      panelScroll.add(new RegistrarVehiculo());
        
    }//GEN-LAST:event_btnRegistroVehiculosActionPerformed

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
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Administrador;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem Mecanico;
    private javax.swing.JMenuItem Vendedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistroHerramientas;
    private javax.swing.JButton btnRegistroVehiculos;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelScroll;
    private javax.swing.JPanel panelSuperio;
    // End of variables declaration//GEN-END:variables
}
