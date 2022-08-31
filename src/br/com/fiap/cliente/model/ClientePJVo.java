package br.com.fiap.cliente.model;

import java.sql.Date;

public class ClientePJVo extends ClienteVo{

	private Integer id_cli;
	private String 	cnpj;
	private String 	razao_social;
	private String 	nm_fantasia;
	private Date 	dt_fundacao;

	/*	Construtores */
	
	public ClientePJVo(Integer id_cli, String nm_cliente, String tp_cliente, String tel_cliente, String email_cliente, Integer id_cli2, String cnpj, String razao_social, String nm_fantasia, Date dt_fundacao) {
		super(id_cli, nm_cliente, tp_cliente, tel_cliente, email_cliente);
		id_cli = id_cli2;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.nm_fantasia = nm_fantasia;
		this.dt_fundacao = dt_fundacao;
	}

	public ClientePJVo() {}
	
	/*	Getters && Setters */
	
	public Integer getId_cli() {
		return id_cli;
	}

	public void setId_cli(Integer id_cli) {
		this.id_cli = id_cli;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNm_fantasia() {
		return nm_fantasia;
	}

	public void setNm_fantasia(String nm_fantasia) {
		this.nm_fantasia = nm_fantasia;
	}

	public Date getDt_fundacao() {
		return dt_fundacao;
	}

	public void setDt_fundacao(Date dt_fundacao) {
		this.dt_fundacao = dt_fundacao;
	}


	@Override
	public String toString() {
		return 	"\n * Id Cliente: " 	+ id_cli 		+ 
				"\n * Cnpj: "			+ cnpj 			+ 
				"\n * Razão Social: " 	+ razao_social 	+
				"\n * Nome Fantasia: " 	+ nm_fantasia 	+
				"\n * Data Fundação: " 	+ dt_fundacao 	+ 
				"\n";
	}

}
