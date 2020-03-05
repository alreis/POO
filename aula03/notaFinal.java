package aula03;
import java.util.Scanner;
import java.lang.Math;

public class notaFinal {
	public static void main(String[] args) {
		double notaP, notaT, notaF;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a nota da componente prática: ");
		notaP = sc.nextDouble();
		Math.ceil(notaP);
		System.out.print("Insira a nota da componete teórica: ");
		notaT = sc.nextDouble();
		Math.ceil(notaT);
		notaF = 0.4 * notaT + 0.6 * notaP;
		Math.round(notaF);
		if ((notaP < 0 || notaP > 20) || (notaT < 0 || notaT > 20))
			System.out.println("Nota inválida !");
			
		if (notaP < 7.0 || notaT < 7.0)
			System.out.println("Reprovado por nota mínima !");
		
		else
			System.out.println("Sua nota final é : " +notaF);
		
		sc.close();
	}

}
