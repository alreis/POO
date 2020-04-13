package aula03;
import java.util.Scanner;
import java.util.Random;

public class altoBaixo {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(101), N, count = 1;
		String r1 = "s", r2 = "sim", resposta;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numéro: ");
		N = sc.nextInt();
		
		do {
				while (randomNumber != N) {
					
					if(randomNumber > N) {
						count++;
						System.out.println("O número inserido é demasiado baixo !");
						System.out.print("Tente novamente: ");
						N = sc.nextInt();
					}
					if(randomNumber < N) {
						count++;
						System.out.println("O número inserido é demasiado alto !");
						System.out.print("Tente novamente: ");
						N = sc.nextInt();
						}
					}
					
							System.out.println("Você terminou em " +count+ " tentativas !");
							count = 1;
							System.out.print("Gostaria de jogar novamente, (S)im ? ");
							resposta = sc.next();
							resposta = resposta.replaceAll(" ", "");
							
							if(resposta.equalsIgnoreCase(r1) || resposta.contentEquals(r2)) {
								randomNumber = rand.nextInt(101);
								System.out.print("Insira um numéro: ");
								N = sc.nextInt();
							}
			
			} while (resposta.equalsIgnoreCase(r1) || resposta.contentEquals(r2));
		
		
		
		sc.close();
			
		
	}

}
