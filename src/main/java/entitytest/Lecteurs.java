/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitytest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "lecteurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lecteurs.findAll", query = "SELECT l FROM Lecteurs l"),
    @NamedQuery(name = "Lecteurs.findById", query = "SELECT l FROM Lecteurs l WHERE l.id = :id"),
    @NamedQuery(name = "Lecteurs.findByNom", query = "SELECT l FROM Lecteurs l WHERE l.nom = :nom"),
    @NamedQuery(name = "Lecteurs.findByDateNaissance", query = "SELECT l FROM Lecteurs l WHERE l.dateNaissance = :dateNaissance"),
    @NamedQuery(name = "Lecteurs.findByEmail", query = "SELECT l FROM Lecteurs l WHERE l.email = :email"),
    @NamedQuery(name = "Lecteurs.findByPasswrd", query = "SELECT l FROM Lecteurs l WHERE l.passwrd = :passwrd"),
    @NamedQuery(name = "Lecteurs.findByAdresse", query = "SELECT l FROM Lecteurs l WHERE l.adresse = :adresse")})
public class Lecteurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Column(name = "dateNaissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "passwrd")
    private String passwrd;
    @Size(max = 100)
    @Column(name = "Adresse")
    private String adresse;

    public Lecteurs() {
    }

    public Lecteurs(Integer id) {
        this.id = id;
    }

    public Lecteurs(Integer id, String nom, String email, String passwrd) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.passwrd = passwrd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecteurs)) {
            return false;
        }
        Lecteurs other = (Lecteurs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitytest.Lecteurs[ id=" + id + " ]";
    }
    
}
