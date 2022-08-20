package br.com.fiap.pessoa;

				//| The Interns - 2SIS |
				//	89108 - Felipe Otto da Silva
				//	89199 -	Pedro Henrique Castanheira
				//	88246 - Pedro Martins Procopio Argentati
				//	87486 - Rafael Tannous
				//	87023 - Yasmin Verderame

public abstract class Pessoa {

	protected Integer atrIdPessoa;

	public Pessoa(Integer atrIdPessoa) {
		super();
		this.atrIdPessoa = atrIdPessoa;
	}

	public Integer getAtrIdPessoa() {
		return atrIdPessoa;
	}

	public void setAtrIdPessoa(Integer atrIdPessoa) {
		this.atrIdPessoa = atrIdPessoa;
	}

	@Override
	public String toString() {
		return "* ID Pessoa: " + atrIdPessoa;
	}

}
