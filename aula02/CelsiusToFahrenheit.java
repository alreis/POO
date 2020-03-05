package aula02;
import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a temperatura em Célsius: ");
		celsius = sc.nextDouble();
		fahrenheit = 1.8 * celsius + 32;
		System.out.println("A temperatura em Fahrennheit é " +fahrenheit);
		sc.close();
	}

}
