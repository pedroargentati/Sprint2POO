import java.util.Date;

public class TB_CLIENTE_PJ {
	private int id_cli;
	private String cnpj;
	private String razao_social;
	private String nm_fantasia;
	private Date dt_fundacao;

	public TB_CLIENTE_PJ(int id_cli, String cnpj, String razao_social, String nm_fantasia, Date dt_fundacao) {
		super();
		this.id_cli = id_cli;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
		this.nm_fantasia = nm_fantasia;
		this.dt_fundacao = dt_fundacao;
	}

	@Override
	public String toString() {
		return "TB_CLIENTE_PF [id_cli=" + id_cli + ", cnpj=" + cnpj + ", razao_social=" + razao_social
				+ ", nm_fantasia=" + nm_fantasia + ", dt_fundacao=" + dt_fundacao + "]";
	}

	public int getId_cli() {
		return id_cli;
	}

	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNm_fantasia() {
		return nm_fantasia;
	}

	public void setNm_fantasia(String nm_fantasia) {
		this.nm_fantasia = nm_fantasia;
	}

	public Date getDt_fundacao() {
		return dt_fundacao;
	}

	public void setDt_fundacao(Date dt_fundacao) {
		this.dt_fundacao = dt_fundacao;
	}

}
