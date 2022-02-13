package aula2;

import java.util.Scanner;

public class Aula2Exercicio2Circulo {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);	
		double raio;
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();
		System.out.printf("O valor da área é: "+raio*3,14);
	}

/*EXERCÍCIOS
- CRIAR UM PROGRAMA PARA O CALCULO A ÁREA DE UM CIRCULO
- ENTRAR COM OS DADOS DO RAIO
- FORMULA DO CIRCULO: A = PI * (RAIO **2)
- REALIZAR A SAIDA : “O VALOR DA ÁREA É: “, VALOR DA ÁREA DO
CIRCULO*/
}
