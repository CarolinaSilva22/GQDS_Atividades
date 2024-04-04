package matriz;
import java.util.Scanner;

public class Atividade1_a{
	
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

        scanner.close();

       
        System.out.println("Matriz informada:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}