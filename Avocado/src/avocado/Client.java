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
public class Client {
    
    private int Id_Client;
    private String Nom_Client;
    private String Prenom_Client;
    private String DateNaiss_Cli;
    private String Add_Cli;
    private String tel_cli;
    private String Email_cli;
    private String Type_Id;
    private int Num_Id;
    private String type_Cli;
    private String Raison_Social;

    public Client(int Id_Client, String Nom_Client, String Prenom_Client, String DateNaiss_Cli, String Add_Cli, String tel_cli, String Email_cli, String Type_Id, int Num_Id, String type_Cli, String Raison_Social) {
        this.Id_Client = Id_Client;
        this.Nom_Client = Nom_Client;
        this.Prenom_Client = Prenom_Client;
        this.DateNaiss_Cli = DateNaiss_Cli;
        this.Add_Cli = Add_Cli;
        this.tel_cli = tel_cli;
        this.Email_cli = Email_cli;
        this.Type_Id = Type_Id;
        this.Num_Id = Num_Id;
        this.type_Cli = type_Cli;
        this.Raison_Social = Raison_Social;
    }

    public int getId_Client() {
        return Id_Client;
    }

    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
    }

    public String getNom_Client() {
        return Nom_Client;
    }

    public void setNom_Client(String Nom_Client) {
        this.Nom_Client = Nom_Client;
    }

    public String getPrenom_Client() {
        return Prenom_Client;
    }

    public void setPrenom_Client(String Prenom_Client) {
        this.Prenom_Client = Prenom_Client;
    }

    public String getDateNaiss_Cli() {
        return DateNaiss_Cli;
    }

    public void setDateNaiss_Cli(String DateNaiss_Cli) {
        this.DateNaiss_Cli = DateNaiss_Cli;
    }

    public String getAdd_Cli() {
        return Add_Cli;
    }

    public void setAdd_Cli(String Add_Cli) {
        this.Add_Cli = Add_Cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getEmail_cli() {
        return Email_cli;
    }

    public void setEmail_cli(String Email_cli) {
        this.Email_cli = Email_cli;
    }

    public String getType_Id() {
        return Type_Id;
    }

    public void setType_Id(String Type_Id) {
        this.Type_Id = Type_Id;
    }

    public int getNum_Id() {
        return Num_Id;
    }

    public void setNum_Id(int Num_Id) {
        this.Num_Id = Num_Id;
    }

    public String getType_Cli() {
        return type_Cli;
    }

    public void setType_Cli(String type_Cli) {
        this.type_Cli = type_Cli;
    }

    public String getRaison_Social() {
        return Raison_Social;
    }

    public void setRaison_Social(String Raison_Social) {
        this.Raison_Social = Raison_Social;
    }
    
    
    
    
}
