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
    private String matricule;
    private String nom;
    private String prenom;
    private String sexe;
    private String tel; 
    private String adresse;
    private String email ;
    private String statut;
    
   
    public Encadreur() {
    }

    public Encadreur(String matricule, String nom, String prenom, String sexe, String tel, String adresse, String email, String statut) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
        this.statut = statut;
    }

    public Encadreur(Long id, String matricule, String nom, String prenom, String sexe, String tel, String adresse, String email, String statut) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
        this.statut = statut;
    }

    public Encadreur(String nom, String prenom, String sexe, String tel, String sexe0, String email, String statut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
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
        return "Encadreur{" + "id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", tel=" + tel + ", adresse=" + adresse + ", email=" + email + ", statut=" + statut + '}';
    }

 

}