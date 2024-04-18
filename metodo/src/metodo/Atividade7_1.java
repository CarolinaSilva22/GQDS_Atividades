	package metodo;

	import java.util.Scanner;

	public class Atividade7_1{

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int[] numeros = new int[10];

			num(numeros, input);
			exibir(numeros);
			int somaPares = somaPares(numeros);
			exibirSoma(somaPares);

			input.close();
		}

		public static void num(int[] numeros, Scanner input) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
				numeros[i] = input.nextInt();
			}
		}

		public static void exibir(int[] numeros) {
			System.out.println("Numeros digitados: ");
			for (int i = 0; i < 10; i++) {
				System.out.println(numeros[i] + " ");
			}
		}

		public static int somaPares(int[] numeros) {
			int somaPares = 0;
			for (int i = 0; i < 10; i++) {
				if (numeros[i] % 2 == 0) {
					somaPares += numeros[i];
				}
			}
			return somaPares;
		}

		public static void exibirSoma(int somaPares) {
			System.out.println("\nSoma dos números pares: " + somaPares);
		}
	
}
