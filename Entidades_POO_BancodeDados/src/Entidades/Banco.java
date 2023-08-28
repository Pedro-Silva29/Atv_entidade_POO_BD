package Entidades;

public class Banco {
	int id;
	String nome;
	String cnpj;
	
	void viewDetalhes(){
	    System.out.println("ID: "+id);
	    System.out.println("nome:"+nome);
	    System.out.println("CNPJ: "+cnpj);
	}
	
	Banco(int id, String nome, String cnpj){
        this.id = id; //atribuição do atributo titulo para o parametro titulo
        //obs: O "THIS" é usado para referenciar o parametro dentro da funcao com o metodo
        this.nome = nome;
        this.cnpj = cnpj;

    }
	
	void alterarNome(String novoNome){
        nome = novoNome;
    }
}