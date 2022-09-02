import java.util.Date;

public class TB_OPERACAO {
	private int cd_op;
	private String tp_op;
	private Date dt_op;
	private int valor_operacao;
	// FK
	private int id_cli;

	public TB_OPERACAO(int cd_op, String tp_op, Date dt_op, int valor_operacao, int id_cli) {
		super();
		this.cd_op = cd_op;
		this.tp_op = tp_op;
		this.dt_op = dt_op;
		this.valor_operacao = valor_operacao;
		this.id_cli = id_cli;
	}

	@Override
	public String toString() {
		return "TB_OPERACAO [cd_op=" + cd_op + ", tp_op=" + tp_op + ", dt_op=" + dt_op + ", valor_operacao="
				+ valor_operacao + ", id_cli=" + id_cli + "]";
	}

	public int getCd_op() {
		return cd_op;
	}

	public void setCd_op(int cd_op) {
		this.cd_op = cd_op;
	}

	public String getTp_op() {
		return tp_op;
	}

	public void setTp_op(String tp_op) {
		this.tp_op = tp_op;
	}

	public Date getDt_op() {
		return dt_op;
	}

	public void setDt_op(Date dt_op) {
		this.dt_op = dt_op;
	}

	public int getValor_operacao() {
		return valor_operacao;
	}

	public void setValor_operacao(int valor_operacao) {
		this.valor_operacao = valor_operacao;
	}

	public int getId_cli() {
		return id_cli;
	}

	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}

}
