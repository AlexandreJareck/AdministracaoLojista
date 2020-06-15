package br.edu.up.administradorlojista.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LocatarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String documento;
	private String residencial;
	private String comercial;
	private String celualar;
	private String email;
	private String fax;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private double aluguel;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataInicio;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataFim;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataVencimento;
	
	private String descricao;
	private Boolean inadimplente;
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
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
	public String getCelualar() {
		return celualar;
	}
	public void setCelualar(String celualar) {
		this.celualar = celualar;
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
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public double getAluguel() {
		return aluguel;
	}
	public void setAluguel(double aluguel) {
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
