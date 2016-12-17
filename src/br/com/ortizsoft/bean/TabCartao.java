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
@Table(name = "tab_cartao", catalog = "ortizsoft", schema = "")
@NamedQueries({
    @NamedQuery(name = "TabCartao.findAll", query = "SELECT t FROM TabCartao t")
    , @NamedQuery(name = "TabCartao.findByCodCartao", query = "SELECT t FROM TabCartao t WHERE t.codCartao = :codCartao")
    , @NamedQuery(name = "TabCartao.findByNomeCartao", query = "SELECT t FROM TabCartao t WHERE t.nomeCartao = :nomeCartao")
    , @NamedQuery(name = "TabCartao.findByTaxaCartao", query = "SELECT t FROM TabCartao t WHERE t.taxaCartao = :taxaCartao")})
public class TabCartao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_CARTAO")
    private Integer codCartao;
    @Column(name = "NOME_CARTAO")
    private String nomeCartao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAXA_CARTAO")
    private Double taxaCartao;

    public TabCartao() {
    }

    public TabCartao(Integer codCartao) {
        this.codCartao = codCartao;
    }

    public Integer getCodCartao() {
        return codCartao;
    }

    public void setCodCartao(Integer codCartao) {
        Integer oldCodCartao = this.codCartao;
        this.codCartao = codCartao;
        changeSupport.firePropertyChange("codCartao", oldCodCartao, codCartao);
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        String oldNomeCartao = this.nomeCartao;
        this.nomeCartao = nomeCartao;
        changeSupport.firePropertyChange("nomeCartao", oldNomeCartao, nomeCartao);
    }

    public Double getTaxaCartao() {
        return taxaCartao;
    }

    public void setTaxaCartao(Double taxaCartao) {
        Double oldTaxaCartao = this.taxaCartao;
        this.taxaCartao = taxaCartao;
        changeSupport.firePropertyChange("taxaCartao", oldTaxaCartao, taxaCartao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCartao != null ? codCartao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabCartao)) {
            return false;
        }
        TabCartao other = (TabCartao) object;
        if ((this.codCartao == null && other.codCartao != null) || (this.codCartao != null && !this.codCartao.equals(other.codCartao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ortizsoft.view.TabCartao[ codCartao=" + codCartao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
