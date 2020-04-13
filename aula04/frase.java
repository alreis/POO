package aula04;
import java.util.Scanner;

public class frase {
	public static void main(String[] args) {
		String frase, nome, nomeDoAluno = "Alysson";
		int pos = -1, count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira uma frase: ");
		frase = sc.next();
		
		System.out.println("Esta é sua frase em minúsculas: '" +frase.toLowerCase()+ "'");
		System.out.println("Esta é sua frase em maiúsculas: '" +frase.toUpperCase()+ "'");
		
		for(int i=0; i < frase.length(); i++)
			pos++;
		System.out.println("O ultimo caracter é: " +frase.charAt(pos));
		
		for(int i=0; i < 3; i++)
			System.out.println("O " +(i+1)+ "° caracter é: " +frase.charAt(i));
		
		System.out.println("Sua frase tem " +(pos+1)+ " caracteres !");
		
		do {
			System.out.print("Advinhe o nome do Aluno que fez este programa: ");
			nome = sc.next();
			count++;
		} while(nome.compareToIgnoreCase(nomeDoAluno) != nomeDoAluno.compareToIgnoreCase(nome));
		System.out.print("Parabéns você acertou em " +count+ " tentativas!");
		
		sc.close();
	}

}
