/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCRHelper;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author CASA
 */
@Entity
@Table(name = "empresasclientes", catalog = "mydatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Empresasclientes.findAll", query = "SELECT e FROM Empresasclientes e"),
    @NamedQuery(name = "Empresasclientes.findByIdempresasClientes", query = "SELECT e FROM Empresasclientes e WHERE e.idempresasClientes = :idempresasClientes"),
    @NamedQuery(name = "Empresasclientes.findByNombreCliente", query = "SELECT e FROM Empresasclientes e WHERE e.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Empresasclientes.findByRedCliente", query = "SELECT e FROM Empresasclientes e WHERE e.redCliente = :redCliente")})
public class Empresasclientes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempresasClientes")
    private Integer idempresasClientes;
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Column(name = "redCliente")
    private String redCliente;

    public Empresasclientes() {
    }

    public Empresasclientes(Integer idempresasClientes) {
        this.idempresasClientes = idempresasClientes;
    }

    public Integer getIdempresasClientes() {
        return idempresasClientes;
    }

    public void setIdempresasClientes(Integer idempresasClientes) {
        Integer oldIdempresasClientes = this.idempresasClientes;
        this.idempresasClientes = idempresasClientes;
        changeSupport.firePropertyChange("idempresasClientes", oldIdempresasClientes, idempresasClientes);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        String oldNombreCliente = this.nombreCliente;
        this.nombreCliente = nombreCliente;
        changeSupport.firePropertyChange("nombreCliente", oldNombreCliente, nombreCliente);
    }

    public String getRedCliente() {
        return redCliente;
    }

    public void setRedCliente(String redCliente) {
        String oldRedCliente = this.redCliente;
        this.redCliente = redCliente;
        changeSupport.firePropertyChange("redCliente", oldRedCliente, redCliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempresasClientes != null ? idempresasClientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresasclientes)) {
            return false;
        }
        Empresasclientes other = (Empresasclientes) object;
        if ((this.idempresasClientes == null && other.idempresasClientes != null) || (this.idempresasClientes != null && !this.idempresasClientes.equals(other.idempresasClientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockApp.Empresasclientes[ idempresasClientes=" + idempresasClientes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
