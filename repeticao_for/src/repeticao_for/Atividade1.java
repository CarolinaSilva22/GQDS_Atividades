package repeticao_for;

import java.util.Scanner;

public class Atividade1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o primeiro número positivo: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo número positivo: ");
	        int num2 = scanner.nextInt();
	        
	        int somaImpares = 0;
	        
	        for (int i = num1 + 1; i < num2; i++) {
	            if (i % 2 != 0) {
	                somaImpares += i;
	            }
	        }
	        
	        System.out.println("Soma dos numeros impares é: " + somaImpares);
	     
	    }
	}

