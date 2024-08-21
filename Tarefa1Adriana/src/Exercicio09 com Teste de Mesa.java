9 - As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double preco;
        if (quantidade < 12) {
            preco = 1.30;
        } else {
            preco = 1.00;
        }

        double custoTotal = quantidade * preco;

        System.out.printf("O custo total da compra é: R$ %.2f%n", custoTotal);
        
        scanner.close();
    }
}

Teste de mesa:

| Passo | Entrada | Variáveis                         | Cálculo                                                                 | Saída                                 |
|-------|---------|-----------------------------------|-------------------------------------------------------------------------|---------------------------------------|
| 1     | -       | `scanner`                         | -                                                                       | -                                     |
| 2     | `10`    | `quantidade = 10`, `preco = 1.30` | `custoTotal = quantidade * preco` <br> `custoTotal = 10 * 1.30 = 13.00` | `O custo total da compra é: R$ 13.00` |
| 3     | `15`    | `quantidade = 15`, `preco = 1.00` | `custoTotal = quantidade * preco` <br> `custoTotal = 15 * 1.00 = 15.00` | `O custo total da compra é: R$ 15.00` |
