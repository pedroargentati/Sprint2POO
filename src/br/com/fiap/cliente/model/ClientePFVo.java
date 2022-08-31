package br.com.fiap.cliente.model;

import java.sql.Date;

public class ClientePFVo extends ClienteVo {

	private Integer id_cli;
	private String 	cpf_cli;
	private String 	rg_cli;
	private Date 	dt_nscmt_cli;
	private String 	sexo_cli;

	/*	Construtores */

	public ClientePFVo(Integer id_cli, String nm_cliente, String tp_cliente, String tel_cliente, String email_cliente, Integer id_cli2, String cpf_cli, String rg_cli, Date dt_nscmt_cli, String sexo_cli) {
		super(id_cli, nm_cliente, tp_cliente, tel_cliente, email_cliente);
		id_cli = id_cli2;
		this.cpf_cli = cpf_cli;
		this.rg_cli = rg_cli;
		this.dt_nscmt_cli = dt_nscmt_cli;
		this.sexo_cli = sexo_cli;
	}
	
	public ClientePFVo() {}
	
	/* Getters && Setters */
	
	public Integer getId_cli() {
		return id_cli;
	}

	public void setId_cli(Integer id_cli) {
		this.id_cli = id_cli;
	}

	public String getCpf_cli() {
		return cpf_cli;
	}

	public void setCpf_cli(String cpf_cli) {
		this.cpf_cli = cpf_cli;
	}

	public String getRg_cli() {
		return rg_cli;
	}

	public void setRg_cli(String rg_cli) {
		this.rg_cli = rg_cli;
	}

	public Date getDt_nscmt_cli() {
		return dt_nscmt_cli;
	}

	public void setDt_nscmt_cli(Date dt_nscmt_cli) {
		this.dt_nscmt_cli = dt_nscmt_cli;
	}

	public String getSexo_cli() {
		return sexo_cli;
	}

	public void setSexo_cli(String sexo_cli) {
		this.sexo_cli = sexo_cli;
	}

	@Override
	public String toString() {
		return 	"\n * Id cliente: " 		+  id_cli 		+ 
				"\n * CPF: "				+  cpf_cli 		+ 
				"\n * RG cliente: " 		+  rg_cli 		+
				"\n * Data nascimento: " 	+  dt_nscmt_cli +
				"\n * Sexo: " 				+  sexo_cli 	+ 
				"\n";
	}

}
