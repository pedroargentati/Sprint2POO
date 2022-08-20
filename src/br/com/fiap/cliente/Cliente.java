package br.com.fiap.cliente;

import br.com.fiap.pessoa.Pessoa;

public abstract class Cliente extends Pessoa {

	protected Integer 	atrIdCliente;
	protected String 	atrEndereco;
	protected String 	atrTipoCliente;
	protected String 	atrEmail;

	public Cliente(Integer atrIdPessoa, Integer atrIdCliente, String atrEndereco, String atrTipoCliente, String atrEmail) {
		super(atrIdPessoa);
		this.atrIdCliente = atrIdCliente;
		this.atrEndereco = atrEndereco;
		this.atrTipoCliente = atrTipoCliente;
		this.atrEmail = atrEmail;
	}
	
	public abstract void cadastrarTipoPessoa();
	public abstract void excluirTipoPessoa();

	public Integer getAtrIdCliente() {
		return atrIdCliente;
	}

	public void setAtrIdCliente(Integer atrIdCliente) {
		this.atrIdCliente = atrIdCliente;
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

	public String getAtrEmail() {
		return atrEmail;
	}

	public void setAtrEmail(String atrEmail) {
		this.atrEmail = atrEmail;
	}

	@Override
	public String toString() {
		return "* atrIdCliente: " + atrIdCliente + "\n* atrEndereco: " + atrEndereco + "\n* atrTipoCliente: "+ atrTipoCliente + "\n* atrEmail: " + atrEmail;
	}

}
