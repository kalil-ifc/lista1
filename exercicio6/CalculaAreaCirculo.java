package exercicio6;
import java.util.Scanner;

// Pede raio e calcula área de um círculo
//
// Encontramos duas formas de resolver este problema:
// Float.parseFloat() conforme pesquisa: https://stackoverflow.com/questions/7552660/convert-float-to-string-and-string-to-float-in-java
// Math.PI conforme pesquisa: https://www.arquivodecodigos.com.br/dicas/1236-java-como-obter-o-valor-de-pi-em-java-usando-a-constante-math-pi.html#:~:text=Em%20Java%2C%20o%20PI%20pode,%3A%203%2C14159...

public class CalculaAreaCirculo {
	public static void main (String args[]) {
		// entradas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o raio de um cículo.");
		System.out.print("Valor: ");
		float raio = entrada.nextFloat();
		float pi = Float.parseFloat("3.141592653589793");
		double pi2 = Math.PI;
		
		// processos
		float area = pi*raio;
		double area2 = pi2*raio;
		
		// saídas
		System.out.println("Area calculada:");
		System.out.println(area);
		System.out.println("ou");
		System.out.println(area2);
	}
}
