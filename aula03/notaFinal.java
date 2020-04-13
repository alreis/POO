package aula03;
import java.util.Scanner;
import java.lang.Math;

public class notaFinal {
	public static void main(String[] args) {
		int linha = 2, coluna = 3;
		double notaP, notaT, notaF, tabelaDeNotas[][] = new double[linha][coluna];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				do {
					System.out.print("Insira a nota da componente teórica: ");
					notaT = sc.nextDouble();
					Math.ceil(notaT);
					if (notaT< 0 || notaT > 20)
						System.out.println("Nota inválida !");
						
				}while(notaT < 0 || notaT > 20);

				do {
					System.out.print("Insira a nota da componete prática: ");
					notaP = sc.nextDouble();
					Math.ceil(notaP);	
					if (notaP < 0 || notaP > 20)
						System.out.println("Nota inválida !");
					
				}while(notaP < 0 || notaP > 20);
				tabelaDeNotas[i][j] = notaT;
				tabelaDeNotas[i][j] = notaP;
				notaF = 0.4 * notaT + 0.6 * notaP;
				Math.round(notaF);
				tabelaDeNotas[i][j] = notaF;
			}	
		}
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++);
				System.out.println(tabelaDeNotas);
		}
		
		
		
		
			
		/*if (notaP < 7.0 || notaT < 7.0)
			System.out.println("Reprovado por nota mínima !");
		
		else
			System.out.println("Sua nota final é : " +notaF);
		*/
		sc.close();
	}

}
