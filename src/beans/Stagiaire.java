/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author DELL
 */
public class Stagiaire {

    private Long id;
    private String nom;
    private String prenom;
    private String sexe;
    private String tel;
    private String provenance;
    private String email;
    private String specialite;
    private String statut;
    private String destination; 
    

    public Stagiaire() {
    }

    public Stagiaire(String nom, String prenom,String sexe, String tel, String provenance, String email, String specialite, String statut, String destination) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.tel = tel;
        this.provenance = provenance;
        this.email = email;
        this.specialite = specialite;
        this.statut = statut;
        this.destination = destination;
    }

    public Stagiaire(Long id, String nom, String prenom,String sexe, String tel, String provenance, String email, String specialite, String statut, String destination) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.tel = tel;
        this.provenance = provenance;
        this.email = email;
        this.specialite = specialite;
        this.statut = statut;
        this.destination = destination;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
     public String getSexe() {
        return prenom;
    }

    public void setSexe(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Stagiaire{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", tel=" + tel + ", provenance=" + provenance + ", email=" + email + ", specialite=" + specialite + ", statut=" + statut + ", destination=" + destination + '}';
    }

    
}
