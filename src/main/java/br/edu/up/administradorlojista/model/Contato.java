package br.edu.up.administradorlojista.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTATO")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "Residencial", nullable = false)
	private String residencial;
	
	@Column(name = "Comercial", nullable = false)
	private String comercial;
	
	@Column(name = "Celular", nullable = false)
	private String celular;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "Fax", nullable = false)
	private String fax;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResidencial() {
		return residencial;
	}

	public void setResidencial(String residencial) {
		this.residencial = residencial;
	}

	public String getComercial() {
		return comercial;
	}

	public void setComercial(String comercial) {
		this.comercial = comercial;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}
