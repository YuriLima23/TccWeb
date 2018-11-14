/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregado")
    private List<Solucao> solucaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregado")
    private List<Album> albumList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregado")
    private List<Contrato> contratoList;
 
  @author aluno
 */
@Entity
@Table(name = "empregador")
@NamedQueries({
    @NamedQuery(name = "Empregador.findAll", query = "SELECT e FROM Empregador e"),
    @NamedQuery(name = "Empregador.findById", query = "SELECT e FROM Empregador e WHERE e.id = :id"),
    @NamedQuery(name = "Empregador.findByNome", query = "SELECT e FROM Empregador e WHERE e.nome = :nome"),
    @NamedQuery(name = "Empregador.findByEmail", query = "SELECT e FROM Empregador e WHERE e.email = :email"),
    @NamedQuery(name = "Empregador.findBySenha", query = "SELECT e FROM Empregador e WHERE e.senha = :senha"),
    @NamedQuery(name = "Empregador.findByTelefone", query = "SELECT e FROM Empregador e WHERE e.telefone = :telefone"),
    @NamedQuery(name = "Empregador.findByCidade", query = "SELECT e FROM Empregador e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Empregador.findByPerfil", query = "SELECT e FROM Empregador e WHERE e.perfil = :perfil"),
    @NamedQuery(name = "Empregador.findByFoto", query = "SELECT e FROM Empregador e WHERE e.foto = :foto"),
    @NamedQuery(name = "Empregado.findContratos", query = "SELECT e FROM Empregador e WHERE e.id = :contrato"),
    @NamedQuery(name = "Empregador.login", query = "SELECT e FROM Empregador e WHERE e.email = :email and e.senha = :senha"),
   })
public class Empregador implements Serializable {

    @Column(name = "perfil")
    private Boolean perfil;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "foto")
    private String foto;
  
    @OneToMany(mappedBy = "empregador")
    private List<Tarefa> tarefaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregador")
    private List<Contrato> contratoList;

    public Empregador() {
    }

    public Empregador(Integer id) {
        this.id = id;
    }

    public Empregador(Integer id, String nome, String email, String senha, String telefone, String cidade, boolean perfil, String foto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cidade = cidade;
        this.perfil = perfil;
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

   

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public List<Contrato> getContratoList() {
        return contratoList;
    }

    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
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
        if (!(object instanceof Empregador)) {
            return false;
        }
        Empregador other = (Empregador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empregador[ id=" + id + " ]";
    }

    public Boolean getPerfil() {
        return perfil;
    }

    public void setPerfil(Boolean perfil) {
        this.perfil = perfil;
    }
    
}
