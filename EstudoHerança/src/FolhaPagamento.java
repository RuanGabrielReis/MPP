import java.util.List;
import java.util.ArrayList;

public class FolhaPagamento {
    private List<Funcionario> listaFuncionarios;

    public FolhaPagamento() {
        listaFuncionarios = new ArrayList<Funcionario>();
    }
    
    public void adicionarFuncionario(Funcionario novo){
        listaFuncionarios.add(novo);
    }
    
    public void exibirFuncionarios() {
        for (Funcionario func : listaFuncionarios) {
            func.calcularSalario();
            System.out.println(func);
        }
    }
    
    public double calcularTotalSalarios() {
        double total = 0;
        for (Funcionario func: listaFuncionarios){
            func.calcularSalario();
            total = total + func.getSalario();
        }
        return total;
    }
}
