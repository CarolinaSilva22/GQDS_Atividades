package metodo;
import java.util.Scanner;

public class Atividade8_3 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int linhas = 5;
			int colunas = 5;

			int[][] matriz = new int[linhas][colunas];
			leitura(matriz, linhas, colunas, input);
			exibir(matriz, linhas, colunas);
			
			input.close();
		}
		public static void leitura(int[][] matriz, int linhas, int colunas, Scanner input) {
			
			System.out.println("Digite os elementos da matriz:");

			for (int i = 0; i < linhas; i++) {
				for (int j = 0; j < colunas; j++) {
					System.out.printf("Elemento [%d][%d]: ", i, j);
					matriz[i][j] = input.nextInt();
				}
			}
		}	public static void exibir(int[][] matriz, int linhas, int colunas) {

			System.out.println("Resultado da matriz Transposta:");

			for (int i = 0; i < colunas; i++) {
				for (int j = 0; j < linhas; j++) {
					System.out.print(matriz[j][i] + " ");
				}
				System.out.println();
			}

			
		}
	}

