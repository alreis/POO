package aula02;
import java.util.Scanner;

public class juros {
	public static void main(String[] args) {
		double montanteInvestido, taxaDeJuros, valorTotal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o montate investido: ");
		montanteInvestido = sc.nextDouble();
		System.out.println("Insira a txa de juros mensal: ");
		taxaDeJuros = sc.nextDouble();
		valorTotal = montanteInvestido + (((taxaDeJuros/100) * montanteInvestido)*3);
		System.out.printf("O montante ao fim de 3 meses é %.03f %n", valorTotal);
		sc.close();
	}

}
