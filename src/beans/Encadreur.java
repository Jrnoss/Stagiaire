package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Encadreur {
    private Long id;
    private String nom;
    private String prenom;
    private String sexe;
    private String tel; 
    private String adresse;
    private String email ;
    private String statut;
   
    public Encadreur() {
    }

    public Encadreur(String nom, String prenom, String sexe, String tel, String adresse, String email, String statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
        this.statut = statut;
    }

    public Encadreur(Long id, String nom, String prenom, String sexe, String tel, String adresse, String email, String statut) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPreom() {
        return prenom;
    }

    public void setPreom(String preom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Encadreur{" + "id=" + id + ", nom=" + nom + ", preom=" + prenom + ", sexe=" + sexe + ", tel=" + tel + ", adresse=" + adresse + ", email=" + email + ", statut=" + statut + '}';
    }

   
    
}
