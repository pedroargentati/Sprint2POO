
public class TB_OP_SUPERVISIONADA {
	private int cd_op_supervisionada;
	private int cd_op;
	// FK
	private int cd_tp_op_supervisionada;
	private int id_gerente;

	public TB_OP_SUPERVISIONADA(int cd_op_supervisionada, int cd_op, int cd_tp_op_supervisionada, int id_gerente) {
		super();
		this.cd_op_supervisionada = cd_op_supervisionada;
		this.cd_op = cd_op;
		this.cd_tp_op_supervisionada = cd_tp_op_supervisionada;
		this.id_gerente = id_gerente;
	}

	@Override
	public String toString() {
		return "TB_OP_SUPERVISIONADA [cd_op_supervisionada=" + cd_op_supervisionada + ", cd_op=" + cd_op
				+ ", cd_tp_op_supervisionada=" + cd_tp_op_supervisionada + ", id_gerente=" + id_gerente + "]";
	}

	public int getCd_op_supervisionada() {
		return cd_op_supervisionada;
	}

	public void setCd_op_supervisionada(int cd_op_supervisionada) {
		this.cd_op_supervisionada = cd_op_supervisionada;
	}

	public int getCd_op() {
		return cd_op;
	}

	public void setCd_op(int cd_op) {
		this.cd_op = cd_op;
	}

	public int getCd_tp_op_supervisionada() {
		return cd_tp_op_supervisionada;
	}

	public void setCd_tp_op_supervisionada(int cd_tp_op_supervisionada) {
		this.cd_tp_op_supervisionada = cd_tp_op_supervisionada;
	}

	public int getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(int id_gerente) {
		this.id_gerente = id_gerente;
	}

}
