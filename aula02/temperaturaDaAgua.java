package aula02;
import java.util.Scanner;

public class temperaturaDaAgua {
	public static void main(String[] args) {
		double M, finalTemperature, initialTemperature, Q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a quantidade de água em Kg: ");
		M = sc.nextDouble();
		System.out.print("Insira a temperatura inicial em Célsius: ");
		initialTemperature = sc.nextDouble();
		System.out.print("Insira a temperatura final em Célcius:  ");
		finalTemperature = sc.nextDouble();
		Q = M * (finalTemperature - initialTemperature) * 4184;
		System.out.println("A energia necessária em Joules é " +Q);
		sc.close();
	}
}
