package poo;
import java.util.Scanner;


	class PessoaFisica {
	    private String nome;
	    private String CPF;

	    public PessoaFisica(String nome, String CPF) {
	        this.nome = nome;
	        this.CPF = CPF;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCPF() {
	        return CPF;
	    }

	    public void setCPF(String CPF) {
	        this.CPF = CPF;
	    }
	}


