
public class TB_TP_CONTA {
	private int cd_tp_conta;
	private String nm_tp_conta;

	public TB_TP_CONTA(int cd_tp_conta, String nm_tp_conta) {
		super();
		this.cd_tp_conta = cd_tp_conta;
		this.nm_tp_conta = nm_tp_conta;
	}

	@Override
	public String toString() {
		return "TB_TP_CONTA [cd_tp_conta=" + cd_tp_conta + ", nm_tp_conta=" + nm_tp_conta + "]";
	}

	public int getCd_tp_conta() {
		return cd_tp_conta;
	}

	public void setCd_tp_conta(int cd_tp_conta) {
		this.cd_tp_conta = cd_tp_conta;
	}

	public String getNm_tp_conta() {
		return nm_tp_conta;
	}

	public void setNm_tp_conta(String nm_tp_conta) {
		this.nm_tp_conta = nm_tp_conta;
	}

}
