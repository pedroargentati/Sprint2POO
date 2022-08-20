package br.com.fiap.cliente.model.dao;

import java.sql.SQLException;

import br.com.fiap.cliente.model.PessoaVo;

public class mainteste {

	public static void main(String[] args) throws SQLException {

//		PessoaVo pessoa1 = new PessoaVo(1, "Pedro", 1, "48174972897", "Rua Lins de Vasconselos", "P");
//		PessoaVo pessoa2 = new PessoaVo(2, "Pedro", 2, "12345678900", "Rua teste123", "F");
//		PessoaVo pessoa3 = new PessoaVo(3, "Pedro", 3, "09876543211", "Rua da FIAP", "Q");
//		PessoaVo pessoa4 = new PessoaVo(4, "Rubens", 4, "00000000000000", "Rua Vai CURINTIA", "P");
//
		PessoaDAOANSI pes = new PessoaDAOANSI();
//		pes.cadastrarPessoa(pessoa1);
//		pes.cadastrarPessoa(pessoa2);
//		pes.cadastrarPessoa(pessoa3);
//		pes.cadastrarPessoa(pessoa4);

//		pes.excluirPessoa(pessoa);
//		System.out.println(pes.obterListaPessoa());;
//		System.out.println(pes.obterPessoaPorChave(1,1));
//		pes.alterarPessoa(pessoa4);
		System.out.println(pes.obterPessoaPorChave(1, 1));
	}

}
