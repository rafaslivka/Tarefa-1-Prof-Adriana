10 - Ler as notas da 1a. e 2a. avaliações de um aluno. 
     Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). 
     Escrever também a média calculada. 

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite a nota da 1° avaliação: ");
      double nota1 = scanner.nextDouble();
      
      System.out.println("Digite a nota da 2° avalicação: ");
      double nota2 = scanner.nextDouble();
      
      
      double media = (nota1 + nota2) / 2;
      
      if (media >=6) {
    	  System.out.println("o Aluno esta aprovado");
    	 
      } else { 
    	  System.out.println("o Aluno esta reprovado");
    	  
    	  System.out.printf("A média do aluno é: %.2f%n", media);
    	  
    	  scanner.close();
      }
      
	}

}

Teste de mesa:

| Passo | Entrada | Variáveis                | Cálculo                                        | Saída                        |
|-------|---------|--------------------------|------------------------------------------------|------------------------------|
| 1     | -       | `scanner`                | -                                              | -                            |
| 2     | `7.0`   | `nota1 = 7.0`            | -                                              | -                            |
| 3     | `5.0`   | `nota2 = 5.0`            | `media = (nota1 + nota2) / 2` <br> `media = (7.0 + 5.0) / 2 = 12.0 / 2 = 6.0` | `o Aluno esta aprovado`      |
| 4     | `4.0`   | `nota1 = 4.0`, `nota2 = 4.0` | `media = (nota1 + nota2) / 2` <br> `media = (4.0 + 4.0) / 2 = 8.0 / 2 = 4.0` | `o Aluno esta reprovado` <br> `A média do aluno é: 4.00` |
