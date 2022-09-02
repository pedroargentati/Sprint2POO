
public class TB_TP_OP_SUPERVISIONADA {
	private int cd_tp_op_supervisionada;
	private String nm_tp_op_supervisionada;

	public TB_TP_OP_SUPERVISIONADA(int cd_tp_op_supervisionada, String nm_tp_op_supervisionada) {
		super();
		this.cd_tp_op_supervisionada = cd_tp_op_supervisionada;
		this.nm_tp_op_supervisionada = nm_tp_op_supervisionada;
	}

	@Override
	public String toString() {
		return "TB_TP_OP_SUPERVISIONADA [cd_tp_op_supervisionada=" + cd_tp_op_supervisionada
				+ ", nm_tp_op_supervisionada=" + nm_tp_op_supervisionada + "]";
	}

	public int getCd_tp_op_supervisionada() {
		return cd_tp_op_supervisionada;
	}

	public void setCd_tp_op_supervisionada(int cd_tp_op_supervisionada) {
		this.cd_tp_op_supervisionada = cd_tp_op_supervisionada;
	}

	public String getNm_tp_op_supervisionada() {
		return nm_tp_op_supervisionada;
	}

	public void setNm_tp_op_supervisionada(String nm_tp_op_supervisionada) {
		this.nm_tp_op_supervisionada = nm_tp_op_supervisionada;
	}

}
