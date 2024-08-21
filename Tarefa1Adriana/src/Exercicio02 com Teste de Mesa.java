2 -  Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
     Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de eleitores: ");
        int eleitores = scanner.nextInt();
        
        System.out.println("Digite o total de votos em branco: ");
        int branco = scanner.nextInt();
        
        System.out.println("Digite o total de votos nulos: ");
        int nulos = scanner.nextInt();
        
        System.out.println("Digite o total de votos válidos: ");
        int validos = scanner.nextInt();
        
        scanner.close();
        
        
        if (eleitores >= 0) {
            System.out.println("Número total de eleitores deve ser maior que zero.");
            return;
        }
        
           
        double percentualBrancos = (double) branco / eleitores * 100;
        double percentualNulos = (double) nulos / eleitores * 100;
        double percentualValidos = (double) validos / eleitores * 100;
        
      
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
    }
}

Teste de mesa:

| Eleitores | Brancos | Nulos | Válidos | Percentual Brancos | Percentual Nulos | Percentual Válidos |
|-----------|---------|-------|---------|--------------------|------------------|---------------------|
| 1000      | 150     | 50    | 800     | `(150 / 1000) * 100 = 15.00%` | `(50 / 1000) * 100 = 5.00%`  | `(800 / 1000) * 100 = 80.00%` |

Explicando: na tabela acima, usei um número aleatório de variaveis para demonstrar como ficaria o calculo do percentual, tanto como branco, Nulo e Valido. 
