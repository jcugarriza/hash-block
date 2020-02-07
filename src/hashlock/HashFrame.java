package hashlock;

import java.util.ArrayList;
import javax.swing.*;

public class HashFrame extends javax.swing.JFrame {

    ContratoBanco c;
    Transacciones data;
    ArrayList<Cadena> cadenas;

    public HashFrame() {
        initComponents();

        //centra el frame
        this.setLocationRelativeTo(null);

        c = new ContratoBanco();
        cadenas = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        buttonCrear = new javax.swing.JButton();
        buttonBloque = new javax.swing.JButton();
        buttonCadena = new javax.swing.JButton();
        buttonDepositar = new javax.swing.JButton();
        buttonRetirar = new javax.swing.JButton();
        buttonTransferir = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        buttonSalir = new javax.swing.JButton();
        labelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Butaca");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCrear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCrear.setText("Crear cuenta");
        buttonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 50));

        buttonBloque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonBloque.setText("Guardar Bloque");
        buttonBloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBloqueActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBloque, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 160, 50));

        buttonCadena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCadena.setText("Nueva Cadena");
        buttonCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadenaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, 50));

        buttonDepositar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonDepositar.setText("Depositar");
        buttonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 160, 50));

        buttonRetirar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonRetirar.setText("Retirar");
        buttonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 160, 50));

        buttonTransferir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonTransferir.setText("Transferir");
        buttonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 160, 50));

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 160, 50));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("BUTACA");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 100, 150, -1));

        buttonSalir.setText("Salir");
        getContentPane().add(buttonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 466, -1, -1));

        labelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hashlock/bank original.png"))); // NOI18N
        labelImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 570, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearActionPerformed

    }//GEN-LAST:event_buttonCrearActionPerformed

    private void buttonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferirActionPerformed

    }//GEN-LAST:event_buttonTransferirActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetirarActionPerformed

    }//GEN-LAST:event_buttonRetirarActionPerformed

    private void buttonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDepositarActionPerformed

    }//GEN-LAST:event_buttonDepositarActionPerformed

    private void buttonBloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBloqueActionPerformed

        FuncionesFrame.guardarBloque(cadenas.get(cadenas.size() - 1), data);
        
    }//GEN-LAST:event_buttonBloqueActionPerformed

    private void buttonCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadenaActionPerformed
        
        //se agrega una nueva cadena al final de cadenas
        Cadena cadena = FuncionesFrame.agregarCadena(this.c, cadenas.size());
        if (cadena != null) {
            this.cadenas.add(cadena);
            System.out.println("Cadena " + (this.cadenas.size() - 1) + " creada.");
        }else{
            System.out.println("Error al crear Cadena " + (this.cadenas.size() - 1) + " ((buttonCadena) cadena: null)");
        }
        
    }//GEN-LAST:event_buttonCadenaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HashFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBloque;
    private javax.swing.JButton buttonCadena;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCrear;
    private javax.swing.JButton buttonDepositar;
    private javax.swing.JButton buttonRetirar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JButton buttonTransferir;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
