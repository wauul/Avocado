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
public class Honoraires {
    
    private int id_hon;
    private int id_aff;
    private String Type_Paiement;
    private String Date_Paiement;
    private double Total;
    private double Paye;
    private double Restant;
    private String Commentaire_hon;

    public Honoraires(int id_hon, int id_aff, String Type_Paiement, String Date_Paiement, double Total, double Paye, double Restant, String Commentaire_hon) {
        this.id_hon = id_hon;
        this.id_aff = id_aff;
        this.Type_Paiement = Type_Paiement;
        this.Date_Paiement = Date_Paiement;
        this.Total = Total;
        this.Paye = Paye;
        this.Restant = Restant;
        this.Commentaire_hon = Commentaire_hon;
    }

    public int getId_hon() {
        return id_hon;
    }

    public void setId_hon(int id_hon) {
        this.id_hon = id_hon;
    }

    public int getId_aff() {
        return id_aff;
    }

    public void setId_aff(int id_aff) {
        this.id_aff = id_aff;
    }

    public String getType_Paiement() {
        return Type_Paiement;
    }

    public void setType_Paiement(String Type_Paiement) {
        this.Type_Paiement = Type_Paiement;
    }

    public String getDate_Paiement() {
        return Date_Paiement;
    }

    public void setDate_Paiement(String Date_Paiement) {
        this.Date_Paiement = Date_Paiement;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getPaye() {
        return Paye;
    }

    public void setPaye(double Paye) {
        this.Paye = Paye;
    }

    public double getRestant() {
        return Restant;
    }

    public void setRestant(double Restant) {
        this.Restant = Restant;
    }

    public String getCommentaire_hon() {
        return Commentaire_hon;
    }

    public void setCommentaire_hon(String Commentaire_hon) {
        this.Commentaire_hon = Commentaire_hon;
    }
    
    
}
