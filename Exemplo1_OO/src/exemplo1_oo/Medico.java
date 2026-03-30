package exemplo1_oo;

import java.util.logging.Logger;

public class Medico {
    private String nome;
    private double valorConsulta;
    private int qttConsulta;
    private double salario;

    public Medico() {
        nome = "";
        valorConsulta = 0;
        qttConsulta=0;
        salario = 0;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getQttConsulta() {
        return qttConsulta;
    }

    public void setQttConsulta(int qttConsulta) {
        this.qttConsulta = qttConsulta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        salario = valorConsulta*qttConsulta;
    }
}
