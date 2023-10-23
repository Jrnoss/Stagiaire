/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Stagiaire;
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
public class StagiaireDao extends DAO<Stagiaire> {

    @Override
    public Stagiaire find(long id) {
        Stagiaire stg = new Stagiaire();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Stagiaire where id=" +id);
            if(rs.next()){
                stg.setId(rs.getLong("id"));
                stg.setPrenom(rs.getString("prenom"));
                stg.setNom(rs.getString("nom"));
                stg.setProvenance(rs.getString("provenance"));
                stg.setTel(rs.getString("telephone"));
                stg.setSpecialite(rs.getString("specialite"));
                stg.setEmail(rs.getString("email"));
                stg.setStatut(rs.getString("statut"));
                stg.setDestination(rs.getString("destination"));
                
                 
            }
        } catch (SQLException ex) {
        }
       return stg; 
    }

    @Override
    public void add(Stagiaire obj) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("INSERT INTO Stagiaire (prenom,nom,provenance,telephone,specialite,email,statut,destination ");
            ps.setString(1, obj.getPrenom());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getProvenance());
            ps.setString(4, obj.getTel());
            ps.setString(5, obj.getSexe());
            ps.setString(6, obj.getEmail());
            ps.setString(7, obj.getStatut());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Stagiaire obj, long id) {
        try {
             PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("update Stagiaire set nom=?, prenom=?, sexe=?,"
                + " telephone=?,provenance=?, specialite=?,email=?,statut=?,destination=?, where id =" +id);
             ps.setString(1, obj.getPrenom());
             ps.setString(2, obj.getNom());
             ps.setString(3, obj.getProvenance());
             ps.setString(4, obj.getSexe());
             ps.setString(5, obj.getSpecialite());
             ps.setString(6, obj.getEmail());
             ps.setString(7, obj.getTel());
             ps.setString(8, obj.getStatut());
             ps.setString(9, obj.getDestination());
             ps.execute();
             

        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("delete from Stagiaire where id=" + id);
        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Stagiaire> liste() {
        Stagiaire stg = new Stagiaire();
        List<Stagiaire> obj = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Stagiaire order by asc");
            while(rs.next()){
                stg.setPrenom(rs.getString("prenom"));
                stg.setNom(rs.getString("nom"));
                stg.setProvenance(rs.getString("provenance"));
                stg.setTel(rs.getString("telephone"));
                stg.setSexe(rs.getString("sexe"));
                stg.setSpecialite(rs.getString("specialite"));
                stg.setStatut(rs.getString("statut"));
                stg.setDestination(rs.getString("destination"));
                obj.add(stg);
                stg = new Stagiaire();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }


    
}
