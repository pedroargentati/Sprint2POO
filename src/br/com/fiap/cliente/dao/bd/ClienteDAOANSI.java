package br.com.fiap.cliente.dao.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cliente.dao.ClienteDAO;
import br.com.fiap.cliente.model.ClienteVo;
import br.com.fiap.jdbc.adapter.DataAccessObjectAdapter;

public class ClienteDAOANSI extends DataAccessObjectAdapter implements ClienteDAO {

	public void cadastrarCliente(ClienteVo clienteVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: cadastrarCliente(clienteVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();
				
				sql.append("INSERT INTO ");
				sql.append(			"TB_CLIENTE ");
				sql.append(	"( ID_CLI, ");
				sql.append(		"NM_CLIENTE, ");
				sql.append(		"TP_CLIENTE, ");
				sql.append(		"TEL_CLIENTE, ");
				sql.append(		"EMAIL_CLIENTE ) ");
				sql.append(	"VALUES (?, ?, ?, ?, ?) ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt	(	1, clienteVo.getId_cli()	);
				preparedStatement.setString	(	2, clienteVo.getNm_cliente() );
				preparedStatement.setString	(	3, clienteVo.getTp_cliente() );
				preparedStatement.setString	(	4, clienteVo.getTel_cliente() );
				preparedStatement.setString	(	5, clienteVo.getEmail_cliente() );
				preparedStatement.execute();

			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: cadastrarCliente(clienteVo).");
		}
	}

	public void excluirCliente(ClienteVo clienteVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: excluirCliente(ClienteVo clienteVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
//			this.validateClientType(clienteVo.getId_cli());
			
			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("DELETE FROM ");
				sql.append(		"TB_CLIENTE ");
				sql.append(	"WHERE ");
				sql.append(		"ID_CLI = ? ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt( 1, clienteVo.getId_cli() );

				preparedStatement.execute();

			} catch (SQLException sqle) {
				throw new SQLException(sqle);

			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}

		} finally {
			System.out.println("finalizando metodo: excluirCliente(clienteVo).");
		}
	}

	public List<ClienteVo> obterListaCliente() throws SQLException {
		try {
			System.out.println("iniciando metodo: obterListaCliente().");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;

			List<ClienteVo> result = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"ID_CLI, ");
				sql.append(		"NM_CLIENTE, ");
				sql.append(		"TP_CLIENTE, ");
				sql.append(		"TEL_CLIENTE, ");
				sql.append(		"EMAIL_CLIENTE, ");
				sql.append(		"CD_END_CLIENTE, ");
				sql.append(		"CD_CLASSIFICACAO, ");
				sql.append(		"CD_CONTA ");
				sql.append(	"FROM ");
				sql.append(		"TB_CLIENTE ");

				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();

				while (resultSet.next()) {
					ClienteVo vo = new ClienteVo();
					
					vo.setId_cli		   ( resultSet.getInt("ID_CLI") );
					vo.setNm_cliente	   ( resultSet.getString("NM_CLIENTE") );
					vo.setTp_cliente	   ( resultSet.getString("TP_CLIENTE") );
					vo.setTel_cliente	   ( resultSet.getString("TEL_CLIENTE") );
					vo.setEmail_cliente	   ( resultSet.getString("EMAIL_CLIENTE") );
					vo.setCd_end_cliente   ( resultSet.getInt("CD_END_CLIENTE") );
					vo.setCd_classificacao ( resultSet.getInt("CD_CLASSIFICACAO") );
					vo.setCd_conta		   ( resultSet.getInt("CD_CONTA") );
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
			System.out.println("finalizando metodo: obterListaCliente()");
		}
	}
	
	public List<ClienteVo> obterListaClienteEPF() throws SQLException {
		try {
			System.out.println("iniciando metodo: obterListaClienteEPF().");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;

			List<ClienteVo> result = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"TB_CLIENTE.ID_CLI, ");
				sql.append(		"TB_CLIENTE.NM_CLIENTE, ");
				sql.append(		"TB_CLIENTE.TP_CLIENTE, ");
				sql.append(		"TB_CLIENTE.TEL_CLIENTE, ");
				sql.append(		"TB_CLIENTE.EMAIL_CLIENTE, ");
				sql.append(		"TB_CLIENTE_PF.CPF_CLI, ");
				sql.append(		"TB_CLIENTE_PF.RG_CLI, ");
				sql.append(		"TB_CLIENTE_PF.DT_NSCMT_CLI, ");
				sql.append(		"TB_CLIENTE_PF.SEXO_CLI ");
				sql.append(	"FROM ");
				sql.append(	    "TB_CLIENTE TB_CLIENTE ");
				sql.append(		"LEFT JOIN TB_CLIENTE_PF TB_CLIENTE_PF ");
				sql.append(			"ON TB_CLIENTE.ID_CLI = TB_CLIENTE_PF.ID_CLI");

				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();

				while (resultSet.next()) {
					ClienteVo vo = new ClienteVo();
					
					vo.setId_cli		   ( resultSet.getInt("ID_CLI") );
					vo.setNm_cliente	   ( resultSet.getString("NM_CLIENTE") );
					vo.setTp_cliente	   ( resultSet.getString("TP_CLIENTE") );
					vo.setTel_cliente	   ( resultSet.getString("TEL_CLIENTE") );
					vo.setEmail_cliente	   ( resultSet.getString("EMAIL_CLIENTE") );
					vo.setCpf_cli		   ( resultSet.getString ("CPF_CLI") );
					vo.setRg_cli		   ( resultSet.getString ("RG_CLI") );
					vo.setDt_nscmt_cli	   ( resultSet.getDate   ("DT_NSCMT_CLI") );
					vo.setSexo_cli		   ( resultSet.getString ("SEXO_CLI") );
					
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
			System.out.println("finalizando metodo: obterListaClienteEPF()");
		}
	}
	
	public List<ClienteVo> obterListaClienteEPJ() throws SQLException {
		try {
			System.out.println("iniciando metodo: obterListaClienteEPJ().");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;

			List<ClienteVo> result = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"TB_CLIENTE.ID_CLI, ");
				sql.append(		"TB_CLIENTE.NM_CLIENTE, ");
				sql.append(		"TB_CLIENTE.TP_CLIENTE, ");
				sql.append(		"TB_CLIENTE.TEL_CLIENTE, ");
				sql.append(		"TB_CLIENTE.EMAIL_CLIENTE, ");
				sql.append(		"TB_CLIENTE_PJ.CNPJ, ");
				sql.append(		"TB_CLIENTE_PJ.RAZAO_SOCIAL, ");
				sql.append(		"TB_CLIENTE_PJ.NM_FANTASIA, ");
				sql.append(		"TB_CLIENTE_PJ.DT_FUNDACAO ");
				sql.append(	"FROM ");
				sql.append(	    "TB_CLIENTE TB_CLIENTE ");
				sql.append(		"LEFT JOIN TB_CLIENTE_PJ TB_CLIENTE_PJ ");
				sql.append(			"ON TB_CLIENTE.ID_CLI = TB_CLIENTE_PJ.ID_CLI");

				preparedStatement = connection.prepareStatement(sql.toString());
				resultSet = preparedStatement.executeQuery();
				result = new ArrayList<>();

				while (resultSet.next()) {
					ClienteVo vo = new ClienteVo();
					
					vo.setId_cli		   ( resultSet.getInt("ID_CLI") );
					vo.setNm_cliente	   ( resultSet.getString("NM_CLIENTE") );
					vo.setTp_cliente	   ( resultSet.getString("TP_CLIENTE") );
					vo.setTel_cliente	   ( resultSet.getString("TEL_CLIENTE") );
					vo.setEmail_cliente	   ( resultSet.getString("EMAIL_CLIENTE") );
					vo.setCnpj			   ( resultSet.getString ("CNPJ") );
					vo.setRazao_social	   ( resultSet.getString ("RAZAO_SOCIAL") );
					vo.setNm_fantasia	   ( resultSet.getString ("NM_FANTASIA") );
					vo.setDt_fundacao	   ( resultSet.getDate   ("DT_FUNDACAO") );
					
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
			System.out.println("finalizando metodo: obterListaClienteEPJ()");
		}
	}

	public ClienteVo obterClientePorChave(Integer id_cli) throws SQLException {
		try {
			System.out.println("iniciando metodo: obterClientePorChave(id_cli).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			ClienteVo result = null;

			try {
				
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("SELECT ");
				sql.append(		"ID_CLI, ");
				sql.append(		"NM_CLIENTE, ");
				sql.append(		"TP_CLIENTE, ");
				sql.append(		"TEL_CLIENTE, ");
				sql.append(		"EMAIL_CLIENTE, ");
				sql.append(		"CD_END_CLIENTE, ");
				sql.append(		"CD_CLASSIFICACAO, ");
				sql.append(		"CD_CONTA ");
				sql.append(	"FROM ");
				sql.append(		"TB_CLIENTE ");
				sql.append(	"WHERE ");
				sql.append( 	"ID_CLI = ? ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setInt(1, id_cli);
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					result = new ClienteVo();
					result.setId_cli		   ( resultSet.getInt("ID_CLI") );
					result.setNm_cliente	   ( resultSet.getString("NM_CLIENTE") );
					result.setTp_cliente	   ( resultSet.getString("TP_CLIENTE") );
					result.setTel_cliente	   ( resultSet.getString("TEL_CLIENTE") );
					result.setEmail_cliente	   ( resultSet.getString("EMAIL_CLIENTE") );
					result.setCd_end_cliente   ( resultSet.getInt("CD_END_CLIENTE") );
					result.setCd_classificacao ( resultSet.getInt("CD_CLASSIFICACAO") );
					result.setCd_conta		   ( resultSet.getInt("CD_CONTA") );
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
			System.out.println("finalizando metodo: obterClientePorChave(id_cli).");
		}
	}

	public void alterarCliente(ClienteVo clienteVo) throws SQLException {
		try {
			System.out.println("iniciando metodo: alterarCliente(clienteVo).");

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = conectar();
				StringBuffer sql = new StringBuffer();

				sql.append("UPDATE ");
				sql.append(			"TB_CLIENTE ");
				sql.append(	"SET ");
				sql.append(		"NM_CLIENTE = ?, ");
				sql.append(		"TP_CLIENTE = ?, ");
				sql.append(		"TEL_CLIENTE = ?, ");
				sql.append(		"EMAIL_CLIENTE = ? ");
				sql.append(	"WHERE ");
				sql.append(		"ID_CLI = ? ");

				preparedStatement = connection.prepareStatement(sql.toString());
				preparedStatement.setString	(	1, clienteVo.getNm_cliente() );
				preparedStatement.setString	(	2, clienteVo.getTp_cliente() );
				preparedStatement.setString	(	3, clienteVo.getTel_cliente() );
				preparedStatement.setString	(	4, clienteVo.getEmail_cliente() );
				preparedStatement.setInt	(	5, clienteVo.getId_cli() );
				preparedStatement.execute();

			} catch (SQLException sqle) {
				throw new SQLException(sqle);
			} finally {
				closeStatement(preparedStatement);
				closeConnection(connection);
			}
		} finally {
			System.out.println("finalizando m todo: alterarCliente(clienteVo).");
		}
		
	}
	
}
