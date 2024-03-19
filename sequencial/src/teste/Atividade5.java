package teste;
import java.util.Scanner;
public class Atividade5{

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o raio da esfera:");
        double raio = input.nextDouble();
        
     
        int comprimento = (int) Math.round(2 * Math.PI * raio);
        
   
        int area = (int) Math.round(Math.PI * Math.pow(raio, 2));
        
      
        int volume = (int) Math.round((3.0 / 4.0) * Math.PI * Math.pow(raio, 3));
        
        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Area da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
        
    }
}