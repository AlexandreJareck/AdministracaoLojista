package br.edu.up.administradorlojista.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "CONTRATO")

public class Contrato implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "Aluguel", nullable = false)
	private Double aluguel;
	
	@Column(name = "DataInicio", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataInicio;
	
	@Column(name = "DataFim", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataFim;
	
	@Column(name = "DataVencimento", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataVencimento;
	
	@Column(name = "Descricao", nullable = false)
	private String descricao;
	
	@Column(name = "Inadimplente", nullable = false)
	private Boolean inadimplente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getAluguel() {
		return aluguel;
	}

	public void setAluguel(Double aluguel) {
		this.aluguel = aluguel;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getInadimplente() {
		return inadimplente;
	}

	public void setInadimplente(Boolean inadimplente) {
		this.inadimplente = inadimplente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
