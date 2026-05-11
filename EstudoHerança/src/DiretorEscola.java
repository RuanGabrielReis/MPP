public class DiretorEscola extends Professor{

    public DiretorEscola() {
        super();
    }

    public DiretorEscola(int matricula, String nome, int cargaHoraria) {
        super(matricula, nome, cargaHoraria);
    }

    @Override
    public String toString() {
        String resposta = String.format("Dir. Esc. %d - %s - %.2f - %d", getMatricula(), getNome(), getSalario(), getCargaHoraria());
                
        return resposta;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        
        double salarioTemp = getSalario() * 1.5 + 2500;
        
        setSalario(salarioTemp);
    }
    
    
    
}
