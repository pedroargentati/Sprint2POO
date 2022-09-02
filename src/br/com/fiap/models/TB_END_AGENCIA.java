
public class TB_END_AGENCIA {
	private int cd_end_ag;
	private String cep_end_ag;
	private int nr_end_ag;
	private String comp_end_ag;
	// FK
	private String sg_uf;
	private int cd_cidade;

	public TB_END_AGENCIA(int cd_end_ag, String cep_end_ag, int nr_end_ag, String comp_end_ag, String sg_uf,
			int cd_cidade) {
		super();
		this.cd_end_ag = cd_end_ag;
		this.cep_end_ag = cep_end_ag;
		this.nr_end_ag = nr_end_ag;
		this.comp_end_ag = comp_end_ag;
		this.sg_uf = sg_uf;
		this.cd_cidade = cd_cidade;
	}

	@Override
	public String toString() {
		return "TB_END_AGENCIA [cd_end_ag=" + cd_end_ag + ", cep_end_ag=" + cep_end_ag + ", nr_end_ag=" + nr_end_ag
				+ ", comp_end_ag=" + comp_end_ag + ", sg_uf=" + sg_uf + ", cd_cidade=" + cd_cidade + "]";
	}

	public int getCd_end_ag() {
		return cd_end_ag;
	}

	public void setCd_end_ag(int cd_end_ag) {
		this.cd_end_ag = cd_end_ag;
	}

	public String getCep_end_ag() {
		return cep_end_ag;
	}

	public void setCep_end_ag(String cep_end_ag) {
		this.cep_end_ag = cep_end_ag;
	}

	public int getNr_end_ag() {
		return nr_end_ag;
	}

	public void setNr_end_ag(int nr_end_ag) {
		this.nr_end_ag = nr_end_ag;
	}

	public String getComp_end_ag() {
		return comp_end_ag;
	}

	public void setComp_end_ag(String comp_end_ag) {
		this.comp_end_ag = comp_end_ag;
	}

	public String getSg_uf() {
		return sg_uf;
	}

	public void setSg_uf(String sg_uf) {
		this.sg_uf = sg_uf;
	}

	public int getCd_cidade() {
		return cd_cidade;
	}

	public void setCd_cidade(int cd_cidade) {
		this.cd_cidade = cd_cidade;
	}

}
