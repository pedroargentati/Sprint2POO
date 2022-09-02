
public class TB_CLASSIFICACAO {
	private int cd_classificacao;
	private String nm_classificacao;

	public TB_CLASSIFICACAO(int cd_classificacao, String nm_classificacao) {
		super();
		this.cd_classificacao = cd_classificacao;
		this.nm_classificacao = nm_classificacao;
	}

	@Override
	public String toString() {
		return "TB_CLASSIFICACAO [cd_classificacao=" + cd_classificacao + ", nm_classificacao=" + nm_classificacao
				+ "]";
	}

	public int getCd_classificacao() {
		return cd_classificacao;
	}

	public void setCd_classificacao(int cd_classificacao) {
		this.cd_classificacao = cd_classificacao;
	}

	public String getNm_classificacao() {
		return nm_classificacao;
	}

	public void setNm_classificacao(String nm_classificacao) {
		this.nm_classificacao = nm_classificacao;
	}

}
