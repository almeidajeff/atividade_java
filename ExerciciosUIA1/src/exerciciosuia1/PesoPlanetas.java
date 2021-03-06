/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosuia1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeff
 */
public class PesoPlanetas extends javax.swing.JFrame {

    /**
     * Creates new form PesoPlanetas
     */
    public PesoPlanetas() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        calcular_peso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mercurio = new javax.swing.JRadioButton();
        venus = new javax.swing.JRadioButton();
        marte = new javax.swing.JRadioButton();
        jupiter = new javax.swing.JRadioButton();
        saturno = new javax.swing.JRadioButton();
        urano = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Peso na Terra (kg)");

        peso.setText("0");
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        calcular_peso.setText("Calcular Peso");
        calcular_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_pesoActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o Planeta");

        buttonGroup1.add(mercurio);
        mercurio.setText("Mercúrio");
        mercurio.setToolTipText("");
        mercurio.setActionCommand("mercurio");
        mercurio.setName("mercurio"); // NOI18N
        mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioActionPerformed(evt);
            }
        });

        buttonGroup1.add(venus);
        venus.setText("Vênus");
        venus.setActionCommand("venus");

        buttonGroup1.add(marte);
        marte.setText("Marte");
        marte.setActionCommand("marte");
        marte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jupiter);
        jupiter.setText("Júpiter");
        jupiter.setActionCommand("jupiter");

        buttonGroup1.add(saturno);
        saturno.setText("Saturno");
        saturno.setActionCommand("saturno");
        saturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnoActionPerformed(evt);
            }
        });

        buttonGroup1.add(urano);
        urano.setText("Urano");
        urano.setActionCommand("urano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calcular_peso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(venus)
                            .addComponent(mercurio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jupiter)
                            .addComponent(marte))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urano)
                            .addComponent(saturno))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular_peso))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mercurio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(venus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jupiter))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saturno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(urano)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void calcular_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular_pesoActionPerformed
        double peso_double = Double.parseDouble(this.peso.getText());
        String planeta = buttonGroup1.getSelection().getActionCommand();
        CalculaPeso(planeta, peso_double);
    }//GEN-LAST:event_calcular_pesoActionPerformed

    private void mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mercurioActionPerformed

    private void marteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marteActionPerformed

    private void saturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturnoActionPerformed

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
            java.util.logging.Logger.getLogger(PesoPlanetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesoPlanetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesoPlanetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesoPlanetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesoPlanetas().setVisible(true);
            }
        });
    }
    // Funções extras
    public static void CalculaPeso(String planeta, double peso){
        if (planeta == "mercurio"){
            double peso_planeta = (peso/10)* 0.37;
            JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " será de: " + peso_planeta + " kg");
        }
        
        else if (planeta == "venus"){
            double peso_planeta = (peso/10)* 0.88;
            JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " será de: " + peso_planeta + " kg");
        }
        else if (planeta == "marte") {
            double peso_planeta = (peso/10)* 0.38;
            JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " será de: " + peso_planeta + " kg");
        }
        
        else if (planeta == "jupiter") {
            double peso_planeta = (peso/10)* 2.04;
            JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " será de: " + peso_planeta + " kg");
        }
        
        else if (planeta == "saturno") {
            double peso_planeta = (peso/10)* 1.15;
            JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " será de: " + peso_planeta + " kg");
        }
        else if (planeta == "urano") {
            double peso_planeta = (peso/10)* 1.17;
            JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " será de: " + peso_planeta + " kg");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton calcular_peso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jupiter;
    private javax.swing.JRadioButton marte;
    private javax.swing.JRadioButton mercurio;
    private javax.swing.JTextField peso;
    private javax.swing.JRadioButton saturno;
    private javax.swing.JRadioButton urano;
    private javax.swing.JRadioButton venus;
    // End of variables declaration//GEN-END:variables
}
