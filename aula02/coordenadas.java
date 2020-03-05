package aula02;
import java.util.Scanner;
import java.lang.Math;

public class coordenadas {
	public static void main(String[] args) {
		int distance, x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a coordenada X do primeiro ponto: ");
		x1 = sc.nextInt();
		System.out.println("Insira a coordenada y do primeiro ponto: ");
		y1 = sc.nextInt();
		System.out.println("Insira a coordenada X do segundo ponto: ");
		x2 = sc.nextInt();
		System.out.println("Insira a coordenada y do segundo ponto: ");
		y2 = sc.nextInt();
		
		distance = ((x2 - x1)^2) + ((y2 - y1)^2);
		Math.sqrt(distance);
		System.out.println("A distância entre o primeiro ponto e o segundo é " +distance);
		sc.close();
	}

}
