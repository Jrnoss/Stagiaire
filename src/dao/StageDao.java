/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Stage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class StageDao extends DAO<Stage>{

    @Override
    public Stage find(long id) {
        Stage st = new Stage(); 
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Stage where id=" +id);
            if(rs.next()){
                st.setNumero(rs.getLong("numero"));
                st.setDate_debut(rs.getString("date_debut"));
                st.setTheme(rs.getString("theme"));
                st.setType(rs.getString("type"));
                st.setDocument(rs.getString("document"));
            }
            
        } catch (Exception ex) {
        }
        return st;
    }

    @Override
    public void add(Stage obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Stage obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement) this.connect.prepareStatement("update stage set date_debut=?,theme=?, type=?,"
                    + "document=? where numero=" +id);
            ps.setString(1, obj.getDate_debut());
            ps.setString(2, obj.getTheme());
            ps.setString(3, obj.getType());
            ps.setString(4, obj.getDocument());
            ps.setString(6, obj.getDate_fin());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("delete from Stage where id=" + id);
        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE, null, ex);
                    
        }
    }

    @Override
    public List<Stage> liste() {
        Stage st = new Stage();
        List<Stage> obj = new ArrayList<>();
        try {
            
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Stage order by asc");
            while(rs.next()){
            st.setDate_debut(rs.getString("date debut"));
            st.setTheme(rs.getString("theme"));
            st.setType(rs.getString("type"));
            st.setDocument(rs.getString("document"));
            st.setDate_fin(rs.getString("date fin"));
            obj.add(st);
            st = new Stage();
            }
        } catch (Exception ex) {
            Logger.getLogger(StageDao.class.getName()).log(Level.SEVERE,null, ex);
        }
        return obj;
    }

      
}
