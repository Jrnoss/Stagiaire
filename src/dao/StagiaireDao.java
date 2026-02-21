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
            ResultSet rs = this.connect.createStatement().executeQuery("select * from stagiaire where id=" + id);
            if (rs.next()) {
                stg.setId(rs.getInt("id"));
                stg.setMatricule(rs.getString("matricule"));
                stg.setPrenom(rs.getString("prenom"));
                stg.setNom(rs.getString("nom"));
                stg.setSexe(rs.getString("sexe"));
                stg.setTelephone(rs.getString("telephone"));
                stg.setCompetance(rs.getString("competance"));
                stg.setEmail(rs.getString("email"));
                stg.setProfession(rs.getString("profession"));
                stg.setFormation(rs.getString("formation"));
                stg.setEcole(rs.getString("ecole"));
                stg.setId_encadreur(rs.getInt("id_encadreur"));
                stg.setId_tuteur(rs.getInt("id_tuteur"));
//                stg.setId_stage(rs.getInt("stage_id"));

            }
        } catch (SQLException ex) {
        }
        return stg;
    }

    @Override
    public void add(Stagiaire obj) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("INSERT INTO stagiaire(matricule, nom, prenom, "
                    + "telephone,sexe,competance,email,profession,formation,ecole,id_encadreur,id_tuteur)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, obj.getMatricule());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getPrenom());
            ps.setString(4, obj.getTelephone());
            ps.setString(5, obj.getSexe());
            ps.setString(6, obj.getCompetance());
            ps.setString(7, obj.getEmail());
            ps.setString(8, obj.getProfession());
            ps.setString(9, obj.getFormation());
            ps.setString(10, obj.getEcole());
            ps.setInt(11, obj.getId_encadreur());
            ps.setInt(12, obj.getId_tuteur());
//            ps.setInt(11, obj.getId_stage());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Stagiaire obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update stagiaire set matricule=?, nom=?, prenom=?, sexe=?,"
                    + " telephone=?,competance=?,email=?,profession=?,formation=?,ecole=?,id_encadreur=?,id_tuteur=? where id =" + id);
            ps.setString(1, obj.getMatricule());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getPrenom());
            ps.setString(4, obj.getSexe());
            ps.setString(5, obj.getTelephone());
            ps.setString(6, obj.getCompetance());
            ps.setString(7, obj.getEmail());
            ps.setString(8, obj.getProfession());
            ps.setString(9, obj.getFormation());
            ps.setString(10, obj.getEcole());
            ps.setInt(11, obj.getId_encadreur());
            ps.setInt(12, obj.getId_tuteur());
//            ps.setInt(11, obj.getId_stage());
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("delete from stagiaire where id=" + id);
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Stagiaire> liste() {
        Stagiaire stg = new Stagiaire();
        List<Stagiaire> obj = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from stagiaire order by id asc");
            while (rs.next()) {
                stg.setId(rs.getInt("id"));
                stg.setMatricule(rs.getString("matricule"));
                stg.setPrenom(rs.getString("prenom"));
                stg.setNom(rs.getString("nom"));
                stg.setSexe(rs.getString("sexe"));
                stg.setTelephone(rs.getString("telephone"));
                stg.setCompetance(rs.getString("competance"));
                stg.setEmail(rs.getString("email"));
                stg.setProfession(rs.getString("profession"));
                stg.setFormation(rs.getString("formation"));
                stg.setEcole(rs.getString("ecole"));
                stg.setId_encadreur(rs.getInt("id_encadreur"));
                stg.setId_tuteur(rs.getInt("id_tuteur"));
//                stg.setId_stage(rs.getInt("stage_id"));
                obj.add(stg);
                stg = new Stagiaire();
            }

        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public int getstagiaire(String id_stagiaire){
     int id = 0;
        try {
            ResultSet resultat = this.connect.createStatement().executeQuery("Select * from stagiaire where matricule='" + id_stagiaire + "'");
            if (resultat.next()) {
                id = resultat.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
   
  
}
