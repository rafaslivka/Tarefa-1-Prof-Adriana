12 - Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor: ");
	int valor1 = scanner.nextInt();
	
	System.out.println("Digite o segundo valor: ");
	int valor2 = scanner.nextInt();
	
	if (valor1 > valor2) { 
		System.out.printf("O maior valor é: %d%n", valor1);
		
	} else 
		System.out.printf("O maior valor é: %d%n", valor2);
		
scanner.close();
	}

}

Teste de mesa:

| Passo | Entrada | Variáveis          | Cálculo               | Saída                      |
|-------|---------|--------------------|-----------------------|----------------------------|
| 1     | -       | `scanner`          | -                     | -                          |
| 2     | `10`    | `valor1 = 10`      | -                     | -                          |
| 3     | `5`     | `valor2 = 5`       | `valor1 > valor2`     | `O maior valor é: 10`      |
| 4     | `4`     | `valor1 = 4`       | -                     | -                          |
| 5     | `8`     | `valor2 = 8`       | `valor1 < valor2`     | `O maior valor é: 8`       |
