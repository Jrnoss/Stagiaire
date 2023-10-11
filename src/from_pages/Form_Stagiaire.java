/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package from_pages;

import beans.Stagiaire;
import dao.StagiaireDao;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Form_Stagiaire extends javax.swing.JInternalFrame {

    /**
     * Creates new form Utilisateur
     */
    public Form_Stagiaire() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        stagiaire_prenom = new javax.swing.JLabel();
        stagiaire_nom = new javax.swing.JLabel();
        stagiaire_tel = new javax.swing.JLabel();
        stagiaire_email = new javax.swing.JLabel();
        stagiaire_specialite = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_provenance = new javax.swing.JPasswordField();
        btn_modifier = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        btn_save2 = new javax.swing.JButton();
        destination = new javax.swing.JLabel();
        txt_specialite = new javax.swing.JPasswordField();
        btn_recherche = new javax.swing.JButton();
        stagiaire_id = new javax.swing.JLabel();
        txt_prenom = new javax.swing.JTextField();
        provenance2 = new javax.swing.JLabel();
        txt_destination = new javax.swing.JPasswordField();
        stagiaire_statut = new javax.swing.JLabel();
        txt_statut = new javax.swing.JPasswordField();
        txt_sexe = new javax.swing.JPasswordField();
        stagiaire_statut1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_stagiaire = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        stagiaire_prenom.setText("Prénom");

        stagiaire_nom.setText("Nom");

        stagiaire_tel.setText("Téléphone");

        stagiaire_email.setText("Email");

        stagiaire_specialite.setText("Spécialité");

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_provenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_provenanceActionPerformed(evt);
            }
        });

        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        btn_save2.setText("Save");
        btn_save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save2ActionPerformed(evt);
            }
        });

        destination.setText("Destination");

        txt_specialite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_specialiteActionPerformed(evt);
            }
        });

        btn_recherche.setText("Recherche");
        btn_recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechercheActionPerformed(evt);
            }
        });

        stagiaire_id.setText("ID");

        provenance2.setText("Provenance");

        txt_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_destinationActionPerformed(evt);
            }
        });

        stagiaire_statut.setText("Statut");

        txt_statut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statutActionPerformed(evt);
            }
        });

        txt_sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexeActionPerformed(evt);
            }
        });

        stagiaire_statut1.setText("Sexe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_save2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 233, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stagiaire_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(stagiaire_id, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(stagiaire_prenom, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                                    .addComponent(txt_prenom))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(provenance2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_provenance, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(stagiaire_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(stagiaire_email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_specialite)
                                            .addComponent(stagiaire_specialite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_destination)
                                            .addComponent(destination, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stagiaire_statut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_statut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(stagiaire_statut1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stagiaire_id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stagiaire_nom)
                                .addComponent(stagiaire_specialite)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(stagiaire_prenom)
                        .addGap(18, 18, 18)
                        .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(stagiaire_statut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stagiaire_email)
                    .addComponent(stagiaire_tel)
                    .addComponent(provenance2)
                    .addComponent(destination)
                    .addComponent(txt_statut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_provenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stagiaire_statut1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save2)
                    .addComponent(btn_modifier)
                    .addComponent(btn_supprimer)
                    .addComponent(btn_recherche))
                .addGap(41, 41, 41))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {stagiaire_email, stagiaire_prenom, stagiaire_specialite, stagiaire_tel});

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        list_stagiaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Prénom", "Nom", "Téléphone", "Email", "Provenance", "Specialité", "Destination"
            }
        ));
        jScrollPane1.setViewportView(list_stagiaire);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        StagiaireDao stgdao = new StagiaireDao();
        String prenom = txt_prenom.getText();
        String nom = txt_nom.getText();
        String sexe = txt_sexe.getText();
        String provenance = txt_provenance.getText();
        String specialite = txt_specialite.getText();
        String tel = txt_tel.getText();
        String email = txt_email.getText();
        String statut = txt_statut.getText();
        String destination = txt_destination.getText();
        
        if (prenom.equals("") || nom.equals("") || provenance.equals("") || specialite.equals("") ||tel.equals("") || email.equals("") || statut.equals("")|| destination.equals("")) {
            JOptionPane.showMessageDialog(this, "Reseigner les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            Stagiaire stg = new Stagiaire(prenom, nom,sexe, provenance, specialite, tel, email, statut, destination);
            stgdao.add(stg);
            JOptionPane.showMessageDialog(this, "Reseigner les champs");
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void btn_save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_save2ActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_provenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_provenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_provenanceActionPerformed

    private void btn_rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_rechercheActionPerformed

    private void txt_specialiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_specialiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_specialiteActionPerformed

    private void txt_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_destinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_destinationActionPerformed

    private void txt_statutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statutActionPerformed

    private void txt_sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_recherche;
    private javax.swing.JButton btn_save2;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JLabel destination;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list_stagiaire;
    private javax.swing.JLabel provenance2;
    private javax.swing.JLabel stagiaire_email;
    private javax.swing.JLabel stagiaire_id;
    private javax.swing.JLabel stagiaire_nom;
    private javax.swing.JLabel stagiaire_prenom;
    private javax.swing.JLabel stagiaire_specialite;
    private javax.swing.JLabel stagiaire_statut;
    private javax.swing.JLabel stagiaire_statut1;
    private javax.swing.JLabel stagiaire_tel;
    private javax.swing.JPasswordField txt_destination;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JPasswordField txt_provenance;
    private javax.swing.JPasswordField txt_sexe;
    private javax.swing.JPasswordField txt_specialite;
    private javax.swing.JPasswordField txt_statut;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
