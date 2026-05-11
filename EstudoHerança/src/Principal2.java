public class Principal2 {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        
        folha.adicionarFuncionario(new AuxiliarAdministrativo(1001,"Marcelo"));
        folha.adicionarFuncionario(new DiretorServico(1002,"Danilo"));
        folha.adicionarFuncionario(new Professor(1003,"Joao",40));
        folha.adicionarFuncionario(new Coordenador(5,1004,"Luiz",20));
        folha.adicionarFuncionario(new DiretorEscola(1005,"Victor",20));
        
        System.out.println(String.format("O valor total da folha de pagamento é %.2f",folha.calcularTotalSalarios()));
    
        System.out.println("\nAbaixo serão exibidos os funcionarios:");
        folha.exibirFuncionarios();
    }
    
}
