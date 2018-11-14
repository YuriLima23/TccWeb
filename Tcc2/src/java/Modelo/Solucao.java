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
@Table(name = "solucao")
@NamedQueries({
    @NamedQuery(name = "Solucao.findAll", query = "SELECT s FROM Solucao s"),
    @NamedQuery(name = "Solucao.findById", query = "SELECT s FROM Solucao s WHERE s.id = :id"),
    @NamedQuery(name = "Solucao.findByDescricao", query = "SELECT s FROM Solucao s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Solucao.findByData", query = "SELECT s FROM Solucao s WHERE s.data = :data"),
    @NamedQuery(name = "Solucao.findByValorminimo", query = "SELECT s FROM Solucao s WHERE s.valorminimo = :valorminimo")})
public class Solucao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "valorminimo")
    private String valorminimo;
    @JoinColumn(name = "empregado", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empregado empregado;
    @JoinColumn(name = "tarefa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tarefa tarefa;

    public Solucao() {
    }

    public Solucao(Integer id) {
        this.id = id;
    }

    public Solucao(Integer id, String descricao, Date data) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getValorminimo() {
        return valorminimo;
    }

    public void setValorminimo(String valorminimo) {
        this.valorminimo = valorminimo;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
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
        if (!(object instanceof Solucao)) {
            return false;
        }
        Solucao other = (Solucao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Solucao[ id=" + id + " ]";
    }
    
}
