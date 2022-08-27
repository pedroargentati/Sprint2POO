package br.com.fiap.pessoa.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.pessoa.model.PessoaVo;

public interface PessoaDAO {

	public void cadastrarPessoa	(PessoaVo pessoaVo) throws SQLException;
	public void excluirPessoa	(PessoaVo pessoaVo) throws SQLException;
	public void alterarPessoa	(PessoaVo pessoaVo) throws SQLException;
	public PessoaVo obterPessoaPorChave(Integer atrIdPessoa, Integer atridUsuario) throws SQLException;
	public List<PessoaVo> obterListaPessoa () throws SQLException;

}
