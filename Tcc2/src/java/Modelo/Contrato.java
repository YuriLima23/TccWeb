/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "contrato")
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c")
    , @NamedQuery(name = "Contrato.findById", query = "SELECT c FROM Contrato c WHERE c.id = :id")
    , @NamedQuery(name = "Contrato.findByDatadeinicio", query = "SELECT c FROM Contrato c WHERE c.datadeinicio = :datadeinicio")
    , @NamedQuery(name = "Contrato.findByDatafinal", query = "SELECT c FROM Contrato c WHERE c.datafinal = :datafinal")
    , @NamedQuery(name = "Contrato.findByDescricao", query = "SELECT c FROM Contrato c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "Contrato.findByStatus", query = "SELECT c FROM Contrato c WHERE c.status = :status")
    , @NamedQuery(name = "Contrato.findByFeedback", query = "SELECT c FROM Contrato c WHERE c.feedback = :feedback")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "datadeinicio")
    @Temporal(TemporalType.DATE)
    private Date datadeinicio;
    @Column(name = "datafinal")
    @Temporal(TemporalType.DATE)
    private Date datafinal;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "completado")
    private Boolean completado;
    @Column(name = "feedback")
    private String feedback;
    @JoinColumn(name = "empregado", referencedColumnName = "id")
    @ManyToOne
    private Empregado empregado;
    @JoinColumn(name = "empregador", referencedColumnName = "id")
    @ManyToOne
    private Empregador empregador;

    public Contrato() {
    }

    public Contrato(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatadeinicio() {
        return datadeinicio;
    }

    public void setDatadeinicio(Date datadeinicio) {
        this.datadeinicio = datadeinicio;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Empregador getEmpregador() {
        return empregador;
    }

    public void setEmpregador(Empregador empregador) {
        this.empregador = empregador;
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
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Contrato[ id=" + id + " ]";
    }

    /**
     * @return the completado
     */
    public Boolean getCompletado() {
        return completado;
    }

    /**
     * @param completado the completado to set
     */
    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }
    
}
