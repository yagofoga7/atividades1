package exercicio0603;

import java.util.Scanner;

public class Areatriangulo {

	public static void main(String[] args) {
		//Variáveis
				Double base, altura,area;
				//Instanciar classe Scanner
				Scanner ler = new Scanner(System.in);
						
				//Entrada de dados
				System.out.println("Informe o valor da base");
				base = ler.nextDouble();
				
				System.out.println("Informe o valor da altura");
				altura = ler.nextDouble();
				
				//Processamento
				area=((base* altura))/2;
						
				//Saída de dados
				System.out.println("Sua area é: "+area);
		        ler.close ();

	}

}
