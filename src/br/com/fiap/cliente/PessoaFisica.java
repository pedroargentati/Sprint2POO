package br.com.fiap.cliente;

import java.util.Date;

public class PessoaFisica extends Cliente {

	private String 		atrCpf;
	private String 		atrNome;
	private String 		atrRg;
	private Date 		atrDataNascimento;

	public PessoaFisica(Integer atrIdPessoa, Integer atrIdCliente, String atrEndereco, String atrTipoCliente, String atrEmail, String atrCpf, String atrNome, String atrRg, Date atrDataNascimento) {
		super(atrIdPessoa, atrIdCliente, atrEndereco, atrTipoCliente, atrEmail);
		this.atrCpf = atrCpf;
		this.atrNome = atrNome;
		this.atrRg = atrRg;
		this.atrDataNascimento = atrDataNascimento;
	}

	public String getAtrCpf() {
		return atrCpf;
	}

	public void setAtrCpf(String atrCpf) {
		this.atrCpf = atrCpf;
	}

	public String getAtrNome() {
		return atrNome;
	}

	public void setAtrNome(String atrNome) {
		this.atrNome = atrNome;
	}

	public String getAtrRg() {
		return atrRg;
	}

	public void setAtrRg(String atrRg) {
		this.atrRg = atrRg;
	}

	public Date getAtrDataNascimento() {
		return atrDataNascimento;
	}

	public void setAtrDataNascimento(Date atrDataNascimento) {
		this.atrDataNascimento = atrDataNascimento;
	}

	@Override
	public String toString() {
		return "* CPF: " + atrCpf + "\n* Nome: " + atrNome + "\n* atrRg=" + atrRg + "\n* atrDataNascimento: " + atrDataNascimento;
	}
	
	@Override
	public void cadastrarTipoPessoa() {
		System.out.println("Aqui será feito o caadstro da pessoa física.");
	}

	@Override
	public void excluirTipoPessoa() {
		System.out.println("Aqui seá feita a exclusão da pessoa física.");
	}

}
