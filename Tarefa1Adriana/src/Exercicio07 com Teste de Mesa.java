7 - Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 

import java.util.Scanner; 

public class Exercicio7 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        
        if (valor > 10) { 
            System.out.println("É MAIOR QUE 10!");
        } else {  
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}

Teste de mesa:

| Passo | Entrada | Variáveis              | Cálculo                 | Saída                        |
|-------|---------|------------------------|-------------------------|------------------------------|
| 1     | -       | `scanner`              | -                       | -                            |
| 2     | `15`    | `valor = 15`           | `valor > 10`            | `É MAIOR QUE 10!`            |
| 3     | `5`     | `valor = 5`            | `valor <= 10`           | `NÃO É MAIOR QUE 10!`        |
