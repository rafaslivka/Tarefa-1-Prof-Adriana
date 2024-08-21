6 - Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. 
    Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler a temperatura em graus Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        
        // Converter Fahrenheit para Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        
       
        System.out.printf("A temperatura correspondente em graus Celsius é: %.2f°C%n", temperaturaCelsius);
        
        scanner.close();
    }
}

Teste de mesa: 

| Passo | Entrada         | Variáveis                   | Cálculo                                     | Saída                                 |
|-------|-----------------|-----------------------------|---------------------------------------------|---------------------------------------|
| 1     | -               | `scanner`                   | -                                           | -                                     |
| 2     | `100`           | `temperaturaFahrenheit = 100` | -                                           | -                                     |
| 3     | -               | `temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9` | `temperaturaCelsius = (100 - 32) * 5 / 9 = 68 * 5 / 9 = 340 / 9 ≈ 37.78` | `A temperatura correspondente em graus Celsius é: 37.78°C` |

Obs: Profª, nesse exercício, tive dificuldades em saber como faz a conversão de temperaturas, tive que pedir para o chat me explicar a fazer, foi a única dificuldade que tive, fora isso, tranquilo.
