package br.com.fiap.cliente.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.fiap.cliente.dao.bd.ClienteDAOANSI;
import br.com.fiap.cliente.dao.bd.ClientePFDAOANSI;
import br.com.fiap.cliente.dao.bd.ClientePJDAOANSI;
import br.com.fiap.cliente.model.ClientePFVo;
import br.com.fiap.cliente.model.ClientePJVo;

public class mainteste {

	public static void main(String[] args) throws SQLException, ParseException {

		/*	TABELA CLIENTE PF */
		
		ClienteDAOANSI clienteDAO = new ClienteDAOANSI();
//		ClienteVo cliente1 = new ClienteVo();
//		cliente1.setId_cli(1);
//		cliente1.setNm_cliente("Pedro");
//		cliente1.setTp_cliente("PJ");
//		cliente1.setTel_cliente("11982176333");
//		cliente1.setEmail_cliente("pedro.argentati@teste.com");
//		
//		ClienteVo cliente2 = new ClienteVo();
//		cliente2.setId_cli(1);
//		cliente2.setNm_cliente("Pedro");
//		cliente2.setTp_cliente("PJ");
//		cliente2.setTel_cliente("11982176333");
//		cliente2.setEmail_cliente("pedro.argentati@gmail.com");
		
//		clienteDAO.cadastrarCliente(cliente1);
//		System.out.println(clienteDAO.obterClientePorChave(1));
		System.out.println(clienteDAO.obterListaClienteEPJ());
//		clienteDAO.alterarCliente(cliente2);
//		clienteDAO.excluirCliente(cliente1);
		
//		clientePJ.getId_cli() );
//		preparedStatement.setString	  ( 2, clientePJ.getCnpj() );
//		preparedStatement.setString	  ( 3, clientePJ.getRazao_social() );
//		preparedStatement.setString	  ( 4, clientePJ.getNm_fantasia() );
//		preparedStatement.setDate	  ( 5, clientePJ.getDt_fundacao() );
//		preparedStatement.execute();
		
		
		
				/*	TABELA CLIENTE PJ */
		
		
//		
//		ClientePJDAOANSI clientepjDAOANSI = new ClientePJDAOANSI();
//		ClientePJVo clientepj1 = new ClientePJVo();
//		clientepj1.setId_cli(1);
//		clientepj1.setCnpj("123435678-1");
//		clientepj1.setRazao_social("POPULIS RH BPO");
//		clientepj1.setNm_fantasia("GLR - CONSULTORIA EM SISTEMAS");
//		
//		String input = "06/10/2022 18:29:09";
//	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//	    java.util.Date dt = sdf.parse(input);
//	    java.sql.Date dtSql = new java.sql.Date(dt.getTime());
//////		
//		clientepj1.setDt_fundacao(dtSql);
//		clientepjDAOANSI.cadastrarClientePJ(clientepj1);
//		System.out.println(clientepjDAOANSI.obterClientePJPorChave(1));
//		System.out.println(clientepjDAOANSI.obterListaClientePJ());
//		clientepjDAOANSI.alterarClientePJ(clientepj1);
//		clientepjDAOANSI.excluirClientePJ(1);
		
		
		
		/*	TABELA CLIENTE PF */
		
		
		
//		private Integer id_cli;
//		private String 	cpf_cli;
//		private String 	rg_cli;
//		private Date 	dt_nscmt_cli;
//		private String 	sexo_cli;
//		
//	ClientePFDAOANSI clientePFDAOANSI = new ClientePFDAOANSI();
//	ClientePFVo clientepf1 = new ClientePFVo();
//	clientepf1.setId_cli(1);
//	clientepf1.setCpf_cli("123456789-99");
//	clientepf1.setRg_cli("3211123");
//	
//	String input = "02/19/2003 18:29:09";
//    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//    java.util.Date dt = sdf.parse(input);
//    java.sql.Date dtSql = new java.sql.Date(dt.getTime());
//	
//	
//	clientepf1.setDt_nscmt_cli(dtSql);
//	clientepf1.setSexo_cli("M");
//	
//	clientePFDAOANSI.cadastrarClientePF(clientepf1);
//	System.out.println(clientePFDAOANSI.obterClientePFPorChave(1));
//	System.out.println(clienteDAO.obterListaCliente());
//	clientePFDAOANSI.alterarClientePF(clientepf1);
//	clientePFDAOANSI.excluirClientePF(1);
	
	}

}
