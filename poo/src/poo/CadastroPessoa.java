package poo;

public class CadastroPessoa {
	    private PessoaFisica[] pessoasFisicas;
	    private PessoaJuridica[] pessoasJuridicas;
	    private int totalPessoasFisicas;
	    private int totalPessoasJuridicas;


	    public CadastroPessoa(int capacidadePessoasFisicas, int capacidadePessoasJuridicas) {
	        pessoasFisicas = new PessoaFisica[capacidadePessoasFisicas];
	        pessoasJuridicas = new PessoaJuridica[capacidadePessoasJuridicas];
	        totalPessoasFisicas = 0;
	        totalPessoasJuridicas = 0;
	    }
	    
	    public void cadastrarPessoaFisica(String nome, String CPF) {
	        if (totalPessoasFisicas < pessoasFisicas.length) {
	            pessoasFisicas[totalPessoasFisicas] = new PessoaFisica(nome, CPF);
	            totalPessoasFisicas++;
	            System.out.println("Pessoa física cadastrada com sucesso.");
	        } else {
	            System.out.println("Capacidade máxima de pessoas físicas atingida.");
	        }
	    }

	    public void cadastrarPessoaJuridica(String nome, String CNPJ) {
	        if (totalPessoasJuridicas < pessoasJuridicas.length) {
	            pessoasJuridicas[totalPessoasJuridicas] = new PessoaJuridica(nome, CNPJ);
	            totalPessoasJuridicas++;
	            System.out.println("Pessoa jurídica cadastrada com sucesso.");
	        } else {
	            System.out.println("Capacidade máxima de pessoas jurídicas atingida.");
	        }
	    }

	    public void imprimirTodos() {
	        System.out.println("Pessoas Físicas:");
	        for (int i = 0; i < totalPessoasFisicas; i++) {
	            System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCPF());
	        }
	        System.out.println("\nPessoas Jurídicas:");
	        for (int i = 0; i < totalPessoasJuridicas; i++) {
	            System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCNPJ());
	        }
	    }

	   
	    public void imprimirPessoasFisicas() {
	        System.out.println("Pessoas Físicas:");
	        for (int i = 0; i < totalPessoasFisicas; i++) {
	            System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCPF());
	        }
	    }

	 
	    public void imprimirPessoasJuridicas() {
	        System.out.println("Pessoas Jurídicas:");
	        for (int i = 0; i < totalPessoasJuridicas; i++) {
	            System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCNPJ());
	        }
	    }

	    public void pesquisar(String documento) {
	        boolean encontrado = false;
	        for (int i = 0; i < totalPessoasFisicas; i++) {
	            if (pessoasFisicas[i].getCPF().equals(documento)) {
	                System.out.println("Pessoa física encontrada:");
	                System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCPF());
	                encontrado = true;
	            }
	        }
	        for (int i = 0; i < totalPessoasJuridicas; i++) {
	            if (pessoasJuridicas[i].getCNPJ().equals(documento)) {
	                System.out.println("Pessoa jurídica encontrada:");
	                System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCNPJ());
	                encontrado = true;
	            }
	        }
	        if (!encontrado) {
	            System.out.println("Documento não encontrado.");
	        }
	    }

	   
	    public void atualizar(String documento, String novoNome) {
	        for (int i = 0; i < totalPessoasFisicas; i++) {
	            if (pessoasFisicas[i].getCPF().equals(documento)) {
	                pessoasFisicas[i].setNome(novoNome);
	                System.out.println("Pessoa física atualizada com sucesso.");
	                return;
	            }
	        }
	        for (int i = 0; i < totalPessoasJuridicas; i++) {
	            if (pessoasJuridicas[i].getCNPJ().equals(documento)) {
	                pessoasJuridicas[i].setNome(novoNome);
	                System.out.println("Pessoa jurídica atualizada com sucesso.");
	                return;
	            }
	        }
	        System.out.println("Documento não encontrado.");
	    }

	    public void excluir(String documento) {
	        for (int i = 0; i < totalPessoasFisicas; i++) {
	            if (pessoasFisicas[i].getCPF().equals(documento)) {
	                for (int j = i; j < totalPessoasFisicas - 1; j++) {
	                    pessoasFisicas[j] = pessoasFisicas[j + 1];
	                }
	                pessoasFisicas[totalPessoasFisicas - 1] = null;
	                totalPessoasFisicas--;
	                System.out.println("Pessoa física excluída com sucesso.");
	                return;
	            }
	        }
	        for (int i = 0; i < totalPessoasJuridicas; i++) {
	            if (pessoasJuridicas[i].getCNPJ().equals(documento)) {
	                for (int j = i; j < totalPessoasJuridicas - 1; j++) {
	                    pessoasJuridicas[j] = pessoasJuridicas[j + 1];
	                }
	                pessoasJuridicas[totalPessoasJuridicas - 1] = null;
	                totalPessoasJuridicas--;
	                System.out.println("Pessoa jurídica excluída com sucesso.");
	                return;
	            }
	        }
	        System.out.println("Documento não encontrado.");
	    }
}
