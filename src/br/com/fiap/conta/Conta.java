package br.com.fiap.conta;

public abstract class Conta {

	protected Integer 	atrNumConta;
	protected Integer 	atrNumAgencia;
	protected double 	atrSaldoConta;

	public Conta(Integer atrNumConta, Integer atrNumAgencia, double atrSaldoConta) {
		super();
		this.atrNumConta = atrNumConta;
		this.atrNumAgencia = atrNumAgencia;
		this.atrSaldoConta = atrSaldoConta;
	}

	public Integer getAtrNumConta() {
		return atrNumConta;
	}

	public void setAtrNumConta(Integer atrNumConta) {
		this.atrNumConta = atrNumConta;
	}

	public Integer getAtrNumAgencia() {
		return atrNumAgencia;
	}

	public void setAtrNumAgencia(Integer atrNumAgencia) {
		this.atrNumAgencia = atrNumAgencia;
	}

	public double getAtrSaldoConta() {
		return atrSaldoConta;
	}

	public void setAtrSaldoConta(double atrSaldoConta) {
		this.atrSaldoConta = atrSaldoConta;
	}

	@Override
	public String toString() {
		return "* Número Conta: " + atrNumConta + "\n* Número Agência: " + atrNumAgencia + "\n* Saldo Conta: " + atrSaldoConta;
	}

}
