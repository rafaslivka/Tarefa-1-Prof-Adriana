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
