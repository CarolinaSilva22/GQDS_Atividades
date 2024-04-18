package metodo;
import java.util.Scanner;

public class Atividade8_4 {
	
	    public static void main(String[] args) {
	  
	    	        Scanner input = new Scanner(System.in);

	    	        int linhas = 5;
	    	        int colunas = 5;

	    	        int[][] matriz = new int[linhas][colunas];
	    	        elementos(matriz, linhas, colunas, input);
	    	        diagonal(matriz, linhas, colunas);
	    			exibir(matriz, linhas, colunas);
	    			input.close();
	    		}
	    			public static void elementos(int[][] matriz, int linhas, int colunas, Scanner input) {
	    	        System.out.println("Digite os elementos da matriz:");

	    	        for (int i = 0; i < linhas; i++) {
	    	            for (int j = 0; j < colunas; j++) {
	    	                System.out.printf("Elemento [%d][%d]: ", i, j);
	    	                matriz[i][j] = input.nextInt();
	    	            }
	    	        }
	    			}

	    			public static void diagonal(int[][] matriz, int linhas, int colunas) {
	    	        for (int i = 0; i < linhas; i++) {
	    	            int temp = matriz[i][i];
	    	            matriz[i][i] = matriz[i][colunas - 1 - i];
	    	            matriz[i][colunas - 1 - i] = temp;
	    	        }
	    			}
	    	        public static void exibir(int[][] matriz, int linhas, int colunas) {
	    	        System.out.println("Resultado da matriz com diagonais trocadas:");

	    	        for (int i = 0; i < linhas; i++) {
	    	            for (int j = 0; j < colunas; j++) {
	    	                System.out.print(matriz[i][j] + " ");
	    	            }
	    	            System.out.println(); 
	    	        }

	    	    }
	    	}


