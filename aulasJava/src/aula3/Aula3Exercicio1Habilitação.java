package aula3;
import java.util.Scanner;

public class Aula3Exercicio1Habilitação {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String nome, carteira;
		int idade;
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		System.out.println("Possui carteira de habilitação?(sim/não)");
		carteira = sc.next();	
		sc.close();
		
		if ( (idade >= 18) && (carteira == "sim")  ); {
		System.out.println(nome+" , você está habilitado a dirigir!");
		}
		else {
		System.out.println(nome+" , você não está habilitado a dirigir!");
		 
		 }
			
	}
}
/*1 - Crie Um Programa Para Determinar Se Uma Pessoa Está Apta Para Dirigir Um Carro.
Você Deve Solicitar A Entrada De Dados: Nome, Idade, Habilitado
Se A Pessoa É Maior De Idade E Se Tem Carteira De Habilitação
Ou Seja, Se Atende A Todos Os Requisitos, Informar: “Liberação Realizada Para ”, Nome
Senao Informar Que “O Cliente “,Nome, “ Não Atente A Todos Os Requisitos.
Obrigatórios”*/