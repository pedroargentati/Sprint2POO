
public class TB_CLIENTE {
	private int id_cli;
	private String nm_cli;
	private String tp_cli;
	private String tel_cli;
	private String email_cli;
	// FK
	private int cd_end_cli;
	private int cd_classificacao;
	private int cd_conta;

	public TB_CLIENTE(int id_cli, String nm_cli, String tp_cli, String tel_cli, String email_cli, int cd_end_cli,
			int cd_classificacao, int cd_conta) {
		super();
		this.id_cli = id_cli;
		this.nm_cli = nm_cli;
		this.tp_cli = tp_cli;
		this.tel_cli = tel_cli;
		this.email_cli = email_cli;
		this.cd_end_cli = cd_end_cli;
		this.cd_classificacao = cd_classificacao;
		this.cd_conta = cd_conta;
	}

	@Override
	public String toString() {
		return "TB_CLIENTE [id_cli=" + id_cli + ", nm_cli=" + nm_cli + ", tp_cli=" + tp_cli + ", tel_cli=" + tel_cli
				+ ", email_cli=" + email_cli + ", cd_end_cli=" + cd_end_cli + ", cd_classificacao=" + cd_classificacao
				+ ", cd_conta=" + cd_conta + "]";
	}

	public int getId_cli() {
		return id_cli;
	}

	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}

	public String getNm_cli() {
		return nm_cli;
	}

	public void setNm_cli(String nm_cli) {
		this.nm_cli = nm_cli;
	}

	public String getTp_cli() {
		return tp_cli;
	}

	public void setTp_cli(String tp_cli) {
		this.tp_cli = tp_cli;
	}

	public String getTel_cli() {
		return tel_cli;
	}

	public void setTel_cli(String tel_cli) {
		this.tel_cli = tel_cli;
	}

	public String getEmail_cli() {
		return email_cli;
	}

	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}

	public int getCd_end_cli() {
		return cd_end_cli;
	}

	public void setCd_end_cli(int cd_end_cli) {
		this.cd_end_cli = cd_end_cli;
	}

	public int getCd_classificacao() {
		return cd_classificacao;
	}

	public void setCd_classificacao(int cd_classificacao) {
		this.cd_classificacao = cd_classificacao;
	}

	public int getCd_conta() {
		return cd_conta;
	}

	public void setCd_conta(int cd_conta) {
		this.cd_conta = cd_conta;
	}

}
