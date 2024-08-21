import java.util.Scanner;

public class Exercicio4	 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;
        
        double custoDistribuidor = custoFabrica * percentualDistribuidor;

        double custoAntesImpostos = custoFabrica + custoDistribuidor;

        double custoImpostos = custoAntesImpostos * percentualImpostos;

        double custoFinal = custoAntesImpostos + custoImpostos;
 
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);
        
        scanner.close();
    }
}
