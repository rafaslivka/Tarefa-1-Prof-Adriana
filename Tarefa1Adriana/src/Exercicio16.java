import java.util.*;
public class Exercicio16 {

	public static void main(String[] args) {
		double gastosJan = 15000;
		double gastosFev = 23000;
		double gastosMarc = 17000;
		
		double gastoTotal = gastosJan + gastosFev + gastosMarc;
		
		System.out.println("Gasto total: " + gastoTotal);
		System.out.println("Média: " + (gastoTotal/3));
	}

}
