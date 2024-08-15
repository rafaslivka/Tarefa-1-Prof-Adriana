import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
   
        if (valor1 < valor2) {
            System.out.printf("Valores em ordem crescente: %d, %d%n", valor1, valor2);
        } else {
            System.out.printf("Valores em ordem crescente: %d, %d%n", valor2, valor1);
        }
        
        scanner.close();
    }
}
