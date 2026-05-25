package src;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Motocicleta extends Veiculo{
    private int cilindradas;

    public Motocicleta(String nome, String fabricante, double precoVenda, int cilindradas) {
        super(nome, fabricante, precoVenda);
        this.cilindradas = cilindradas;
    }

    public Motocicleta() {
        super();
        cilindradas = 0;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIPVA() {
        return getPrecoVenda() * 0.02;
    }

    @Override
    public String toString() {
        return "Motocicleta";
    }
}
