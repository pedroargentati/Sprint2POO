
public class TB_CIDADE {
	private String sg_ud;
	private int cd_cidade;
	private String nm_cidade;

	public TB_CIDADE(String sg_ud, int cd_cidade, String nm_cidade) {
		super();
		this.sg_ud = sg_ud;
		this.cd_cidade = cd_cidade;
		this.nm_cidade = nm_cidade;
	}

	@Override
	public String toString() {
		return "TB_CIDADE [sg_ud=" + sg_ud + ", cd_cidade=" + cd_cidade + ", nm_cidade=" + nm_cidade + "]";
	}

	public String getSg_ud() {
		return sg_ud;
	}

	public void setSg_ud(String sg_ud) {
		this.sg_ud = sg_ud;
	}

	public int getCd_cidade() {
		return cd_cidade;
	}

	public void setCd_cidade(int cd_cidade) {
		this.cd_cidade = cd_cidade;
	}

	public String getNm_cidade() {
		return nm_cidade;
	}

	public void setNm_cidade(String nm_cidade) {
		this.nm_cidade = nm_cidade;
	}

}
