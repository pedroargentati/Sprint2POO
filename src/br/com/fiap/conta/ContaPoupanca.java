package br.com.fiap.conta;

import br.com.fiap.calculos.Rendimento;

public class ContaPoupanca extends Conta implements Rendimento {

	private double 	atRendimento;
	private Integer atrDiasRendimento;
	
	public ContaPoupanca(Integer atrNumConta, Integer atrNumAgencia, double atrSaldoConta, double atRendimento, Integer atrDiasRendimento) {
		super(atrNumConta, atrNumAgencia, atrSaldoConta);
		this.atRendimento = atRendimento;
		this.atrDiasRendimento = atrDiasRendimento;
	}

	public double getAtRendimento() {
		return atRendimento;
	}

	public void setAtRendimento(double atRendimento) {
		this.atRendimento = atRendimento;
	}

	public Integer getAtrDiasRendimento() {
		return atrDiasRendimento;
	}

	public void setAtrDiasRendimento(Integer atrDiasRendimento) {
		this.atrDiasRendimento = atrDiasRendimento;
	}

	@Override
	public String toString() {
		return "* Rendimento: " + atRendimento + "\n* Dias Rendimento: " + atrDiasRendimento;
	}

	@Override
	public double calculaRendimento() {
		return atrDiasRendimento * atRendimento;
	}

}
