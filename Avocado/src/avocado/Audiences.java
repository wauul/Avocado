/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Waul
 */
@Entity
@Table(name = "audiences", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Audiences.findAll", query = "SELECT a FROM Audiences a")
    , @NamedQuery(name = "Audiences.findByIdAud", query = "SELECT a FROM Audiences a WHERE a.idAud = :idAud")
    , @NamedQuery(name = "Audiences.findByDateAud", query = "SELECT a FROM Audiences a WHERE a.dateAud = :dateAud")
    , @NamedQuery(name = "Audiences.findByStatutAud", query = "SELECT a FROM Audiences a WHERE a.statutAud = :statutAud")})
public class Audiences implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Aud", nullable = false)
    private Integer idAud;
    @Basic(optional = false)
    @Column(name = "Date_Aud", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateAud;
    @Basic(optional = false)
    @Column(name = "Statut_Aud", nullable = false, length = 20)
    private String statutAud;
    @Lob
    @Column(name = "Comm_Aud", length = 2147483647)
    private String commAud;
    @JoinColumn(name = "Id_Aff", referencedColumnName = "Id_Aff", nullable = false)
    @ManyToOne(optional = false)
    private Affaires idAff;
    @JoinColumn(name = "Id_Juri", referencedColumnName = "Id_Juri", nullable = false)
    @ManyToOne(optional = false)
    private Juridictions idJuri;
    @JoinColumn(name = "Id_Resp", referencedColumnName = "Id_Conf", nullable = false)
    @ManyToOne(optional = false)
    private Confreres idResp;
    @JoinColumn(name = "Id_Sub", referencedColumnName = "Id_Conf", nullable = false)
    @ManyToOne(optional = false)
    private Confreres idSub;

    public Audiences() {
    }

    public Audiences(Integer idAud) {
        this.idAud = idAud;
    }

    public Audiences(Integer idAud, Date dateAud, String statutAud) {
        this.idAud = idAud;
        this.dateAud = dateAud;
        this.statutAud = statutAud;
    }

    public Integer getIdAud() {
        return idAud;
    }

    public void setIdAud(Integer idAud) {
        this.idAud = idAud;
    }

    public Date getDateAud() {
        return dateAud;
    }

    public void setDateAud(Date dateAud) {
        this.dateAud = dateAud;
    }

    public String getStatutAud() {
        return statutAud;
    }

    public void setStatutAud(String statutAud) {
        this.statutAud = statutAud;
    }

    public String getCommAud() {
        return commAud;
    }

    public void setCommAud(String commAud) {
        this.commAud = commAud;
    }

    public Affaires getIdAff() {
        return idAff;
    }

    public void setIdAff(Affaires idAff) {
        this.idAff = idAff;
    }

    public Juridictions getIdJuri() {
        return idJuri;
    }

    public void setIdJuri(Juridictions idJuri) {
        this.idJuri = idJuri;
    }

    public Confreres getIdResp() {
        return idResp;
    }

    public void setIdResp(Confreres idResp) {
        this.idResp = idResp;
    }

    public Confreres getIdSub() {
        return idSub;
    }

    public void setIdSub(Confreres idSub) {
        this.idSub = idSub;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAud != null ? idAud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audiences)) {
            return false;
        }
        Audiences other = (Audiences) object;
        if ((this.idAud == null && other.idAud != null) || (this.idAud != null && !this.idAud.equals(other.idAud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Audiences[ idAud=" + idAud + " ]";
    }
    
}
