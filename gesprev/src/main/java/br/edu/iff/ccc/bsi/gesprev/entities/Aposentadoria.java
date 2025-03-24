package br.edu.iff.ccc.bsi.gesprev.entities;

import java.util.Date;
import java.util.Objects;
import jakarta.persistence.*;

public class Aposentadoria extends Processo {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tipo;
    private String mat;
    private String cargo;
    private Date dtAdmissao;
    private String pis;
    private boolean tempoAverbado;

    public Aposentadoria() {
    	super();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, mat);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aposentadoria other = (Aposentadoria) obj;
        return Objects.equals(id, other.id);
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	public boolean isTempoAverbado() {
		return tempoAverbado;
	}
	public void setTempoAverbado(boolean tempoAverbado) {
		this.tempoAverbado = tempoAverbado;
	}
}
