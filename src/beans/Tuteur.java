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
public class Tuteur {
    private int id;
    private String id_tuteur;
    private String nomcomplet;
    private String adresse;
    private String telephone;
    private String statut;

    public Tuteur() {
    }

    public Tuteur(int id, String id_tuteur, String nomcomplet, String adresse, String telephone, String statut) {
        this.id = id;
        this.id_tuteur = id_tuteur;
        this.nomcomplet = nomcomplet;
        this.adresse = adresse;
        this.telephone = telephone;
        this.statut = statut;
    }

    public Tuteur(String id_tuteur, String nomcomplet, String adresse, String telephone, String statut) {
        this.id_tuteur = id_tuteur;
        this.nomcomplet = nomcomplet;
        this.adresse = adresse;
        this.telephone = telephone;
        this.statut = statut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_tuteur() {
        return id_tuteur;
    }

    public void setId_tuteur(String id_tuteur) {
        this.id_tuteur = id_tuteur;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Tuteur{" + "id=" + id + ", id_tuteur=" + id_tuteur + ", nomcomplet=" + nomcomplet + ", adresse=" + adresse + ", telephone=" + telephone + ", statut=" + statut + '}';
    }

   

  
   
    
}
