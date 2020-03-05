package aula03;
import java.util.Scanner;

public class contagem {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número : ");
		numero = sc.nextInt();
		
		for (int i=1; numero >= 0; numero--)
			System.out.println(+numero);
		sc.close();
		    
	}

}
