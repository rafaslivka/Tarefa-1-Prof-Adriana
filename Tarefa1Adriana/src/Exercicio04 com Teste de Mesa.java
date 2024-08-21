4 - O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. 

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

Teste de mesa:

| Passo | Entrada | Variáveis                                | Cálculo                                                                 | Saída                              |
|-------|---------|------------------------------------------|-------------------------------------------------------------------------|------------------------------------|
| 1     | -       | `scanner`                               | -                                                                       | -                                  |
| 2     | `20000` | `custoFabrica = 20000`                   | -                                                                       | -                                  |
| 3     | -       | `percentualDistribuidor = 0.28`          | -                                                                       | -                                  |
| 4     | -       | `percentualImpostos = 0.45`              | -                                                                       | -                                  |
| 5     | -       | `custoDistribuidor = custoFabrica * percentualDistribuidor` | `custoDistribuidor = 20000 * 0.28 = 5600`                                 | -                                  |
| 6     | -       | `custoAntesImpostos = custoFabrica + custoDistribuidor` | `custoAntesImpostos = 20000 + 5600 = 25600`                            | -                                  |
| 7     | -       | `custoImpostos = custoAntesImpostos * percentualImpostos` | `custoImpostos = 25600 * 0.45 = 11520`                                  | -                                  |
| 8     | -       | `custoFinal = custoAntesImpostos + custoImpostos` | `custoFinal = 25600 + 11520 = 37120`                                    | `O custo final ao consumidor é: R$ 37120.00` |
