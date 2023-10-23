/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Encadreur;
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
public class EncadreurDao extends DAO<Encadreur>{

    @Override
    public Encadreur find(long id) {
    Encadreur enc = new Encadreur();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Stagiaire where id=" +id);
            if(rs.next()){
                enc.setId(rs.getLong("id"));
                enc.setNom(rs.getString("nom"));
                enc.setPreom(rs.getString("prenom"));
                enc.setSexe(rs.getString("sexe"));
                enc.setTel(rs.getString("telephone"));
                enc.setAdresse(rs.getString("adresse"));
                enc.setEmail(rs.getString("email"));
                enc.setStatut(rs.getString("statut"));
            }
            
        } catch (SQLException ex) {
        }
        return enc;
    }

    @Override
    public void add(Encadreur obj) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("INSERT INTO Encadreur (nom,prenom,sexe,telephone,adresse,email,statut) VALUES(?,?,?,?,?,?,?");
            ps.setString(1, obj.getPreom());
            ps.setString(2, obj.getNom());
            ps.setString(4, obj.getSexe());
            ps.setString(3, obj.getTel());
            ps.setString(6, obj.getEmail());
            ps.setString(7, obj.getStatut());
            ps.execute();
           
                    
        } catch (Exception ex) {
            Logger.getLogger(EncadreurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Encadreur obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update encadreur set nom=?," + " prenom=?,"
                    + " telephone=?,sexe=?, adresse=?, email=?, statut=? where id= " +id );
            ps.setString(1, obj.getPreom());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getSexe());
            ps.setString(4, obj.getTel());
            ps.setString(5, obj.getAdresse());
            ps.setString(6, obj.getStatut());
            ps.execute();
            
        } catch (Exception ex) {
            Logger.getLogger(EncadreurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
                PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("delete from Encadreur where id="+ id);

        } catch (Exception ex) {
            Logger.getLogger(EncadreurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Encadreur> liste() {
        Encadreur enc = new Encadreur();
        List<Encadreur> obj = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Encadreur order by asc");
            while(rs.next()){
            enc.setPreom(rs.getString(""));
            enc.setNom(rs.getString("nom"));
            enc.setSexe(rs.getString("sexe"));
            enc.setTel(rs.getString("telephone"));
            enc.setEmail(rs.getString("email"));
            enc.setStatut(rs.getString("statut"));
            obj.add(enc);
            enc = new Encadreur();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(EncadreurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
}
