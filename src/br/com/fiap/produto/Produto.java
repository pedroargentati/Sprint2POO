package br.com.fiap.produto;

public class Produto {

	private Integer 	atrIdProduto;
	private String		atrNomeProduto;
	private String 		atrTipoProduto;

	public Produto(Integer atrIdProduto, String atrNomeProduto, String atrTipoProduto) {
		super();
		this.atrIdProduto = atrIdProduto;
		this.atrNomeProduto = atrNomeProduto;
		this.atrTipoProduto = atrTipoProduto;
	}

	public Integer getAtrIdProduto() {
		return atrIdProduto;
	}

	public void setAtrIdProduto(Integer atrIdProduto) {
		this.atrIdProduto = atrIdProduto;
	}

	public String getAtrNomeProduto() {
		return atrNomeProduto;
	}

	public void setAtrNomeProduto(String atrNomeProduto) {
		this.atrNomeProduto = atrNomeProduto;
	}

	public String getAtrTipoProduto() {
		return atrTipoProduto;
	}

	public void setAtrTipoProduto(String atrTipoProduto) {
		this.atrTipoProduto = atrTipoProduto;
	}

	@Override
	public String toString() {
		return "* Id Produto: " + atrIdProduto + "\n* Nome Produto: " + atrNomeProduto + "\n* Tipo Produto: " + atrTipoProduto;
	}

}
