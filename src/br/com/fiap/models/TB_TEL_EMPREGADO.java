public class TB_TEL_EMPREGADO {
	private int id_emp;
	private String tel_emp;

	public TB_TEL_EMPREGADO(int id_emp, String tel_emp) {
		super();
		this.id_emp = id_emp;
		this.tel_emp = tel_emp;
	}

	@Override
	public String toString() {
		return "TB_TEL_EMPREGADO [id_emp=" + id_emp + ", tel_emp=" + tel_emp + "]";
	}

	public int getId_emp() {
		return id_emp;
	}

	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}

	public String getTel_emp() {
		return tel_emp;
	}

	public void setTel_emp(String tel_emp) {
		this.tel_emp = tel_emp;
	}

}
