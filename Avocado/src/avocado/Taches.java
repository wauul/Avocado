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
import javax.persistence.Lob;
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
@Table(name = "taches", catalog = "avocado", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taches.findAll", query = "SELECT t FROM Taches t")
    , @NamedQuery(name = "Taches.findByIdTask", query = "SELECT t FROM Taches t WHERE t.idTask = :idTask")
    , @NamedQuery(name = "Taches.findByTitreTask", query = "SELECT t FROM Taches t WHERE t.titreTask = :titreTask")
    , @NamedQuery(name = "Taches.findByDateTask", query = "SELECT t FROM Taches t WHERE t.dateTask = :dateTask")})
public class Taches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Task", nullable = false)
    private Integer idTask;
    @Basic(optional = false)
    @Column(name = "Titre_Task", nullable = false, length = 25)
    private String titreTask;
    @Basic(optional = false)
    @Column(name = "Date_Task", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTask;
    @Basic(optional = false)
    @Lob
    @Column(name = "Task", nullable = false, length = 2147483647)
    private String task;

    public Taches() {
    }

    public Taches(Integer idTask) {
        this.idTask = idTask;
    }

    public Taches(Integer idTask, String titreTask, Date dateTask, String task) {
        this.idTask = idTask;
        this.titreTask = titreTask;
        this.dateTask = dateTask;
        this.task = task;
    }

    public Integer getIdTask() {
        return idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public String getTitreTask() {
        return titreTask;
    }

    public void setTitreTask(String titreTask) {
        this.titreTask = titreTask;
    }

    public Date getDateTask() {
        return dateTask;
    }

    public void setDateTask(Date dateTask) {
        this.dateTask = dateTask;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTask != null ? idTask.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taches)) {
            return false;
        }
        Taches other = (Taches) object;
        if ((this.idTask == null && other.idTask != null) || (this.idTask != null && !this.idTask.equals(other.idTask))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avocado.Taches[ idTask=" + idTask + " ]";
    }
    
}
