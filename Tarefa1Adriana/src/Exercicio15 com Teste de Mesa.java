15 - A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
     Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
     (considere que o mês possua 4 semanas exatas). 

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

Teste de mesa:

| Passo | Entrada | Variáveis                       | Cálculo                                                                                     | Saída                               |
|-------|---------|---------------------------------|---------------------------------------------------------------------------------------------|-------------------------------------|
| 1     | -       | `scanner`                       | -                                                                                           | -                                   |
| 2     | `200`   | `horasTrabalhadas = 200`        | -                                                                                           | -                                   |
| 3     | `25`    | `salarioPorHora = 25`           | `horasSemanais = 40` <br> `horasMensais = horasSemanais * 4 = 40 * 4 = 160`                | -                                   |
| 4     | -       | `horasExtras = horasTrabalhadas - horasMensais` <br> `horasExtras = 200 - 160 = 40` | `valorHoraExtra = salarioPorHora * 1.5` <br> `valorHoraExtra = 25 * 1.5 = 37.5`  | -                                   |
| 5     | -       | `salarioTotal = (horasMensais * salarioPorHora) + (horasExtras * valorHoraExtra)` <br> `salarioTotal = (160 * 25) + (40 * 37.5)` | `salarioTotal = 4000 + 1500 = 5500` | `O salário total do funcionário é R$ 5500.00` |
| 6     | `120`   | `horasTrabalhadas = 120`        | -                                                                                           | -                                   |
| 7     | `30`    | `salarioPorHora = 30`           | `horasSemanais = 40` <br> `horasMensais = horasSemanais * 4 = 40 * 4 = 160`                | -                                   |
| 8     | -       | `salarioTotal = horasTrabalhadas * salarioPorHora` <br> `salarioTotal = 120 * 30` | `salarioTotal = 3600`                     | `O salário total do funcionário é R$ 3600.00` |
