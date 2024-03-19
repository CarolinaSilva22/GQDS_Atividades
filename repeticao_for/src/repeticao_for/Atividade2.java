package repeticao_for;

	import java.util.Scanner;

	public class Atividade2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
		
			System.out.print("Digite um número inteiro: ");
			int num = input.nextInt();
			
			int fat = 1;
			int i = 1;
			for(i = 1;i <= num; i++){
	            fat = fat * i;
	        }
	        
	        System.out.println("!" + num + " = " + fat);
			i++;
		}
}
