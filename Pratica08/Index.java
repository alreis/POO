package Pratica08;


public class Index {
	
	private static String nome = "Empresa de Aluguer de Viaturas";
	private static String codigoPostal = "3770-355";
	private static String email = "empresadealuguerdeviaturas@ua.pt";
	
	public static void main(String[] args) {
		
		System.out.println("CONTATO");
		System.out.println("***********************************************\n");
		System.out.println(nome);
		System.out.println("Código Postal: " + codigoPostal);
		System.out.println("Email: " + email + "\n");
		System.out.println("***********************************************\n");
		
		Menu.main(args);
	}

}


