3 - Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 

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

Teste de mesa: 

| Passo | Entrada | Variáveis                          | Cálculo                                     | Saída                       |
|-------|---------|------------------------------------|---------------------------------------------|-----------------------------|
| 1     | -       | `scanner`                           | -                                           | -                           |
| 2     | `3000`  | `salarioAtual = 3000`               | -                                           | -                           |
| 3     | `5`     | `percentualReajuste = 5`            | -                                           | -                           |
| 4     | -       | `novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100)` | `novoSalario = 3000 + (3000 * 5 / 100) = 3150` | `O novo salário é: 3150.00` |
