/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "tarefa")
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t"),
    @NamedQuery(name = "Tarefa.findById", query = "SELECT t FROM Tarefa t WHERE t.id = :id"),
    @NamedQuery(name = "Tarefa.findByTitulo", query = "SELECT t FROM Tarefa t WHERE t.titulo = :titulo"),
    @NamedQuery(name = "Tarefa.findByDescricao", query = "SELECT t FROM Tarefa t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "Tarefa.findByDatafinal", query = "SELECT t FROM Tarefa t WHERE t.datafinal = :datafinal"),
    @NamedQuery(name = "Tarefa.findByDatainicial", query = "SELECT t FROM Tarefa t WHERE t.datainicial = :datainicial"),
    @NamedQuery(name = "Tarefa.findByValordisponivel", query = "SELECT t FROM Tarefa t WHERE t.valordisponivel = :valordisponivel"),
    @NamedQuery(name = "Tarefa.findByCompletado", query = "SELECT t FROM Tarefa t WHERE t.completado = :completado")})
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "datafinal")
    @Temporal(TemporalType.DATE)
    private Date datafinal;
    @Basic(optional = false)
    @Column(name = "datainicial")
    @Temporal(TemporalType.DATE)
    private Date datainicial;
    @Basic(optional = false)
    @Column(name = "valordisponivel")
    private String valordisponivel;
    @Column(name = "completado")
    private Boolean completado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarefa")
    private List<Solucao> solucaoList;
    @JoinColumn(name = "empregador", referencedColumnName = "id")
    @ManyToOne
    private Empregador empregador;

    public Tarefa() {
    }

    public Tarefa(Integer id) {
        this.id = id;
    }

    public Tarefa(Integer id, String titulo, String descricao, Date datafinal, Date datainicial, String valordisponivel) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.datafinal = datafinal;
        this.datainicial = datainicial;
        this.valordisponivel = valordisponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }

    public String getValordisponivel() {
        return valordisponivel;
    }

    public void setValordisponivel(String valordisponivel) {
        this.valordisponivel = valordisponivel;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public List<Solucao> getSolucaoList() {
        return solucaoList;
    }

    public void setSolucaoList(List<Solucao> solucaoList) {
        this.solucaoList = solucaoList;
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
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tarefa[ id=" + id + " ]";
    }
    
}
