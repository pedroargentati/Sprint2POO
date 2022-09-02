
public class TB_CARGO_EMPREGADO {
	private int cd_cargo;
	private String nm_cargo;

	public TB_CARGO_EMPREGADO(int cd_cargo, String nm_cargo) {
		super();
		this.cd_cargo = cd_cargo;
		this.nm_cargo = nm_cargo;
	}

	@Override
	public String toString() {
		return "TB_CARGO_EMPREGADO [cd_cargo=" + cd_cargo + ", nm_cargo=" + nm_cargo + "]";
	}

	public int getCd_cargo() {
		return cd_cargo;
	}

	public void setCd_cargo(int cd_cargo) {
		this.cd_cargo = cd_cargo;
	}

	public String getNm_cargo() {
		return nm_cargo;
	}

	public void setNm_cargo(String nm_cargo) {
		this.nm_cargo = nm_cargo;
	}

}
