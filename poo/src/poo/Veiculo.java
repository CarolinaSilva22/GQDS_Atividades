package poo;
import java.util.Scanner;

class Veiculo {
    private String numeroChassi;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getNumeroChassi() {
        return numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
