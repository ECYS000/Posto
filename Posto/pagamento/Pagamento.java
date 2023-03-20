package pagamento;

import java.util.Scanner;

public class Pagamento {
	
	public static double formaPagamento(int formaEscolhido, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch(formaEscolhido) {
		
		case 1:
			
			System.out.println("Será pago no dinheiro");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaEmDinheiro = entrada.nextDouble();
			
			Dinheiro.pagamentoDinheiro(quantiaEmDinheiro, valorAbastecido);
			
			break;
		
		default:
			break;
		}
		return valorAbastecido;
		
	}
	
	
	

}
