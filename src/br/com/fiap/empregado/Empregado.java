package br.com.fiap.empregado;

import br.com.fiap.pessoa.Pessoa;

public abstract class Empregado extends Pessoa {

	protected Integer 	atrIdEmpregado;
	protected String 	atrDepartamento;
	protected double 	atrSalario;
	protected String 	atrRgEmpregado;

	public Empregado(Integer atrIdPessoa, Integer atrIdEmpregado, String atrDepartamento, double atrSalario, String atrRgEmpregado) {
		super(atrIdPessoa);
		this.atrIdEmpregado = atrIdEmpregado;
		this.atrDepartamento = atrDepartamento;
		this.atrSalario = atrSalario;
		this.atrRgEmpregado = atrRgEmpregado;
	}

	public Integer getAtrIdEmpregado() {
		return atrIdEmpregado;
	}

	public void setAtrIdEmpregado(Integer atrIdEmpregado) {
		this.atrIdEmpregado = atrIdEmpregado;
	}

	public String getAtrDepartamento() {
		return atrDepartamento;
	}

	public void setAtrDepartamento(String atrDepartamento) {
		this.atrDepartamento = atrDepartamento;
	}

	public double getAtrSalario() {
		return atrSalario;
	}

	public void setAtrSalario(double atrSalario) {
		this.atrSalario = atrSalario;
	}

	public String getAtrRgEmpregado() {
		return atrRgEmpregado;
	}

	public void setAtrRgEmpregado(String atrRgEmpregado) {
		this.atrRgEmpregado = atrRgEmpregado;
	}

	@Override
	public String toString() {
		return "* Id Empregado: " + atrIdEmpregado + "\n* Departamento: " + atrDepartamento + "\n* Salario: " + atrSalario + "\n* RgEmpregado: " + atrRgEmpregado;
	}
	
}
