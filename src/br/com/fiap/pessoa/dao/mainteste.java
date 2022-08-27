package br.com.fiap.pessoa.dao;

import java.sql.SQLException;

import br.com.fiap.pessoa.model.EmpVo;
import br.com.fiap.pessoa.model.PessoaVo;

public class mainteste {

	public static void main(String[] args) throws SQLException {

//		PessoaVo pessoa1 = new PessoaVo(6, "Pedro", 1, "48174972897", "Rua Lins de Vasconselos", "P");
//		PessoaVo pessoa2 = new PessoaVo(2, "Pedro", 2, "12345678900", "Rua teste123", "F");
//		PessoaVo pessoa3 = new PessoaVo(3, "Pedro", 3, "09876543211", "Rua da FIAP", "Q");
//		PessoaVo pessoa4 = new PessoaVo(4, "Rubens", 4, "00000000000000", "Rua Vai CURINTIA", "P");

//		PessoaDAOANSI pes = new PessoaDAOANSI();
//		pes.cadastrarPessoa(pessoa1);
//		pes.cadastrarPessoa(pessoa2);
//		pes.cadastrarPessoa(pessoa3);
//		pes.cadastrarPessoa(pessoa4);

//		pes.excluirPessoa(pessoa);
//		System.out.println(pes.obterListaPessoa());;
//		System.out.println(pes.obterPessoaPorChave(1,1));
//		pes.alterarPessoa(pessoa4);
//		System.out.println(pes.obterPessoaPorChave(1, 1));
		
//		EmpVo empVo2 = new EmpVo(2, 321 ,"TOTVS", "TOTVS 1", "12332132112");
//		EmpVo empVo3 = new EmpVo(3, 456 ,"JB", "JB - LOGISTICS", "90372189012");
//		EmpVo empVo4 = new EmpVo(4, 789 ,"LUCIO", "LUCIO ENGENHARIA", "8901238901");
		EmpDAOANSI empDAOANSI = new EmpDAOANSI();
//		empDAOANSI.cadastrarEmpresa(empVo2);
//		empDAOANSI.cadastrarEmpresa(empVo3);
//		empDAOANSI.cadastrarEmpresa(empVo4);
//		empDAOANSI.excluirEmpresa(1,123);
//		empDAOANSI.alterarEmpresa(empVo);
//		System.out.println(empDAOANSI.obterEmpresaPorChave(1, 123));
		System.out.println(empDAOANSI.obterListaEmpresa());
		
	}

}
