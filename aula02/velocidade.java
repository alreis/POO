package aula02;
import java.util.Scanner;

public class velocidade {
	public static void main(String[] args) {
		double v1, v2, d1, d2, mediaFinal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a v1: ");
		v1 = sc.nextDouble();
		System.out.print("Insira a d1: ");
		d1 = sc.nextDouble();
		System.out.print("Insira a v2: ");
		v2 = sc.nextDouble();
		System.out.print("Insira a d2: ");
		d2 = sc.nextDouble();
		
		mediaFinal = (v1+v2)/2;
		System.out.println("A velocidade média final é " +mediaFinal+ "km/h");
		sc.close();
		
		
	}

}
