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
public class Jankenpon extends javax.swing.JFrame {


    /**
     * Creates new form Jankenpon
     */
    public Jankenpon() {
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
        label1 = new java.awt.Label();
        canvas1 = new java.awt.Canvas();
        label2 = new java.awt.Label();
        pedra = new javax.swing.JRadioButton();
        papel = new javax.swing.JRadioButton();
        tesoura = new javax.swing.JRadioButton();
        jogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
        label1.setText("JanKenPon");

        label2.setText("Pedra, Papel ou Tesoura ?");

        buttonGroup1.add(pedra);
        pedra.setSelected(true);
        pedra.setText("Pedra");
        pedra.setActionCommand("0");

        buttonGroup1.add(papel);
        papel.setText("Papel");
        papel.setActionCommand("1");

        buttonGroup1.add(tesoura);
        tesoura.setText("Tesoura");
        tesoura.setActionCommand("2");

        jogar.setText("Jogar");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pedra)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(papel)
                            .addComponent(tesoura)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(pedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(papel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tesoura)
                .addGap(6, 6, 6)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        // TODO add your handling code here:
        int jogador = Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
        int computador = randInt(0,2);
        Jogar(jogador, computador);
    }//GEN-LAST:event_jogarActionPerformed

    /**
     * @param args the command line arguments
     */
    /**public void mostraImagem() { 
        int resp = JOptionPane.showConfirmDialog(this, "Deseja Iniciar o Jogo?", "", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) { 
            //jPMostraimagem.setIcon("../imagens/logo_jankenpon.jpg"); 
        }
    }*/
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
            java.util.logging.Logger.getLogger(Jankenpon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jankenpon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jankenpon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jankenpon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jankenpon().setVisible(true);
            }
        });
    }

    // Funções Extras
    public static int randInt(int min, int max){
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public static String getStringTextValue(int valor){
        
        if (valor == 0){
            String texto = "Pedra";
            return texto;
        }
        else if (valor == 1){
            String texto = "Papel";
            return texto;
        }
        else{
            String texto = "Tesoura";
            return texto;
        }
    }
    
    public class static Jogar(int valor_jogador, int valor_computador){
        String texto_computador = getStringTextValue(valor_computador);
        
        if (valor_jogador == valor_computador){
            JOptionPane.showMessageDialog(null,"O Computador tirou " + texto_computador);
            JOptionPane.showMessageDialog(null,"Empate, jogue novamente");
        }
        /* Pedra ganha de Tesoura
           Papel ganha de Pedra
           Tesoura ganha de Papel
        */
        else if (valor_jogador == 0 && valor_computador == 2 ||
                 valor_jogador == 1 && valor_computador == 0 ||
                 valor_jogador == 2 && valor_computador == 1){
            JOptionPane.showMessageDialog(null,"O Computador tirou " + texto_computador);
            JOptionPane.showMessageDialog(null,"Você Ganhou !");
        }
        else {
            JOptionPane.showMessageDialog(null,"O Computador tirou " + texto_computador);
            JOptionPane.showMessageDialog(null,"Você Perdeu !");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jogar;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JRadioButton papel;
    private javax.swing.JRadioButton pedra;
    private javax.swing.JRadioButton tesoura;
    // End of variables declaration//GEN-END:variables
}
