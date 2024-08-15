import java.util.Scanner;

public class Exercicio4	 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        // Percentuais
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;
        
        // Calcular o custo do distribuidor
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        
        // Calcular o custo antes dos impostos
        double custoAntesImpostos = custoFabrica + custoDistribuidor;
        
        // Calcular os impostos
        double custoImpostos = custoAntesImpostos * percentualImpostos;
        
        // Calcular o custo final ao consumidor
        double custoFinal = custoAntesImpostos + custoImpostos;
        
        // Exibir o custo final
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);
        
        scanner.close();
    }
}