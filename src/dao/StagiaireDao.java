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
                stg.setId_stage(rs.getInt("stage_id"));

            }
        } catch (SQLException ex) {
        }
        return stg;
    }

    @Override
    public void add(Stagiaire obj) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("INSERT INTO stagiaire(matricule, prenom, nom, sexe, telephone, competance, email, profession, formation, ecole, stage_id)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, obj.getMatricule());
            ps.setString(2, obj.getPrenom());
            ps.setString(3, obj.getNom());
            ps.setString(4, obj.getSexe());
            ps.setString(5, obj.getTelephone());
            ps.setString(6, obj.getCompetance());
            ps.setString(7, obj.getEmail());
            ps.setString(8, obj.getProfession());
            ps.setString(9, obj.getFormation());
            ps.setString(10, obj.getEcole());
            ps.setInt(11, obj.getId_stage());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Stagiaire obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update stagiaire set matricule=?, prenom=?, nom=?, sexe=?,"
                    + " telephone=?, competance=?, email=?, profession=?, formation=?, ecole=?, stage_id=? where id =" + id);
            ps.setString(1, obj.getMatricule());
            ps.setString(2, obj.getPrenom());
            ps.setString(3, obj.getNom());
            ps.setString(4, obj.getSexe());
            ps.setString(5, obj.getTelephone());
            ps.setString(6, obj.getCompetance());
            ps.setString(7, obj.getEmail());
            ps.setString(8, obj.getProfession());
            ps.setString(9, obj.getFormation());
            ps.setString(10, obj.getEcole());
            ps.setInt(11, obj.getId_stage());
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
            ResultSet rs = this.connect.createStatement().executeQuery("select * from stagiaire order by matricule asc");
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
                stg.setId_stage(rs.getInt("stage_id"));
                obj.add(stg);
                stg = new Stagiaire();
            }

        } catch (Exception ex) {
            Logger.getLogger(StagiaireDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

}
