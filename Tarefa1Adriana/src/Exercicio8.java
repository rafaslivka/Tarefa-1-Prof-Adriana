import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Valor: ");
		int valor = scanner.nextInt();
		
		if (valor >=0) {
			System.out.println("O valor é positivo. ");		
		} else { 
			System.out.print("O valor é negativo. ");
		}
		
		scanner.close();

	}

}
