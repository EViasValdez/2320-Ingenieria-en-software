/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combox;

/**
 *
 * @author EViasValdez
 */
public class Checkboxradiobutton extends javax.swing.JFrame {

    /**
     * Creates new form combobox
     */
    public Checkboxradiobutton() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkManzana = new javax.swing.JCheckBox();
        chkFresa = new javax.swing.JCheckBox();
        chkDurazno = new javax.swing.JCheckBox();
        chkPiña = new javax.swing.JCheckBox();
        chkPapaya = new javax.swing.JCheckBox();
        chkMelon = new javax.swing.JCheckBox();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        radChico = new javax.swing.JRadioButton();
        radMediano = new javax.swing.JRadioButton();
        radGrande = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        etiOrden = new javax.swing.JButton();
        etiOrden1 = new javax.swing.JButton();
        Mostrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(247, 240, 0));

        jPanel1.setBackground(new java.awt.Color(0, 124, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elige tus frutas");

        chkManzana.setBackground(new java.awt.Color(0, 124, 0));
        chkManzana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkManzana.setForeground(new java.awt.Color(255, 255, 255));
        chkManzana.setText("Manzana");
        chkManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkManzanaActionPerformed(evt);
            }
        });

        chkFresa.setBackground(new java.awt.Color(0, 124, 0));
        chkFresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkFresa.setForeground(new java.awt.Color(255, 255, 255));
        chkFresa.setText("Fresa");

        chkDurazno.setBackground(new java.awt.Color(0, 124, 0));
        chkDurazno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkDurazno.setForeground(new java.awt.Color(255, 255, 255));
        chkDurazno.setText("Durazno");

        chkPiña.setBackground(new java.awt.Color(0, 124, 0));
        chkPiña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPiña.setForeground(new java.awt.Color(255, 255, 255));
        chkPiña.setText("Piña");

        chkPapaya.setBackground(new java.awt.Color(0, 124, 0));
        chkPapaya.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPapaya.setForeground(new java.awt.Color(255, 255, 255));
        chkPapaya.setText("Papaya");

        chkMelon.setBackground(new java.awt.Color(0, 124, 0));
        chkMelon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMelon.setForeground(new java.awt.Color(255, 255, 255));
        chkMelon.setText("Melon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkManzana)
                            .addComponent(chkFresa)
                            .addComponent(chkDurazno))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkPapaya)
                            .addComponent(chkPiña)
                            .addComponent(chkMelon))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkManzana)
                    .addComponent(chkPiña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFresa)
                    .addComponent(chkPapaya))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDurazno)
                    .addComponent(chkMelon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        label1.setText("Orden de coctel de frutas");

        jPanel2.setBackground(new java.awt.Color(9, 0, 168));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elige el tamaño");

        radChico.setBackground(new java.awt.Color(9, 0, 168));
        radChico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radChico.setForeground(new java.awt.Color(255, 255, 255));
        radChico.setText("Chico");
        radChico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radChicoActionPerformed(evt);
            }
        });

        radMediano.setBackground(new java.awt.Color(9, 0, 168));
        radMediano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radMediano.setForeground(new java.awt.Color(255, 255, 255));
        radMediano.setText("Mediano");

        radGrande.setBackground(new java.awt.Color(9, 0, 168));
        radGrande.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radGrande.setForeground(new java.awt.Color(255, 255, 255));
        radGrande.setText("Grande");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radGrande)
                    .addComponent(radMediano)
                    .addComponent(jLabel2)
                    .addComponent(radChico))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radChico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radMediano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radGrande)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(198, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(240, 240, 240));
        label2.setText("Asi va su orden");

        etiOrden.setBackground(new java.awt.Color(198, 0, 0));
        etiOrden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiOrden.setText("Generar orden");
        etiOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiOrdenActionPerformed(evt);
            }
        });

        etiOrden1.setBackground(new java.awt.Color(198, 0, 0));
        etiOrden1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiOrden1.setText("Limpiar orden");
        etiOrden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiOrden1ActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(198, 0, 0));
        Mostrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 379, Short.MAX_VALUE)
                        .addComponent(etiOrden1)
                        .addGap(5, 5, 5)
                        .addComponent(etiOrden))
                    .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiOrden1)
                    .addComponent(etiOrden))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkManzanaActionPerformed

    private void etiOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiOrdenActionPerformed
        // TODO add your handling code here:
        String mensaje = "Usted selecciono: ";
        String mensaje1 = "El precio es: ";
        if (chkManzana.isSelected()){
            mensaje = mensaje + "Manzana ";
        }
        if (chkPiña.isSelected()){
            mensaje = mensaje + "Piña ";
        }
        if (chkFresa.isSelected()){
            mensaje = mensaje + "Fresa ";
        }
        if (chkPapaya.isSelected()){
            mensaje = mensaje + "Papaya ";
        }    
        if (chkDurazno.isSelected()){
            mensaje = mensaje +  "Durazno ";
        }    
        if (chkMelon.isSelected()){
            mensaje = mensaje + "Melon ";
        }
        if (radChico.isSelected()){
            mensaje = mensaje + "Tamaño: chico ";
        }
        if (radMediano.isSelected()){
            mensaje = mensaje + "Tamaño: mediano ";
        }
        if (radGrande.isSelected()){
            mensaje = mensaje + "Tamaño: grande";
        }
        Mostrar.setText(mensaje);
    }//GEN-LAST:event_etiOrdenActionPerformed

    private void radChicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radChicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radChicoActionPerformed

    private void etiOrden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiOrden1ActionPerformed
        // TODO add your handling code here:
        String mensaje = " ";
        
        if (chkPiña.isSelected()){
            mensaje = mensaje + "  ";
        }
        if (chkFresa.isSelected()){
            mensaje = mensaje + "  ";
        }
        if (chkPapaya.isSelected()){
            mensaje = mensaje + "  ";
        }    
        if (chkDurazno.isSelected()){
            mensaje = mensaje +  "  ";
        }    
        if (chkMelon.isSelected()){
            mensaje = mensaje + "  ";
        }
        if (radChico.isSelected())
        {
            mensaje = mensaje + "  ";
        }
        if (radMediano.isSelected())
        {
            mensaje = mensaje + "  ";
        }
        if (radGrande.isSelected())
        {
            mensaje = mensaje + "  ";
        }

        Mostrar.setText(mensaje);
    }//GEN-LAST:event_etiOrden1ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkboxradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkboxradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkboxradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkboxradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkboxradiobutton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mostrar;
    private javax.swing.JCheckBox chkDurazno;
    private javax.swing.JCheckBox chkFresa;
    private javax.swing.JCheckBox chkManzana;
    private javax.swing.JCheckBox chkMelon;
    private javax.swing.JCheckBox chkPapaya;
    private javax.swing.JCheckBox chkPiña;
    private javax.swing.JButton etiOrden;
    private javax.swing.JButton etiOrden1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JRadioButton radChico;
    private javax.swing.JRadioButton radGrande;
    private javax.swing.JRadioButton radMediano;
    // End of variables declaration//GEN-END:variables
}