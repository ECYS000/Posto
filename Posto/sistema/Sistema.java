package sistema;

import java.util.Scanner;

import pagamento.Pagamento;
import pagamento.Credito;
import pessoas.Cliente;
import pessoas.Funcionario;
import servicos.Abastecimento;

public class Sistema {

	public static void main(String[] args) {
		int escolhaCliente;
		int tipoCombustivel;
		double valorAbastecer;
		double qtdeCombustivel;
		
		Scanner entrada = new Scanner(System.in);
		
//		// jeito pode fazer:
//		//Cliente c1 = new Cliente();
//		//c1.nome = "Gabriela";
//		//c1.sobrenome = "Nunes";
//		
//		//mas outro jeito pode tb assim:
//		Cliente c2 = new Cliente("Gabriel", "Nunes");
//		Cliente c3 = new Cliente("Everson", "Carlos");
//		Cliente c4 = new Cliente("Kauan", "Ghenov");
//
//		
//		System.out.println(c2.nome+" "+c2.sobrenome);
//		
//		c2.dizNomeCliente("Gilcemar");
//		
//		System.out.println(Funcionario.enderecoPosto);
//		
//		Credito.pagoNoCredito("Everson");
//		Credito.pagoNoCredito("Qualquer nome");
//		
		System.out.println("Olá seja bem-vendo(a) ao posto Transforme-se");
		
		System.out.println("Qual serviço deseja fazer? \n"+
				"1- Abastecer \n"+
				"2- \n"+
				"3- \n");
		escolhaCliente = entrada.nextInt();

		if (escolhaCliente == 1 ) {
			System.out.println("O preço dos combustíveis: \n"
					+ "1- Gasolina - R$ 4,50 \n"
					+ "2- Etanol   - R$ 3,85 \n"
					+ "3- Diesel   - R$ 4,25");
			System.out.println("Qual combustível gostaria de abastecer?");
			tipoCombustivel = entrada.nextInt();
			
			System.out.println("Quanto gostaria de abastecer?");
			valorAbastecer = entrada.nextDouble();
			
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
			
			System.out.println("Qual seria a forma de pagamento? \n"
					+ "1- Dinheiro \n"
					+ "2- Crédito \n"
					+ "3- Debito");
			int formaPagamento = entrada.nextInt();
			Pagamento.formaPagamento(formaPagamento, valorAbastecer);
			
				
				
						
			entrada.close();
			
			// ABSTRAÇÃO / DESACOPLAR
		}
	
	
	}
	
}
