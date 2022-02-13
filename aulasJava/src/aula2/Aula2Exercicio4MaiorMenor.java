package aula2;
import java.util.Scanner;
public class Aula2Exercicio4MaiorMenor {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		double numero1, numero2;
		System.out.println("Digite um número: ");
		numero1 = sc.nextDouble();
		System.out.println("Digite um número: ");
		numero2 = sc.nextDouble();
		if (numero1>numero2) {
			System.out.println("verdadeiro");
		}
		else {
			System.out.println("falso");
		}
	}
}
/*
- CRIAR UM PROGRAMA PARA VERIFICAR MAIOR NUMERO
- ENTRAR COM O NUMERO1 , NUMERO2
- LER OS VALORES
- SE O NUMERO1 FOR MAIOR QUE NUMERO2 DEVE MOSTRAR
VERDADEIRO, SENAO MOSTRAR FALSO
USAR OPERADORES LÓGICOS*/