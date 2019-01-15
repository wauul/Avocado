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
@Table(name = "honoraires", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Honoraires.findAll", query = "SELECT h FROM Honoraires h")
    , @NamedQuery(name = "Honoraires.findByIdHon", query = "SELECT h FROM Honoraires h WHERE h.idHon = :idHon")
    , @NamedQuery(name = "Honoraires.findByTypePaiement", query = "SELECT h FROM Honoraires h WHERE h.typePaiement = :typePaiement")
    , @NamedQuery(name = "Honoraires.findByDatePaiement", query = "SELECT h FROM Honoraires h WHERE h.datePaiement = :datePaiement")
    , @NamedQuery(name = "Honoraires.findByHeurePaie", query = "SELECT h FROM Honoraires h WHERE h.heurePaie = :heurePaie")
    , @NamedQuery(name = "Honoraires.findByTotalPaiement", query = "SELECT h FROM Honoraires h WHERE h.totalPaiement = :totalPaiement")
    , @NamedQuery(name = "Honoraires.findByRestePaiement", query = "SELECT h FROM Honoraires h WHERE h.restePaiement = :restePaiement")
    , @NamedQuery(name = "Honoraires.findByMontantPaiement", query = "SELECT h FROM Honoraires h WHERE h.montantPaiement = :montantPaiement")})
public class Honoraires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Hon", nullable = false)
    private Integer idHon;
    @Basic(optional = false)
    @Column(name = "Type_Paiement", nullable = false, length = 8)
    private String typePaiement;
    @Basic(optional = false)
    @Column(name = "Date_Paiement", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datePaiement;
    @Basic(optional = false)
    @Column(name = "Heure_Paie", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date heurePaie;
    @Basic(optional = false)
    @Column(name = "Total_Paiement", nullable = false)
    private double totalPaiement;
    @Basic(optional = false)
    @Column(name = "Reste_Paiement", nullable = false)
    private double restePaiement;
    @Basic(optional = false)
    @Column(name = "Montant_Paiement", nullable = false)
    private double montantPaiement;
    @Lob
    @Column(name = "Comm_Hon", length = 2147483647)
    private String commHon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "honnorairesAff")
    private Collection<Affaires> affairesCollection;
    @JoinColumn(name = "Id_Aff", referencedColumnName = "Id_Aff", nullable = false)
    @ManyToOne(optional = false)
    private Affaires idAff;

    public Honoraires() {
    }

    public Honoraires(Integer idHon) {
        this.idHon = idHon;
    }

    public Honoraires(Integer idHon, String typePaiement, Date datePaiement, Date heurePaie, double totalPaiement, double restePaiement, double montantPaiement) {
        this.idHon = idHon;
        this.typePaiement = typePaiement;
        this.datePaiement = datePaiement;
        this.heurePaie = heurePaie;
        this.totalPaiement = totalPaiement;
        this.restePaiement = restePaiement;
        this.montantPaiement = montantPaiement;
    }

    public Integer getIdHon() {
        return idHon;
    }

    public void setIdHon(Integer idHon) {
        this.idHon = idHon;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Date getHeurePaie() {
        return heurePaie;
    }

    public void setHeurePaie(Date heurePaie) {
        this.heurePaie = heurePaie;
    }

    public double getTotalPaiement() {
        return totalPaiement;
    }

    public void setTotalPaiement(double totalPaiement) {
        this.totalPaiement = totalPaiement;
    }

    public double getRestePaiement() {
        return restePaiement;
    }

    public void setRestePaiement(double restePaiement) {
        this.restePaiement = restePaiement;
    }

    public double getMontantPaiement() {
        return montantPaiement;
    }

    public void setMontantPaiement(double montantPaiement) {
        this.montantPaiement = montantPaiement;
    }

    public String getCommHon() {
        return commHon;
    }

    public void setCommHon(String commHon) {
        this.commHon = commHon;
    }

    @XmlTransient
    public Collection<Affaires> getAffairesCollection() {
        return affairesCollection;
    }

    public void setAffairesCollection(Collection<Affaires> affairesCollection) {
        this.affairesCollection = affairesCollection;
    }

    public Affaires getIdAff() {
        return idAff;
    }

    public void setIdAff(Affaires idAff) {
        this.idAff = idAff;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHon != null ? idHon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Honoraires)) {
            return false;
        }
        Honoraires other = (Honoraires) object;
        if ((this.idHon == null && other.idHon != null) || (this.idHon != null && !this.idHon.equals(other.idHon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Honoraires[ idHon=" + idHon + " ]";
    }
    
}
