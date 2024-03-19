package repeticao_for;

import java.util.Scanner;

public class Atividade4 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int maior = Integer.MIN_VALUE; 
	        int menor = Integer.MAX_VALUE; 
	        System.out.println("Digite os números (digite 0 para terminar):");

	        for (int numero; (numero = scanner.nextInt()) != 0;) {
	            if (numero > maior) {
	                maior = numero;
	            }

	            if (numero < menor) {
	                menor = numero;
	            }
	        }

	        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum número foi informado.");
	        } else {
	            System.out.println("Maior número: " + maior);
	            System.out.println("Menor número: " + menor);
	        }
	    }
}
