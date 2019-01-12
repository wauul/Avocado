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
public class Audience {
    
    private int Id_Aud;
    private int Id_Aff;
    private int Id_Juri;
    private String Date_Aud;
    private String Heure_Aud;
    private int Id_Substitue ;
    private int  Id_EnCharge;
    private String Statut ;
    private String Comm ;

    public Audience(int Id_Aud, int Id_Aff, int Id_Juri, String Date_Aud, String Heure_Aud, int Id_Substitue, int Id_EnCharge, String Statut, String Comm) {
        this.Id_Aud = Id_Aud;
        this.Id_Aff = Id_Aff;
        this.Id_Juri = Id_Juri;
        this.Date_Aud = Date_Aud;
        this.Heure_Aud = Heure_Aud;
        this.Id_Substitue = Id_Substitue;
        this.Id_EnCharge = Id_EnCharge;
        this.Statut = Statut;
        this.Comm = Comm;
    }

    public int getId_Aud() {
        return Id_Aud;
    }

    public void setId_Aud(int Id_Aud) {
        this.Id_Aud = Id_Aud;
    }

    public int getId_Aff() {
        return Id_Aff;
    }

    public void setId_Aff(int Id_Aff) {
        this.Id_Aff = Id_Aff;
    }

    public int getId_Juri() {
        return Id_Juri;
    }

    public void setId_Juri(int Id_Juri) {
        this.Id_Juri = Id_Juri;
    }

    public String getDate_Aud() {
        return Date_Aud;
    }

    public void setDate_Aud(String Date_Aud) {
        this.Date_Aud = Date_Aud;
    }

    public String getHeure_Aud() {
        return Heure_Aud;
    }

    public void setHeure_Aud(String Heure_Aud) {
        this.Heure_Aud = Heure_Aud;
    }

    public int getId_Substitue() {
        return Id_Substitue;
    }

    public void setId_Substitue(int Id_Substitue) {
        this.Id_Substitue = Id_Substitue;
    }

    public int getId_EnCharge() {
        return Id_EnCharge;
    }

    public void setId_EnCharge(int Id_EnCharge) {
        this.Id_EnCharge = Id_EnCharge;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String Statut) {
        this.Statut = Statut;
    }

    public String getComm() {
        return Comm;
    }

    public void setComm(String Comm) {
        this.Comm = Comm;
    }
    
    
}
