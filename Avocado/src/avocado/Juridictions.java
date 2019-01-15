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
@Table(name = "juridictions", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juridictions.findAll", query = "SELECT j FROM Juridictions j")
    , @NamedQuery(name = "Juridictions.findByIdJuri", query = "SELECT j FROM Juridictions j WHERE j.idJuri = :idJuri")
    , @NamedQuery(name = "Juridictions.findByTypeJuri", query = "SELECT j FROM Juridictions j WHERE j.typeJuri = :typeJuri")
    , @NamedQuery(name = "Juridictions.findByTitreJuri", query = "SELECT j FROM Juridictions j WHERE j.titreJuri = :titreJuri")
    , @NamedQuery(name = "Juridictions.findByTelJuri", query = "SELECT j FROM Juridictions j WHERE j.telJuri = :telJuri")
    , @NamedQuery(name = "Juridictions.findByFaxJuri", query = "SELECT j FROM Juridictions j WHERE j.faxJuri = :faxJuri")})
public class Juridictions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Juri", nullable = false)
    private Integer idJuri;
    @Basic(optional = false)
    @Column(name = "Type_Juri", nullable = false, length = 65)
    private String typeJuri;
    @Basic(optional = false)
    @Column(name = "Titre_Juri", nullable = false, length = 25)
    private String titreJuri;
    @Basic(optional = false)
    @Lob
    @Column(name = "Add_Juri", nullable = false, length = 2147483647)
    private String addJuri;
    @Basic(optional = false)
    @Column(name = "Tel_Juri", nullable = false, length = 10)
    private String telJuri;
    @Basic(optional = false)
    @Column(name = "Fax_Juri", nullable = false, length = 10)
    private String faxJuri;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJuri")
    private Collection<Affaires> affairesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJuri")
    private Collection<Audiences> audiencesCollection;

    public Juridictions() {
    }

    public Juridictions(Integer idJuri) {
        this.idJuri = idJuri;
    }

    public Juridictions(Integer idJuri, String typeJuri, String titreJuri, String addJuri, String telJuri, String faxJuri) {
        this.idJuri = idJuri;
        this.typeJuri = typeJuri;
        this.titreJuri = titreJuri;
        this.addJuri = addJuri;
        this.telJuri = telJuri;
        this.faxJuri = faxJuri;
    }

    public Integer getIdJuri() {
        return idJuri;
    }

    public void setIdJuri(Integer idJuri) {
        this.idJuri = idJuri;
    }

    public String getTypeJuri() {
        return typeJuri;
    }

    public void setTypeJuri(String typeJuri) {
        this.typeJuri = typeJuri;
    }

    public String getTitreJuri() {
        return titreJuri;
    }

    public void setTitreJuri(String titreJuri) {
        this.titreJuri = titreJuri;
    }

    public String getAddJuri() {
        return addJuri;
    }

    public void setAddJuri(String addJuri) {
        this.addJuri = addJuri;
    }

    public String getTelJuri() {
        return telJuri;
    }

    public void setTelJuri(String telJuri) {
        this.telJuri = telJuri;
    }

    public String getFaxJuri() {
        return faxJuri;
    }

    public void setFaxJuri(String faxJuri) {
        this.faxJuri = faxJuri;
    }

    @XmlTransient
    public Collection<Affaires> getAffairesCollection() {
        return affairesCollection;
    }

    public void setAffairesCollection(Collection<Affaires> affairesCollection) {
        this.affairesCollection = affairesCollection;
    }

    @XmlTransient
    public Collection<Audiences> getAudiencesCollection() {
        return audiencesCollection;
    }

    public void setAudiencesCollection(Collection<Audiences> audiencesCollection) {
        this.audiencesCollection = audiencesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJuri != null ? idJuri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juridictions)) {
            return false;
        }
        Juridictions other = (Juridictions) object;
        if ((this.idJuri == null && other.idJuri != null) || (this.idJuri != null && !this.idJuri.equals(other.idJuri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Juridictions[ idJuri=" + idJuri + " ]";
    }
    
}
