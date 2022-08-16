package exercicio4;
import java.util.Scanner;

// Pede 4 notas e devolve a média

public class CalculaMedia {
	public static void main(String args[]) {
		// entradas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quatro notas");
		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Nota 3: ");
		float nota3 = entrada.nextFloat();
		System.out.print("Nota 4: ");
		float nota4 = entrada.nextFloat();
		
		// processos
		float media = (nota1+nota2+nota3+nota4)/4;
		
		// saida
		System.out.println("Media calculada: "+media);
	}
}
