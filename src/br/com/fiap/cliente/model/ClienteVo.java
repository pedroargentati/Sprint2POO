
		//		| The Interns - 2SIS |
		//	89108 - Felipe Otto da Silva
		//	89199 -	Pedro Henrique Castanheira
		//	88246 - Pedro Martins Procopio Argentati
		//	87486 - Rafael Tannous
		//	87023 - Yasmin Verderame

/* Tabela Cliente - PK: id_cli */

//CREATE TABLE PESSOA (
//    atrIdPessoa integer,
//    atrNomePessoa varchar2(100),
//    atrIdUsuario integer,
//    atrCPF varchar2(14),
//    atrEndereco varchar2(150),
//    atrTipoCliente varchar2(100) default 'P'
//);
//
//Alter Table Pessoa
//    Add Constraint PessoaPK
//    Primary Key(atrIdPessoa, atrIdUsuario);

package br.com.fiap.cliente.model;

import java.sql.Date;

public class ClienteVo {
	
	private Integer	 id_cli;
	private String	 nm_cliente;
	private String   tp_cliente;
	private String 	 tel_cliente;
	private String   email_cliente;
	
			/*	FK's */
	
	private Integer cd_end_cliente;
	private Integer cd_classificacao;
	private Integer cd_conta;
		
	/*	Campos da ClientePJ */
	
	private String 	cnpj;
	private String 	razao_social;
	private String 	nm_fantasia;
	private Date 	dt_fundacao;
	
	/*	Campos da ClientePF */
	
	private String 	cpf_cli;
	private String 	rg_cli;
	private Date 	dt_nscmt_cli;
	private String 	sexo_cli;
	
			/*	Construtores */
	
	
	
	public ClienteVo(Integer id_cli, String nm_cliente, String tp_cliente, String tel_cliente, String email_cliente) {
		super();
		this.id_cli = id_cli;
		this.nm_cliente = nm_cliente;
		this.tp_cliente = tp_cliente;
		this.tel_cliente = tel_cliente;
		this.email_cliente = email_cliente;
	}

	public ClienteVo() {}
	
	/*	Getters && Setters */
	
	public Integer getId_cli() {
		return id_cli;
	}

	public void setId_cli(Integer id_cli) {
		this.id_cli = id_cli;
	}

	public String getNm_cliente() {
		return nm_cliente;
	}

	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}

	public String getTp_cliente() {
		return tp_cliente;
	}

	public void setTp_cliente(String tp_cliente) {
		this.tp_cliente = tp_cliente;
	}

	public String getTel_cliente() {
		return tel_cliente;
	}

	public void setTel_cliente(String tel_cliente) {
		this.tel_cliente = tel_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public Integer getCd_end_cliente() {
		return cd_end_cliente;
	}

	public void setCd_end_cliente(Integer cd_end_cliente) {
		this.cd_end_cliente = cd_end_cliente;
	}

	public Integer getCd_classificacao() {
		return cd_classificacao;
	}
	
	@Override
	public String toString() { 
		StringBuffer ts = new StringBuffer();
		ts.append(" \n * Id cliente: " 	 	  + id_cli ); 
		ts.append(" \n * Nome cliente: "      + nm_cliente );
		ts.append(" \n * Tipo cliente: " 	  + tp_cliente );
		ts.append(" \n * Telefone cliente: "  + tel_cliente);
		ts.append(" \n * Email Cliente: " 	  + email_cliente );
						
		if ( cnpj != null && razao_social != null && nm_fantasia != null && dt_fundacao != null ) {
			ts.append("\n * Cnpj: "				+ cnpj );
			ts.append("\n * Nome Fantasia: " 	+ nm_fantasia );
			ts.append("\n * Data fundação: " 	+ dt_fundacao );
		}
		
		if ( cpf_cli != null && rg_cli != null && dt_nscmt_cli != null && sexo_cli != null ) {
			ts.append("\n * CPF: "				+  cpf_cli );
			ts.append("\n * RG cliente: " 		+  rg_cli );
			ts.append("\n * Data nascimento: " 	+  dt_nscmt_cli );
			ts.append("\n * Sexo: " 			+  sexo_cli );
		}
		
		return ts.toString();
	}

	public void setCd_classificacao(Integer cd_classificacao) {
		this.cd_classificacao = cd_classificacao;
	}

	public Integer getCd_conta() {
		return cd_conta;
	}

	public void setCd_conta(Integer cd_conta) {
		this.cd_conta = cd_conta;
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

}
