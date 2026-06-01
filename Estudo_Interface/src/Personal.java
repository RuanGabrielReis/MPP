public class Personal implements FolhaPagamento{
    private String nome;
    private String cref;

    public Personal(String nome, String cref) {
        this.nome = nome;
        this.cref = cref;
    }

    @Override
    public String toString() {
        return "Nome: " +nome + ". CREF: "+cref;
    }

    @Override
    public double calcularSalario() {
        return 1800.00;
    }
    
    
}
