import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println("Número não negativo.");
		}
		else if (numero < 0) {
			System.out.println("Número negativo.");
		}
		else {
			System.out.println("Número não negativo.");
		}
		teclado.close();	
	}
}