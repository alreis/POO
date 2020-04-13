package aula04;
import java.util.Scanner;

public class acronimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, acronimos="";
		System.out.print("Insira a String: ");
		nome = sc.nextLine();
		String[] nomes = nome.split(" ");

		for(String x : nomes){
			if(x.length() >= 3)
				acronimos += x.charAt(0);
		}

		System.out.println(acronimos);
		sc.close();
	}
}
