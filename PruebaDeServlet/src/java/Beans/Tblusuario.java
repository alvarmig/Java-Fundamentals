/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Miguel
 */
@Entity
@Table(name = "tblusuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuario.findAll", query = "SELECT t FROM Tblusuario t")
    , @NamedQuery(name = "Tblusuario.findByIdusuario", query = "SELECT t FROM Tblusuario t WHERE t.idusuario = :idusuario")
    , @NamedQuery(name = "Tblusuario.findByEmail", query = "SELECT t FROM Tblusuario t WHERE t.email = :email")
    , @NamedQuery(name = "Tblusuario.findByUsuario", query = "SELECT t FROM Tblusuario t WHERE t.usuario = :usuario")
    , @NamedQuery(name = "Tblusuario.findByPassword", query = "SELECT t FROM Tblusuario t WHERE t.password = :password")
    , @NamedQuery(name = "Tblusuario.findByCreacion", query = "SELECT t FROM Tblusuario t WHERE t.creacion = :creacion")
    , @NamedQuery(name = "Tblusuario.findByUltimoAcceso", query = "SELECT t FROM Tblusuario t WHERE t.ultimoAcceso = :ultimoAcceso")
    , @NamedQuery(name = "Tblusuario.findByActivo", query = "SELECT t FROM Tblusuario t WHERE t.activo = :activo")})
public class Tblusuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creacion;
    @Column(name = "ultimoAcceso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoAcceso;
    @Basic(optional = false)
    @Column(name = "activo")
    private short activo;

    public Tblusuario() {
    }

    public Tblusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Tblusuario(Integer idusuario, String email, String usuario, String password, Date creacion, short activo) {
        this.idusuario = idusuario;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
        this.creacion = creacion;
        this.activo = activo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblusuario)) {
            return false;
        }
        Tblusuario other = (Tblusuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Tblusuario[ idusuario=" + idusuario + " ]";
    }

}
