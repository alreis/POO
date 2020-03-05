package aula02;
import java.util.Scanner;
import java.lang.Math;

public class hipotenusa {
	public static void main(String[] args) {
		double CatetoA, CatetoB, Hipo, Angulo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor do cateto A: ");
		CatetoA = sc.nextDouble();
		System.out.print("Insira o valor do cateto B: "); 
		CatetoB = sc.nextDouble();
		
		Hipo = Math.sqrt(Math.pow(CatetoA, 2) + Math.pow(CatetoB, 2));
		Angulo = Math.tanh(CatetoA/Hipo);
		
		System.out.println("O valor da Hipotenusa é " +Hipo);
		System.out.printf("O triângulo tem um ângulo de %.2f°", Math.toDegrees(Angulo));
		sc.close();
	}

}
