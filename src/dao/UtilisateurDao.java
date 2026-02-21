
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Stage;
import beans.Utilisateur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class UtilisateurDao extends DAO<Utilisateur> {

    @Override
    public Utilisateur find(long id) {
        Utilisateur us = new Utilisateur();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from utilisateur where iduser=" + id);
            if (rs.next()) {
                us.setIduser(rs.getLong("iduser"));
                us.setNom(rs.getString("nom"));
                us.setTelephone(rs.getString("telephone"));
                us.setAdresse(rs.getString("adresse"));
                us.setLogin(rs.getString("login"));
                us.setPassword(rs.getString("password"));
                us.setSecret(rs.getString("secret"));
                us.setRole(rs.getString("role"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }

    @Override
    public void add(Utilisateur obj) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("INSERT INTO utilisateur ( nom, telephone, adresse, login, password,secret, role, iduse) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, obj.getNom());
            ps.setString(2, obj.getTelephone());
            ps.setString(3, obj.getAdresse());
            ps.setString(4, obj.getLogin());
            ps.setString(5, obj.getPassword());
            ps.setString(6, obj.getSecret());
            ps.setString(7, obj.getRole());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Utilisateur obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update utilisateur set  nom=?,"
                    + " telephone=?,adresse=?,  login=?,  password=?, secret=?, role=? where iduser = " + id);
            ps.setString(1, obj.getNom());
            ps.setString(2, obj.getTelephone());
            ps.setString(3, obj.getAdresse());
            ps.setString(4, obj.getLogin());
            ps.setString(5, obj.getPassword());
            ps.setString(6, obj.getSecret());
            ps.setString(7, obj.getRole());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("delete from utilisateur where iduser=" + id);
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Utilisateur> liste() {
        Utilisateur us = new Utilisateur();
        List<Utilisateur> obj = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from utilisateur");
            while (rs.next()) {
                us.setNom(rs.getString("nom"));
                us.setTelephone(rs.getString("telephone"));
                us.setAdresse(rs.getString("adresse"));
                us.setLogin(rs.getString("login"));
                us.setPassword(rs.getString("password"));
                us.setSecret(rs.getString("secret"));
                us.setRole(rs.getString("role"));
                us.setIduser(rs.getLong("iduser"));
                obj.add(us);
                us = new Utilisateur();
            }

        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;

    }

    public boolean connecter(String login, String password) {
        boolean check = false;
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("Select * from utilisateur where login ='" + login + "'and password='" + password + "'");
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

}
