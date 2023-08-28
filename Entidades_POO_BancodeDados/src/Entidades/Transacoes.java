package Entidades;

import java.time.LocalDateTime;

public class Transacoes {
	int idtransacoes;
	LocalDateTime dthoratransacao;
	double valtransacao;
	String tipotransacao;
	int idconta;
	
	void viewDetalhes(){
	    System.out.println("ID das transações: "+idtransacoes);
	    System.out.println("Data da tranasação: "+dthoratransacao);
	    System.out.println("Valor da transacao: "+valtransacao);
	    System.out.println("Tipo da transacao: "+tipotransacao);
	    System.out.println("ID da conta: "+idconta);
	}
	
	Transacoes(int idtransacoes, LocalDateTime dthoratransacao, Double valtransacao, String tipotransacao, int idconta){
        this.idtransacoes = idtransacoes;
        this.dthoratransacao = dthoratransacao;
        this.valtransacao = valtransacao;
        this.tipotransacao = tipotransacao;
        this.idconta = idconta;
    }
	
	void alterarValorTransacao(Double novaValTransacao) {
		valtransacao = novaValTransacao;
	}
	
	
	void alterarTipoTransacao(String novoTipoTransacao){
        tipotransacao = novoTipoTransacao;
    }
}
