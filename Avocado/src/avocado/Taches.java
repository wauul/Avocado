/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

/**
 *
 * @author Waul
 */
public class Taches {
    
    private int id_Taches;
    private String Titre_Tache;
    private String Tache;
    private String Date_Tache;

    public Taches(int id_Taches, String Titre_Tache, String Tache, String Date_Tache) {
        this.id_Taches = id_Taches;
        this.Titre_Tache = Titre_Tache;
        this.Tache = Tache;
        this.Date_Tache = Date_Tache;
    }

    public int getId_Taches() {
        return id_Taches;
    }

    public void setId_Taches(int id_Taches) {
        this.id_Taches = id_Taches;
    }

    public String getTitre_Tache() {
        return Titre_Tache;
    }

    public void setTitre_Tache(String Titre_Tache) {
        this.Titre_Tache = Titre_Tache;
    }

    public String getTache() {
        return Tache;
    }

    public void setTache(String Tache) {
        this.Tache = Tache;
    }

    public String getDate_Tache() {
        return Date_Tache;
    }

    public void setDate_Tache(String Date_Tache) {
        this.Date_Tache = Date_Tache;
    }
}
