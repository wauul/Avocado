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
public class Juridiction {
    
    private int Id_juridiction;
    private String Type_juridiction;
    private String Titre_juridiction;
    private String Add_juridiction;
    private String Tel_juridiction;
    private String Fax_juridiction;

    public Juridiction(int Id_juridiction, String Type_juridiction, String Titre_juridiction, String Add_juridiction, String Tel_juridiction, String Fax_juridiction) {
        this.Id_juridiction = Id_juridiction;
        this.Type_juridiction = Type_juridiction;
        this.Titre_juridiction = Titre_juridiction;
        this.Add_juridiction = Add_juridiction;
        this.Tel_juridiction = Tel_juridiction;
        this.Fax_juridiction = Fax_juridiction;
    }

    Juridiction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_juridiction() {
        return Id_juridiction;
    }

    public void setId_juridiction(int Id_juridiction) {
        this.Id_juridiction = Id_juridiction;
    }

    public String getType_juridiction() {
        return Type_juridiction;
    }

    public void setType_juridiction(String Type_juridiction) {
        this.Type_juridiction = Type_juridiction;
    }

    public String getTitre_juridiction() {
        return Titre_juridiction;
    }

    public void setTitre_juridiction(String Titre_juridiction) {
        this.Titre_juridiction = Titre_juridiction;
    }

    public String getAdd_juridiction() {
        return Add_juridiction;
    }

    public void setAdd_juridiction(String Add_juridiction) {
        this.Add_juridiction = Add_juridiction;
    }

    public String getTel_juridiction() {
        return Tel_juridiction;
    }

    public void setTel_juridiction(String Tel_juridiction) {
        this.Tel_juridiction = Tel_juridiction;
    }

    public String getFax_juridiction() {
        return Fax_juridiction;
    }

    public void setFax_juridiction(String Fax_juridiction) {
        this.Fax_juridiction = Fax_juridiction;
    }
    
}
