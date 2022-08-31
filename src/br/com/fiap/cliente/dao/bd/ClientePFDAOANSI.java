package br.com.fiap.cliente.dao.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cliente.dao.ClientePFDAO;
import br.com.fiap.cliente.model.ClientePFVo;
import br.com.fiap.jdbc.adapter.DataAccessObjectAdapter;

public class ClientePFDAOANSI extends DataAccessObjectAdapter implements ClientePFDAO {
	
	public void cadastrarClientePF(ClientePFVo clientePFVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: cadastrarClientePF(clientePFVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" INSERT INTO ");
				sql.append("		TB_CLIENTE_PF");
				sql.append(" ( ID_CLI, ");
				sql.append("	CPF_CLI, ");
				sql.append("	RG_CLI, ");
				sql.append("	DT_NSCMT_CLI, ");
				sql.append("	SEXO_CLI) ");
				sql.append(" VALUES (?, ?, ?, ?, ?)");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt   	  ( 1, clientePFVo.getId_cli() );
				preparedStatement.setString	  ( 2, clientePFVo.getCpf_cli() );
				preparedStatement.setString	  ( 3, clientePFVo.getRg_cli() );
				preparedStatement.setDate	  ( 4, clientePFVo.getDt_nscmt_cli() );
				preparedStatement.setString	  ( 5, clientePFVo.getSexo_cli() );
				preparedStatement.execute();
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: cadastrarClientePF(clientePF).");
		}
	}
	
	public void excluirClientePF(Integer id_cli) throws SQLException {
		try {
		System.out.println("iniciando método: excluirClientePF(id_cli)");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		try {
			
			connection = conectar();
			StringBuffer sql = new StringBuffer();
			
			sql.append(" DELETE FROM ");
			sql.append("		TB_CLIENTE_PF ");
			sql.append(" WHERE ");
			sql.append("	ID_CLI = ? ");
			
			preparedStatement = connection.prepareStatement(sql.toString());
			preparedStatement.setInt( 1, id_cli );
			
			preparedStatement.execute();
			
		} catch (SQLException sqle) {
			throw new SQLException(sqle);
		
		} finally {
			closeStatement(preparedStatement);
			closeConnection(connection);
		}
			
			
		} finally {
			System.out.println("finalizando método: excluirClientePF(id_cli).");
		}
		
	}

	public void alterarClientePF(ClientePFVo clientePFVo) throws SQLException {

		try {
			System.out.println("iniciando método: alterarClientePF(clientePF).");
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" UPDATE ");
				sql.append("		TB_CLIENTE_PF");
				sql.append(" SET ");
				sql.append("	CPF_CLI = ?, ");
				sql.append("	RG_CLI = ?, ");
				sql.append("	DT_NSCMT_CLI = ?, ");
				sql.append("	SEXO_CLI = ? ");
				sql.append(" WHERE ");
				sql.append("	ID_CLI = ? ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setString	  ( 1, clientePFVo.getCpf_cli() );
				preparedStatement.setString	  ( 2, clientePFVo.getRg_cli() );
				preparedStatement.setDate	  ( 3, clientePFVo.getDt_nscmt_cli() );
				preparedStatement.setString	  ( 4, clientePFVo.getSexo_cli() );
				preparedStatement.setInt   	  ( 5, clientePFVo.getId_cli() );
				preparedStatement.execute();
				
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			
			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
			
			
		} finally {
			System.out.println("finalizando método: alterarClientePF(clientePF).");
		}
		
	}

	public ClientePFVo obterClientePFPorChave(Integer id_cli) throws SQLException {
		try {
			System.out.println("iniciando método: obterClientePFPorChave(id_cli).");
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			ClientePFVo result = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" SELECT ");
				sql.append("   ID_CLI, ");
				sql.append("	CPF_CLI, ");
				sql.append("	RG_CLI, ");
				sql.append("	DT_NSCMT_CLI, ");
				sql.append("	SEXO_CLI ");
				sql.append(" FROM ");
				sql.append(" 	TB_CLIENTE_PF ");
				sql.append(" WHERE ");
				sql.append("    ID_CLI = ? ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt(1, id_cli);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					result = new ClientePFVo();
					result.setId_cli		( resultSet.getInt	  ("ID_CLI") );
					result.setCpf_cli		( resultSet.getString ("CPF_CLI") );
					result.setRg_cli		( resultSet.getString ("RG_CLI") );
					result.setDt_nscmt_cli	( resultSet.getDate   ("DT_NSCMT_CLI") );
					result.setSexo_cli		( resultSet.getString ("SEXO_CLI") );
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
			System.out.println("finalizando metodo: obterClientePFPorChave(id_cli).");
		}
	}

	@Override
	public List<ClientePFVo> obterListaClientePF() throws SQLException {
		try {
			System.out.println("iniciando método: obterListaClientePF().");
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			List<ClientePFVo> result = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" SELECT ");
				sql.append("    ID_CLI, ");
				sql.append("	CPF_CLI, ");
				sql.append("	RG_CLI, ");
				sql.append("	DT_NSCMT_CLI, ");
				sql.append("	SEXO_CLI ");
				sql.append(" FROM ");
				sql.append(" 	TB_CLIENTE_PF ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();
				
				while(resultSet.next()) {
					ClientePFVo vo = new ClientePFVo();
					vo.setId_cli		( resultSet.getInt	  ("ID_CLI") );
					vo.setCpf_cli		( resultSet.getString ("CPF_CLI") );
					vo.setRg_cli		( resultSet.getString ("RG_CLI") );
					vo.setDt_nscmt_cli	( resultSet.getDate   ("DT_NSCMT_CLI") );
					vo.setSexo_cli		( resultSet.getString ("SEXO_CLI") );

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
			System.out.println("finalizando método: obterListaClientePF().");
		}
	}

}
