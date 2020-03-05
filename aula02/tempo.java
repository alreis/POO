package aula02;
import java.util.Scanner;

public class tempo {
	public static void main(String[] args) {
		int sec, hora, min, restoSec;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o tempo em segundos: ");
		sec = sc.nextInt();
		hora = sec / 3600;
		min = (sec - hora * 3600) / 60;
		restoSec = sec - (hora * 3600 + min * 60);
		System.out.println(+hora+ ":" +min+ ":" +restoSec);
		sc.close();
		
	}

}
