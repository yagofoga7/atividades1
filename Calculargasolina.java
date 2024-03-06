package exercicio0603;

import java.util.Scanner;

public class Calculargasolina {

	public static void main(String[] args) {

			//Variáveis
			double combustivel, consumo, litros, custototal, distancia;

			//Instanciar classe Scanner
			Scanner ler = new Scanner(System.in);

			//Entrada de dados
			System.out.println("Qual o valor de litros do combustivel ");
			combustivel = ler.nextDouble();

			System.out.println("Qual a distancia percorrida em KM:");
			distancia = ler.nextDouble();
			
			System.out.println("Qual o consumo médio:");
			consumo = ler.nextDouble();

			//Processamento
			litros =distancia /consumo;
			custototal = litros*combustivel;
			

			//Saída de dados
			System.out.println("Sua quantidade de litros gastos é de : "+litros);
			System.out.println("Seu custo total é de : "+custototal);
			ler.close();


	}

}
