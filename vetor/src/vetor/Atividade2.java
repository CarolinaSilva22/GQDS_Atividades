package vetor;

	import java.util.Scanner;
	public class Atividade2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double[] vetor = new double[10];

			for (int i = 0; i < 10; i++) {
				System.out.print("Digite o " + (i + 1) + "º número real: ");
				vetor[i] = scanner.nextDouble();
			}

			System.out.print("Vetor: ");
			for (int i = 0; i < 10; i++) {
				System.out.print(vetor[i] + " ");
			}
			System.out.println();

			System.out.print("Posições dos números negativos: ");
			for (int i = 0; i < 10; i++) {
				if (vetor[i] < 0) {
					System.out.print(i + " ");
				}
			}

		}


}
