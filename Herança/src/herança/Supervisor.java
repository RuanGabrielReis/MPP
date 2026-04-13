/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;



/**
 *
 * @author aluno
 */
public class Supervisor extends Empregado {

    public Supervisor() {
    }
    
    public Supervisor(String nome, int tempo) {
        super(nome,tempo);
    }

    @Override
    public void calcularSalario() {
        double salarioBase = 10000;
        
        if (getTempo() >= 5) {
            salarioBase = salarioBase * 1.2;
        }
        
        this.salario = salarioBase;
    }
    
}
