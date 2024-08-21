13 - Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

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

Teste de mesa:

| Passo | Entrada | Variáveis          | Cálculo               | Saída                             |
|-------|---------|--------------------|-----------------------|-----------------------------------|
| 1     | -       | `scanner`          | -                     | -                                 |
| 2     | `7`     | `valor1 = 7`       | -                     | -                                 |
| 3     | `12`    | `valor2 = 12`      | `valor1 < valor2`     | `Valores em ordem crescente: 7, 12` |
| 4     | `15`    | `valor1 = 15`      | -                     | -                                 |
| 5     | `10`    | `valor2 = 10`      | `valor1 > valor2`     | `Valores em ordem crescente: 10, 15` |
