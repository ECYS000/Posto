package pessoas;

public class Cliente {
	
	public String nome;
	public String sobrenome;
	public int idade;
	

	public Cliente (String nomeRecebido, String sobrenomeRebecido) {
		
		nome = nomeRecebido;
		sobrenome = sobrenomeRebecido;
	}
	
	public void dizNomeCliente(String nomeCliente) {
		System.out.println("Ola meu nome é "+nomeCliente);
	}

}
