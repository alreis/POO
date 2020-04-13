package aula03;
import java.util.Scanner;

public class diasDoMes {
	public static void main(String[] args) {
		int mes, ano, dias;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o mês: ");
		mes = sc.nextInt();
		System.out.print("Insira o ano: ");
		ano = sc.nextInt();
		
		if(mes < 0 || mes > 12)
			System.out.print("Mês incorreto!");
		
		else {
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
				dias = 31;
			if(mes == 2 && ano%400 == 0 || ano%4 == 0 && ano%100 != 0 )
				dias = 29;
			else
				dias = 28;
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
				dias =30;
			
			System.out.print("O " +mes+ "° mês do ano de " +ano+ " tem "  +dias+" dias !");
		}
		
		
		sc.close();
	}
}
