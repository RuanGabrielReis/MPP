/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;



/**
 *
 * @author aluno
 */
public class Gerente extends Empregado {

    public Gerente() {
    }
    
    public Gerente(String nome, int tempo) {
        super(nome,tempo);
    }

    @Override
    public void calcularSalario() {
        double salarioBase = 15000;
        
        if (getTempo() >= 5) {
            salarioBase = salarioBase * 1.2;
        }
        
        this.salario = salarioBase;
    }
    
}
