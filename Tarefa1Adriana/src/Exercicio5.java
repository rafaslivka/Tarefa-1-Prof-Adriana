import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarrosVendidos = scanner.nextInt();
        
       
        System.out.print("Digite o valor total das vendas: R$ ");	
        double valorTotalVendas = scanner.nextDouble();
        
        
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
       
        System.out.print("Digite o valor recebido por carro vendido: R$ ");
        double valorPorCarro = scanner.nextDouble();

        double comissaoPorCarro = numeroCarrosVendidos * valorPorCarro;

        double comissaoPorVendas = 0.05 * valorTotalVendas;

        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;
        
        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);
        
        scanner.close();
    }
}
