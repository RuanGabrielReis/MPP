public class Coordenador extends Professor{
    private int qtdTurmas;

    public Coordenador() {
        super();
    }

    public Coordenador(int qtdTurmas, int matricula, String nome, int cargaHoraria) {
        super(matricula, nome, cargaHoraria);
        this.qtdTurmas = qtdTurmas;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    @Override
    public String toString() {
        String resposta = String.format("Coord. %d - %s - %.2f - %d - %d turmas", getMatricula(), getNome(), getSalario(), getCargaHoraria(), getQtdTurmas());
                
        return resposta; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        double salarioTemp = getSalario()+(getQtdTurmas()*150);
        
        setSalario(salarioTemp);
    }
    
    
}
