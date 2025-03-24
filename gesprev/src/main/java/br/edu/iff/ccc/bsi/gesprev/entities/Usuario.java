package br.edu.iff.ccc.bsi.gesprev.entities;

import jakarta.persistence.*;

@Entity
public class Usuario extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	private int tipo;
    private String senha;
    
    public Usuario() {
    	super();
    }
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}