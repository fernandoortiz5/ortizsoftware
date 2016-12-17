/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ortizsoft.bean;

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
 * @author Fernandoi
 */
@Entity
@Table(name = "tab_bancos", catalog = "ortizsoft", schema = "")
@NamedQueries({
    @NamedQuery(name = "TabBancos.findAll", query = "SELECT t FROM TabBancos t")
    , @NamedQuery(name = "TabBancos.findByCodBanco", query = "SELECT t FROM TabBancos t WHERE t.codBanco = :codBanco")
    , @NamedQuery(name = "TabBancos.findByNomeBanco", query = "SELECT t FROM TabBancos t WHERE t.nomeBanco = :nomeBanco")
    , @NamedQuery(name = "TabBancos.findByAgenciaBanco", query = "SELECT t FROM TabBancos t WHERE t.agenciaBanco = :agenciaBanco")
    , @NamedQuery(name = "TabBancos.findByContaBanco", query = "SELECT t FROM TabBancos t WHERE t.contaBanco = :contaBanco")
    , @NamedQuery(name = "TabBancos.findByGerenteBanco", query = "SELECT t FROM TabBancos t WHERE t.gerenteBanco = :gerenteBanco")
    , @NamedQuery(name = "TabBancos.findByFoneBanco", query = "SELECT t FROM TabBancos t WHERE t.foneBanco = :foneBanco")})
public class TabBancos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_BANCO")
    private Integer codBanco;
    @Basic(optional = false)
    @Column(name = "NOME_BANCO")
    private String nomeBanco;
    @Basic(optional = false)
    @Column(name = "AGENCIA_BANCO")
    private int agenciaBanco;
    @Basic(optional = false)
    @Column(name = "CONTA_BANCO")
    private int contaBanco;
    @Column(name = "GERENTE_BANCO")
    private String gerenteBanco;
    @Basic(optional = false)
    @Column(name = "FONE_BANCO")
    private String foneBanco;

    public TabBancos() {
    }

    public TabBancos(Integer codBanco) {
        this.codBanco = codBanco;
    }

    public TabBancos(Integer codBanco, String nomeBanco, int agenciaBanco, int contaBanco, String foneBanco) {
        this.codBanco = codBanco;
        this.nomeBanco = nomeBanco;
        this.agenciaBanco = agenciaBanco;
        this.contaBanco = contaBanco;
        this.foneBanco = foneBanco;
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        Integer oldCodBanco = this.codBanco;
        this.codBanco = codBanco;
        changeSupport.firePropertyChange("codBanco", oldCodBanco, codBanco);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        String oldNomeBanco = this.nomeBanco;
        this.nomeBanco = nomeBanco;
        changeSupport.firePropertyChange("nomeBanco", oldNomeBanco, nomeBanco);
    }

    public int getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(int agenciaBanco) {
        int oldAgenciaBanco = this.agenciaBanco;
        this.agenciaBanco = agenciaBanco;
        changeSupport.firePropertyChange("agenciaBanco", oldAgenciaBanco, agenciaBanco);
    }

    public int getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(int contaBanco) {
        int oldContaBanco = this.contaBanco;
        this.contaBanco = contaBanco;
        changeSupport.firePropertyChange("contaBanco", oldContaBanco, contaBanco);
    }

    public String getGerenteBanco() {
        return gerenteBanco;
    }

    public void setGerenteBanco(String gerenteBanco) {
        String oldGerenteBanco = this.gerenteBanco;
        this.gerenteBanco = gerenteBanco;
        changeSupport.firePropertyChange("gerenteBanco", oldGerenteBanco, gerenteBanco);
    }

    public String getFoneBanco() {
        return foneBanco;
    }

    public void setFoneBanco(String foneBanco) {
        String oldFoneBanco = this.foneBanco;
        this.foneBanco = foneBanco;
        changeSupport.firePropertyChange("foneBanco", oldFoneBanco, foneBanco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBanco != null ? codBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabBancos)) {
            return false;
        }
        TabBancos other = (TabBancos) object;
        if ((this.codBanco == null && other.codBanco != null) || (this.codBanco != null && !this.codBanco.equals(other.codBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ortizsoft.view.TabBancos[ codBanco=" + codBanco + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
