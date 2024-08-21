10 - 

mport java.util.Scanner;
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
