package exercicio3;
import java.util.Scanner;

// Pede dois números e imprime a soma

public class ImprimeSoma {
	public static void main (String args[]) {
		// entradas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe dois numeros");
		System.out.print("Num 1: ");
		int num1 = entrada.nextInt();
		System.out.print("Num 2: ");
		int num2 = entrada.nextInt();
		
		// processos
		int soma = num1+num2;
		
		// saída
		
		System.out.println("A soma dos numeros é " + soma);
	}
}
