/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author aluno
 */
public class Empregado {
    private String nome;
    private int tempo;
    protected double salario;

    public Empregado(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        this.salario = 0;
    }

    public Empregado() {
        this.nome = "";
        this.tempo = 0;
        this.salario = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularSalario() {
        
    }
}
