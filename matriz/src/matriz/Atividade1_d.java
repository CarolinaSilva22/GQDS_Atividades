package matriz;
import java.util.Scanner;

public class Atividade1_d{
    public static void main(String[] args) {
  
    	        Scanner scanner = new Scanner(System.in);

    	        int linhas = 5;
    	        int colunas = 5;

    	        int[][] matriz = new int[linhas][colunas];

    	        System.out.println("Digite os elementos da matriz 5x5:");

    	        for (int i = 0; i < linhas; i++) {
    	            for (int j = 0; j < colunas; j++) {
    	                System.out.printf("Elemento [%d][%d]: ", i, j);
    	                matriz[i][j] = scanner.nextInt();
    	            }
    	        }

    	    
    	        for (int i = 0; i < linhas; i++) {
    	            int temp = matriz[i][i];
    	            matriz[i][i] = matriz[i][colunas - 1 - i];
    	            matriz[i][colunas - 1 - i] = temp;
    	        }

    	        System.out.println("Matriz com diagonais trocadas:");

    	        for (int i = 0; i < linhas; i++) {
    	            for (int j = 0; j < colunas; j++) {
    	                System.out.print(matriz[i][j] + " ");
    	            }
    	            System.out.println(); 
    	        }

    	    }
    	}
