
public class TB_TP_OP_AUTONOMA {
	private int cd_tp_op_autonoma;
	private String nm_tp_op_autonoma;

	public TB_TP_OP_AUTONOMA(int cd_tp_op_autonoma, String nm_tp_op_autonoma) {
		super();
		this.cd_tp_op_autonoma = cd_tp_op_autonoma;
		this.nm_tp_op_autonoma = nm_tp_op_autonoma;
	}

	@Override
	public String toString() {
		return "TB_TP_OP_AUTONOMA [cd_tp_op_autonoma=" + cd_tp_op_autonoma + ", nm_tp_op_autonoma=" + nm_tp_op_autonoma
				+ "]";
	}

	public int getCd_tp_op_autonoma() {
		return cd_tp_op_autonoma;
	}

	public void setCd_tp_op_autonoma(int cd_tp_op_autonoma) {
		this.cd_tp_op_autonoma = cd_tp_op_autonoma;
	}

	public String getNm_tp_op_autonoma() {
		return nm_tp_op_autonoma;
	}

	public void setNm_tp_op_autonoma(String nm_tp_op_autonoma) {
		this.nm_tp_op_autonoma = nm_tp_op_autonoma;
	}

}
