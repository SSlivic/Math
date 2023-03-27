/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lerningmath;

/**
 *
 * @author Sanja
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jLabel1 = new javax.swing.JLabel();
        firstgr = new javax.swing.JButton();
        secondgr = new javax.swing.JButton();
        thirdgr = new javax.swing.JButton();
        fourthgr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Learning math");

        firstgr.setText("First grade");
        firstgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstgrMouseClicked(evt);
            }
        });
        firstgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstgrActionPerformed(evt);
            }
        });

        secondgr.setText("Second grade");
        secondgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondgrMouseClicked(evt);
            }
        });

        thirdgr.setText("Third grade");
        thirdgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirdgrMouseClicked(evt);
            }
        });
        thirdgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdgrActionPerformed(evt);
            }
        });

        fourthgr.setText("Fourth grade");
        fourthgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourthgrMouseClicked(evt);
            }
        });
        fourthgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthgrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstgr)
                    .addComponent(thirdgr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondgr)
                    .addComponent(fourthgr))
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstgr)
                    .addComponent(secondgr))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdgr)
                    .addComponent(fourthgr))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstgrMouseClicked
     Firstgrade fg=new Firstgrade();
        fg.setVisible(true);   
    }//GEN-LAST:event_firstgrMouseClicked

    private void secondgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondgrMouseClicked
         Secondgrade sg=new Secondgrade();
        sg.setVisible(true);        
    }//GEN-LAST:event_secondgrMouseClicked

    private void thirdgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirdgrMouseClicked
        ThirdGrade tr=new ThirdGrade();
        tr.setVisible(true);        
    }//GEN-LAST:event_thirdgrMouseClicked

    private void fourthgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourthgrMouseClicked
       
        Fourthgrade fg=new Fourthgrade();
        fg.setVisible(true);
    }//GEN-LAST:event_fourthgrMouseClicked

    private void firstgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstgrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstgrActionPerformed

    private void thirdgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdgrActionPerformed
       
        
    }//GEN-LAST:event_thirdgrActionPerformed

    private void fourthgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthgrActionPerformed
       
    }//GEN-LAST:event_fourthgrActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton firstgr;
    private javax.swing.JButton fourthgr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton secondgr;
    private javax.swing.JButton thirdgr;
    // End of variables declaration//GEN-END:variables
}
