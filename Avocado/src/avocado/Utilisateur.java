/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avocado;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Waul
 */
@Entity
@Table(name = "utilisateur", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u")
    , @NamedQuery(name = "Utilisateur.findByIdUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.idUtilisateur = :idUtilisateur")
    , @NamedQuery(name = "Utilisateur.findByNomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.nomUtilisateur = :nomUtilisateur")
    , @NamedQuery(name = "Utilisateur.findByMDPUtil", query = "SELECT u FROM Utilisateur u WHERE u.mDPUtil = :mDPUtil")
    , @NamedQuery(name = "Utilisateur.findByTypeCompte", query = "SELECT u FROM Utilisateur u WHERE u.typeCompte = :typeCompte")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Utilisateur", nullable = false)
    private Integer idUtilisateur;
    @Basic(optional = false)
    @Column(name = "NomUtilisateur", nullable = false, length = 25)
    private String nomUtilisateur;
    @Basic(optional = false)
    @Column(name = "MDP_Util", nullable = false, length = 25)
    private String mDPUtil;
    @Basic(optional = false)
    @Column(name = "Type_Compte", nullable = false, length = 26)
    private String typeCompte;
    @JoinColumn(name = "Id_Avoc", referencedColumnName = "Id_Conf")
    @ManyToOne
    private Confreres idAvoc;

    public Utilisateur() {
    }

    public Utilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Utilisateur(Integer idUtilisateur, String nomUtilisateur, String mDPUtil, String typeCompte) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.mDPUtil = mDPUtil;
        this.typeCompte = typeCompte;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMDPUtil() {
        return mDPUtil;
    }

    public void setMDPUtil(String mDPUtil) {
        this.mDPUtil = mDPUtil;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Confreres getIdAvoc() {
        return idAvoc;
    }

    public void setIdAvoc(Confreres idAvoc) {
        this.idAvoc = idAvoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUtilisateur != null ? idUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idUtilisateur == null && other.idUtilisateur != null) || (this.idUtilisateur != null && !this.idUtilisateur.equals(other.idUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Utilisateur[ idUtilisateur=" + idUtilisateur + " ]";
    }
    
}
