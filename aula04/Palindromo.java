package aula04;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = 0, countEspaco = 0;
        String contrario = "", Frase01, FrasePalindromo;
        System.out.print("Insira a String com caracteres numéricos à ser contada: ");
        Frase01 = sc.nextLine();
        
        for(int i = 0; i < Frase01.length(); i++) {
        	if(Character.isDigit(Frase01.charAt(i)))
        		count++;
        	if(Character.isSpace(Frase01.charAt(i)))
        		countEspaco++;
        	}
        System.out.println("Sua String contém " +count+ " caracter(es) numérico(s) !");
        System.out.println("Sua String contém " +countEspaco+ " espaços !");
        if(Frase01 == Frase01.toLowerCase())
        	System.out.println("Sua String '" +Frase01+ "' contém somente letras minúsculas !");
        System.out.println("Sua String sem espaços seguidos: '"+Frase01.replaceAll("  ", " ")+"'");
        
        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        FrasePalindromo = sc.nextLine();
        for (int i = (FrasePalindromo.length() -1); i >= 0; i--) {
            contrario = contrario + FrasePalindromo.charAt(i);
        }
        if (contrario.toLowerCase().equals(FrasePalindromo.toLowerCase())) {
            System.out.println("Essa palavra é palíndromo :)");
        } else {
            System.out.println("Essa palavra não é palíndromo :(");
        }
        
        
        sc.close();
        
    }
    
}
