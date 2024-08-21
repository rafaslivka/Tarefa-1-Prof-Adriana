14 -  Ler a hora de início e a hora de fim de um jogo de Xadrez,
      (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas.
      sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Hora de início: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Hora de fim: ");
        int horaFim = scanner.nextInt();

    
        int duracao;
        if (horaFim >= horaInicio) {
         
            duracao = horaFim - horaInicio;
        } else {
          
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");
    }
}

Teste de mesa:

| Passo | Entrada | Variáveis            | Cálculo                                             | Saída                       |
|-------|---------|----------------------|-----------------------------------------------------|-----------------------------|
| 1     | -       | `scanner`            | -                                                   | -                           |
| 2     | `10`    | `horaInicio = 10`    | -                                                   | -                           |
| 3     | `15`    | `horaFim = 15`       | `duracao = horaFim - horaInicio` <br> `duracao = 15 - 10 = 5` | `A duração do jogo foi de 5 horas.` |
| 4     | `22`    | `horaInicio = 22`    | -                                                   | -                           |
| 5     | `3`     | `horaFim = 3`        | `duracao = (24 - horaInicio) + horaFim` <br> `duracao = (24 - 22) + 3 = 2 + 3 = 5` | `A duração do jogo foi de 5 horas.` |
