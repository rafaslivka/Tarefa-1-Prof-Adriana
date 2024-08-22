17 - Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.

Fórmula para cálculo de média de LP1.
(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2)

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler as notas e declarar as variaveis
        System.out.print("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da E1: ");
        double E1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da E2: ");
        double E2 = scanner.nextDouble();
        
        System.out.print("Digite a nota da API: ");
        double API = scanner.nextDouble();
        
        System.out.print("Digite a nota de X: ");
        double X = scanner.nextDouble();
        
        System.out.print("Digite a nota do SUB: ");
        double SUB = scanner.nextDouble();
        
        //para fazer o calculo da média
        double mediaP1 = P1 * 0.6 + (E1 + E2) / 2 * 0.4;
        double parte1 = mediaP1 * 0.5;
        double parte2 = (Math.max(mediaP1 - 5.9, 0) / (mediaP1 - 5.9)) * (API * 0.5);
        double media = parte1 + parte2 + X + (SUB * 0.2);
        
        System.out.printf("A média de LP1 é: %.2f%n", media);
        
        scanner.close();
    }
}

Teste de mesa, @professora, nessa parte tive que usar o ChatGpt para me ensinar a fazer, estava muito complexo e não estava conseguindo fazer sozinho.

No teste de mesa, usei valores aleatórios, podendo ser alterados no programa acima.
    
| Passo | Entrada             | P1 | E1 | E2 | API | X  | SUB | Saída Esperada                         |
|-------|---------------------|----|----|----|-----|----|-----|----------------------------------------|
| 1     | Digite a nota da P1 | 7  | 6  | 8  | 9   | 5  | 4   | A média de LP1 é: 8.02                 |
| 2     | Digite a nota da E1 |    |    |    |     |    |     |                                        |
| 3     | Digite a nota da E2 |    |    |    |     |    |     |                                        |
| 4     | Digite a nota da API|    |    |    |     |    |     |                                        |
| 5     | Digite a nota de X  |    |    |    |     |    |     |                                        |
| 6     | Digite a nota do SUB|    |    |    |     |    |     |                                        |

Calculos utilizados durante o processo para obter a nota:
    
1. **Entrada:**
   - P1 = 7
   - E1 = 6
   - E2 = 8
   - API = 9
   - X = 5
   - SUB = 4

2. **Cálculo da Média P1:**
   - `mediaP1 = P1 * 0.6 + (E1 + E2) / 2 * 0.4`
   - `mediaP1 = 7 * 0.6 + (6 + 8) / 2 * 0.4`
   - `mediaP1 = 4.2 + 7 * 0.4`
   - `mediaP1 = 4.2 + 2.8 = 7.0`

3. **Cálculo da Parte 1:**
   - `parte1 = mediaP1 * 0.5`
   - `parte1 = 7.0 * 0.5 = 3.5`

4. **Cálculo da Parte 2:**
   - `parte2 = (Math.max(mediaP1 - 5.9, 0) / (mediaP1 - 5.9)) * (API * 0.5)`
   - `parte2 = (Math.max(7.0 - 5.9, 0) / (7.0 - 5.9)) * (9 * 0.5)`
   - `parte2 = (1.1 / 1.1) * 4.5`
   - `parte2 = 4.5`

5. **Cálculo da Média Final:**
   - `media = parte1 + parte2 + X + (SUB * 0.2)`
   - `media = 3.5 + 4.5 + 5 + 0.8`
   - `media = 8.02`
