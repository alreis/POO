package aula03;
import java.util.Scanner;

public class numeroPrimo {
	public static void main(String[] args) {
		int N, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número inteiro positivo: ");
		N = sc.nextInt();
		
		for(int i=1; i <= N; i++) {
			if (N%i==0)
				System.out.println(N+ "/" +i+ "=" +N/i);
				count++;
		}
		if (N < 0) {
			System.out.print("ERRO: Número inserido é negativo!");
		}
		else if (count > 2)
			System.out.print(N+" não é um número primo!");
		else
			System.out.print(N+" é um número primo!");
		
		sc.close();
	}

}
