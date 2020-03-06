package aula03;
import java.util.Scanner;
import java.lang.Math;

public class fundoDeInvestimento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double montanteInvestido, taxaDeJuro, valorMensal;
		int tempo;
		System.out.print("Insira o valor investido!\nO valor deve ser positivo e multiplo de 1000: ");
		montanteInvestido = sc.nextDouble();
		
		System.out.print("Insira a taxa de juro entre 0% e 5%: ");	
		taxaDeJuro = sc.nextDouble();
		taxaDeJuro = taxaDeJuro/100;
		
		if(montanteInvestido < 0 || montanteInvestido%1000 != 0) 
			System.out.println("ERRO: Valor negativo ou não é multiplo de 1000!");
		else if(taxaDeJuro < 0 || taxaDeJuro > 0.5)
			System.out.println("ERRO: Taxa de juro não está entre 0% e 5%!");
		else {
			for(tempo = 1; tempo <=12; tempo++) {
				valorMensal = montanteInvestido * Math.pow((1+taxaDeJuro),tempo);
				System.out.printf("Valor do " +tempo+ "° mês = %.2f€\n", valorMensal);
			}
		}
		sc.close();
		
	}

}
