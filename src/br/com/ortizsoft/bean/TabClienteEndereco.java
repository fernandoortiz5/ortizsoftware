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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Fernandoi
 */
@Entity
@Table(name = "TAB_CLIENTE_ENDERECO", catalog = "ortizsoft", schema = "")
@NamedQueries({
    @NamedQuery(name = "TabClienteEndereco.findAll", query = "SELECT t FROM TabClienteEndereco t")
    , @NamedQuery(name = "TabClienteEndereco.findByCodEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.codEndereco = :codEndereco")
    , @NamedQuery(name = "TabClienteEndereco.findByLogradouroEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.logradouroEndereco = :logradouroEndereco")
    , @NamedQuery(name = "TabClienteEndereco.findByComplementoEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.complementoEndereco = :complementoEndereco")
    , @NamedQuery(name = "TabClienteEndereco.findByCepEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.cepEndereco = :cepEndereco")
    , @NamedQuery(name = "TabClienteEndereco.findByBairroEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.bairroEndereco = :bairroEndereco")
    , @NamedQuery(name = "TabClienteEndereco.findByCidadeEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.cidadeEndereco = :cidadeEndereco")
    , @NamedQuery(name = "TabClienteEndereco.findByUfEndereco", query = "SELECT t FROM TabClienteEndereco t WHERE t.ufEndereco = :ufEndereco")})
public class TabClienteEndereco implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_ENDERECO")
    private Integer codEndereco;
    @Basic(optional = false)
    @Column(name = "LOGRADOURO_ENDERECO")
    private String logradouroEndereco;
    @Column(name = "COMPLEMENTO_ENDERECO")
    private String complementoEndereco;
    @Basic(optional = false)
    @Column(name = "CEP_ENDERECO")
    private String cepEndereco;
    @Basic(optional = false)
    @Column(name = "BAIRRO_ENDERECO")
    private String bairroEndereco;
    @Basic(optional = false)
    @Column(name = "CIDADE_ENDERECO")
    private String cidadeEndereco;
    @Basic(optional = false)
    @Column(name = "UF_ENDERECO")
    private String ufEndereco;
    @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_CLIENTE")
    @ManyToOne
    private TabCliente codCliente;

    public TabClienteEndereco() {
    }

    public TabClienteEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public TabClienteEndereco(Integer codEndereco, String logradouroEndereco, String cepEndereco, String bairroEndereco, String cidadeEndereco, String ufEndereco) {
        this.codEndereco = codEndereco;
        this.logradouroEndereco = logradouroEndereco;
        this.cepEndereco = cepEndereco;
        this.bairroEndereco = bairroEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.ufEndereco = ufEndereco;
    }

    public Integer getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Integer codEndereco) {
        Integer oldCodEndereco = this.codEndereco;
        this.codEndereco = codEndereco;
        changeSupport.firePropertyChange("codEndereco", oldCodEndereco, codEndereco);
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        String oldLogradouroEndereco = this.logradouroEndereco;
        this.logradouroEndereco = logradouroEndereco;
        changeSupport.firePropertyChange("logradouroEndereco", oldLogradouroEndereco, logradouroEndereco);
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        String oldComplementoEndereco = this.complementoEndereco;
        this.complementoEndereco = complementoEndereco;
        changeSupport.firePropertyChange("complementoEndereco", oldComplementoEndereco, complementoEndereco);
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        String oldCepEndereco = this.cepEndereco;
        this.cepEndereco = cepEndereco;
        changeSupport.firePropertyChange("cepEndereco", oldCepEndereco, cepEndereco);
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        String oldBairroEndereco = this.bairroEndereco;
        this.bairroEndereco = bairroEndereco;
        changeSupport.firePropertyChange("bairroEndereco", oldBairroEndereco, bairroEndereco);
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        String oldCidadeEndereco = this.cidadeEndereco;
        this.cidadeEndereco = cidadeEndereco;
        changeSupport.firePropertyChange("cidadeEndereco", oldCidadeEndereco, cidadeEndereco);
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        String oldUfEndereco = this.ufEndereco;
        this.ufEndereco = ufEndereco;
        changeSupport.firePropertyChange("ufEndereco", oldUfEndereco, ufEndereco);
    }

    public TabCliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(TabCliente codCliente) {
        TabCliente oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEndereco != null ? codEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabClienteEndereco)) {
            return false;
        }
        TabClienteEndereco other = (TabClienteEndereco) object;
        if ((this.codEndereco == null && other.codEndereco != null) || (this.codEndereco != null && !this.codEndereco.equals(other.codEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ortizsoft.view.TabClienteEndereco[ codEndereco=" + codEndereco + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
