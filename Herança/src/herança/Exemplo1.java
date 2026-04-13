/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança;

/**
 *
 * @author aluno
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supervisor objeto = new Supervisor();
        
        objeto.setNome("Danilo");
        objeto.setTempo(10);
        objeto.calcularSalario();
        
        System.out.println("O salário é " + objeto.getSalario());
    
        Gerente objeto2 = new Gerente("Helena",4);
        objeto2.calcularSalario();
        
        System.out.println("O salário do gerente é " + objeto2.getSalario());
    }
    
}
