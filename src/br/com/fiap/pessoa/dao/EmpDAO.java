package br.com.fiap.pessoa.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.pessoa.model.EmpVo;

public interface EmpDAO {

	public void cadastrarEmpresa(EmpVo empVo) throws SQLException;
	public void excluirEmpresa(Integer atrIdEmpresa, Integer atrCodigoEmpresa) throws SQLException;
	public void alterarEmpresa(EmpVo empVo) throws SQLException;
	public EmpVo obterEmpresaPorChave(Integer atrIdEmpresa, Integer atrCodigoEmpresa) throws SQLException;
	public List<EmpVo> obterListaEmpresa() throws SQLException;

}
