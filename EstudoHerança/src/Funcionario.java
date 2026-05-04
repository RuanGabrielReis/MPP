public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public Funcionario() {
        matricula = 0;
        nome = "";
        salario = 0;
    }

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario() {
        setSalario(2000.00);
    }
}
