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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Waul
 */
@Entity
@Table(name = "affaires", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Affaires.findAll", query = "SELECT a FROM Affaires a")
    , @NamedQuery(name = "Affaires.findByIdAff", query = "SELECT a FROM Affaires a WHERE a.idAff = :idAff")
    , @NamedQuery(name = "Affaires.findByEtatAff", query = "SELECT a FROM Affaires a WHERE a.etatAff = :etatAff")
    , @NamedQuery(name = "Affaires.findByQualit\u00e9Plai", query = "SELECT a FROM Affaires a WHERE a.qualit\u00e9Plai = :qualit\u00e9Plai")
    , @NamedQuery(name = "Affaires.findByNatureAff", query = "SELECT a FROM Affaires a WHERE a.natureAff = :natureAff")
    , @NamedQuery(name = "Affaires.findByDateEntAff", query = "SELECT a FROM Affaires a WHERE a.dateEntAff = :dateEntAff")})
public class Affaires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Aff", nullable = false)
    private Integer idAff;
    @Basic(optional = false)
    @Column(name = "Etat_Aff", nullable = false)
    private boolean etatAff;
    @Basic(optional = false)
    @Column(name = "Qualit\u00e9_Plai", nullable = false, length = 21)
    private String qualitéPlai;
    @Basic(optional = false)
    @Column(name = "Nature_Aff", nullable = false, length = 16)
    private String natureAff;
    @Basic(optional = false)
    @Lob
    @Column(name = "Objet", nullable = false, length = 2147483647)
    private String objet;
    @Basic(optional = false)
    @Column(name = "Date_Ent_Aff", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateEntAff;
    @Basic(optional = false)
    @Lob
    @Column(name = "Comm_Aff", nullable = false, length = 2147483647)
    private String commAff;
    @JoinColumn(name = "Id_AvocatContre", referencedColumnName = "Id_Conf", nullable = false)
    @ManyToOne(optional = false)
    private Confreres idAvocatContre;
    @JoinColumn(name = "Id_Client", referencedColumnName = "Id_Cli", nullable = false)
    @ManyToOne(optional = false)
    private Client idClient;
    @JoinColumn(name = "Id_Contre", referencedColumnName = "Id_Cli", nullable = false)
    @ManyToOne(optional = false)
    private Client idContre;
    @JoinColumn(name = "Honnoraires_Aff", referencedColumnName = "Id_Hon", nullable = false)
    @ManyToOne(optional = false)
    private Honoraires honnorairesAff;
    @JoinColumn(name = "Id_Juri", referencedColumnName = "Id_Juri", nullable = false)
    @ManyToOne(optional = false)
    private Juridictions idJuri;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAff")
    private Collection<Audiences> audiencesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAff")
    private Collection<Honoraires> honorairesCollection;

    public Affaires() {
    }

    public Affaires(Integer idAff) {
        this.idAff = idAff;
    }

    public Affaires(Integer idAff, boolean etatAff, String qualitéPlai, String natureAff, String objet, Date dateEntAff, String commAff) {
        this.idAff = idAff;
        this.etatAff = etatAff;
        this.qualitéPlai = qualitéPlai;
        this.natureAff = natureAff;
        this.objet = objet;
        this.dateEntAff = dateEntAff;
        this.commAff = commAff;
    }

    public Integer getIdAff() {
        return idAff;
    }

    public void setIdAff(Integer idAff) {
        this.idAff = idAff;
    }

    public boolean getEtatAff() {
        return etatAff;
    }

    public void setEtatAff(boolean etatAff) {
        this.etatAff = etatAff;
    }

    public String getQualitéPlai() {
        return qualitéPlai;
    }

    public void setQualitéPlai(String qualitéPlai) {
        this.qualitéPlai = qualitéPlai;
    }

    public String getNatureAff() {
        return natureAff;
    }

    public void setNatureAff(String natureAff) {
        this.natureAff = natureAff;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Date getDateEntAff() {
        return dateEntAff;
    }

    public void setDateEntAff(Date dateEntAff) {
        this.dateEntAff = dateEntAff;
    }

    public String getCommAff() {
        return commAff;
    }

    public void setCommAff(String commAff) {
        this.commAff = commAff;
    }

    public Confreres getIdAvocatContre() {
        return idAvocatContre;
    }

    public void setIdAvocatContre(Confreres idAvocatContre) {
        this.idAvocatContre = idAvocatContre;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }

    public Client getIdContre() {
        return idContre;
    }

    public void setIdContre(Client idContre) {
        this.idContre = idContre;
    }

    public Honoraires getHonnorairesAff() {
        return honnorairesAff;
    }

    public void setHonnorairesAff(Honoraires honnorairesAff) {
        this.honnorairesAff = honnorairesAff;
    }

    public Juridictions getIdJuri() {
        return idJuri;
    }

    public void setIdJuri(Juridictions idJuri) {
        this.idJuri = idJuri;
    }

    @XmlTransient
    public Collection<Audiences> getAudiencesCollection() {
        return audiencesCollection;
    }

    public void setAudiencesCollection(Collection<Audiences> audiencesCollection) {
        this.audiencesCollection = audiencesCollection;
    }

    @XmlTransient
    public Collection<Honoraires> getHonorairesCollection() {
        return honorairesCollection;
    }

    public void setHonorairesCollection(Collection<Honoraires> honorairesCollection) {
        this.honorairesCollection = honorairesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAff != null ? idAff.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affaires)) {
            return false;
        }
        Affaires other = (Affaires) object;
        if ((this.idAff == null && other.idAff != null) || (this.idAff != null && !this.idAff.equals(other.idAff))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Affaires[ idAff=" + idAff + " ]";
    }
    
}
