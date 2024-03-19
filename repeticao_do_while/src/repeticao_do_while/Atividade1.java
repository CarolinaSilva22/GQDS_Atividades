package repeticao_do_while;

import java.util.Scanner;

public class Atividade1 {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        int numeroConta;
	        char continuar;
	        
	        do {
	            System.out.print("Digite o número da conta corrente (3 dígitos): ");
	            numeroConta = scanner.nextInt();
	            
	            int digitoVerificador = calcularDigitoVerificador(numeroConta);
	            System.out.println("O dígito verificador da conta é: " + digitoVerificador);
	            
	            System.out.print("Deseja verificar outro número de conta corrente? (s/n): ");
	            continuar = scanner.next().charAt(0);
	        } while (continuar == 's' || continuar == 'S');
	        
	        scanner.close();
	    }
	    
	    public static int calcularDigitoVerificador(int numeroConta) {
	        int inverso = Integer.parseInt(new StringBuilder(Integer.toString(numeroConta)).reverse().toString());
	        int soma = numeroConta + inverso;
	        int digitoVerificador = 0;
	        
	        for (int i = 0; soma > 0; i++) {
	            int digito = soma % 10;
	            digitoVerificador += digito * i;
	            soma /= 10;
	        }
	        
	        return digitoVerificador % 10;
	    }
	}