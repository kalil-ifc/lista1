package exercicio8;
import java.util.Scanner;

// Pede valor de uma hora de trabalho, número de horas trabalhadas/mês e retorna o salário total

public class CalculaSalario {
	public static void main(String args[]) {
		// entradas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor da hora de trabalho e a quantidade de horas trabalhadas no mês.");
		System.out.print("Valor hora: ");
		float valorHora = entrada.nextFloat();
		System.out.print("Quantidade de horas trabalhadas: ");
		int numeroHoras = entrada.nextInt();
		
		// processos
		float salario = valorHora*numeroHoras;
		
		// saídas
		System.out.println("Salario Total: "+salario);
	}
}
