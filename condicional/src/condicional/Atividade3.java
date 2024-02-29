package condicional;

import java.util.Scanner;

public class Atividade3 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("Digite o valor do coeficiente A: ");
			int a = input.nextInt();

			System.out.println("Digite o valor do coeficiente B: ");
			int b = input.nextInt();

			System.out.println("Digite o valor do coeficiente C: ");
			int c = input.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				System.out.println("Igualdade confirmada: 0 = 0!");

			} else if (a == 0 && b == 0 && c != 0) {
				System.out.println("Coeficientes informados incorretamente!");

			} else if (a == 0 && b != 0) {
				double x = -c / b;
				System.out.println("Esta é uma equação de primeiro grau: x=" + x);

			} else if (a != 0) {
				System.out.println("Esta é uma equação de segundo grau!");
				double delta = Math.pow(b, 2) - 4 * a * c;
				
				if (delta < 0) {
					System.out.println("Esta equação não possui raízes reais! Delta=" + delta);
				} else if (delta == 0) {
					double x = (double) -b / (2 * a);
					System.out.format("Esta equação possui duas raízes reais iguais: x= %.2f\n", x);
				} else if (delta > 0) {
					System.out.println("Esta equação possui duas raízes reais diferentes! Delta=" + delta);
					double x = (-b + Math.sqrt(delta)) / (2 * a);
					double x1 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.format("Valor de x= %.2f\n", x);
					System.out.format("Valor de x= %.2f\n", x1);
				}

			}

		}

	}

