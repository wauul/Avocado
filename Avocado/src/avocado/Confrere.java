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
public class Confrere {
    
    private int Id_Conf;
    private String Nom_Conf;
    private String prenom_conf;
    private String Profession;
    private String Description;
    private String adresse_conf;
    private String tel_conf;
    private String Email_conf;

    public Confrere(int Id_Conf, String Nom_Conf, String prenom_conf, String Profession, String Description, String adresse_conf, String tel_conf, String Email_conf) {
        this.Id_Conf = Id_Conf;
        this.Nom_Conf = Nom_Conf;
        this.prenom_conf = prenom_conf;
        this.Profession = Profession;
        this.Description = Description;
        this.adresse_conf = adresse_conf;
        this.tel_conf = tel_conf;
        this.Email_conf = Email_conf;
    }

    public int getId_Conf() {
        return Id_Conf;
    }

    public void setId_Conf(int Id_Conf) {
        this.Id_Conf = Id_Conf;
    }

    public String getNom_Conf() {
        return Nom_Conf;
    }

    public void setNom_Conf(String Nom_Conf) {
        this.Nom_Conf = Nom_Conf;
    }

    public String getPrenom_conf() {
        return prenom_conf;
    }

    public void setPrenom_conf(String prenom_conf) {
        this.prenom_conf = prenom_conf;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getAdresse_conf() {
        return adresse_conf;
    }

    public void setAdresse_conf(String adresse_conf) {
        this.adresse_conf = adresse_conf;
    }

    public String getTel_conf() {
        return tel_conf;
    }

    public void setTel_conf(String tel_conf) {
        this.tel_conf = tel_conf;
    }

    public String getEmail_conf() {
        return Email_conf;
    }

    public void setEmail_conf(String Email_conf) {
        this.Email_conf = Email_conf;
    }
    
}
