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
public class TuteurDao extends DAO<Tuteur>{

    @Override
    public Tuteur find(long id) {
 Tuteur tt = new Tuteur();
        try {
            ResultSet rs = this.connect.createStatement().executeQuery("select * from Tuteur where id=" +id);
            if (rs.next()){
                tt.setId(rs.getLong("id"));
                tt.setNom(rs.getString("nom"));
                tt.setPrenom(rs.getString("prenom"));
                tt.setAdresse(rs.getString("adresse"));
                tt.setTelephone(rs.getString("telephone"));
                tt.setStatut(rs.getString("statut"));
                
            }
        } catch (SQLException ex) {
          }
        return tt;
    }

    @Override
    public void add(Tuteur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Tuteur obj, long id) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("update Stagiaire set prenom=?, nom=?,"
                    + "adresse=?,  telephone=?, statut=?, where id=" +id);
            ps.setString(1, obj.getPrenom());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getTelephone());
            ps.setString(4, obj.getStatut());
            ps.execute();
                    
        } catch (Exception ex) {
            Logger.getLogger(TuteurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void delete(long id) {
        try {
            PreparedStatement ps = (PreparedStatement)this.connect.prepareStatement("delete from Tuteur where id=" + id);
        } catch (Exception ex) {
            Logger.getLogger(TuteurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Tuteur> liste() {
        Tuteur tt = new Tuteur();
        List<Tuteur> obj = new ArrayList<>();
        try {
              ResultSet rs = this.connect.createStatement().executeQuery("select * from Tuteur order by asc");
        while(rs.next()){
            tt.setPrenom(rs.getString("prenom"));
            tt.setNom(rs.getString("nom"));
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
    
}
