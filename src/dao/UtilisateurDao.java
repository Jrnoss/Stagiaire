
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
public class UtilisateurDao extends DAO<Utilisateur>{

    @Override
    public Utilisateur find(long id) {
        Utilisateur us = new Utilisateur();
        try {
             ResultSet rs = this.connect.createStatement().executeQuery("select * from Utilisateur where id=" +id);
        if(rs.next()){
            us.setId(rs.getInt("id"));
            us.setPrenom(rs.getString("prenom"));
            us.setNom(rs.getString("nom"));
            us.setTelephone(rs.getString("telephone"));
            us.setEmail(rs.getString("email"));
            us.setPassword(rs.getString("password"));
        }
      
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return us;
    }

    @Override
    public void add(Utilisateur obj) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("INSERT INTO Utilisateur (prenom, nom, telephone, email, passeword) VALUES (?,?,?,?,?");
            ps.setString(1, obj.getNom());
            ps.setString(2, obj.getPrenom());
            ps.setString(3, obj.getTelephone());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getPassword());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void edit(Utilisateur obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("update Utilisateur set prenom=?, nom=?,"
                    + " telephone=?, email=?, password=?, id=" +id);
            ps.setString(1, obj.getPrenom());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getTelephone());
            ps.setString(4, obj.getPassword());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("delete from Utilisateur where id=" +id);
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Utilisateur> liste() {
        Utilisateur us = new Utilisateur();
        List<Utilisateur> obj = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Utilisateur order by asc ");
            while(rs.next()){
                us.setPrenom(rs.getString("prenom"));
                us.setNom(rs.getString("nom"));
                us.setTelephone(rs.getString("telephone"));
                us.setEmail(rs.getString("email"));
                us.setPassword(rs.getString("password"));
                obj.add(us);
                us =new Utilisateur();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
       
    }

    public void add(Stage st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }