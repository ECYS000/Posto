package servicos;

public class Abastecimento {

	public static void Abastecer( int tipoCombustivel, double valorAbastecer) {
		
		double precoGasolina = 4.75;
		double precoEtanol = 3.85;
		double precoDiesel = 5.15;
		double qtdeCombustivel;
		
		// %.2f 20.00 - Dinheiro
		// %.3f 1.000 - litros - Combustivel
		
		if(tipoCombustivel == 1) {
			qtdeCombustivel = valorAbastecer / precoGasolina;
			System.out.printf("Foi abastecido o valor de %.2f reais, rendendo a quantidade de %.3f litros. \n"
					,valorAbastecer,qtdeCombustivel);
		}else if (tipoCombustivel == 2) {
			qtdeCombustivel = valorAbastecer / precoEtanol;
			System.out.printf("Foi abastecido o valor de %.2f reais, rendendo a quantidade de %.3f litros. \n"
					,valorAbastecer,qtdeCombustivel);
		}else if (tipoCombustivel == 3) {
			qtdeCombustivel = valorAbastecer / precoDiesel;
			System.out.printf("Foi abastecido o valor de %.2f reais, rendendo a quantidade de %.3f litros. \n"
					,valorAbastecer,qtdeCombustivel);
		}else {
			System.out.println("valor nao existe seu corno");		}
	}
}
