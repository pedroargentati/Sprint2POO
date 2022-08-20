package br.com.fiap.cliente;

public class PessoaJuridica extends Cliente {

	private String atrCnpj;
	private String atrNomeFantasia;
	private String atrRazaoSocial;

	public PessoaJuridica(Integer atrIdPessoa, Integer atrIdCliente, String atrEndereco, String atrTipoCliente, String atrEmail, String atrCnpj, String atrNomeFantasia, String atrRazaoSocial) {
		super(atrIdPessoa, atrIdCliente, atrEndereco, atrTipoCliente, atrEmail);
		this.atrCnpj = atrCnpj;
		this.atrNomeFantasia = atrNomeFantasia;
		this.atrRazaoSocial = atrRazaoSocial;
	}

	public String getAtrCnpj() {
		return atrCnpj;
	}

	public void setAtrCnpj(String atrCnpj) {
		this.atrCnpj = atrCnpj;
	}

	public String getAtrNomeFantasia() {
		return atrNomeFantasia;
	}

	public void setAtrNomeFantasia(String atrNomeFantasia) {
		this.atrNomeFantasia = atrNomeFantasia;
	}

	public String getAtrRazaoSocial() {
		return atrRazaoSocial;
	}

	public void setAtrRazaoSocial(String atrRazaoSocial) {
		this.atrRazaoSocial = atrRazaoSocial;
	}

	@Override
	public String toString() {
		return "* CNPJ: " + atrCnpj + "\n* Nome Fantasia: " + atrNomeFantasia + "\n* Razao Social: " + atrRazaoSocial;
	}

	@Override
	public void cadastrarTipoPessoa() {
		System.out.println("Aqui será feito o cadastro da empresa.");
	}

	@Override
	public void excluirTipoPessoa() {
		System.out.println("Aqui será feita a exclusão da empresa.");
	}

}
