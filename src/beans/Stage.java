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
public class Stage {
    private Long numero;
    private String date_debut;
     private String type;
    private String theme;
    private String document;
    private String date_fin;

    public Stage() {
    }

    public Stage(String date_debut, String type, String theme, String document, String alerte, String date_fin, String destination) {
        this.date_debut = date_debut;
        this.type = type;
        this.theme = theme;
        this.document = document;
        this.date_fin = date_fin;
    }

    public Stage(Long numero, String date_debut, String type, String theme, String document, String alerte, String date_fin, String destination) {
        this.numero = numero;
        this.date_debut = date_debut;
        this.type = type;
        this.theme = theme;
        this.document = document;
        this.date_fin = date_fin;
    }

    public Stage(String date_debut, String type, String theme, String document, String date_fin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

  
    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

   

    @Override
    public String toString() {
        return "Stage{" + "numero=" + numero + ", date_debut=" + date_debut + ", type=" + type + ", theme=" + theme + ", document=" + document + ", date_fin=" + date_fin + '}';
    }
    
    
    
}
