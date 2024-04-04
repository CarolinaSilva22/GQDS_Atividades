package vetor;

	import java.util.Scanner;
	public class Atividade1 {
		

		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			int[] numeros = new int[10];
			int somaPares = 0;
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
				numeros[i] = input.nextInt();
				
				if (numeros[i] % 2 == 0) {
					somaPares += numeros[i];
				}
			}
			System.out.println("Numeros digitados: ");
			for (int i = 0; i < 10; i++) {
				System.out.println(numeros[i] + " " );
			}
			System.out.println("\nSoma dos números pares: " + somaPares);
		
		
			

		}

	}