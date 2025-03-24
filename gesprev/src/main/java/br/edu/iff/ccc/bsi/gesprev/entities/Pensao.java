package br.edu.iff.ccc.bsi.gesprev.entities;

import java.util.Objects;
import jakarta.persistence.*;

@Entity
public class Pensao extends Processo {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private boolean ativo;
    
    @OneToOne
    private Pessoa segurado;

    public Pensao() {
    	super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ativo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pensao other = (Pensao) obj;
        return Objects.equals(id, other.id);
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Pessoa getSegurado() {
		return segurado;
	}
	public void setSegurado(Pessoa segurado) {
		this.segurado = segurado;
	}
}
