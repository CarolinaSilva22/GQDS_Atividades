package poo;
import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[100]; 
        int totalVeiculos = 0;

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Pesquisar veículo por chassi ou placa");
            System.out.println("3. Atualizar veículo por chassi ou placa");
            System.out.println("4. Excluir veículo por chassi ou placa");
            System.out.println("5. Imprimir lista de veículos");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número do chassi:");
                    String chassi = scanner.nextLine();
                    System.out.println("Digite a placa:");
                    String placa = scanner.nextLine();
                    System.out.println("Digite a marca:");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o modelo:");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite o ano:");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); 

                    Veiculo veiculo = new Veiculo(chassi, placa, marca, modelo, ano);
                    veiculos[totalVeiculos] = veiculo;
                    totalVeiculos++;
                    break;
                case 2:
                    System.out.println("Digite o chassi ou placa:");
                    String chavePesquisa = scanner.nextLine();
                    pesquisarVeiculo(veiculos, totalVeiculos, chavePesquisa);
                    break;
                case 3:
                    System.out.println("Digite o chassi ou placa do veículo a ser atualizado:");
                    String chaveAtualizacao = scanner.nextLine();
                    atualizarVeiculo(veiculos, totalVeiculos, chaveAtualizacao, scanner);
                    break;
                case 4:
                    System.out.println("Digite o chassi ou placa do veículo a ser excluído:");
                    String chaveExclusao = scanner.nextLine();
                    excluirVeiculo(veiculos, totalVeiculos, chaveExclusao);
                    break;
                case 5:
                    imprimirVeiculos(veiculos, totalVeiculos);
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void pesquisarVeiculo(Veiculo[] veiculos, int totalVeiculos, String chavePesquisa) {
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chavePesquisa) || veiculo.getPlaca().equals(chavePesquisa)) {
                System.out.println("Veículo encontrado:");
                System.out.println("Chassi: " + veiculo.getNumeroChassi());
                System.out.println("Placa: " + veiculo.getPlaca());
                System.out.println("Marca: " + veiculo.getMarca());
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Ano: " + veiculo.getAno());
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

  
    public static void atualizarVeiculo(Veiculo[] veiculos, int totalVeiculos, String chaveAtualizacao, Scanner scanner) {
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chaveAtualizacao) || veiculo.getPlaca().equals(chaveAtualizacao)) {
                System.out.println("Digite o novo número do chassi:");
                String novoChassi = scanner.nextLine();
                System.out.println("Digite a nova placa:");
                String novaPlaca = scanner.nextLine();
                System.out.println("Digite a nova marca:");
                String novaMarca = scanner.nextLine();
                System.out.println("Digite o novo modelo:");
                String novoModelo = scanner.nextLine();
                System.out.println("Digite o novo ano:");
                int novoAno = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                veiculo = new Veiculo(novoChassi, novaPlaca, novaMarca, novoModelo, novoAno);
                veiculos[i] = veiculo;
                System.out.println("Veículo atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    public static void excluirVeiculo(Veiculo[] veiculos, int totalVeiculos, String chaveExclusao) {
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chaveExclusao) || veiculo.getPlaca().equals(chaveExclusao)) {
                for (int j = i; j < totalVeiculos - 1; j++) {
                    veiculos[j] = veiculos[j + 1];
                }
                veiculos[totalVeiculos - 1] = null;
                totalVeiculos--;
                System.out.println("Veículo excluído com sucesso.");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    
    public static void imprimirVeiculos(Veiculo[] veiculos, int totalVeiculos) {
        System.out.println("Lista de veículos cadastrados:");
        for (int i = 0; i < totalVeiculos; i++) {
            Veiculo veiculo = veiculos[i];
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Chassi: " + veiculo.getNumeroChassi());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());
        }
    }
}
