
	package condicional;


	import java.util.Scanner;

	public class Atividade1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		    Scanner input = new Scanner(System.in);
				
			System.out.println("Digite sua idade: ");
			int idade = input.nextInt();
			
			System.out.println("Digite seu sexo(M/F): ");
			String sexo = input.next();
			
			switch(sexo){
			case "M":
			    if(idade <= 15){
			    	System.out.println("valor mensalidade: R$ 60,00");
		     	}
			    if(idade >= 16 && idade <=18){
			    	System.out.println("valor mensalidade: R$ 75,00");
		     	}
			    if(idade >= 19 && idade <=30){
			    	System.out.println("valor mensalidade: R$ 90,00");
			    }
			    if(idade >= 31 && idade <=40){
			    	System.out.println("valor mensalidade: R$ 85,00");		
				}
			    if(idade > 40){
			    	System.out.println("valor mensalidade: R$ 80,00");
				};
			break;
			case "F":
				 if(idade <= 18){
				    System.out.println("valor mensalidade: R$ 60,00");
			     }
				 if(idade >= 19 && idade <=25){
				    System.out.println("valor mensalidade: R$ 90,00");
			     }
				 if(idade >= 26 && idade <=40){
				    System.out.println("valor mensalidade: R$ 85,00");
				 }
				 if(idade > 40){
				    System.out.println("valor mensalidade: R$ 80,00");
				 };
			break;
			default : System.out.println("Valor Errado!!");
			 }
	}
}
