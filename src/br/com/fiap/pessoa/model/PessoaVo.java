
		//		| The Interns - 2SIS |
		//	89108 - Felipe Otto da Silva
		//	89199 -	Pedro Henrique Castanheira
		//	88246 - Pedro Martins Procopio Argentati
		//	87486 - Rafael Tannous
		//	87023 - Yasmin Verderame

/* Tabela Pessoa - PK: atrIdPessoa, atrIdUsuario */

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

package br.com.fiap.pessoa.model;

public class PessoaVo {
	
	private Integer	 atrIdPessoa;
	private String	 atrNomePessoa;
	private Integer  atrIdUsuario;
	private String 	 atrCPF;
	private String   atrEndereco;
	private String   atrTipoCliente;

	public PessoaVo() {}
	
	public PessoaVo(Integer atrIdPessoa, String atrNomePessoa, Integer atrIdUsuario, String atrCPF, String atrEndereco, String atrTipoCliente) {
		super();
		this.atrIdPessoa	 = atrIdPessoa;
		this.atrNomePessoa	 = atrNomePessoa;
		this.atrIdUsuario	 = atrIdUsuario;
		this.atrCPF			 = atrCPF;
		this.atrEndereco	 = atrEndereco;
		this.atrTipoCliente	 = atrTipoCliente;
	}

	public Integer getAtrIdPessoa() {
		return atrIdPessoa;
	}

	public void setAtrIdPessoa(Integer atrIdPessoa) {
		this.atrIdPessoa = atrIdPessoa;
	}

	public String getAtrNomePessoa() {
		return atrNomePessoa;
	}

	public void setAtrNomePessoa(String atrNomePessoa) {
		this.atrNomePessoa = atrNomePessoa;
	}

	public Integer getAtrIdUsuario() {
		return atrIdUsuario;
	}

	public void setAtrIdUsuario(Integer atrIdUsuario) {
		this.atrIdUsuario = atrIdUsuario;
	}

	public String getAtrCPF() {
		return atrCPF;
	}

	public void setAtrCPF(String atrCPF) {
		this.atrCPF = atrCPF;
	}

	public String getAtrEndereco() {
		return atrEndereco;
	}

	public void setAtrEndereco(String atrEndereco) {
		this.atrEndereco = atrEndereco;
	}

	public String getAtrTipoCliente() {
		return atrTipoCliente;
	}

	public void setAtrTipoCliente(String atrTipoCliente) {
		this.atrTipoCliente = atrTipoCliente;
	}

	@Override
	public String toString() {
		String select = " \n * atrIdPessoa: " 	 + atrIdPessoa 	  +
						" \n * atrNomePessoa: "  + atrNomePessoa  + 
						" \n * atrIdUsuario: " 	 + atrIdUsuario   + 
						" \n * atrCPF: " 		 + atrCPF 		  + 
						" \n * atrEndereco: " 	 + atrEndereco 	  + 
						" \n * atrTipoCliente: " + atrTipoCliente + "\n";
		
		return select.replaceAll(",", "");
	}

}
