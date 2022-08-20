package br.com.fiap.conta.model;

import br.com.fiap.calculos.TaxaJuros;

public class ContaCorrente extends Conta implements TaxaJuros{

	private double atrChequeEspecial;
	private Integer atrPeriodoCheque;
	private double atrLimite;


	public ContaCorrente(Integer atrNumConta, Integer atrNumAgencia, double atrSaldoConta, double atrChequeEspecial, Integer atrPeriodoCheque, double atrLimite) {
		super(atrNumConta, atrNumAgencia, atrSaldoConta);
		this.atrChequeEspecial = atrChequeEspecial;
		this.atrPeriodoCheque = atrPeriodoCheque;
		this.atrLimite = atrLimite;
	}

	public Integer getAtrPeriodoCheque() {
		return atrPeriodoCheque;
	}

	public void setAtrPeriodoCheque(Integer atrPeriodoCheque) {
		this.atrPeriodoCheque = atrPeriodoCheque;
	}

	public double getAtrChequeEspecial() {
		return atrChequeEspecial;
	}

	public void setAtrChequeEspecial(double atrChequeEspecial) {
		this.atrChequeEspecial = atrChequeEspecial;
	}

	public double getAtrLimite() {
		return atrLimite;
	}

	public void setAtrLimite(double atrLimite) {
		this.atrLimite = atrLimite;
	}

	@Override
	public String toString() {
		return "* Cheque Especial: " + atrChequeEspecial + "\n* Limite: " + atrLimite + "\n* Per�odo: " + atrPeriodoCheque;
	}

	@Override
	public double calculaChequeEspecial() {
		double juros = (atrChequeEspecial * (BANCO_PAN / 20) * atrPeriodoCheque) / 30;
		return juros;
	}
	
}
