/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package from_pages;

import java.text.Normalizer.Form;

/**
 *
 * @author DELL
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        main.removeAll();
        Accueil home = new Accueil();
        main.add(home).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p_tb = new javax.swing.JPanel();
        lbl_tb_board = new javax.swing.JLabel();
        jPanel9_encadreur = new javax.swing.JPanel();
        lbl_encadreur = new javax.swing.JLabel();
        jPanel10_tuteur = new javax.swing.JPanel();
        lbl_tuteur = new javax.swing.JLabel();
        jPanel11_stage = new javax.swing.JPanel();
        lbl_stage = new javax.swing.JLabel();
        jPanel13_utilisateur = new javax.swing.JPanel();
        lbl_utilisateur = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12_stagiaire = new javax.swing.JPanel();
        lbl_stagiaire = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        main = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        p_tb.setBackground(new java.awt.Color(255, 255, 255));
        p_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_tbMouseClicked(evt);
            }
        });

        lbl_tb_board.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tb_board.setText(" Tableau de board");
        lbl_tb_board.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout p_tbLayout = new javax.swing.GroupLayout(p_tb);
        p_tb.setLayout(p_tbLayout);
        p_tbLayout.setHorizontalGroup(
            p_tbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_tb_board, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        p_tbLayout.setVerticalGroup(
            p_tbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_tbLayout.createSequentialGroup()
                .addComponent(lbl_tb_board)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel9_encadreur.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9_encadreur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9_encadreurMouseClicked(evt);
            }
        });

        lbl_encadreur.setBackground(new java.awt.Color(255, 255, 255));
        lbl_encadreur.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_encadreur.setText("Encadreur");
        lbl_encadreur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel9_encadreurLayout = new javax.swing.GroupLayout(jPanel9_encadreur);
        jPanel9_encadreur.setLayout(jPanel9_encadreurLayout);
        jPanel9_encadreurLayout.setHorizontalGroup(
            jPanel9_encadreurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_encadreur, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );
        jPanel9_encadreurLayout.setVerticalGroup(
            jPanel9_encadreurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9_encadreurLayout.createSequentialGroup()
                .addComponent(lbl_encadreur)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel10_tuteur.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10_tuteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10_tuteurMouseClicked(evt);
            }
        });

        lbl_tuteur.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_tuteur.setText("Tuteur");
        lbl_tuteur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel10_tuteurLayout = new javax.swing.GroupLayout(jPanel10_tuteur);
        jPanel10_tuteur.setLayout(jPanel10_tuteurLayout);
        jPanel10_tuteurLayout.setHorizontalGroup(
            jPanel10_tuteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_tuteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10_tuteurLayout.setVerticalGroup(
            jPanel10_tuteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10_tuteurLayout.createSequentialGroup()
                .addComponent(lbl_tuteur)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel11_stage.setBackground(new java.awt.Color(255, 255, 255));

        lbl_stage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_stage.setText(" Stage");
        lbl_stage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_stage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_stageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11_stageLayout = new javax.swing.GroupLayout(jPanel11_stage);
        jPanel11_stage.setLayout(jPanel11_stageLayout);
        jPanel11_stageLayout.setHorizontalGroup(
            jPanel11_stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_stage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );
        jPanel11_stageLayout.setVerticalGroup(
            jPanel11_stageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11_stageLayout.createSequentialGroup()
                .addComponent(lbl_stage)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel13_utilisateur.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13_utilisateur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13_utilisateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13_utilisateurMouseClicked(evt);
            }
        });

        lbl_utilisateur.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_utilisateur.setText("Utilisateur");
        lbl_utilisateur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel13_utilisateurLayout = new javax.swing.GroupLayout(jPanel13_utilisateur);
        jPanel13_utilisateur.setLayout(jPanel13_utilisateurLayout);
        jPanel13_utilisateurLayout.setHorizontalGroup(
            jPanel13_utilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_utilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13_utilisateurLayout.setVerticalGroup(
            jPanel13_utilisateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13_utilisateurLayout.createSequentialGroup()
                .addComponent(lbl_utilisateur)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12_stagiaire.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12_stagiaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12_stagiaireMouseClicked(evt);
            }
        });

        lbl_stagiaire.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_stagiaire.setText("Stagiaire");
        lbl_stagiaire.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel12_stagiaireLayout = new javax.swing.GroupLayout(jPanel12_stagiaire);
        jPanel12_stagiaire.setLayout(jPanel12_stagiaireLayout);
        jPanel12_stagiaireLayout.setHorizontalGroup(
            jPanel12_stagiaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_stagiaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12_stagiaireLayout.setVerticalGroup(
            jPanel12_stagiaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12_stagiaireLayout.createSequentialGroup()
                .addComponent(lbl_stagiaire)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_tb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10_tuteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13_utilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel12_stagiaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel11_stage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel9_encadreur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(p_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel12_stagiaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel9_encadreur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel10_tuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel11_stage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jPanel13_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        main.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_tbMouseClicked
        // TODO add your handling code here:
        main.removeAll();
        Accueil home = new Accueil();
        main.add(home).setVisible(true);
    }//GEN-LAST:event_p_tbMouseClicked

    private void jPanel13_utilisateurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13_utilisateurMouseClicked
        // TODO add your handling code here:
         main.removeAll();
        Form_Utilisateur us = new Form_Utilisateur();
        main.add(us).setVisible(true);
    }//GEN-LAST:event_jPanel13_utilisateurMouseClicked

    private void jPanel9_encadreurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9_encadreurMouseClicked
        // TODO add your handling code here:
        main.removeAll();
        Form_Encadreur enc = new Form_Encadreur();
        main.add(enc).setVisible(true);
    }//GEN-LAST:event_jPanel9_encadreurMouseClicked

    private void jPanel10_tuteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10_tuteurMouseClicked
        main.removeAll();
        Form_Tuteur tt = new Form_Tuteur();
        main.add(tt).setVisible(true);
       
                
    }//GEN-LAST:event_jPanel10_tuteurMouseClicked

    private void lbl_stageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_stageMouseClicked
        // TODO add your handling code here: 
        main.removeAll();
        Form_Stage st = new Form_Stage();
        main.add(st).setVisible(true);
    }//GEN-LAST:event_lbl_stageMouseClicked

    private void jPanel12_stagiaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12_stagiaireMouseClicked
         main.removeAll();
        Form_Stagiaire stg = new Form_Stagiaire();
        main.add(stg).setVisible(true);
    }//GEN-LAST:event_jPanel12_stagiaireMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10_tuteur;
    private javax.swing.JPanel jPanel11_stage;
    private javax.swing.JPanel jPanel12_stagiaire;
    private javax.swing.JPanel jPanel13_utilisateur;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9_encadreur;
    private javax.swing.JLabel lbl_encadreur;
    private javax.swing.JLabel lbl_stage;
    private javax.swing.JLabel lbl_stagiaire;
    private javax.swing.JLabel lbl_tb_board;
    private javax.swing.JLabel lbl_tuteur;
    private javax.swing.JLabel lbl_utilisateur;
    private javax.swing.JDesktopPane main;
    private javax.swing.JPanel p_tb;
    // End of variables declaration//GEN-END:variables
}