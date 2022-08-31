
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
		String select = " \n * Id cliente: " 	 	+ id_cli 	    +
						" \n * Nome cliente: "      + nm_cliente    + 
						" \n * Tipo cliente: " 	    + tp_cliente    + 
						" \n * Telefone cliente: " 	+ tel_cliente   + 
						" \n * Email Cliente: " 	+ email_cliente + "\n";
		
		return select.replaceAll(",", "");
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

}
