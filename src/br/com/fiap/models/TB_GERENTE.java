
public class TB_GERENTE {
	private int id_gerente;
	private int qntd_operacao;

	public TB_GERENTE(int id_gerente, int qntd_operacao) {
		super();
		this.id_gerente = id_gerente;
		this.qntd_operacao = qntd_operacao;
	}

	@Override
	public String toString() {
		return "TB_GERENTE [id_gerente=" + id_gerente + ", qntd_operacao=" + qntd_operacao + "]";
	}

	public int getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(int id_gerente) {
		this.id_gerente = id_gerente;
	}

	public int getQntd_operacao() {
		return qntd_operacao;
	}

	public void setQntd_operacao(int qntd_operacao) {
		this.qntd_operacao = qntd_operacao;
	}

}
