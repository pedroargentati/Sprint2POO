
public class TB_CONTA {
	private int cd_conta;
	private double saldo_conta;
	private int nr_conta;

	// FK
	private int id_cli;
	private int cd_tp_conta;

	public TB_CONTA(int cd_conta, double saldo_conta, int nr_conta, int id_cli, int cd_tp_conta) {
		super();
		this.cd_conta = cd_conta;
		this.saldo_conta = saldo_conta;
		this.nr_conta = nr_conta;
		this.id_cli = id_cli;
		this.cd_tp_conta = cd_tp_conta;
	}

	@Override
	public String toString() {
		return "TB_CONTA [cd_conta=" + cd_conta + ", saldo_conta=" + saldo_conta + ", nr_conta=" + nr_conta
				+ ", id_cli=" + id_cli + ", cd_tp_conta=" + cd_tp_conta + "]";
	}

	public int getCd_conta() {
		return cd_conta;
	}

	public void setCd_conta(int cd_conta) {
		this.cd_conta = cd_conta;
	}

	public double getSaldo_conta() {
		return saldo_conta;
	}

	public void setSaldo_conta(double saldo_conta) {
		this.saldo_conta = saldo_conta;
	}

	public int getNr_conta() {
		return nr_conta;
	}

	public void setNr_conta(int nr_conta) {
		this.nr_conta = nr_conta;
	}

	public int getId_cli() {
		return id_cli;
	}

	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}

	public int getCd_tp_conta() {
		return cd_tp_conta;
	}

	public void setCd_tp_conta(int cd_tp_conta) {
		this.cd_tp_conta = cd_tp_conta;
	}

}
