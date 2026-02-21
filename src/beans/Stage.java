/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Stage {
    private Long id;
    private String id_stage;
    private Date date_debut;
    private String theme;
    private String type_stage;
    private String document;
    private String path_file;
    private Date date_fin;
    private int id_stagiaire;

    public Stage() {
    }

    public Stage(String id_stage, Date date_debut, String theme, String type_stage, String document, String path_file, Date date_fin, int id_stagiaire) {
        this.id_stage = id_stage;
        this.date_debut = date_debut;
        this.theme = theme;
        this.type_stage = type_stage;
        this.document = document;
        this.path_file = path_file;
        this.date_fin = date_fin;
        this.id_stagiaire = id_stagiaire;
    }

    public Stage(Long id, String id_stage, Date date_debut, String theme, String type_stage, String document, String path_file, Date date_fin, int id_stagiaire) {
        this.id = id;
        this.id_stage = id_stage;
        this.date_debut = date_debut;
        this.theme = theme;
        this.type_stage = type_stage;
        this.document = document;
        this.path_file = path_file;
        this.date_fin = date_fin;
        this.id_stagiaire = id_stagiaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_stage() {
        return id_stage;
    }

    public void setId_stage(String id_stage) {
        this.id_stage = id_stage;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getType_stage() {
        return type_stage;
    }

    public void setType_stage(String type_stage) {
        this.type_stage = type_stage;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPath_file() {
        return path_file;
    }

    public void setPath_file(String path_file) {
        this.path_file = path_file;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public int getId_stagiaire() {
        return id_stagiaire;
    }

    public void setId_stagiaire(int id_stagiaire) {
        this.id_stagiaire = id_stagiaire;
    }

    @Override
    public String toString() {
        return "Stage{" + "id=" + id + ", id_stage=" + id_stage + ", date_debut=" + date_debut + ", theme=" + theme + ", type_stage=" + type_stage + ", document=" + document + ", path_file=" + path_file + ", date_fin=" + date_fin + ", id_stagiaire=" + id_stagiaire + '}';
    }

}