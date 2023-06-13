import java.util.Scanner;

public class exercicioUmWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a senha:");
		int x = teclado.nextInt();
		
		while (x !=2002) {
			System.out.println("Senha inválida.");
			System.out.println("Digite a senha novamente:");
			x = teclado.nextInt();
		}
		
		System.out.println("Acesso permitido.");
	
		teclado.close();
	}
}
