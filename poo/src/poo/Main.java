package poo;

import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Informe a capacidade máxima de pessoas físicas:");
	        int capacidadePessoasFisicas = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("Informe a capacidade máxima de pessoas jurídicas:");
	        int capacidadePessoasJuridicas = scanner.nextInt();
	        scanner.nextLine(); 

	        CadastroPessoa cadastro = new CadastroPessoa(capacidadePessoasFisicas, capacidadePessoasJuridicas);

	        while (true) {
	            System.out.println("\nSelecione uma opção:");
	            System.out.println("1. Cadastrar pessoa física");
	            System.out.println("2. Cadastrar pessoa jurídica");
	            System.out.println("3. Imprimir todas as pessoas");
	            System.out.println("4. Imprimir apenas pessoas físicas");
	            System.out.println("5. Imprimir apenas pessoas jurídicas");
	            System.out.println("6. Pesquisar por CPF ou CNPJ");
	            System.out.println("7. Atualizar por CPF ou CNPJ");
	            System.out.println("8. Excluir por CPF ou CNPJ");
	            System.out.println("9. Sair");

	            int opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Informe o nome da pessoa física:");
	                    String nomePF = scanner.nextLine();
	                    System.out.println("Informe o CPF:");
	                    String cpf = scanner.nextLine();
	                    cadastro.cadastrarPessoaFisica(nomePF, cpf);
	                    break;
	                case 2:
	                    System.out.println("Informe o nome da pessoa jurídica:");
	                    String nomePJ = scanner.nextLine();
	                    System.out.println("Informe o CNPJ:");
	                    String cnpj = scanner.nextLine();
	                    cadastro.cadastrarPessoaJuridica(nomePJ, cnpj);
	                    break;
	                case 3:
	                    cadastro.imprimirTodos();
	                    break;
	                case 4:
	                    cadastro.imprimirPessoasFisicas();
	                    break;
	                case 5:
	                    cadastro.imprimirPessoasJuridicas();
	                    break;
	                case 6:
	                    System.out.println("Informe o CPF ou CNPJ a ser pesquisado:");
	                    String documento = scanner.nextLine();
	                    cadastro.pesquisar(documento);
	                    break;
	                case 7:
	                    System.out.println("Informe o CPF ou CNPJ a ser atualizado:");
	                    String documentoAtualizacao = scanner.nextLine();
	                    System.out.println("Informe o novo nome:");
	                    String novoNome = scanner.nextLine();
	                    cadastro.atualizar(documentoAtualizacao, novoNome);
	                    break;
	                case 8:
	                    System.out.println("Informe o CPF ou CNPJ a ser excluído:");
	                    String documentoExclusao = scanner.nextLine();
	                    cadastro.excluir(documentoExclusao);
	                    break;
	                case 9:
	                    System.out.println("Encerrando o programa...");
	                    System.exit(0);
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }
	}
}
