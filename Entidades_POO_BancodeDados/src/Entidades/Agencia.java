package Entidades;

public class Agencia {
	String numAgencia;
	String nome;
	String endereco;
	String telefone;
	
	
	void viewDetalhes(){
	    System.out.println("Nº da Agência: "+numAgencia);
	    System.out.println("nome:"+nome);
	    System.out.println("endereco: "+endereco);
	    System.out.println("telefone: "+telefone);
	}
	
	Agencia(String numAgencia, String nome, String endereco, String telefone){
        this.numAgencia = numAgencia; //atribuição do atributo titulo para o parametro titulo
        //obs: O "THIS" é usado para referenciar o parametro dentro da funcao com o metodo
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;

    }
	
	void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
	void alterarEndereco(String novoEndereco) {
		endereco = novoEndereco;
	}
	
	
	void alterarTelefone(String novoTelefone){
        telefone = novoTelefone;
    }
}



