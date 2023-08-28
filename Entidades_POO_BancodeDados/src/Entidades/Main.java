package Entidades;

import java.time.LocalDate;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dtAbertura = LocalDate.of(2023, 8, 23);
		LocalDateTime dthoratransacao = LocalDateTime.of(2023, 8, 27, 19, 00);

		//Criação dos objetos da classe cliente
		Cliente cl1 = new Cliente("139.832.912-92","Pedro","estrada do arraial","Casa Amarela","Recife","PE","52171295","pedro@gmail.com","8140028922");
		Cliente cl2 = new Cliente("148.293.002-35","Victor","Rua Hérmoneges de Morais","Madalena","Recife","PE","50610230","victor@gmail.com","8199842938");
		System.out.println("Dados da Cliente: ");
		cl1.viewDetalhes();
		System.out.println();
		cl2.viewDetalhes();
		
		System.out.println("-----------------------");
		System.out.println();
		
		//Criação dos objetos da classe Agência
		Agencia ag = new Agencia("01","Agencia Santander Boa vista","Boa Vista","4004-3535");
		Agencia ag1 = new Agencia("02","Agencia Santander Casa Amarela","Casa Amarela","4004-3535");
		System.out.println("Dados da Agência: ");
		ag.viewDetalhes();
		System.out.println();
		ag1.viewDetalhes();
		
		System.out.println("-----------------------");
		System.out.println();
		
		//Criação dos objetos da classe Banco
		Banco b = new Banco(01,"Santander","90.400.888/0001-42");
		Banco b1 = new Banco(02,"Bradesco","60.746.948/0001-12");
		System.out.println("Dados da Banco: ");
		b.viewDetalhes();
		System.out.println();
		b1.viewDetalhes();
		
		System.out.println("-----------------------");
		System.out.println();
		
		//Criação dos objetos da classe Conta
		Conta con = new Conta(01,"02",250.00,"CORRENTE",dtAbertura,"139.932.912-92","1");
		Conta con1 = new Conta(02,"05",500.00,"POUPANÇA",dtAbertura,"148.293.002-35","02");
		System.out.println("Dados da Conta: ");
		con.viewDetalhes();
		System.out.println();
		con1.viewDetalhes();	
		System.out.println();
		
		System.out.println("-----------------------");
		//Criação dos objetos 
		Transacoes tr = new Transacoes(01,dthoratransacao,250.00,"CONTA CORRENTE",01);
		Transacoes tr1 = new Transacoes(02,dthoratransacao,900.00,"POUPANÇA",02);
		System.out.println("Dados da Transações: ");
		tr.viewDetalhes();
		System.out.println();
		tr1.viewDetalhes();
		System.out.println("-----------------------");
		
		System.out.println();
		System.out.println("------------- DEPOIS DAS ALTERAÇÕES ----------------");	
		System.out.println();
		
		//Alterações dos objetos clientes
		cl1.alterarEndereco("Rua Joao Limeoeiro");
		cl1.alterarBairro("Dois Irmãos");
		cl2.alterarEndereco("Rua seis de março");
		cl2.alterarBairro("Várzea");

		//Alterações da Agência
		ag.alterarTelefone("40023992");
		ag.alterarEndereco("Rua do Príncipe");
		ag.alterarNome("Agencia Santander Rua do príncipe");
		ag1.alterarTelefone("39005012");
		ag1.alterarNome("Agencia Santander Av. Cruz Cabugá");
		ag1.alterarEndereco("Av. Cruz Cabugá");
		
		//Alterações da Conta
		con.alterarTipoConta("POUPANÇA");
		con1.alterarTipoConta("CONTA CORRENTE");
		
		//	Alterações das transferências
		tr.alterarValorTransacao(500.0);
		tr.alterarTipoTransacao("POUPANÇA");
		tr1.alterarValorTransacao(650.0);
		tr1.alterarTipoTransacao("CONTA CORRENTE");
		
		System.out.println("Dados da Cliente: ");
		cl1.viewDetalhes();
		System.out.println();
		cl2.viewDetalhes();
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println("Dados da Agência: ");
		ag.viewDetalhes();
		System.out.println();
		ag1.viewDetalhes();
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println("Dados da Conta: ");
		con.viewDetalhes();
		System.out.println();
		con1.viewDetalhes();
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println("Dados da Transações: ");
		tr.viewDetalhes();
		System.out.println();
		tr1.viewDetalhes();
		System.out.println();
		System.out.println("-----------------------");
		}

}
