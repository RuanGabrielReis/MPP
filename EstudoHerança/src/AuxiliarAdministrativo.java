public class AuxiliarAdministrativo  extends Funcionario{

    public AuxiliarAdministrativo() {
    super();
    }

    public AuxiliarAdministrativo(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        double reajuste = getSalario() * 10/100;
        double novoSalario = getSalario() +reajuste;
        
        setSalario(novoSalario);
    }

    @Override
    public String toString() {
        String resposta = String.format("Aux. Adm. %d - %s - %.2f", getMatricula(), getNome(), getSalario());
                
        return resposta;
    }
    
    
    
}
