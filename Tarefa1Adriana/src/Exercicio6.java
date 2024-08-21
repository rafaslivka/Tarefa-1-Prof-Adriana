import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler a temperatura em graus Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        
        // Converter Fahrenheit para Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        
       
        System.out.printf("A temperatura correspondente em graus Celsius é: %.2f°C%n", temperaturaCelsius);
        
        scanner.close();
    }
}
