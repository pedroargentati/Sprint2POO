package br.com.fiap.calculos;

public interface TaxaJuros {

	/** 
	 * Taxa de Juros do Banco PAN;
	 * Números em porcentagem;
	 * Fonte: https://www.bancopan.com.br/blog/publicacoes/como-calcular-juros-de-um-emprestimo-simples-e-composto.htm
	**/
	
	public final double BANCO_PAN  		= 0.0795;
	
	public abstract double calculaChequeEspecial();

}
