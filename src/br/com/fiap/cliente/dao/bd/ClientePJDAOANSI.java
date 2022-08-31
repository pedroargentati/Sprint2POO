package br.com.fiap.cliente.dao.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cliente.dao.ClientePJDAO;
import br.com.fiap.cliente.model.ClientePJVo;
import br.com.fiap.jdbc.adapter.DataAccessObjectAdapter;

public class ClientePJDAOANSI extends DataAccessObjectAdapter implements ClientePJDAO {
	
	public void cadastrarClientePJ(ClientePJVo clientePJ) throws SQLException {
		try {
			System.out.println("iniciando metodo: cadastrarClientePJ(clientePJ).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" INSERT INTO ");
				sql.append("		TB_CLIENTE_PJ");
				sql.append(" ( ID_CLI, ");
				sql.append("	CNPJ, ");
				sql.append("	RAZAO_SOCIAL, ");
				sql.append("	NM_FANTASIA, ");
				sql.append("	DT_FUNDACAO) ");
				sql.append(" VALUES (?, ?, ?, ?, ?)");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt   	  ( 1, clientePJ.getId_cli() );
				preparedStatement.setString	  ( 2, clientePJ.getCnpj() );
				preparedStatement.setString	  ( 3, clientePJ.getRazao_social() );
				preparedStatement.setString	  ( 4, clientePJ.getNm_fantasia() );
				preparedStatement.setDate	  ( 5, clientePJ.getDt_fundacao() );
				preparedStatement.execute();
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: cadastrarClientePJ(clientePJ).");
		}
	}
	
	public void excluirClientePJ(Integer id_cli) throws SQLException {
		try {
		System.out.println("iniciando método: excluirClientePJ(id_cli)");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		try {
			
			connection = conectar();
			StringBuffer sql = new StringBuffer();
			
			sql.append(" DELETE FROM ");
			sql.append("		TB_CLIENTE_PJ ");
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
			System.out.println("finalizando método: excluirClientePJ(id_cli).");
		}
		
	}

	public void alterarClientePJ(ClientePJVo clientePJ) throws SQLException {

		try {
			System.out.println("iniciando método: alterarClientePJ(clientePJ).");
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" UPDATE ");
				sql.append("		TB_CLIENTE_PJ");
				sql.append(" SET ");
				sql.append("	CNPJ = ?, ");
				sql.append("	RAZAO_SOCIAL = ?, ");
				sql.append("	NM_FANTASIA = ?, ");
				sql.append("	DT_FUNDACAO = ? ");
				sql.append(" WHERE ");
				sql.append("	ID_CLI = ? ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setString	  ( 1, clientePJ.getCnpj() );
				preparedStatement.setString	  ( 2, clientePJ.getRazao_social() );
				preparedStatement.setString	  ( 3, clientePJ.getNm_fantasia() );
				preparedStatement.setDate	  ( 4, clientePJ.getDt_fundacao() );
				preparedStatement.setInt   	  ( 5, clientePJ.getId_cli() );
				preparedStatement.execute();
				
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			
			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
			
			
		} finally {
			System.out.println("finalizando método: alterarClientePJ(clientePJ).");
		}
		
	}

	public ClientePJVo obterClientePJPorChave(Integer id_cli) throws SQLException {
		try {
			System.out.println("iniciando método: obterClientePJPorChave(id_cli).");
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			ClientePJVo result = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" SELECT ");
				sql.append(" 	ID_CLI, ");
				sql.append("	CNPJ, ");
				sql.append("	RAZAO_SOCIAL, ");
				sql.append("	NM_FANTASIA, ");
				sql.append("	DT_FUNDACAO ");
				sql.append(" FROM ");
				sql.append(" 	TB_CLIENTE_PJ ");
				sql.append(" WHERE ");
				sql.append("    ID_CLI = ? ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt(1, id_cli);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					result = new ClientePJVo();
					result.setId_cli		( resultSet.getInt	  ("ID_CLI") );
					result.setCnpj			( resultSet.getString ("CNPJ") );
					result.setRazao_social	( resultSet.getString ("RAZAO_SOCIAL") );
					result.setNm_fantasia	( resultSet.getString ("NM_FANTASIA") );
					result.setDt_fundacao	( resultSet.getDate   ("DT_FUNDACAO") );
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
			System.out.println("finalizando metodo: obterClientePJPorChave(id_cli).");
		}
	}

	@Override
	public List<ClientePJVo> obterListaClientePJ() throws SQLException {
		try {
			System.out.println("iniciando método: obterListaClientePJ().");
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			List<ClientePJVo> result = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" SELECT ");
				sql.append("    ID_CLI, ");
				sql.append("	CNPJ, ");
				sql.append("	RAZAO_SOCIAL, ");
				sql.append("	NM_FANTASIA, ");
				sql.append("	DT_FUNDACAO ");
				sql.append(" FROM ");
				sql.append(" 	TB_CLIENTE_PJ ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();
				
				while(resultSet.next()) {
					ClientePJVo vo = new ClientePJVo();
					vo.setId_cli		( resultSet.getInt	  ("ID_CLI") );
					vo.setCnpj			( resultSet.getString ("CNPJ") );
					vo.setRazao_social	( resultSet.getString ("RAZAO_SOCIAL") );
					vo.setNm_fantasia	( resultSet.getString ("NM_FANTASIA") );
					vo.setDt_fundacao	( resultSet.getDate   ("DT_FUNDACAO") );
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
			System.out.println("finalizando método: obterListaClientePJ().");
		}
	}

}
