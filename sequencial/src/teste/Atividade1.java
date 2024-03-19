package teste;
import java.util.Scanner;

	public class Atividade1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
				
			System.out.println("Digite a maior diagonal do losango: ");
			double maior = input.nextDouble();
			
			System.out.println("Digite a menor diagonal do losango: ");
			double menor = input.nextDouble();
			
			double area = (maior * menor)/ 2;
			System.out.println("Resultado é: " + area);
			
		}

		

	}
