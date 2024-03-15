package java_estrutura_de_repeticao;
import java.util.Scanner;

public class PesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaSalarios = 0;
        int somaFilhos = 0;
        int numeroPessoas = 0;
        
        while (true) {
            System.out.print("Digite o salário (ou um valor negativo para encerrar): ");
            double salario = scanner.nextDouble();
            
            if (salario < 0) {
                break;
            }
            
            System.out.print("Digite o número de filhos: ");
            int numFilhos = scanner.nextInt();
            
            somaSalarios += salario;
            somaFilhos += numFilhos;
            numeroPessoas++;
        }
        
        if (numeroPessoas > 0) {
            double mediaSalarial = somaSalarios / numeroPessoas;
            double mediaFilhos = (double) somaFilhos / numeroPessoas;
            
            System.out.println("Média Salarial da População: " + mediaSalarial);
            System.out.println("Média do Número de Filhos: " + mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
        
        scanner.close();
    }
}
