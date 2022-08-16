package exercicio7;
import java.util.Scanner;

// Calcula e mostra a área de um quadrado

public class CalculaAreaQuadrado {
	public static void main(String args[]) {
		// entradas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe os lados de um quadrado.");
		System.out.print("Lado 1: ");
		float lado1 = entrada.nextFloat();
		System.out.print("Lado 2: ");
		float lado2 = entrada.nextFloat();
		
		// processos
		float area = lado1*lado2;
		
		// saídas
		System.out.print("Area calculada: "+area);
	}
}
