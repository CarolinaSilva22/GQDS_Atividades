
	package repeticao_do_while;

	import java.util.Scanner;

	public class Atividade2 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			double nota;
			do {
				System.out.print("Digite uma nota entre 0 á 10: ");
				nota = scanner.nextDouble();
			} while (nota < 0 || nota > 10);

			double salario;
			do {
				System.out.print("Digite um salário maior que zero: ");
				salario = scanner.nextDouble();
			} while (salario <= 0);

			char sexo;
			do {
				System.out.print("Digite o sexo (m ou f): ");
				sexo = scanner.next().charAt(0);
			} while (sexo != 'm' && sexo != 'f');

			int idade;
			do {
				System.out.print("Digite uma idade entre 0 á 120: ");
				idade = scanner.nextInt();
			} while (idade < 0 || idade > 120);

			scanner.close();

			System.out.println("Os dados informados são:");
			System.out.println("A nota é: " + nota);
			System.out.println("O salário é: " + salario);
			System.out.println("O sexo é: " + sexo);
			System.out.println("A idade é: " + idade);
		}
	
}
