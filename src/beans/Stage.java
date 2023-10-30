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
    private int id;
    private String id_stage;
    private String type_stage;
    private String theme;
    private String document;
    private String path_file;
    private Date date_debut;
    private Date date_fin;

    public Stage() {
    }

    public Stage(int id, String id_stage, String type_stage, String theme, String document, String path_file, Date date_debut, Date date_fin) {
        this.id = id;
        this.id_stage = id_stage;
        this.type_stage = type_stage;
        this.theme = theme;
        this.document = document;
        this.path_file = path_file;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public Stage(String id_stage, String type_stage, String theme, String document, String path_file, Date date_debut, Date date_fin) {
        this.id_stage = id_stage;
        this.type_stage = type_stage;
        this.theme = theme;
        this.document = document;
        this.path_file = path_file;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_stage() {
        return id_stage;
    }

    public void setId_stage(String id_stage) {
        this.id_stage = id_stage;
    }

    public String getType_stage() {
        return type_stage;
    }

    public void setType_stage(String type_stage) {
        this.type_stage = type_stage;
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

    public String getPath_file() {
        return path_file;
    }

    public void setPath_file(String path_file) {
        this.path_file = path_file;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "Stage{" + "id=" + id + ", id_stage=" + id_stage + ", type_stage=" + type_stage + ", theme=" + theme + ", document=" + document + ", path_file=" + path_file + ", date_debut=" + date_debut + ", date_fin=" + date_fin + '}';
    }

    
}
