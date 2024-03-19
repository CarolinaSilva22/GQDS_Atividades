package repeticao_for;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	        int totalIdades = 0;
	        int contador = 0;

	        System.out.println("Digite as idades (digite um -1 para terminar):");

	        for (;;) {
	            int idade = scanner.nextInt();

	            if (idade < 0) {
	                break;
	            } //usa um loop for infinito e sai do loop quando uma idade negativa é inserida usando a instrução break

	            totalIdades += idade;
	            contador++;
	        }

	        if (contador == 0) {
	            System.out.println("Nenhuma idade foi informada.");
	        } else {
	            double media = (double) totalIdades / contador;
	            System.out.println("A média das idades é: " + media);
	        }

	        scanner.close();
	    }
}
