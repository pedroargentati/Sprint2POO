//package br.com.fiap.empregado.model;
//
//import br.com.fiap.calculos.Bonus;
//
//public class Gerente extends Empregado implements Bonus {
//
//	private double atrBonus;
//
//	public Gerente(Integer atrIdPessoa, Integer atrIdEmpregado, String atrDepartamento, double atrSalario, String atrRgEmpregado, double atrBonus) {
//		super(atrIdPessoa, atrIdEmpregado, atrDepartamento, atrSalario, atrRgEmpregado);
//		this.atrBonus = atrBonus;
//	}
//
//	public double getAtrBonus() {
//		return atrBonus;
//	}
//
//	public void setAtrBonus(double atrBonus) {
//		this.atrBonus = atrBonus;
//	}
//
//	@Override
//	public String toString() {
//		return "* Bonus=" + atrBonus;
//	}
//
//	@Override
//	public double calcularBonus() {
//		return atrSalario * atrBonus / 100;
//	}
//
//}
