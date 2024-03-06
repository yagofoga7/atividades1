package exercicio0603;

import java.util.Scanner;

public class Convertervalor {

	public static void main(String[] args) {
		//Variáveis
		Double real, euro;
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
				
		//Entrada de dados
		System.out.println("Qual o valor para converter o real: ");
		real = ler.nextDouble();
				
		//Processamento
		euro= real* 5.37;
				
		//Saída de dados
		System.out.println("Sua conversão é de: "+euro);
        ler.close ();

	}

}
