/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package from_pages;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Authentification extends javax.swing.JInternalFrame{

    /**
     * Creates new form Acceuil
     */
    public Authentification() {
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

        corps = new javax.swing.JPanel();
        case_head = new javax.swing.JPanel();
        authentification = new javax.swing.JLabel();
        case_main = new javax.swing.JPanel();
        champ_email = new javax.swing.JLabel();
        champ_password = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_oubli = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        case_head.setBackground(new java.awt.Color(204, 204, 204));

        authentification.setBackground(new java.awt.Color(255, 255, 255));
        authentification.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        authentification.setText("GESTION DES AUTHENTIFICATION"); // NOI18N

        javax.swing.GroupLayout case_headLayout = new javax.swing.GroupLayout(case_head);
        case_head.setLayout(case_headLayout);
        case_headLayout.setHorizontalGroup(
            case_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(case_headLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(authentification, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        case_headLayout.setVerticalGroup(
            case_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, case_headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(authentification, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        case_main.setBackground(new java.awt.Color(204, 204, 204));

        champ_email.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        champ_email.setForeground(new java.awt.Color(0, 0, 153));
        champ_email.setText("Username");

        champ_password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        champ_password.setForeground(new java.awt.Color(0, 0, 153));
        champ_password.setText("Password");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        btn_oubli.setBackground(new java.awt.Color(153, 0, 0));
        btn_oubli.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_oubli.setText("Cancel");
        btn_oubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oubliActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(153, 0, 0));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_login.setText("Login");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        txt_password.setText("jPasswordField1");

        javax.swing.GroupLayout case_mainLayout = new javax.swing.GroupLayout(case_main);
        case_main.setLayout(case_mainLayout);
        case_mainLayout.setHorizontalGroup(
            case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(case_mainLayout.createSequentialGroup()
                .addGroup(case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(case_mainLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(champ_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(champ_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_email)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)))
                    .addGroup(case_mainLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(btn_oubli, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        case_mainLayout.setVerticalGroup(
            case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(case_mainLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(champ_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(case_mainLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(champ_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, case_mainLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(case_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_oubli)
                    .addComponent(btn_login))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout corpsLayout = new javax.swing.GroupLayout(corps);
        corps.setLayout(corpsLayout);
        corpsLayout.setHorizontalGroup(
            corpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpsLayout.createSequentialGroup()
                .addGroup(corpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(corpsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(case_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(corpsLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(case_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3034, Short.MAX_VALUE))
        );
        corpsLayout.setVerticalGroup(
            corpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpsLayout.createSequentialGroup()
                .addComponent(case_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(case_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        getContentPane().add(corps, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_oubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oubliActionPerformed

        
    }//GEN-LAST:event_btn_oubliActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
       try {
            
             String email = txt_email.getText();
             char[] password = txt_password.getPassword();
    if (email.equals("")&& password.equals("")){
        JOptionPane.showMessageDialog(null, "Veuillez remplir le champ","Message",JOptionPane.OK_OPTION);
            }
    else if (email.equals("admin")&& password.equals("1234")){
        Authentification.super.dispose();
        new Applis_Stagiaire().setVisible(true);
    }
    else{
        JOptionPane.showMessageDialog(null,"Mot de passe ou \n NOm utilisateur sont incorrects ");
        
    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_loginMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authentification;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_oubli;
    private javax.swing.JPanel case_head;
    private javax.swing.JPanel case_main;
    private javax.swing.JLabel champ_email;
    private javax.swing.JLabel champ_password;
    private javax.swing.JPanel corps;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
