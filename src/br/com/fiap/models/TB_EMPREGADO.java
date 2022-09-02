import java.util.Date;

public class TB_EMPREGADO {
	private int id_emp;
	private String nm_emp;
	private String cpf_emp;
	private String rg_emp;
	private Date dt_nscmt_emp;
	private String sexo_emp;
	private double salario_emp;
	private String email_em;
	// FK
	private int cd_cargo;
	private int cd_ag;
	private int cd_end_emp;

	public TB_EMPREGADO(int id_emp, String nm_emp, String cpf_emp, String rg_emp, Date dt_nscmt_emp, String sexo_emp,
			double salario_emp, String email_em, int cd_cargo, int cd_ag, int cd_end_emp) {
		super();
		this.id_emp = id_emp;
		this.nm_emp = nm_emp;
		this.cpf_emp = cpf_emp;
		this.rg_emp = rg_emp;
		this.dt_nscmt_emp = dt_nscmt_emp;
		this.sexo_emp = sexo_emp;
		this.salario_emp = salario_emp;
		this.email_em = email_em;
		this.cd_cargo = cd_cargo;
		this.cd_ag = cd_ag;
		this.cd_end_emp = cd_end_emp;
	}

	@Override
	public String toString() {
		return "TB_EMPREGADO [id_emp=" + id_emp + ", nm_emp=" + nm_emp + ", cpf_emp=" + cpf_emp + ", rg_emp=" + rg_emp
				+ ", dt_nscmt_emp=" + dt_nscmt_emp + ", sexo_emp=" + sexo_emp + ", salario_emp=" + salario_emp
				+ ", email_em=" + email_em + ", cd_cargo=" + cd_cargo + ", cd_ag=" + cd_ag + ", cd_end_emp="
				+ cd_end_emp + "]";
	}

	public int getId_emp() {
		return id_emp;
	}

	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}

	public String getNm_emp() {
		return nm_emp;
	}

	public void setNm_emp(String nm_emp) {
		this.nm_emp = nm_emp;
	}

	public String getCpf_emp() {
		return cpf_emp;
	}

	public void setCpf_emp(String cpf_emp) {
		this.cpf_emp = cpf_emp;
	}

	public String getRg_emp() {
		return rg_emp;
	}

	public void setRg_emp(String rg_emp) {
		this.rg_emp = rg_emp;
	}

	public Date getDt_nscmt_emp() {
		return dt_nscmt_emp;
	}

	public void setDt_nscmt_emp(Date dt_nscmt_emp) {
		this.dt_nscmt_emp = dt_nscmt_emp;
	}

	public String getSexo_emp() {
		return sexo_emp;
	}

	public void setSexo_emp(String sexo_emp) {
		this.sexo_emp = sexo_emp;
	}

	public double getSalario_emp() {
		return salario_emp;
	}

	public void setSalario_emp(double salario_emp) {
		this.salario_emp = salario_emp;
	}

	public String getEmail_em() {
		return email_em;
	}

	public void setEmail_em(String email_em) {
		this.email_em = email_em;
	}

	public int getCd_cargo() {
		return cd_cargo;
	}

	public void setCd_cargo(int cd_cargo) {
		this.cd_cargo = cd_cargo;
	}

	public int getCd_ag() {
		return cd_ag;
	}

	public void setCd_ag(int cd_ag) {
		this.cd_ag = cd_ag;
	}

	public int getCd_end_emp() {
		return cd_end_emp;
	}

	public void setCd_end_emp(int cd_end_emp) {
		this.cd_end_emp = cd_end_emp;
	}

}
