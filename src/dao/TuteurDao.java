/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Tuteur;
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
public class TuteurDao extends DAO<Tuteur> {

    @Override
    public Tuteur find(long id) {
        Tuteur tt = new Tuteur();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from tuteur where id=" + id);
            if (rs.next()) {
                tt.setId(rs.getInt("id"));
                tt.setId_tuteur(rs.getString("id_tuteur"));
                tt.setNomcomplet(rs.getString("nomcomplet"));
                tt.setTelephone(rs.getString("telephone"));
                tt.setAdresse(rs.getString("adresse"));
                tt.setStatut(rs.getString("statut"));

            }
        } catch (SQLException ex) {
        }
        return tt;
    }

    @Override
    public void add(Tuteur obj) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("INSERT INTO tuteur (id_tuteur,nomcomplet, telephone,adresse,statut)VALUES(?,?,?,?,?)");
            ps.setString(1, obj.getId_tuteur());
            ps.setString(2, obj.getNomcomplet());
            ps.setString(3, obj.getTelephone());
            ps.setString(4, obj.getAdresse());
            ps.setString(5, obj.getStatut());
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(TuteurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Tuteur obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update tuteur set id_tuteur=?, nomcomplet=?, telephone=?, adresse=?, statut=? where id= " + id);
            ps.setString(1, obj.getId_tuteur());
            ps.setString(2, obj.getNomcomplet());
            ps.setString(3, obj.getTelephone());
            ps.setString(4, obj.getAdresse());
            ps.setString(5, obj.getStatut());
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(TuteurDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("delete from Tuteur where id=" + id);
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(TuteurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Tuteur> liste() {
        Tuteur tt = new Tuteur();
        List<Tuteur> obj = new ArrayList<>();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from tuteur order by id asc");
            while (rs.next()) {
                tt.setId(rs.getInt("id"));
                tt.setId_tuteur(rs.getString("id_tuteur"));
                tt.setNomcomplet(rs.getString("nomcomplet"));
                tt.setTelephone(rs.getString("telephone"));
                tt.setAdresse(rs.getString("adresse"));
                tt.setStatut(rs.getString("statut"));
                obj.add(tt);
                tt = new Tuteur();
            }
        } catch (Exception ex) {
            Logger.getLogger(TuteurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    public int getTuteurId(String nom) {
        int id = 0;
        try {
            ResultSet resultat = this.connect.createStatement().executeQuery("Select * from tuteur where id_tuteur='" + nom + "'");
            if (resultat.next()) {
                id = resultat.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
