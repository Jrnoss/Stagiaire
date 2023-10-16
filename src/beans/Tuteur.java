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
    private Long id;
    private String nomcomplet;
    private String adresse;
    private String telephone;
    private String statut;

    public Tuteur() {
    }

    public Tuteur(String nomcomplet, String adresse, String telephone, String statut) {
        this.nomcomplet = nomcomplet;
        this.adresse = adresse;
        this.telephone = telephone;
        this.statut = statut;
    }

    public Tuteur(Long id, String nomcomplet, String adresse, String telephone, String statut) {
        this.id = id;
        this.nomcomplet = nomcomplet;
        this.adresse = adresse;
        this.telephone = telephone;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Tuteur{" + "id=" + id + ", nomcomplet=" + nomcomplet  + ", adresse=" + adresse + ", telephone=" + telephone + ", statut=" + statut + '}';
    }
    
}
