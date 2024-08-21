11 - Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você pode votar este ano.");
        } else {
            System.out.println("Você não pode votar este ano.");
        }

        scanner.close();
    }
}

Teste de mesa: 

| Passo | Entrada | Variáveis                | Cálculo                     | Saída                             |
|-------|---------|--------------------------|-----------------------------|-----------------------------------|
| 1     | -       | `scanner`                | -                           | -                                 |
| 2     | `2024`  | `anoAtual = 2024`        | -                           | -                                 |
| 3     | `2008`  | `anoNascimento = 2008`   | `idade = anoAtual - anoNascimento` <br> `idade = 2024 - 2008 = 16` | `Você pode votar este ano.`      |
| 4     | `2024`  | `anoAtual = 2024`        | -                           | -                                 |
| 5     | `2007`  | `anoNascimento = 2007`   | `idade = anoAtual - anoNascimento` <br> `idade = 2024 - 2007 = 17` | `Você pode votar este ano.`      |
| 6     | `2024`  | `anoAtual = 2024`        | -                           | -                                 |
| 7     | `2009`  | `anoNascimento = 2009`   | `idade = anoAtual - anoNascimento` <br> `idade = 2024 - 2009 = 15` | `Você não pode votar este ano.`  |
