/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author aluno
 */
public class Veiculo {
    private String nome;
    private String fabricante;
    private double precoVenda;

    public Veiculo(String nome, String fabricante, double precoVenda) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.precoVenda = precoVenda;
    }

    public Veiculo() {
        nome = "";
        fabricante = "";
        precoVenda = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Veiculo";
    }
        
    public double calcularIPVA() {
        return getPrecoVenda() * 0.1;
    }
}
