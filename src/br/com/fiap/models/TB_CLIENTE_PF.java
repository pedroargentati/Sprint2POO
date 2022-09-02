import java.util.Date;

public class TB_CLIENTE_PF {
	private int id_cli;
	private String cpf_cli;
	private String rg_cli;
	private Date dt_nscmt_cli;
	private String sexo_cli;

	public TB_CLIENTE_PF(int id_cli, String cpf_cli, String rg_cli, Date dt_nscmt_cli, String sexo_cli) {
		super();
		this.id_cli = id_cli;
		this.cpf_cli = cpf_cli;
		this.rg_cli = rg_cli;
		this.dt_nscmt_cli = dt_nscmt_cli;
		this.sexo_cli = sexo_cli;
	}

	@Override
	public String toString() {
		return "TB_CLIENTE_PJ [id_cli=" + id_cli + ", cpf_cli=" + cpf_cli + ", rg_cli=" + rg_cli + ", dt_nscmt_cli="
				+ dt_nscmt_cli + ", sexo_cli=" + sexo_cli + "]";
	}

	public int getId_cli() {
		return id_cli;
	}

	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}

	public String getCpf_cli() {
		return cpf_cli;
	}

	public void setCpf_cli(String cpf_cli) {
		this.cpf_cli = cpf_cli;
	}

	public String getRg_cli() {
		return rg_cli;
	}

	public void setRg_cli(String rg_cli) {
		this.rg_cli = rg_cli;
	}

	public Date getDt_nscmt_cli() {
		return dt_nscmt_cli;
	}

	public void setDt_nscmt_cli(Date dt_nscmt_cli) {
		this.dt_nscmt_cli = dt_nscmt_cli;
	}

	public String getSexo_cli() {
		return sexo_cli;
	}

	public void setSexo_cli(String sexo_cli) {
		this.sexo_cli = sexo_cli;
	}

}
