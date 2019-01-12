/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 *
 * @author Waul
 */
public class Affaire {
    
    private int Id_affaire;
    private int Id_client;
    private int Id_contre;
    private int Id_AvocatContre;
    private Bool Etat_Affaire;
    private String Qualite_plaigant;
    private int Id_Juridiction;
    private String Nature_Affaire;
    private String Objet_Affaire;
    private String Date_Ent_Aff;
    private double Honnoraires_Aff;
    private String Commentaire_Affaire;

    public Affaire(int Id_affaire, int Id_client, int Id_contre, int Id_AvocatContre, Bool Etat_Affaire, String Qualite_plaigant, int Id_Juridiction, String Nature_Affaire, String Objet_Affaire, String Date_Ent_Aff, double Honnoraires_Aff, String Commentaire_Affaire) {
        this.Id_affaire = Id_affaire;
        this.Id_client = Id_client;
        this.Id_contre = Id_contre;
        this.Id_AvocatContre = Id_AvocatContre;
        this.Etat_Affaire = Etat_Affaire;
        this.Qualite_plaigant = Qualite_plaigant;
        this.Id_Juridiction = Id_Juridiction;
        this.Nature_Affaire = Nature_Affaire;
        this.Objet_Affaire = Objet_Affaire;
        this.Date_Ent_Aff = Date_Ent_Aff;
        this.Honnoraires_Aff = Honnoraires_Aff;
        this.Commentaire_Affaire = Commentaire_Affaire;
    }
    
    
    

    public int getId_affaire() {
        return Id_affaire;
    }

    public void setId_affaire(int Id_affaire) {
        this.Id_affaire = Id_affaire;
    }

    public int getId_client() {
        return Id_client;
    }

    public void setId_client(int Id_client) {
        this.Id_client = Id_client;
    }

    public int getId_contre() {
        return Id_contre;
    }

    public void setId_contre(int Id_contre) {
        this.Id_contre = Id_contre;
    }

    public int getId_AvocatContre() {
        return Id_AvocatContre;
    }

    public void setId_AvocatContre(int Id_AvocatContre) {
        this.Id_AvocatContre = Id_AvocatContre;
    }

    public Bool getEtat_Affaire() {
        return Etat_Affaire;
    }

    public void setEtat_Affaire(Bool Etat_Affaire) {
        this.Etat_Affaire = Etat_Affaire;
    }

    public String getQualite_plaigant() {
        return Qualite_plaigant;
    }

    public void setQualite_plaigant(String Qualite_plaigant) {
        this.Qualite_plaigant = Qualite_plaigant;
    }

    public int getId_Juridiction() {
        return Id_Juridiction;
    }

    public void setId_Juridiction(int Id_Juridiction) {
        this.Id_Juridiction = Id_Juridiction;
    }

    public String getNature_Affaire() {
        return Nature_Affaire;
    }

    public void setNature_Affaire(String Nature_Affaire) {
        this.Nature_Affaire = Nature_Affaire;
    }

    public String getObjet_Affaire() {
        return Objet_Affaire;
    }

    public void setObjet_Affaire(String Objet_Affaire) {
        this.Objet_Affaire = Objet_Affaire;
    }

    public String getDate_Ent_Aff() {
        return Date_Ent_Aff;
    }

    public void setDate_Ent_Aff(String Date_Ent_Aff) {
        this.Date_Ent_Aff = Date_Ent_Aff;
    }

    public double getHonnoraires_Aff() {
        return Honnoraires_Aff;
    }

    public void setHonnoraires_Aff(double Honnoraires_Aff) {
        this.Honnoraires_Aff = Honnoraires_Aff;
    }

    public String getCommentaire_Affaire() {
        return Commentaire_Affaire;
    }

    public void setCommentaire_Affaire(String Commentaire_Affaire) {
        this.Commentaire_Affaire = Commentaire_Affaire;
    }
    

    
}
