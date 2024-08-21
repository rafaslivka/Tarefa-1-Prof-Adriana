8 - Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Valor: ");
		int valor = scanner.nextInt();
		
		if (valor >=0) {
			System.out.println("O valor é positivo. ");		
		} else { 
			System.out.print("O valor é negativo. ");
		}
		
		scanner.close();

	}

}

Teste de mesa:

| Passo | Entrada | Variáveis              | Cálculo           | Saída                      |
|-------|---------|------------------------|-------------------|----------------------------|
| 1     | -       | `scanner`              | -                 | -                          |
| 2     | `10`    | `valor = 10`           | `valor >= 0`      | `O valor é positivo.`      |
| 3     | `-5`    | `valor = -5`           | `valor < 0`       | `O valor é negativo.`      |
