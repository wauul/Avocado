/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Waul
 */
@Entity
@Table(name = "confreres", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Confreres.findAll", query = "SELECT c FROM Confreres c")
    , @NamedQuery(name = "Confreres.findByIdConf", query = "SELECT c FROM Confreres c WHERE c.idConf = :idConf")
    , @NamedQuery(name = "Confreres.findByTypeConf", query = "SELECT c FROM Confreres c WHERE c.typeConf = :typeConf")
    , @NamedQuery(name = "Confreres.findByNomConf", query = "SELECT c FROM Confreres c WHERE c.nomConf = :nomConf")
    , @NamedQuery(name = "Confreres.findByPrenomConf", query = "SELECT c FROM Confreres c WHERE c.prenomConf = :prenomConf")
    , @NamedQuery(name = "Confreres.findByTelConf", query = "SELECT c FROM Confreres c WHERE c.telConf = :telConf")
    , @NamedQuery(name = "Confreres.findByEmailConf", query = "SELECT c FROM Confreres c WHERE c.emailConf = :emailConf")})
public class Confreres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Conf", nullable = false)
    private Integer idConf;
    @Basic(optional = false)
    @Column(name = "Type_Conf", nullable = false, length = 40)
    private String typeConf;
    @Basic(optional = false)
    @Column(name = "Nom_Conf", nullable = false, length = 25)
    private String nomConf;
    @Basic(optional = false)
    @Column(name = "Prenom_Conf", nullable = false, length = 25)
    private String prenomConf;
    @Basic(optional = false)
    @Lob
    @Column(name = "Add_Conf", nullable = false, length = 2147483647)
    private String addConf;
    @Basic(optional = false)
    @Column(name = "Tel_Conf", nullable = false, length = 10)
    private String telConf;
    @Basic(optional = false)
    @Column(name = "Email_Conf", nullable = false, length = 25)
    private String emailConf;
    @Lob
    @Column(name = "Description", length = 2147483647)
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAvocatContre")
    private Collection<Affaires> affairesCollection;
    @OneToMany(mappedBy = "idAvoc")
    private Collection<Utilisateur> utilisateurCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResp")
    private Collection<Audiences> audiencesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSub")
    private Collection<Audiences> audiencesCollection1;

    public Confreres() {
    }

    public Confreres(Integer idConf) {
        this.idConf = idConf;
    }

    public Confreres(Integer idConf, String typeConf, String nomConf, String prenomConf, String addConf, String telConf, String emailConf) {
        this.idConf = idConf;
        this.typeConf = typeConf;
        this.nomConf = nomConf;
        this.prenomConf = prenomConf;
        this.addConf = addConf;
        this.telConf = telConf;
        this.emailConf = emailConf;
    }

    public Integer getIdConf() {
        return idConf;
    }

    public void setIdConf(Integer idConf) {
        this.idConf = idConf;
    }

    public String getTypeConf() {
        return typeConf;
    }

    public void setTypeConf(String typeConf) {
        this.typeConf = typeConf;
    }

    public String getNomConf() {
        return nomConf;
    }

    public void setNomConf(String nomConf) {
        this.nomConf = nomConf;
    }

    public String getPrenomConf() {
        return prenomConf;
    }

    public void setPrenomConf(String prenomConf) {
        this.prenomConf = prenomConf;
    }

    public String getAddConf() {
        return addConf;
    }

    public void setAddConf(String addConf) {
        this.addConf = addConf;
    }

    public String getTelConf() {
        return telConf;
    }

    public void setTelConf(String telConf) {
        this.telConf = telConf;
    }

    public String getEmailConf() {
        return emailConf;
    }

    public void setEmailConf(String emailConf) {
        this.emailConf = emailConf;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Affaires> getAffairesCollection() {
        return affairesCollection;
    }

    public void setAffairesCollection(Collection<Affaires> affairesCollection) {
        this.affairesCollection = affairesCollection;
    }

    @XmlTransient
    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    @XmlTransient
    public Collection<Audiences> getAudiencesCollection() {
        return audiencesCollection;
    }

    public void setAudiencesCollection(Collection<Audiences> audiencesCollection) {
        this.audiencesCollection = audiencesCollection;
    }

    @XmlTransient
    public Collection<Audiences> getAudiencesCollection1() {
        return audiencesCollection1;
    }

    public void setAudiencesCollection1(Collection<Audiences> audiencesCollection1) {
        this.audiencesCollection1 = audiencesCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConf != null ? idConf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Confreres)) {
            return false;
        }
        Confreres other = (Confreres) object;
        if ((this.idConf == null && other.idConf != null) || (this.idConf != null && !this.idConf.equals(other.idConf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Confreres[ idConf=" + idConf + " ]";
    }
    
}
