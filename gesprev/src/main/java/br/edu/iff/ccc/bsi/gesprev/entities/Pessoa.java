package br.edu.iff.ccc.bsi.gesprev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String cpf;
    
    private String nome;
    private Date dtNasc;
    private String numContato;
    
    public Pessoa() {
    	
    }
    
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa other = (Pessoa) obj;
        return Objects.equals(cpf, other.cpf);
    }

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getNumContato() {
		return numContato;
	}
	public void setNumContato(String numContato) {
		this.numContato = numContato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
}
