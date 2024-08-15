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