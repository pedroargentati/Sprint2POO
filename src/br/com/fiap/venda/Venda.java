package br.com.fiap.venda;

import java.util.Date;

public class Venda {

	private Integer 	atridVenda;
	private Date 		atrDatavenda;

	public Venda(Integer atridVenda, Date atrDatavenda) {
		super();
		this.atridVenda = atridVenda;
		this.atrDatavenda = atrDatavenda;
	}

	public Integer getAtridVenda() {
		return atridVenda;
	}

	public void setAtridVenda(Integer atridVenda) {
		this.atridVenda = atridVenda;
	}

	public Date getAtrDatavenda() {
		return atrDatavenda;
	}

	public void setAtrDatavenda(Date atrDatavenda) {
		this.atrDatavenda = atrDatavenda;
	}
	
	public void realizarvenda() {
		
	}

	@Override
	public String toString() {
		return "* ID Venda: " + atridVenda + "\n* Data venda: " + atrDatavenda;
	}

}
