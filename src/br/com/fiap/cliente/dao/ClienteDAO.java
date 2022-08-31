package br.com.fiap.cliente.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.cliente.model.ClienteVo;

public interface ClienteDAO {

	public void cadastrarCliente	(ClienteVo clienteVo) throws SQLException;
	public void excluirCliente	(ClienteVo clienteVo) throws SQLException;
	public void alterarCliente	(ClienteVo clienteVo) throws SQLException;
	public ClienteVo obterClientePorChave(Integer id_cli) throws SQLException;
	public List<ClienteVo> obterListaCliente () throws SQLException;

}
