package java_estrutura_de_repeticao;
import java.util.Scanner;

public class NotasFaltas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alunos = 0;
        int reprovados = 0;
        double Snotas = 0;
        double Maiornota = -1;
        double Menornota = 101;
        
        System.out.print("Insira aqui a quantidade de alunos");
        int totalAlunos = input.nextInt();

        double nota = 0;

        while (nota >= 0) {
            System.out.print("Digite a nota final dos alunos: ");
            nota = input.nextDouble();
            if (nota < 0) {
                System.out.println("Encerrando o programa.");
                input.close();
                break;
            }
            System.out.print("Digite o total de faltas: ");
            int faltas = input.nextInt();
            if (nota >= 90) {
                alunos++;
            }
            if (nota < 70 || faltas >= 20) {
                reprovados++;
            }
            if (nota > Maiornota) {
                Maiornota = nota;
            }
            if (nota < Menornota) {
                Menornota = nota;
            }
            
           
            Snotas += nota;
        }
        double media = Snotas / totalAlunos;

        System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + alunos);
        System.out.println("Quantidade de alunos reprovados por nota ou falta: " + reprovados);
        System.out.println("Maior nota: " + Maiornota);
        System.out.println("Menor nota: " + Menornota);
        System.out.println("Média de notas da turma: " + media);
    }
}
