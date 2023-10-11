/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "utisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utisateur.findAll", query = "SELECT u FROM Utisateur u")
    , @NamedQuery(name = "Utisateur.findById", query = "SELECT u FROM Utisateur u WHERE u.id = :id")
    , @NamedQuery(name = "Utisateur.findByPrenom", query = "SELECT u FROM Utisateur u WHERE u.prenom = :prenom")
    , @NamedQuery(name = "Utisateur.findByNom", query = "SELECT u FROM Utisateur u WHERE u.nom = :nom")
    , @NamedQuery(name = "Utisateur.findByTelephone", query = "SELECT u FROM Utisateur u WHERE u.telephone = :telephone")
    , @NamedQuery(name = "Utisateur.findByEmail", query = "SELECT u FROM Utisateur u WHERE u.email = :email")
    , @NamedQuery(name = "Utisateur.findByPassword", query = "SELECT u FROM Utisateur u WHERE u.password = :password")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public Utilisateur() {
    }

    public Utilisateur(Integer id) {
        this.id = id;
    }

    public Utilisateur(String prenom, String nom, String telephone, String email, String password) {
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }

    
    public Utilisateur(Integer id, String prenom, String nom, String telephone, String email, String password) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Utisateur[ id=" + id + " ]";
    }
    
}
