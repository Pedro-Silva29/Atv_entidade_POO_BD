package Entidades;

public class Cliente {
	String cpfCliente;
	String nome;
	String endereco;
	String bairro;
	String cidade;
	String UF;
	String cep;
	String telefone;
	String email;
	
	void viewDetalhes(){
	    System.out.println("CPF: "+cpfCliente);
	    System.out.println("nome:"+nome);
	    System.out.println("endereco: "+endereco);
	    System.out.println("Bairro: "+bairro);
	    System.out.println("cidade"+cidade);
	    System.out.println("UF: "+UF);
	    System.out.println("CEP: "+cep);
	    System.out.println("telefone: "+telefone);
	    System.out.println("email: "+email);
	}
	
	Cliente(String cpfCliente, String nome, String endereco, String bairro, String cidade, String UF, String cep, String email, String telefone){
        this.cpfCliente = cpfCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
    }
	/*
	void alterarCPF(String novoCPF){
        cpfCliente = novoCPF;
    }
	
    
	
	void alterarTelefone(String novoTelefone){
		telefone = novoTelefone;
	
	*/
	void alterarBairro(String novoBairro){
		bairro = novoBairro;
	}
	
	void alterarEndereco(String novoEndereco) {
		endereco = novoEndereco;
	}
	
	void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
}
