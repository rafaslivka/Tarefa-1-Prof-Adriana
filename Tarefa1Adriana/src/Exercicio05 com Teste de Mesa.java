5 -  Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
     Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

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

Teste de Mesa:

| Passo | Entrada | Variáveis                                | Cálculo                                                               | Saída                              |
|-------|---------|------------------------------------------|-----------------------------------------------------------------------|------------------------------------|
| 1     | -       | `scanner`                               | -                                                                     | -                                  |
| 2     | `10`    | `numeroCarrosVendidos = 10`              | -                                                                     | -                                  |
| 3     | `50000` | `valorTotalVendas = 50000`               | -                                                                     | -                                  |
| 4     | `3000`  | `salarioFixo = 3000`                     | -                                                                     | -                                  |
| 5     | `1500`  | `valorPorCarro = 1500`                   | `comissaoPorCarro = numeroCarrosVendidos * valorPorCarro` <br> `comissaoPorCarro = 10 * 1500 = 15000` | -                                  |
| 6     | -       | `comissaoPorVendas = 0.05 * valorTotalVendas` | `comissaoPorVendas = 0.05 * 50000 = 2500`                           | -                                  |
| 7     | -       | `salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas` | `salarioFinal = 3000 + 15000 + 2500 = 20500`                       | `O salário final do vendedor é: R$ 20500.00` |

Obs: lembrando que todos os valores que eu coloco são aleatórios, no programa eu não declaro o valor exato que eu usei no teste de mesa;
