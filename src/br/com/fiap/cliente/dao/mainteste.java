package br.com.fiap.cliente.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.fiap.cliente.dao.bd.ClienteDAOANSI;
import br.com.fiap.cliente.dao.bd.ClientePFDAOANSI;
import br.com.fiap.cliente.dao.bd.ClientePJDAOANSI;
import br.com.fiap.cliente.model.ClientePFVo;
import br.com.fiap.cliente.model.ClientePJVo;
import br.com.fiap.cliente.model.ClienteVo;

public class MainTeste {

	public static void main(String[] args) throws SQLException, ParseException {
		
		/*			Bom dia/tarde/noite Selmini!
		 * 
		 * Tomei a liberdade para criar uma classe teste para voc�
		 * a fim de facilitar seu trabalho na hora de corrigir
		 * e coloquei todos os m�todos CRUD que criei para as 
		 * tr�s tabelas. Sugiro n�o executar tudo de uma vez.
		 * 
		 * Os scripts para cria��o das tabelas est�o no arquivo zip
		 * enviado por n�s no portal da FIAP.
		 * 
		 * */
		
		//========================================================//
				/*	Realizar teste da -> TABELA CLIENTE */
		//========================================================//
		
		
		// Instanciando o objeto do tipo DAO para ter acesso aos m�todos.
		ClienteDAOANSI clienteDAO = new ClienteDAOANSI();
		
		// Setando as informa��es para serem cadastradas / editadas no banco.
		ClienteVo cliente1 = new ClienteVo();
		cliente1.setId_cli(1);
		cliente1.setNm_cliente("Pedro");
		cliente1.setTp_cliente("PJ");
		cliente1.setTel_cliente("1231231232131");
		cliente1.setEmail_cliente("pedro.argentati@teste.com");

		
		// M�todo para realizar o cadastro (INSERT) no banco
		clienteDAO.cadastrarCliente(cliente1);
		
		
		/* M�todo para realizar a consulta de apenas 1 cliente. 
		 * @param: ID_CLI*
		 */
		System.out.println(clienteDAO.obterClientePorChave(1));
		
		
		/* M�todo para realizar a consulta de todos os clientes que est�o no banco. */
		System.out.println(clienteDAO.obterListaCliente());
		
		
		/* M�todo para realizar a consulta de todos os clientes que est�o no banco.
		 * Obs -> caso tenha, ir� retornar tamb�m as informa��es contidas na tabela TB_CLIENTE_PJ 
		 * de todos os clientes juntamente com os registro da tabela TB_CLIENTE.*
		 */
		System.out.println(clienteDAO.obterListaClienteEPJ());
		
		
		/* M�todo para realizar a consulta de todos os clientes que est�o no banco.
		 * Obs -> caso tenha, ir� retornar tamb�m as informa��es contidas na tabela TB_CLIENTE_PF 
		 * de todos os clientes juntamente com os registro da tabela TB_CLIENTE.*
		 */
		System.out.println(clienteDAO.obterListaClienteEPF());
		
		
		/* M�todo para realizar a altera��o de apenas um cliente. 
		 * @param: objeto do tipo ClienteVo.*
		 */
		clienteDAO.alterarCliente(cliente1);
		
		
		/* M�todo para realizar a exclus�o de apenas um cliente. 
		 * @param: ID_CLI.*
		 */
		clienteDAO.excluirCliente(cliente1);
		
		
		
		//========================================================//
				/*	Realizar teste da -> TABELA CLIENTE PJ */
		//========================================================//
		
		
		
		// Instanciando o objeto do tipo DAO para ter acesso aos m�todos.
		ClientePJDAOANSI clientepjDAOANSI = new ClientePJDAOANSI();
		
		
		// Setando as informa��es para serem cadastradas / editadas no banco.
		ClientePJVo clientepj1 = new ClientePJVo();
		clientepj1.setId_cli(1);
		clientepj1.setCnpj("123435678-1");
		clientepj1.setRazao_social("POPULIS RH BPO");
		clientepj1.setNm_fantasia("GLR - CONSULTORIA EM SISTEMAS");
		
		String input = "06/10/2022 18:29:09";
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	    java.util.Date dt = sdf.parse(input);
	    java.sql.Date dtSql = new java.sql.Date(dt.getTime());
		clientepj1.setDt_fundacao(dtSql);
		
		
		// M�todo para realizar o cadastro (INSERT) no banco
		clientepjDAOANSI.cadastrarClientePJ(clientepj1);
		
		
		/* M�todo para realizar a consulta de apenas 1 cliente PJ. 
		 * @param: ID_CLI*
		 */
		System.out.println(clientepjDAOANSI.obterClientePJPorChave(1));
		
		
		// M�todo para obter todos os registros do tipo ClientePJ que est�o no Banco.
		System.out.println(clientepjDAOANSI.obterListaClientePJ());
		
		
		/* M�todo para realizar a altera��o de apenas 1 cliente PJ. 
		 * @param: objeto do tipo ClientePJVo.*
		 */
		clientepjDAOANSI.alterarClientePJ(clientepj1);
		
		
		/* M�todo para realizar a exclus�o de apenas 1 cliente PJ. 
		 * @param: ID_CLI.*
		 */
		clientepjDAOANSI.excluirClientePJ(1);
		
		
		
		//========================================================//
				/*	Realizar teste da -> TABELA CLIENTE PF */
		//========================================================//

		

	// Instanciando o objeto do tipo DAO para ter acesso aos m�todos.
	ClientePFDAOANSI clientePFDAOANSI = new ClientePFDAOANSI();
	
	
	// Setando as informa��es para serem cadastradas / editadas no banco.
	ClientePFVo clientepf1 = new ClientePFVo();
	clientepf1.setId_cli(1);
	clientepf1.setCpf_cli("123456789-99");
	clientepf1.setRg_cli("3211123");
	
	String input2 = "02/19/2003 18:29:09";
    SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
    java.util.Date dt2 = sdf2.parse(input2);
    java.sql.Date dtSql2 = new java.sql.Date(dt2.getTime());
	
	clientepf1.setDt_nscmt_cli(dtSql2);
	clientepf1.setSexo_cli("M");

	
	// M�todo para realizar o cadastro (INSERT) no banco
	clientePFDAOANSI.cadastrarClientePF(clientepf1);
	
	
	/* M�todo para realizar a consulta de apenas 1 cliente PF. 
	 * @param: ID_CLI*
	 */
	System.out.println(clientePFDAOANSI.obterClientePFPorChave(1));
	
	
	// M�todo para obter todos os registros do tipo ClientePF que est�o no Banco.
	System.out.println(clienteDAO.obterListaCliente());
	
	
	/* M�todo para realizar a altera��o de apenas 1 cliente PF. 
	 * @param: objeto do tipo ClientePFVo.*
	 */
	clientePFDAOANSI.alterarClientePF(clientepf1);
	
	
	/* M�todo para realizar a altera��o de apenas 1 cliente PF. 
	 * @param: ID_CLI.*
	 */
	clientePFDAOANSI.excluirClientePF(1);
	
	}

}
