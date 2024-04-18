package metodo;
import java.util.Scanner;
public class Atividade7_2 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		
			double[] vetor = new double[10];
		
			num(vetor, input);
			exibir(vetor);
			negativos(vetor);
			
			input.close();
			
		}
		public static void num (double[] vetor, Scanner input) { 
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o " + (i + 1) + "º número real: ");
				vetor[i] = input.nextDouble();
			}
		}
		
		
		public static void exibir(double[] vetor) {

			System.out.print("Vetor: ");
			for (int i = 0; i < 10; i++) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		public static void negativos(double[] vetor) {

			System.out.println("\nPosições dos números negativos: ");
			for (int i = 0; i < 10; i++) {
				if (vetor[i] < 0) {
					System.out.println(i + " ");
				}
			}

			
		}
}
