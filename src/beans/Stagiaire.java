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

    private int id;
    private String matricule;
    private String prenom;
    private String nom;
    private String sexe;
    private String telephone;
    private String competance;
    private String email;
    private String profession;
    private String formation;
    private String ecole; 
    private int id_stage;
    

    public Stagiaire() {
    }

    public Stagiaire(int id, String matricule, String prenom, String nom, String sexe, String telephone, String competance, String email, String profession, String formation, String ecole, int id_stage) {
        this.id = id;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.competance = competance;
        this.email = email;
        this.profession = profession;
        this.formation = formation;
        this.ecole = ecole;
        this.id_stage = id_stage;
    }

    public Stagiaire(String matricule, String prenom, String nom, String sexe, String telephone, String competance, String email, String profession, String formation, String ecole, int id_stage) {
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.competance = competance;
        this.email = email;
        this.profession = profession;
        this.formation = formation;
        this.ecole = ecole;
        this.id_stage = id_stage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCompetance() {
        return competance;
    }

    public void setCompetance(String competance) {
        this.competance = competance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public int getId_stage() {
        return id_stage;
    }

    public void setId_stage(int id_stage) {
        this.id_stage = id_stage;
    }

    @Override
    public String toString() {
        return "Stagiaire{" + "id=" + id + ", matricule=" + matricule + ", prenom=" + prenom + ", nom=" + nom + ", sexe=" + sexe + ", telephone=" + telephone + ", competance=" + competance + ", email=" + email + ", profession=" + profession + ", formation=" + formation + ", ecole=" + ecole + ", id_stage=" + id_stage + '}';
    }

    
}
