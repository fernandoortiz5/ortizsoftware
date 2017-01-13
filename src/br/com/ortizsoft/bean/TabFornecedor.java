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
 * @author fernando
 */
@Entity
@Table(name = "TAB_FORNECEDOR", catalog = "ortizsoft", schema = "")
@NamedQueries({
    @NamedQuery(name = "TabFornecedor.findAll", query = "SELECT t FROM TabFornecedor t")
    , @NamedQuery(name = "TabFornecedor.findByCodFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.codFornecedor = :codFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByNomeFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.nomeFornecedor = :nomeFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByCpfFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.cpfFornecedor = :cpfFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByRgFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.rgFornecedor = :rgFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByOrgaoRgFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.orgaoRgFornecedor = :orgaoRgFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByCnpjFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.cnpjFornecedor = :cnpjFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByEnderecoFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.enderecoFornecedor = :enderecoFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByTipoFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.tipoFornecedor = :tipoFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByBairroFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.bairroFornecedor = :bairroFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByCidadeFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.cidadeFornecedor = :cidadeFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByUfFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.ufFornecedor = :ufFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByCepFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.cepFornecedor = :cepFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByEmailFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.emailFornecedor = :emailFornecedor")
    , @NamedQuery(name = "TabFornecedor.findBySiteFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.siteFornecedor = :siteFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByFoneFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.foneFornecedor = :foneFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByCelularFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.celularFornecedor = :celularFornecedor")
    , @NamedQuery(name = "TabFornecedor.findByContatoFornecedor", query = "SELECT t FROM TabFornecedor t WHERE t.contatoFornecedor = :contatoFornecedor")})
