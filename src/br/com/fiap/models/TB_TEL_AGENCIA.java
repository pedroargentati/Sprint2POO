
public class TB_TEL_AGENCIA {
	private int cd_ag;
	private String tel_ag;

	public TB_TEL_AGENCIA(int cd_ag, String tel_ag) {
		super();
		this.cd_ag = cd_ag;
		this.tel_ag = tel_ag;
	}

	@Override
	public String toString() {
		return "TB_TEL_AGENCIA [cd_ag=" + cd_ag + ", tel_ag=" + tel_ag + "]";
	}

	public int getCd_ag() {
		return cd_ag;
	}

	public void setCd_ag(int cd_ag) {
		this.cd_ag = cd_ag;
	}

	public String getTel_ag() {
		return tel_ag;
	}

	public void setTel_ag(String tel_ag) {
		this.tel_ag = tel_ag;
	}

}
