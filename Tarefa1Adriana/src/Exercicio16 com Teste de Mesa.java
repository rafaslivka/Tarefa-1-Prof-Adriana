16 - Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. 
     Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.

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

Teste de mesa:

| Passo | Entrada | Variáveis            | Cálculo                                      | Saída                                |
|-------|---------|----------------------|----------------------------------------------|--------------------------------------|
| 1     | -       | -                    | -                                            | -                                    |
| 2     | -       | `gastosJan = 15000`, `gastosFev = 23000`, `gastosMarc = 17000` | `gastoTotal = gastosJan + gastosFev + gastosMarc` <br> `gastoTotal = 15000 + 23000 + 17000 = 55000` | -                                    |
| 3     | -       | `gastoTotal = 55000` | `Média = gastoTotal / 3` <br> `Média = 55000 / 3 ≈ 18333.33` | `Gasto total: 55000.0` <br> `Média: 18333.33` |
