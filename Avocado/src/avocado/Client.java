/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Waul
 */
@Entity
@Table(name = "client", catalog = "avocado", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"Num_CarteId"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client_1.findAll", query = "SELECT c FROM Client_1 c")
    , @NamedQuery(name = "Client_1.findByIdCli", query = "SELECT c FROM Client_1 c WHERE c.idCli = :idCli")
    , @NamedQuery(name = "Client_1.findByNomCli", query = "SELECT c FROM Client_1 c WHERE c.nomCli = :nomCli")
    , @NamedQuery(name = "Client_1.findByPrenomCli", query = "SELECT c FROM Client_1 c WHERE c.prenomCli = :prenomCli")
    , @NamedQuery(name = "Client_1.findByDateNaissCli", query = "SELECT c FROM Client_1 c WHERE c.dateNaissCli = :dateNaissCli")
    , @NamedQuery(name = "Client_1.findByTelCli", query = "SELECT c FROM Client_1 c WHERE c.telCli = :telCli")
    , @NamedQuery(name = "Client_1.findByEmailCli", query = "SELECT c FROM Client_1 c WHERE c.emailCli = :emailCli")
    , @NamedQuery(name = "Client_1.findByTypeCarteID", query = "SELECT c FROM Client_1 c WHERE c.typeCarteID = :typeCarteID")
    , @NamedQuery(name = "Client_1.findByNumCarteId", query = "SELECT c FROM Client_1 c WHERE c.numCarteId = :numCarteId")
    , @NamedQuery(name = "Client_1.findByTypeCli", query = "SELECT c FROM Client_1 c WHERE c.typeCli = :typeCli")
    , @NamedQuery(name = "Client_1.findByRaiSocCli", query = "SELECT c FROM Client_1 c WHERE c.raiSocCli = :raiSocCli")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Cli", nullable = false)
    private Integer idCli;
    @Basic(optional = false)
    @Column(name = "Nom_Cli", nullable = false, length = 25)
    private String nomCli;
    @Basic(optional = false)
    @Column(name = "Prenom_Cli", nullable = false, length = 25)
    private String prenomCli;
    @Basic(optional = false)
    @Column(name = "DateNaiss_Cli", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissCli;
    @Basic(optional = false)
    @Lob
    @Column(name = "Add_Cli", nullable = false, length = 2147483647)
    private String addCli;
    @Basic(optional = false)
    @Column(name = "Tel_Cli", nullable = false, length = 10)
    private String telCli;
    @Basic(optional = false)
    @Column(name = "Email_Cli", nullable = false, length = 25)
    private String emailCli;
    @Basic(optional = false)
    @Column(name = "Type_CarteID", nullable = false, length = 27)
    private String typeCarteID;
    @Basic(optional = false)
    @Column(name = "Num_CarteId", nullable = false)
    private int numCarteId;
    @Basic(optional = false)
    @Column(name = "Type_Cli", nullable = false, length = 14)
    private String typeCli;
    @Basic(optional = false)
    @Column(name = "RaiSoc_Cli", nullable = false, length = 30)
    private String raiSocCli;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClient")
    private Collection<Affaires> affairesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idContre")
    private Collection<Affaires> affairesCollection1;

    public Client() {
    }

    public Client(Integer idCli) {
        this.idCli = idCli;
    }

    public Client(Integer idCli, String nomCli, String prenomCli, Date dateNaissCli, String addCli, String telCli, String emailCli, String typeCarteID, int numCarteId, String typeCli, String raiSocCli) {
        this.idCli = idCli;
        this.nomCli = nomCli;
        this.prenomCli = prenomCli;
        this.dateNaissCli = dateNaissCli;
        this.addCli = addCli;
        this.telCli = telCli;
        this.emailCli = emailCli;
        this.typeCarteID = typeCarteID;
        this.numCarteId = numCarteId;
        this.typeCli = typeCli;
        this.raiSocCli = raiSocCli;
    }

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getPrenomCli() {
        return prenomCli;
    }

    public void setPrenomCli(String prenomCli) {
        this.prenomCli = prenomCli;
    }

    public Date getDateNaissCli() {
        return dateNaissCli;
    }

    public void setDateNaissCli(Date dateNaissCli) {
        this.dateNaissCli = dateNaissCli;
    }

    public String getAddCli() {
        return addCli;
    }

    public void setAddCli(String addCli) {
        this.addCli = addCli;
    }

    public String getTelCli() {
        return telCli;
    }

    public void setTelCli(String telCli) {
        this.telCli = telCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public String getTypeCarteID() {
        return typeCarteID;
    }

    public void setTypeCarteID(String typeCarteID) {
        this.typeCarteID = typeCarteID;
    }

    public int getNumCarteId() {
        return numCarteId;
    }

    public void setNumCarteId(int numCarteId) {
        this.numCarteId = numCarteId;
    }

    public String getTypeCli() {
        return typeCli;
    }

    public void setTypeCli(String typeCli) {
        this.typeCli = typeCli;
    }

    public String getRaiSocCli() {
        return raiSocCli;
    }

    public void setRaiSocCli(String raiSocCli) {
        this.raiSocCli = raiSocCli;
    }

    @XmlTransient
    public Collection<Affaires> getAffairesCollection() {
        return affairesCollection;
    }

    public void setAffairesCollection(Collection<Affaires> affairesCollection) {
        this.affairesCollection = affairesCollection;
    }

    @XmlTransient
    public Collection<Affaires> getAffairesCollection1() {
        return affairesCollection1;
    }

    public void setAffairesCollection1(Collection<Affaires> affairesCollection1) {
        this.affairesCollection1 = affairesCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCli != null ? idCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idCli == null && other.idCli != null) || (this.idCli != null && !this.idCli.equals(other.idCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Client_1[ idCli=" + idCli + " ]";
    }
    
}
