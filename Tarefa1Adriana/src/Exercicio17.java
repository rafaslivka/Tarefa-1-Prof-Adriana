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
