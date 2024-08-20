1 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
    Considerar ano com 365 dias e mês com 30 dias. 

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        //calcular o total de dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        //result
        System.out.println("A idade em dias é: " + totalDias);
        
        scanner.close();
    }

}

Teste de mesa:

| Anos | Meses | Dias | Cálculo                | Resultado |
|------|-------|------|------------------------|-----------|
| 2    | 3     | 10   | Entrada dos dados      |           |
| 2    | 3     | 10   | `2 * 365`              | 730       |
| 2    | 3     | 10   | `3 * 30`               | 90        |
| 2    | 3     | 10   | `10`                   | 10        |
| 2    | 3     | 10   | `730 + 90 + 10`        | 830       |
| 2    | 3     | 10   | Resultado Final        | 830       |
