package teste;
	import java.util.Scanner;

		public class Atividade3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			    Scanner input = new Scanner(System.in);
					
				System.out.println("Digite o salario minimo: ");
				double salario_min = input.nextDouble();
				
				System.out.println("Digite o salario do funcionario: ");
				double salario_func = input.nextDouble();
				
				
				double total = salario_func / salario_min;
				System.out.println("Resultado é: " + total + " salarios minimos;");
				
			}

			

	
}