public class TabFornecedor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Basic(optional = false)
    @Column(name = "NOME_FORNECEDOR")
    private String nomeFornecedor;
    @Column(name = "CPF_FORNECEDOR")
    private String cpfFornecedor;
    @Column(name = "RG_FORNECEDOR")
    private String rgFornecedor;
    @Column(name = "ORGAO_RG_FORNECEDOR")
    private String orgaoRgFornecedor;
    @Column(name = "CNPJ_FORNECEDOR")
    private String cnpjFornecedor;
    @Basic(optional = false)
    @Column(name = "ENDERECO_FORNECEDOR")
    private String enderecoFornecedor;
    @Basic(optional = false)
    @Column(name = "TIPO_FORNECEDOR")
    private Character tipoFornecedor;
    @Basic(optional = false)
    @Column(name = "BAIRRO_FORNECEDOR")
    private String bairroFornecedor;
    @Basic(optional = false)
    @Column(name = "CIDADE_FORNECEDOR")
    private String cidadeFornecedor;
    @Basic(optional = false)
    @Column(name = "UF_FORNECEDOR")
    private String ufFornecedor;
    @Basic(optional = false)
    @Column(name = "CEP_FORNECEDOR")
    private String cepFornecedor;
    @Column(name = "EMAIL_FORNECEDOR")
    private String emailFornecedor;
    @Column(name = "SITE_FORNECEDOR")
    private String siteFornecedor;
    @Basic(optional = false)
    @Column(name = "FONE_FORNECEDOR")
    private String foneFornecedor;
    @Basic(optional = false)
    @Column(name = "CELULAR_FORNECEDOR")
    private String celularFornecedor;
    @Column(name = "CONTATO_FORNECEDOR")
    private String contatoFornecedor;

    public TabFornecedor() {
    }

    public TabFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public TabFornecedor(Integer codFornecedor, String nomeFornecedor, String enderecoFornecedor, Character tipoFornecedor, String bairroFornecedor, String cidadeFornecedor, String ufFornecedor, String cepFornecedor, String foneFornecedor, String celularFornecedor) {
        this.codFornecedor = codFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        this.bairroFornecedor = bairroFornecedor;
        this.cidadeFornecedor = cidadeFornecedor;
        this.ufFornecedor = ufFornecedor;
        this.cepFornecedor = cepFornecedor;
        this.foneFornecedor = foneFornecedor;
        this.celularFornecedor = celularFornecedor;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        String oldNomeFornecedor = this.nomeFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        changeSupport.firePropertyChange("nomeFornecedor", oldNomeFornecedor, nomeFornecedor);
    }

    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    public void setCpfFornecedor(String cpfFornecedor) {
        String oldCpfFornecedor = this.cpfFornecedor;
        this.cpfFornecedor = cpfFornecedor;
        changeSupport.firePropertyChange("cpfFornecedor", oldCpfFornecedor, cpfFornecedor);
    }

    public String getRgFornecedor() {
        return rgFornecedor;
    }

    public void setRgFornecedor(String rgFornecedor) {
        String oldRgFornecedor = this.rgFornecedor;
        this.rgFornecedor = rgFornecedor;
        changeSupport.firePropertyChange("rgFornecedor", oldRgFornecedor, rgFornecedor);
    }

    public String getOrgaoRgFornecedor() {
        return orgaoRgFornecedor;
    }

    public void setOrgaoRgFornecedor(String orgaoRgFornecedor) {
        String oldOrgaoRgFornecedor = this.orgaoRgFornecedor;
        this.orgaoRgFornecedor = orgaoRgFornecedor;
        changeSupport.firePropertyChange("orgaoRgFornecedor", oldOrgaoRgFornecedor, orgaoRgFornecedor);
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        String oldCnpjFornecedor = this.cnpjFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        changeSupport.firePropertyChange("cnpjFornecedor", oldCnpjFornecedor, cnpjFornecedor);
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        String oldEnderecoFornecedor = this.enderecoFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        changeSupport.firePropertyChange("enderecoFornecedor", oldEnderecoFornecedor, enderecoFornecedor);
    }

    public Character getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(Character tipoFornecedor) {
        Character oldTipoFornecedor = this.tipoFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        changeSupport.firePropertyChange("tipoFornecedor", oldTipoFornecedor, tipoFornecedor);
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        String oldBairroFornecedor = this.bairroFornecedor;
        this.bairroFornecedor = bairroFornecedor;
        changeSupport.firePropertyChange("bairroFornecedor", oldBairroFornecedor, bairroFornecedor);
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        String oldCidadeFornecedor = this.cidadeFornecedor;
        this.cidadeFornecedor = cidadeFornecedor;
        changeSupport.firePropertyChange("cidadeFornecedor", oldCidadeFornecedor, cidadeFornecedor);
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        String oldUfFornecedor = this.ufFornecedor;
        this.ufFornecedor = ufFornecedor;
        changeSupport.firePropertyChange("ufFornecedor", oldUfFornecedor, ufFornecedor);
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        String oldCepFornecedor = this.cepFornecedor;
        this.cepFornecedor = cepFornecedor;
        changeSupport.firePropertyChange("cepFornecedor", oldCepFornecedor, cepFornecedor);
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        String oldEmailFornecedor = this.emailFornecedor;
        this.emailFornecedor = emailFornecedor;
        changeSupport.firePropertyChange("emailFornecedor", oldEmailFornecedor, emailFornecedor);
    }

    public String getSiteFornecedor() {
        return siteFornecedor;
    }

    public void setSiteFornecedor(String siteFornecedor) {
        String oldSiteFornecedor = this.siteFornecedor;
        this.siteFornecedor = siteFornecedor;
        changeSupport.firePropertyChange("siteFornecedor", oldSiteFornecedor, siteFornecedor);
    }

    public String getFoneFornecedor() {
        return foneFornecedor;
    }

    public void setFoneFornecedor(String foneFornecedor) {
        String oldFoneFornecedor = this.foneFornecedor;
        this.foneFornecedor = foneFornecedor;
        changeSupport.firePropertyChange("foneFornecedor", oldFoneFornecedor, foneFornecedor);
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        String oldCelularFornecedor = this.celularFornecedor;
        this.celularFornecedor = celularFornecedor;
        changeSupport.firePropertyChange("celularFornecedor", oldCelularFornecedor, celularFornecedor);
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        String oldContatoFornecedor = this.contatoFornecedor;
        this.contatoFornecedor = contatoFornecedor;
        changeSupport.firePropertyChange("contatoFornecedor", oldContatoFornecedor, contatoFornecedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFornecedor != null ? codFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabFornecedor)) {
            return false;
        }
        TabFornecedor other = (TabFornecedor) object;
        if ((this.codFornecedor == null && other.codFornecedor != null) || (this.codFornecedor != null && !this.codFornecedor.equals(other.codFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ortizsoft.view.TabFornecedor[ codFornecedor=" + codFornecedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
