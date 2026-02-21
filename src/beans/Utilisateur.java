/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
public class Utilisateur {
    private Long iduser;
    private String nom;
    private String telephone;
    private String adresse;
    private String login;
    private String password;
    private String secret;
    private String role;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String telephone, String adresse, String login, String password, String secret, String role) {
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.login = login;
        this.password = password;
        this.secret = secret;
        this.role = role;
    }

    public Utilisateur(Long iduser, String nom, String telephone, String adresse, String login, String password, String secret, String role) {
        this.iduser = iduser;
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.login = login;
        this.password = password;
        this.secret = secret;
        this.role = role;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

   

    @Override
    public String toString() {
        return "Utilisateur{" + "iduser=" + iduser + ", nom=" + nom + ", telephone=" + telephone + ", adresse=" + adresse + ", login=" + login + ", password=" + password + ", secret=" + secret + ", role=" + role + "}";
    }

  

    
}
