package metodo;
import java.util.Scanner;
public class Atividade7_3 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			double[] vetor = new double[10];
		
			num(vetor, input);
			double menor = Menor(vetor);
		    double maior = Maior(vetor);
			exibir(vetor);
			exibirMaiorMenor(menor, maior);
			
			input.close();
		}
		public static void num(double[] vetor, Scanner input) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite o " + (i + 1) + "º número real: ");
				vetor[i] = input.nextDouble();
			}
		}
		
		public static void exibir(double[] vetor) {

			System.out.print("Vetor: ");
			for (int i = 0; i < 10; i++) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		 public static double Menor(double[] vetor) {
		        double menor = vetor[0];
		        for (int i = 1; i < 10; i++) {
		            if (vetor[i] < menor) {
		                menor = vetor[i];
		            }
		        }
		        return menor;
		    }

		    public static double Maior(double[] vetor) {
		        double maior = vetor[0];
		        for (int i = 1; i < 10; i++) {
		            if (vetor[i] > maior) {
		                maior = vetor[i];
		            }
		        }
		        return maior;
		    }
		
		public static void exibirMaiorMenor(double menor, double maior) {
			System.out.println();
			System.out.println("Menor número: " + menor);
			System.out.println("Maior número: " + maior);

			
		

	}
}
