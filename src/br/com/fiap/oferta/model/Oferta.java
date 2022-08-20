package br.com.fiap.oferta.model;

import java.util.Date;

public class Oferta {

	private Integer 	atrIdOferta;
	private String 		atrNomeOferta;
	private Date 		atrPrazoOferta;

	public Oferta(Integer atrIdOferta, String atrNomeOferta, Date atrPrazoOferta) {
		super();
		this.atrIdOferta = atrIdOferta;
		this.atrNomeOferta = atrNomeOferta;
		this.atrPrazoOferta = atrPrazoOferta;
	}

	public Integer getAtrIdOferta() {
		return atrIdOferta;
	}

	public void setAtrIdOferta(Integer atrIdOferta) {
		this.atrIdOferta = atrIdOferta;
	}

	public String getAtrNomeOferta() {
		return atrNomeOferta;
	}

	public void setAtrNomeOferta(String atrNomeOferta) {
		this.atrNomeOferta = atrNomeOferta;
	}

	public Date getAtrPrazoOferta() {
		return atrPrazoOferta;
	}

	public void setAtrPrazoOferta(Date atrPrazoOferta) {
		this.atrPrazoOferta = atrPrazoOferta;
	}
	
	public void realizarOferta() {
		
	}

	@Override
	public String toString() {
		return "* Id Oferta:" + atrIdOferta + "\n* Nome Oferta: " + atrNomeOferta + "\n* Prazo Oferta: " + atrPrazoOferta;
	}

}
