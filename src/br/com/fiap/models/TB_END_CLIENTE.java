
public class TB_END_CLIENTE {
	private int cd_end_cli;
	private String cep_end_cli;
	private int nr_end_cli;
	private String comp_end_cli;
	// FK
	private String sg_uf;
	private int cd_cidade;

	public TB_END_CLIENTE(int cd_end_cli, String cep_end_cli, int nr_end_cli, String comp_end_cli, String sg_uf,
			int cd_cidade) {
		super();
		this.cd_end_cli = cd_end_cli;
		this.cep_end_cli = cep_end_cli;
		this.nr_end_cli = nr_end_cli;
		this.comp_end_cli = comp_end_cli;
		this.sg_uf = sg_uf;
		this.cd_cidade = cd_cidade;
	}

	@Override
	public String toString() {
		return "TB_END_CLIENTE [cd_end_cli=" + cd_end_cli + ", cep_end_cli=" + cep_end_cli + ", nr_end_cli="
				+ nr_end_cli + ", comp_end_cli=" + comp_end_cli + ", sg_uf=" + sg_uf + ", cd_cidade=" + cd_cidade + "]";
	}

	public int getCd_end_cli() {
		return cd_end_cli;
	}

	public void setCd_end_cli(int cd_end_cli) {
		this.cd_end_cli = cd_end_cli;
	}

	public String getCep_end_cli() {
		return cep_end_cli;
	}

	public void setCep_end_cli(String cep_end_cli) {
		this.cep_end_cli = cep_end_cli;
	}

	public int getNr_end_cli() {
		return nr_end_cli;
	}

	public void setNr_end_cli(int nr_end_cli) {
		this.nr_end_cli = nr_end_cli;
	}

	public String getComp_end_cli() {
		return comp_end_cli;
	}

	public void setComp_end_cli(String comp_end_cli) {
		this.comp_end_cli = comp_end_cli;
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
