package exercicio0603;
import java.util.Scanner;
public class Calculadoradetemperatura {

	public static void main(String[] args) {
		//Variáveis
		Double Fahrenheit, Celsius;
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
				
		//Entrada de dados
		System.out.println("Qual sua temperatura em Fahrenheit");
		Fahrenheit = ler.nextDouble();
				
		//Processamento
		Celsius=((Fahrenheit -32)*5)/9;
				
		//Saída de dados
		System.out.println("Seu Celcius tem um total de: "+Celsius);
        ler.close ();
	}
	
}


