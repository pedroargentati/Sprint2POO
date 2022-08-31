package br.com.fiap.cliente.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.cliente.model.ClientePFVo;

public interface ClientePFDAO {

	public void cadastrarClientePF(ClientePFVo clientePFVo) throws SQLException;
	public void excluirClientePF(Integer id_cli) throws SQLException;
	public void alterarClientePF(ClientePFVo clientePFVo) throws SQLException;
	public ClientePFVo obterClientePFPorChave(Integer id_cli) throws SQLException;
	public List<ClientePFVo> obterListaClientePF() throws SQLException;
	
}
