public class Professor extends Funcionario{

    private int cargaHoraria;
    
    public Professor() {
        super();
    }

    public Professor(int matricula, String nome, int cargaHoraria) {
        super(matricula, nome);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        double salarioTemp = getCargaHoraria()*50*4.5;
        
        setSalario(salarioTemp);
    }

    @Override
    public String toString() {
        String resposta = String.format("Aux. Adm. %d - %s - %.2f - %d", getMatricula(), getNome(), getSalario(), getCargaHoraria());
                
        return resposta;
    }
    
    
    
}
