package br.edu.iff.ccc.bsi.gesprev.entities;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
public class Contracheque implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private float salarioBruto;
    private float sindicato;
    private float instituto;
    private float irf;
    private float salarioLiquido;
    
    @OneToOne
    private Processo servidor;

    public Contracheque() {
    	
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salarioBruto, salarioLiquido);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contracheque other = (Contracheque) obj;
        return Objects.equals(id, other.id);
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public float getSindicato() {
		return sindicato;
	}
	public void setSindicato(float sindicato) {
		this.sindicato = sindicato;
	}
	public float getInstituto() {
		return instituto;
	}
	public void setInstituto(float instituto) {
		this.instituto = instituto;
	}
	public float getIrf() {
		return irf;
	}
	public void setIrf(float irf) {
		this.irf = irf;
	}
	public float getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public Processo getServidor() {
		return servidor;
	}
	public void setServidor(Processo servidor) {
		this.servidor = servidor;
	}
}
