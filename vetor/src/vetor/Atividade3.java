
	package vetor;
	import java.util.Scanner;
	public class Atividade3 {
		
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				double[] vetor = new double[10];

				for (int i = 0; i < 10; i++) {
					System.out.print("Digite o " + (i + 1) + "º número real: ");
					vetor[i] = scanner.nextDouble();
				}

				double menor = vetor[0];
				double maior = vetor[0];

				for (int i = 1; i < 10; i++) {
					if (vetor[i] < menor) {
						menor = vetor[i];
					}
					if (vetor[i] > maior) {
						maior = vetor[i];
					}
				}

				System.out.print("Vetor: ");
				for (int i = 0; i < 10; i++) {
					System.out.print(vetor[i] + " ");
				}
				System.out.println();
				System.out.println("Menor número: " + menor);
				System.out.println("Maior número: " + maior);

			}


	
}
