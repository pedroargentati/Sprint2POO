
public class TB_OP_AUTONOMA {
	private int cd_op_autonoma;
	// FK
	private int cd_op;
	private int cd_tp_op_autonoma;

	public TB_OP_AUTONOMA(int cd_op_autonoma, int cd_op, int cd_tp_op_autonoma) {
		super();
		this.cd_op_autonoma = cd_op_autonoma;
		this.cd_op = cd_op;
		this.cd_tp_op_autonoma = cd_tp_op_autonoma;
	}

	@Override
	public String toString() {
		return "TB_OP_AUTONOMA [cd_op_autonoma=" + cd_op_autonoma + ", cd_op=" + cd_op + ", cd_tp_op_autonoma="
				+ cd_tp_op_autonoma + "]";
	}

	public int getCd_op_autonoma() {
		return cd_op_autonoma;
	}

	public void setCd_op_autonoma(int cd_op_autonoma) {
		this.cd_op_autonoma = cd_op_autonoma;
	}

	public int getCd_op() {
		return cd_op;
	}

	public void setCd_op(int cd_op) {
		this.cd_op = cd_op;
	}

	public int getCd_tp_op_autonoma() {
		return cd_tp_op_autonoma;
	}

	public void setCd_tp_op_autonoma(int cd_tp_op_autonoma) {
		this.cd_tp_op_autonoma = cd_tp_op_autonoma;
	}

}
