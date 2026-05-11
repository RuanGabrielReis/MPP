public class DiretorServico extends AuxiliarAdministrativo{
    
    public DiretorServico() {
    super();
    }

    public DiretorServico(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        double reajuste = getSalario() * 0.5;
        double novoSalario = getSalario() +reajuste;
        
        setSalario(novoSalario);
    }

    @Override
    public String toString() {
        String resposta = String.format("Dir. Ser. %d - %s - %.2f", getMatricula(), getNome(), getSalario());
                
        return resposta;
    }
}
