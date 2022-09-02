
public class TB_AGENCIA {
	private int cd_ag;
	private String email_ag;
	//FK
	private int cd_end_ag;

	public TB_AGENCIA(int cd_ag, String email_ag, int cd_end_ag) {
		super();
		this.cd_ag = cd_ag;
		this.email_ag = email_ag;
		this.cd_end_ag = cd_end_ag;
	}

	@Override
	public String toString() {
		return "TB_AGENCIA [cd_ag=" + cd_ag + ", email_ag=" + email_ag + ", cd_end_ag=" + cd_end_ag + "]";
	}

	public int getCd_ag() {
		return cd_ag;
	}

	public void setCd_ag(int cd_ag) {
		this.cd_ag = cd_ag;
	}

	public String getEmail_ag() {
		return email_ag;
	}

	public void setEmail_ag(String email_ag) {
		this.email_ag = email_ag;
	}

	public int getCd_end_ag() {
		return cd_end_ag;
	}

	public void setCd_end_ag(int cd_end_ag) {
		this.cd_end_ag = cd_end_ag;
	}

}
