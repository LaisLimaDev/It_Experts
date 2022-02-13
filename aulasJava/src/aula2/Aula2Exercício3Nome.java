package aula2;
import java.util.Scanner;

public class Aula2Exercício3Nome {
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	String nome, sobrenome;
	System.out.println("Olá, digite seu nome");
	nome = sc.nextLine();
	System.out.println("Olá, digite seu sobrenome");
	sobrenome = sc.nextLine();
	System.out.println("Bem vindo "+ nome+ " "+sobrenome);
	
	sc.close();

	}

}

/*CRIAR UM PROGRAMA PARA MOSTRAR O SEU NOME E SOBRE NOME
- SOLICITAR A ENTRADA COM O NOME, SOBRE NOME
- SAIDA: “BEM VINDO “ NOME “ “, SOBRE NOME*/