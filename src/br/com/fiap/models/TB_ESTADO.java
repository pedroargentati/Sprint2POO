
public class TB_ESTADO {
	private String sg_uf;
	private String nm_uf;
	
	public TB_ESTADO(String sg_uf, String nm_uf) {
		super();
		this.sg_uf = sg_uf;
		this.nm_uf = nm_uf;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public String getSg_uf() {
		return sg_uf;
	}
	
	public void setSg_uf(String sg_uf) {
		this.sg_uf = sg_uf;
	}
	
	public String getNm_uf() {
		return nm_uf;
	}
	
	public void setNm_uf(String nm_uf) {
		this.nm_uf = nm_uf;
	}

}
