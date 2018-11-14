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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "empregado")
@NamedQueries({
    @NamedQuery(name = "Empregado.findAll", query = "SELECT e FROM Empregado e")
    , @NamedQuery(name = "Empregado.findById", query = "SELECT e FROM Empregado e WHERE e.id = :id")
    , @NamedQuery(name = "Empregado.findByAvaliacao", query = "SELECT e FROM Empregado e WHERE e.avaliacao = :avaliacao")
    , @NamedQuery(name = "Empregado.findByCidade", query = "SELECT e FROM Empregado e WHERE e.cidade = :cidade")
    , @NamedQuery(name = "Empregado.findByDescricao", query = "SELECT e FROM Empregado e WHERE e.descricao = :descricao")
    , @NamedQuery(name = "Empregado.findByEmail", query = "SELECT e FROM Empregado e WHERE e.email = :email")
    , @NamedQuery(name = "Empregado.findByFoto", query = "SELECT e FROM Empregado e WHERE e.foto = :foto")
    , @NamedQuery(name = "Empregado.findByNome", query = "SELECT e FROM Empregado e WHERE e.nome = :nome")
    , @NamedQuery(name = "Empregado.findByPerfil", query = "SELECT e FROM Empregado e WHERE e.perfil = :perfil")
    , @NamedQuery(name = "Empregado.findBySenha", query = "SELECT e FROM Empregado e WHERE e.senha = :senha")
    , @NamedQuery(name = "Empregado.login", query = "SELECT e FROM Empregado e WHERE e.email = :email and e.senha = :senha")})
public class Empregado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avaliacao")
    private Double avaliacao;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "email")
    private String email;
    @Column(name = "foto")
    private String foto;
    @Column(name = "nome")
    private String nome;
    @Column(name = "perfil")
    private Boolean perfil;
    @Column(name = "senha")
    private String senha;
    @Column(name = "telefone")
    private String telefone;
    @JoinColumn(name = "categoria", referencedColumnName = "id")
    @ManyToOne
    private Categoria categoria;
    @OneToMany(mappedBy = "empregado")
    private List<Avaliacao> avaliacaoList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregado")
    private List<Solucao> solucaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregado")
    private List<Album> albumList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empregado")
    private List<Contrato> contratoList;

    public Empregado() {
    }

    public Empregado(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getPerfil() {
        return perfil;
    }

    public void setPerfil(Boolean perfil) {
        this.perfil = perfil;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Avaliacao> getAvaliacaoList() {
        return avaliacaoList;
    }

    public void setAvaliacaoList(List<Avaliacao> avaliacaoList) {
        this.avaliacaoList = avaliacaoList;
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
        if (!(object instanceof Empregado)) {
            return false;
        }
        Empregado other = (Empregado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empregado[ id=" + id + " ]";
    }

    /**
     * @return the solucaoList
     */
    public List<Solucao> getSolucaoList() {
        return solucaoList;
    }

    /**
     * @param solucaoList the solucaoList to set
     */
    public void setSolucaoList(List<Solucao> solucaoList) {
        this.solucaoList = solucaoList;
    }

    /**
     * @return the albumList
     */
    public List<Album> getAlbumList() {
        return albumList;
    }

    /**
     * @param albumList the albumList to set
     */
    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    /**
     * @return the contratoList
     */
    public List<Contrato> getContratoList() {
        return contratoList;
    }

    /**
     * @param contratoList the contratoList to set
     */
    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

}
