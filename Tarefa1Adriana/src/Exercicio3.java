import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        
        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

      
        System.out.printf("O novo salário é: %.2f\n", novoSalario);

        
        scanner.close();
    }
}