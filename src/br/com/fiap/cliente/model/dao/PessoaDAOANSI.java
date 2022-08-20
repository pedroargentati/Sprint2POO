package br.com.fiap.cliente.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cliente.model.PessoaVo;
import br.com.fiap.jdbc.adapter.DataAccessObjectAdapter;

public class PessoaDAOANSI extends DataAccessObjectAdapter implements PessoaDAO {

	public void cadastrarPessoa(PessoaVo pessoaVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: cadastrarPessoa(pessoaVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				sql.append("INSERT INTO ");
				sql.append(			"PESSOA ");
				sql.append(	"( ATRIDPESSOA, ");
				sql.append(		"ATRNOMEPESSOA, ");
				sql.append(		"ATRIDUSUARIO, ");
				sql.append(		"ATRCPF, ");
				sql.append(		"ATRENDERECO, ");
				sql.append(		"ATRTIPOCLIENTE ) ");
				sql.append(	"VALUES (?, ?, ?, ?, ?, ?) ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt	(	1, pessoaVo.getAtrIdPessoa() );
				preparedStatement.setString	(	2, pessoaVo.getAtrNomePessoa() );
				preparedStatement.setInt	(	3, pessoaVo.getAtrIdUsuario() );
				preparedStatement.setString	(	4, pessoaVo.getAtrCPF() );
				preparedStatement.setString	(	5, pessoaVo.getAtrEndereco() );
				preparedStatement.setString	(	6, pessoaVo.getAtrTipoCliente() );
				preparedStatement.execute();

			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: cadastrarPessoa(pessoaVo).");
		}
	}

	public void excluirPessoa(PessoaVo pessoaVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: excluirPessoa(PessoaVo pessoaVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("DELETE FROM ");
				sql.append(		"PESSOA ");
				sql.append(	"WHERE ");
				sql.append(		"ATRIDPESSOA = ? ");
				sql.append(	"AND ATRIDUSUARIO = ? ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt(1, pessoaVo.getAtrIdPessoa());
				preparedStatement.setInt(2, pessoaVo.getAtrIdUsuario());

				preparedStatement.execute();

			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: excluirPessoa(PessoaVo pessoaVo).");
		}
	}

	public List<PessoaVo> obterListaPessoa() throws SQLException {
		try {
			System.out.println("iniciando metodo: obterListaPessoa().");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;

			List<PessoaVo> result = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"ATRIDPESSOA, ");
				sql.append(		"ATRNOMEPESSOA, ");
				sql.append(		"ATRIDUSUARIO, ");
				sql.append(		"ATRCPF, ");
				sql.append(		"ATRENDERECO, ");
				sql.append(		"ATRTIPOCLIENTE ");
				sql.append(	"FROM ");
				sql.append(		"PESSOA ");

				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();

				while (resultSet.next()) {
					PessoaVo vo = new PessoaVo();
					vo.setAtrIdPessoa	( resultSet.getInt		("ATRIDPESSOA") );
					vo.setAtrNomePessoa	( resultSet.getString	("ATRNOMEPESSOA") );
					vo.setAtrIdUsuario	( resultSet.getInt		("ATRIDUSUARIO") );
					vo.setAtrCPF		( resultSet.getString	("ATRCPF") );
					vo.setAtrEndereco	( resultSet.getString	("ATRENDERECO") );
					vo.setAtrTipoCliente( resultSet.getString	("ATRTIPOCLIENTE") );
					result.add(vo);
				}

				return result;
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			} finally {
				closeResultSet(resultSet);
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
		} finally {
			System.out.println("finalizando metodo: obterListaPessoa()");
		}
	}

	public PessoaVo obterPessoaPorChave(Integer atrIdPessoa, Integer atridUsuario) throws SQLException {
		try {
			System.out.println("iniciando metodo: obterPessoaPorChave(atrIdPessoa, atridUsuario).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			PessoaVo result = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"ATRIDPESSOA, ");
				sql.append(		"ATRNOMEPESSOA, ");
				sql.append(		"ATRIDUSUARIO, ");
				sql.append(		"ATRCPF, ");
				sql.append(		"ATRENDERECO, ");
				sql.append(		"ATRTIPOCLIENTE ");
				sql.append(	"FROM ");
				sql.append(		"PESSOA ");
				sql.append(	"WHERE ");
				sql.append( 	"ATRIDPESSOA = ? ");
				sql.append( 	"AND ATRIDUSUARIO = ? ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt(1, atrIdPessoa);
				preparedStatement.setInt(2, atridUsuario);
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					result = new PessoaVo();
					result.setAtrIdPessoa	( resultSet.getInt		("ATRIDPESSOA") );
					result.setAtrNomePessoa	( resultSet.getString	("ATRNOMEPESSOA") );
					result.setAtrIdUsuario	( resultSet.getInt		("ATRIDUSUARIO") );
					result.setAtrCPF		( resultSet.getString	("ATRCPF") );
					result.setAtrEndereco	( resultSet.getString	("ATRENDERECO") );
					result.setAtrTipoCliente( resultSet.getString	("ATRTIPOCLIENTE") );
				}

				return result;
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			} finally {
				closeResultSet(resultSet);
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
		} finally {
			System.out.println("finalizando metodo: obterPessoaPorChave(atrIdPessoa, atridUsuario).");
		}
	}

	public void alterarPessoa(PessoaVo pessoaVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: alterarPessoa(pessoaVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("UPDATE ");
				sql.append(			"PESSOA ");
				sql.append(	"SET ");
				sql.append(		"ATRNOMEPESSOA = ?, ");
				sql.append(		"ATRCPF = ?, ");
				sql.append(		"ATRENDERECO = ?, ");
				sql.append(		"ATRTIPOCLIENTE = ? ");
				sql.append(	"WHERE ");
				sql.append(		"ATRIDPESSOA = ? ");
				sql.append(	"AND ATRIDUSUARIO = ? ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setString	(	1, pessoaVo.getAtrNomePessoa() );
				preparedStatement.setString	(	2, pessoaVo.getAtrCPF() );
				preparedStatement.setString	(	3, pessoaVo.getAtrEndereco() );
				preparedStatement.setString	(	4, pessoaVo.getAtrTipoCliente() );
				preparedStatement.setInt	(	5, pessoaVo.getAtrIdPessoa() );
				preparedStatement.setInt	(	6, pessoaVo.getAtrIdUsuario() );
				preparedStatement.execute();

			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
		} finally {
			System.out.println("alterarPessoa(pessoaVo).");
		}
		
	}

}
