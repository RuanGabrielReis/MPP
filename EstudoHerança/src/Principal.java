public class Principal {
    public static void main(String[] args) {
        AuxiliarAdministrativo func1 = new AuxiliarAdministrativo();
        
        func1.setMatricula(1001);
        func1.setNome("João Geraldo");
        func1.calcularSalario();
        
        System.out.println(func1);
        
        AuxiliarAdministrativo func2 = new AuxiliarAdministrativo(1002,"Victor Hugo");
        func2.calcularSalario();
        System.out.println(func2);
        
        Professor func3 = new Professor(1003,"Ruan", 20);
        func3.calcularSalario();
        System.out.println(func3);  
        
        DiretorServico func4 = new DiretorServico(1004,"Miguel");
        func4.calcularSalario();
        System.out.println(func4); 
        
        DiretorEscola func5 = new DiretorEscola(1005,"Miguel",20);
        func5.calcularSalario();
        System.out.println(func5); 
        
        Coordenador func6 = new Coordenador(10,1005,"Danilo",20);
        func6.calcularSalario();
        System.out.println(func6); 
    }
    
}
