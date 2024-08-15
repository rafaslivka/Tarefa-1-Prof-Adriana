import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Total de horas trabalhadas por mês: "); 
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.println("Salário por hora: ");
        double salarioPorHora = scanner.nextDouble(); 
        
       
        int horasSemanais = 40;
        int horasMensais = horasSemanais * 4;
        
        double salarioTotal;
        
        if (horasTrabalhadas > horasMensais) {
            int horasExtras = horasTrabalhadas - horasMensais;
            double valorHoraExtra = salarioPorHora * 1.5;
            
            salarioTotal = (horasMensais * salarioPorHora) + (horasExtras * valorHoraExtra);
        } else { 
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }
        
        System.out.printf("O salário total do funcionário é R$ %.2f%n", salarioTotal);
    }
}
