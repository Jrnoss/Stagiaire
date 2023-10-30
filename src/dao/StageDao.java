/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Stage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class StageDao extends DAO<Stage> {

    SimpleDateFormat amj = new SimpleDateFormat("yyyy/MM/dd");
    @Override
    public Stage find(long id) {
        Stage st = new Stage();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from stage where id=" + id);
            if (rs.next()) {
                st.setId(rs.getInt("id"));
                st.setId_stage(rs.getString("id_stage"));
                st.setTheme(rs.getString("theme"));
                st.setType_stage(rs.getString("type_stage"));
                st.setDocument(rs.getString("document"));
                st.setPath_file(rs.getString("path_file"));
                st.setDate_debut(rs.getDate("date_debut"));
                st.setDate_fin(rs.getDate("date_fin"));
            }

        } catch (Exception ex) {
        }
        return st;
    }

    @Override
    public void add(Stage obj) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("INSERT INTO stage(id_stage, theme, type_stage, document, path_file, date_debut, date_fin) VALUES (?,?,?,?,?,?)");
            ps.setString(1, obj.getId_stage());
            ps.setString(2, obj.getTheme());
            ps.setString(3, obj.getType_stage());
            ps.setString(4, obj.getDocument());
            ps.setString(5, obj.getPath_file());
            ps.setString(6, amj.format(obj.getDate_debut()));
            ps.setString(7, amj.format(obj.getDate_fin()));
            ps.execute();

        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Stage obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update stage set id_stage=?, theme=?, type_stage=?, document=?, path_file=?, date_debut=?, date_fin=? where id=" + id);
            ps.setString(1, obj.getId_stage());
            ps.setString(2, obj.getTheme());
            ps.setString(3, obj.getType_stage());
            ps.setString(4, obj.getDocument());
            ps.setString(5, obj.getPath_file());
            ps.setString(6, amj.format(obj.getDate_debut()));
            ps.setString(7, amj.format(obj.getDate_fin()));
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("delete from stage where id=" + id);
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @Override
    public List<Stage> liste() {
        Stage st = new Stage();
        List<Stage> obj = new ArrayList<>();
        try {

            ResultSet rs = this.connect.createStatement().executeQuery("select * from stage");
            while (rs.next()) {
                st.setId(rs.getInt("id"));
                st.setId_stage(rs.getString("id_stage"));
                st.setTheme(rs.getString("theme"));
                st.setType_stage(rs.getString("type_stage"));
                st.setDocument(rs.getString("document"));
                st.setPath_file(rs.getString("path_file"));
                st.setDate_debut(rs.getDate("date_debut"));
                st.setDate_fin(rs.getDate("date_fin"));
                obj.add(st);
                st = new Stage();
            }
        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public int getIde(String nom) {
        int id = 0;
        try {
            ResultSet resultat = this.connect.createStatement().executeQuery("Select * from stage where id_stage='" + nom + "'");
            if (resultat.next()) {
                id = resultat.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
