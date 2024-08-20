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
        
        //close_scanner
        scanner.close();
    }

}

Teste de mesa:

| Passo | Descrição                            | Valor | Cálculo        | Resultado |
|-------|--------------------------------------|-------|----------------|-----------|
| 1     | Entrada: Idade em anos               | 2     |                |           |
| 2     | Entrada: Idade em meses              | 3     |                |           |
| 3     | Entrada: Idade em dias               | 10    |                |           |
| 4     | Calcular dias baseados nos anos      |       | `2 * 365`      | 730       |
| 5     | Calcular dias baseados nos meses     |       | `3 * 30`       | 90        |
| 6     | Adicionar dias diretamente           |       | `10`           | 10        |
| 7     | Somar todos os dias                  |       | `730 + 90 + 10`| 830       |
| 8     | Resultado final                      |       |                | 830       |
