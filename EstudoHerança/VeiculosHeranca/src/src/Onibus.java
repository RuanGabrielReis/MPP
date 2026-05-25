package src;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Onibus extends Veiculo{
    private int qtdePassageiros;

    public Onibus(String nome, String fabricante, double precoVenda, int qtdePssageiros) {
        super(nome, fabricante, precoVenda);
        this.qtdePassageiros = qtdePassageiros;
    }

    public Onibus() {
        super();
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public String toString() {
        return "Onibus";
    }

    @Override
    public double calcularIPVA() {
        return getPrecoVenda() * 0.015; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
