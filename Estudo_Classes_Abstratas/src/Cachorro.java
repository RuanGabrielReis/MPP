public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
    String msg = String.format("O cachorro %s faz Au Au!", getNome());
        System.out.println(msg);
    }
    
}
