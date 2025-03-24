package br.edu.iff.ccc.bsi.gesprev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
public class Processo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private Pessoa requerente;
    
    private String email;
    private String procTCE;
    private boolean procRegistrado;
    private Date inicioBeneficio;
    private Date dtRegistro;
    private boolean cessado;
    private Date dataCessamento;
    private String motivoCessamento;
    private String estadoProc;

    public Processo() {
    	
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, procTCE);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Processo other = (Processo) obj;
        return Objects.equals(id, other.id);
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Pessoa getRequerente() {
		return requerente;
	}
	public void setRequerente(Pessoa requerente) {
		this.requerente = requerente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProcTCE() {
		return procTCE;
	}
	public void setProcTCE(String procTCE) {
		this.procTCE = procTCE;
	}
	public boolean isProcRegistrado() {
		return procRegistrado;
	}
	public void setProcRegistrado(boolean procRegistrado) {
		this.procRegistrado = procRegistrado;
	}
	public Date getInicioBeneficio() {
		return inicioBeneficio;
	}
	public void setInicioBeneficio(Date inicioBeneficio) {
		this.inicioBeneficio = inicioBeneficio;
	}
	public Date getDtRegistro() {
		return dtRegistro;
	}
	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}
	public boolean isCessado() {
		return cessado;
	}
	public void setCessado(boolean cessado) {
		this.cessado = cessado;
	}
	public Date getDataCessamento() {
		return dataCessamento;
	}
	public void setDataCessamento(Date dataCessamento) {
		this.dataCessamento = dataCessamento;
	}
	public String getMotivoCessamento() {
		return motivoCessamento;
	}
	public void setMotivoCessamento(String motivoCessamento) {
		this.motivoCessamento = motivoCessamento;
	}
	public String getEstadoProc() {
		return estadoProc;
	}
	public void setEstadoProc(String estadoProc) {
		this.estadoProc = estadoProc;
	}
}

