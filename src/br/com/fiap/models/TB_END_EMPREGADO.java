
public class TB_END_EMPREGADO {
	private int cd_end_emp;
	private String cep_end_emp;
	private int nr_end_emp;
	private String comp_end_emp;
	// FK
	private String sg_uf;
	private int cd_cidade;

	public TB_END_EMPREGADO(int cd_end_emp, String cep_end_emp, int nr_end_emp, String comp_end_emp, String sg_uf,
			int cd_cidade) {
		super();
		this.cd_end_emp = cd_end_emp;
		this.cep_end_emp = cep_end_emp;
		this.nr_end_emp = nr_end_emp;
		this.comp_end_emp = comp_end_emp;
		this.sg_uf = sg_uf;
		this.cd_cidade = cd_cidade;
	}

	@Override
	public String toString() {
		return "TB_END_EMPREGADO [cd_end_emp=" + cd_end_emp + ", cep_end_emp=" + cep_end_emp + ", nr_end_emp="
				+ nr_end_emp + ", comp_end_emp=" + comp_end_emp + ", sg_uf=" + sg_uf + ", cd_cidade=" + cd_cidade + "]";
	}

	public int getCd_end_emp() {
		return cd_end_emp;
	}

	public void setCd_end_emp(int cd_end_emp) {
		this.cd_end_emp = cd_end_emp;
	}

	public String getCep_end_emp() {
		return cep_end_emp;
	}

	public void setCep_end_emp(String cep_end_emp) {
		this.cep_end_emp = cep_end_emp;
	}

	public int getNr_end_emp() {
		return nr_end_emp;
	}

	public void setNr_end_emp(int nr_end_emp) {
		this.nr_end_emp = nr_end_emp;
	}

	public String getComp_end_emp() {
		return comp_end_emp;
	}

	public void setComp_end_emp(String comp_end_emp) {
		this.comp_end_emp = comp_end_emp;
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
