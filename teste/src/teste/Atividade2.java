
	package teste;
	import java.util.Scanner;

		public class Atividade2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			    Scanner input = new Scanner(System.in);
					
				System.out.println("Digite a temperatura em Celsius: ");
				double celsius = input.nextDouble();
				
				
				double Fahrenheit = (celsius * 1.8) + 32;
				System.out.println("Resultado é: " + Fahrenheit);
				
			}

			

	
}
