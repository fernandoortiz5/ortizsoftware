/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ortizsoft.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Fernandoi
 */
@Entity
@Table(name = "TAB_CLIENTE", catalog = "ortizsoft", schema = "")
@NamedQueries({
    @NamedQuery(name = "TabCliente.findAll", query = "SELECT t FROM TabCliente t")
    , @NamedQuery(name = "TabCliente.findByCodCliente", query = "SELECT t FROM TabCliente t WHERE t.codCliente = :codCliente")
    , @NamedQuery(name = "TabCliente.findByNomeCliente", query = "SELECT t FROM TabCliente t WHERE t.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "TabCliente.findByCpfCliente", query = "SELECT t FROM TabCliente t WHERE t.cpfCliente = :cpfCliente")
    , @NamedQuery(name = "TabCliente.findByRgCliente", query = "SELECT t FROM TabCliente t WHERE t.rgCliente = :rgCliente")
    , @NamedQuery(name = "TabCliente.findByOrgaoRgCliente", query = "SELECT t FROM TabCliente t WHERE t.orgaoRgCliente = :orgaoRgCliente")
    , @NamedQuery(name = "TabCliente.findByNascimenteCliente", query = "SELECT t FROM TabCliente t WHERE t.nascimenteCliente = :nascimenteCliente")
    , @NamedQuery(name = "TabCliente.findByDesdeDataCliente", query = "SELECT t FROM TabCliente t WHERE t.desdeDataCliente = :desdeDataCliente")
    , @NamedQuery(name = "TabCliente.findByProfissaoCliente", query = "SELECT t FROM TabCliente t WHERE t.profissaoCliente = :profissaoCliente")
    , @NamedQuery(name = "TabCliente.findByEmpresaCliente", query = "SELECT t FROM TabCliente t WHERE t.empresaCliente = :empresaCliente")
    , @NamedQuery(name = "TabCliente.findByFoneEmpresa", query = "SELECT t FROM TabCliente t WHERE t.foneEmpresa = :foneEmpresa")
    , @NamedQuery(name = "TabCliente.findByRendaCliente", query = "SELECT t FROM TabCliente t WHERE t.rendaCliente = :rendaCliente")
    , @NamedQuery(name = "TabCliente.findByTipoCliente", query = "SELECT t FROM TabCliente t WHERE t.tipoCliente = :tipoCliente")
    , @NamedQuery(name = "TabCliente.findByCnpjCliente", query = "SELECT t FROM TabCliente t WHERE t.cnpjCliente = :cnpjCliente")
    , @NamedQuery(name = "TabCliente.findByReferenciaCliente", query = "SELECT t FROM TabCliente t WHERE t.referenciaCliente = :referenciaCliente")
    , @NamedQuery(name = "TabCliente.findByFoneReferencia", query = "SELECT t FROM TabCliente t WHERE t.foneReferencia = :foneReferencia")
    , @NamedQuery(name = "TabCliente.findByEmail", query = "SELECT t FROM TabCliente t WHERE t.email = :email")})
public class TabCliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Basic(optional = false)
    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;
    @Column(name = "CPF_CLIENTE")
    private String cpfCliente;
    @Column(name = "RG_CLIENTE")
    private String rgCliente;
    @Column(name = "ORGAO_RG_CLIENTE")
    private String orgaoRgCliente;
    @Basic(optional = false)
    @Column(name = "NASCIMENTE_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date nascimenteCliente;
    @Basic(optional = false)
    @Column(name = "DESDE_DATA_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date desdeDataCliente;
    @Column(name = "PROFISSAO_CLIENTE")
    private String profissaoCliente;
    @Column(name = "EMPRESA_CLIENTE")
    private String empresaCliente;
    @Column(name = "FONE_EMPRESA")
    private String foneEmpresa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RENDA_CLIENTE")
    private Double rendaCliente;
    @Basic(optional = false)
    @Column(name = "TIPO_CLIENTE")
    private Character tipoCliente;
    @Column(name = "CNPJ_CLIENTE")
    private String cnpjCliente;
    @Column(name = "REFERENCIA_CLIENTE")
    private String referenciaCliente;
    @Basic(optional = false)
    @Column(name = "FONE_REFERENCIA")
    private String foneReferencia;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(mappedBy = "codCliente")
    private List<TabClienteEndereco> tabClienteEnderecoList;

    public TabCliente() {
    }

    public TabCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public TabCliente(Integer codCliente, String nomeCliente, Date nascimenteCliente, Date desdeDataCliente, Character tipoCliente, String foneReferencia) {
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.nascimenteCliente = nascimenteCliente;
        this.desdeDataCliente = desdeDataCliente;
        this.tipoCliente = tipoCliente;
        this.foneReferencia = foneReferencia;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        String oldCpfCliente = this.cpfCliente;
        this.cpfCliente = cpfCliente;
        changeSupport.firePropertyChange("cpfCliente", oldCpfCliente, cpfCliente);
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        String oldRgCliente = this.rgCliente;
        this.rgCliente = rgCliente;
        changeSupport.firePropertyChange("rgCliente", oldRgCliente, rgCliente);
    }

    public String getOrgaoRgCliente() {
        return orgaoRgCliente;
    }

    public void setOrgaoRgCliente(String orgaoRgCliente) {
        String oldOrgaoRgCliente = this.orgaoRgCliente;
        this.orgaoRgCliente = orgaoRgCliente;
        changeSupport.firePropertyChange("orgaoRgCliente", oldOrgaoRgCliente, orgaoRgCliente);
    }

    public Date getNascimenteCliente() {
        return nascimenteCliente;
    }

    public void setNascimenteCliente(Date nascimenteCliente) {
        Date oldNascimenteCliente = this.nascimenteCliente;
        this.nascimenteCliente = nascimenteCliente;
        changeSupport.firePropertyChange("nascimenteCliente", oldNascimenteCliente, nascimenteCliente);
    }

    public Date getDesdeDataCliente() {
        return desdeDataCliente;
    }

    public void setDesdeDataCliente(Date desdeDataCliente) {
        Date oldDesdeDataCliente = this.desdeDataCliente;
        this.desdeDataCliente = desdeDataCliente;
        changeSupport.firePropertyChange("desdeDataCliente", oldDesdeDataCliente, desdeDataCliente);
    }

    public String getProfissaoCliente() {
        return profissaoCliente;
    }

    public void setProfissaoCliente(String profissaoCliente) {
        String oldProfissaoCliente = this.profissaoCliente;
        this.profissaoCliente = profissaoCliente;
        changeSupport.firePropertyChange("profissaoCliente", oldProfissaoCliente, profissaoCliente);
    }

    public String getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(String empresaCliente) {
        String oldEmpresaCliente = this.empresaCliente;
        this.empresaCliente = empresaCliente;
        changeSupport.firePropertyChange("empresaCliente", oldEmpresaCliente, empresaCliente);
    }

    public String getFoneEmpresa() {
        return foneEmpresa;
    }

    public void setFoneEmpresa(String foneEmpresa) {
        String oldFoneEmpresa = this.foneEmpresa;
        this.foneEmpresa = foneEmpresa;
        changeSupport.firePropertyChange("foneEmpresa", oldFoneEmpresa, foneEmpresa);
    }

    public Double getRendaCliente() {
        return rendaCliente;
    }

    public void setRendaCliente(Double rendaCliente) {
        Double oldRendaCliente = this.rendaCliente;
        this.rendaCliente = rendaCliente;
        changeSupport.firePropertyChange("rendaCliente", oldRendaCliente, rendaCliente);
    }

    public Character getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Character tipoCliente) {
        Character oldTipoCliente = this.tipoCliente;
        this.tipoCliente = tipoCliente;
        changeSupport.firePropertyChange("tipoCliente", oldTipoCliente, tipoCliente);
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        String oldCnpjCliente = this.cnpjCliente;
        this.cnpjCliente = cnpjCliente;
        changeSupport.firePropertyChange("cnpjCliente", oldCnpjCliente, cnpjCliente);
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        String oldReferenciaCliente = this.referenciaCliente;
        this.referenciaCliente = referenciaCliente;
        changeSupport.firePropertyChange("referenciaCliente", oldReferenciaCliente, referenciaCliente);
    }

    public String getFoneReferencia() {
        return foneReferencia;
    }

    public void setFoneReferencia(String foneReferencia) {
        String oldFoneReferencia = this.foneReferencia;
        this.foneReferencia = foneReferencia;
        changeSupport.firePropertyChange("foneReferencia", oldFoneReferencia, foneReferencia);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public List<TabClienteEndereco> getTabClienteEnderecoList() {
        return tabClienteEnderecoList;
    }

    public void setTabClienteEnderecoList(List<TabClienteEndereco> tabClienteEnderecoList) {
        this.tabClienteEnderecoList = tabClienteEnderecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabCliente)) {
            return false;
        }
        TabCliente other = (TabCliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ortizsoft.view.TabCliente[ codCliente=" + codCliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
