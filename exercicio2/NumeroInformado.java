package exercicio2;
import java.util.Scanner;

// pede um número e mostra na tela o número informado

public class NumeroInformado {
	public static void main(String args[]) {
		// entrada
		System.out.println("Informe um numero:");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		// saida
		System.out.println("O numero informado foi " + numero);
	}

}
