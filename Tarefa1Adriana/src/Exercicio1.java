import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        //calcular o total de dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        //result
        System.out.println("A idade em dias é: " + totalDias);
        
        //close_scanner
        scanner.close();
    }

}
