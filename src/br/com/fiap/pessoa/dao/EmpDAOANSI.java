package br.com.fiap.pessoa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.adapter.DataAccessObjectAdapter;
import br.com.fiap.pessoa.model.EmpVo;

public class EmpDAOANSI extends DataAccessObjectAdapter implements EmpDAO {
	
	public void cadastrarEmpresa(EmpVo empVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: cadastrarEmpresa(empVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" INSERT INTO ");
				sql.append("		EMP");
				sql.append(" ( ATRIDEMPRESA, ");
				sql.append("	ATRCODIGOEMPRESA, ");
				sql.append("	ATRNOMEFANTASIA, ");
				sql.append("	ATRRAZAOSOCIAL, ");
				sql.append("	ATRCNPJ) ");
				sql.append(" VALUES (?, ?, ?, ?, ?)");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt   ( 1, empVo.getAtrIdEmpresa() );
				preparedStatement.setInt   ( 2, empVo.getAtrCodigoEmpresa() );
				preparedStatement.setString( 3, empVo.getAtrNomeFantasia() );
				preparedStatement.setString( 4, empVo.getAtrNomeFantasia() );
				preparedStatement.setString( 5, empVo.getAtrCnpj() );
				preparedStatement.execute();
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: cadastrarEmpresa(empVo).");
		}
	}
	
	public void excluirEmpresa(Integer atrIdEmpresa, Integer atrCodigoEmpresa) throws SQLException {
		try {
		System.out.println("iniciando método: excluirEmpresa(empVo)");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		try {
			
			connection = conectar();
			StringBuffer sql = new StringBuffer();
			
			sql.append(" DELETE FROM ");
			sql.append("		EMP ");
			sql.append(" WHERE ");
			sql.append("	ATRIDEMPRESA = ?");
			sql.append(" AND ATRCODIGOEMPRESA = ?");
			
			preparedStatement = connection.prepareStatement(sql.toString());
			preparedStatement.setInt( 1, atrIdEmpresa );
			preparedStatement.setInt( 2, atrCodigoEmpresa );
			
			preparedStatement.execute();
			
		} catch (SQLException sqle) {
			throw new SQLException(sqle);
		
		} finally {
			closeStatement(preparedStatement);
			closeConnection(connection);
		}
			
			
		} finally {
			System.out.println("finalizando método: excluirEmpresa(empVo).");
		}
		
	}

	public void alterarEmpresa(EmpVo empVo) throws SQLException {

		try {
			System.out.println("iniciando método: alterarEmpres(empVo).");
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" UPDATE ");
				sql.append("		EMP");
				sql.append(" SET ");
				sql.append("	 ATRNOMEFANTASIA = ?, ");
				sql.append("	 ATRRAZAOSOCIAL = ?, ");
				sql.append("	 ATRCNPJ = ? ");
				sql.append(" WHERE ");
				sql.append("	ATRIDEMPRESA = ? ");
				sql.append(" AND ATRCODIGOEMPRESA = ?");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setString ( 1, empVo.getAtrNomeFantasia() );
				preparedStatement.setString ( 2, empVo.getAtrRazaoSocial() );
				preparedStatement.setString ( 3, empVo.getAtrCnpj() );
				preparedStatement.setInt	( 4, empVo.getAtrIdEmpresa() );
				preparedStatement.setInt	( 5, empVo.getAtrCodigoEmpresa() );
				preparedStatement.execute();
				
				
			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			
			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
			
			
		} finally {
			System.out.println("finalizando método: alterarEmpresa(empVo).");
		}
		
	}

	public EmpVo obterEmpresaPorChave(Integer atrIdEmpresa, Integer atrCodigoEmpresa) throws SQLException {
		try {
			System.out.println("iniciando método: obterEmpesaPorChave(atrIdEmpresa, atrIdUsuario).");
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			EmpVo result = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" SELECT ");
				sql.append("    ATRIDEMPRESA, ");
				sql.append("	ATRCODIGOEMPRESA, ");
				sql.append("	ATRNOMEFANTASIA, ");
				sql.append("	ATRRAZAOSOCIAL, ");
				sql.append("	ATRCNPJ ");
				sql.append(" FROM ");
				sql.append(" 	EMP ");
				sql.append(" WHERE ");
				sql.append("    ATRIDEMPRESA = ? ");
				sql.append(" AND ATRCODIGOEMPRESA = ? ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt(1, atrIdEmpresa);
				preparedStatement.setInt(2, atrCodigoEmpresa);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					result = new EmpVo();
					result.setAtrIdEmpresa		( resultSet.getInt	  ("ATRIDEMPRESA") );
					result.setAtrCodigoEmpresa	( resultSet.getInt	  ("ATRCODIGOEMPRESA") );
					result.setAtrNomeFantasia	( resultSet.getString ("ATRNOMEFANTASIA") );
					result.setAtrRazaoSocial	( resultSet.getString ("ATRRAZAOSOCIAL") );
					result.setAtrCnpj			( resultSet.getString ("ATRCNPJ") );
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
			System.out.println("finalizando metodo: obterEmpPorChave(atrIdEmpresa, atrCodigoEmpresa).");
		}
	}

	@Override
	public List<EmpVo> obterListaEmpresa() throws SQLException {
		try {
			System.out.println("iniciando método: obterListaEmpresa().");
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			List<EmpVo> result = null;
			
			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append(" SELECT ");
				sql.append("    ATRIDEMPRESA, ");
				sql.append("	ATRCODIGOEMPRESA, ");
				sql.append("	ATRNOMEFANTASIA, ");
				sql.append("	ATRRAZAOSOCIAL, ");
				sql.append("	ATRCNPJ ");
				sql.append(" FROM ");
				sql.append(" 	EMP ");
				
				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();
				
				while(resultSet.next()) {
					EmpVo vo = new EmpVo();
					vo.setAtrIdEmpresa		( resultSet.getInt	  ("ATRIDEMPRESA") );
					vo.setAtrCodigoEmpresa	( resultSet.getInt	  ("ATRCODIGOEMPRESA") );
					vo.setAtrNomeFantasia	( resultSet.getString ("ATRNOMEFANTASIA") );
					vo.setAtrRazaoSocial	( resultSet.getString ("ATRRAZAOSOCIAL") );
					vo.setAtrCnpj			( resultSet.getString ("ATRCNPJ") );
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
			System.out.println("finalizando método: obterListaEmpresa().");
		}
	}
}
