package aula03;
import java.util.Scanner;

public class conjuntoDeNumeros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o conjunto de números separados por espaços, o primeiro e o ultimo valores devem ser iguais: ");
		String conjunto = sc.nextLine();
		//String[] conjunto = c.split(" ");
		/*if(conjunto[0] != conjunto[-1])
			System.out.print("ERRO: O primeiro e o segundo elementos não são iguais!");
		else {
			
		};*/
		
		System.out.print(conjunto.length()-1);
		
	}

}
