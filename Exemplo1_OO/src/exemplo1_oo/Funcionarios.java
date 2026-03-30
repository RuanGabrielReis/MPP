package exemplo1_oo;

import java.util.logging.Logger;

public class Funcionarios {
    private String nome;
    private double salarioBruto;
    private double valorINSS;
    private double salarioLiquido;

    public Funcionarios() {
        nome = "";
        salarioBruto = 0;
        valorINSS=0;
        salarioLiquido = 0;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getValorINSS() {
        return valorINSS;
    }

    public void setValorINSS(double valorINSS) {
        this.valorINSS = valorINSS;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
   
    public void calcularSalarioLiquido() {
        valorINSS = salarioBruto*0.08;
        salarioLiquido = salarioBruto-valorINSS;
    }
}
