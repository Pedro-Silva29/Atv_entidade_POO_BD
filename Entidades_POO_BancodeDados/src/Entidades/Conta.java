package Entidades;

import java.math.BigDecimal;

import java.time.LocalDate;

public class Conta {
	int idconta;
	String numconta;
	double saldo;
	String tipo;
	LocalDate dtAbertura;
	String cpfCliente;
	String numAgencia;
	
	void viewDetalhes(){
	    System.out.println("id da conta:"+idconta);
	    System.out.println("Nº da Conta: "+numconta);
	    System.out.println("Saldo atual: "+saldo);
	    System.out.println("Tipo: "+tipo);
	    System.out.println("Data de abertura:"+dtAbertura);
	    System.out.println("CPF: "+cpfCliente);
	    System.out.println("numAgencia: "+numAgencia);
	}
	
	Conta(int idconta, String numconta, Double saldo, String tipo, LocalDate dtAbertura, String cpfCliente, String numAgencia){
        this.idconta = idconta;
        this.numconta = numconta;
        this.saldo = saldo;
        this.tipo = tipo;
        this.dtAbertura = dtAbertura;
        this.cpfCliente = cpfCliente;
        this.numAgencia = numAgencia;
    }
	
	void alterarTipoConta(String novatipConta) {
		tipo = novatipConta;
	}
	
}