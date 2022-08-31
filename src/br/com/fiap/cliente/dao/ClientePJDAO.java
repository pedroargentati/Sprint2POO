package br.com.fiap.cliente.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.cliente.model.ClientePJVo;

public interface ClientePJDAO {

	public void cadastrarClientePJ(ClientePJVo clientePJVo) throws SQLException;
	public void excluirClientePJ(Integer id_cli) throws SQLException;
	public void alterarClientePJ(ClientePJVo clientePJVo) throws SQLException;
	public ClientePJVo obterClientePJPorChave(Integer id_cli) throws SQLException;
	public List<ClientePJVo> obterListaClientePJ() throws SQLException;

}
