package exercicio5;
import java.util.Scanner;

// Converte metros em centimetros

public class ConversorDeMedidas {
	public static void main(String args[]) {
		// entradas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um valor em metros");
		System.out.print("Valor: ");
		float metros = entrada.nextFloat();
		
		// processos
		float centimetros = metros*100;
		
		// saídas
		System.out.println("Medida calculada em centimetros: "+centimetros);
	}
}
