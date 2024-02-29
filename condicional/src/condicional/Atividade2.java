
	package condicional;

	import java.util.Scanner;

	public class Atividade2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);

			System.out.println("Digite qual o tipo de apartamento hospedado(1-Apto Simples/2-Apto Duplo):");
			int tipo = input.nextInt();

			System.out.println("Digite quantos dias ficou hospedado:");
			int dias = input.nextInt();
			
			if(tipo == 1) {
				if(dias<10) {
					int total = dias * 100;
					System.out.println("Total a ser pago:" + total);
				}
				else if(dias>=10 && dias<=15) {
					int total = dias * 90;
					System.out.println("Total a ser pago:" + total);
				}
				else if(dias>15) {
					int total = dias * 80;
					System.out.println("Total a ser pago:" + total);
	            }
				
			}
			else if(tipo == 2) {
	            if(dias<10) {
	            	int total = dias * 140;
					System.out.println("Total a ser pago:" + total);
				}
				else if(dias>=10 && dias<=15) {
					int total = dias * 120;
					System.out.println("Total a ser pago:" + total);
				}
				else if(dias>15) {
					int total = dias * 100;
					System.out.println("Total a ser pago:" + total);
	            }
				
			
		}

	}
}
