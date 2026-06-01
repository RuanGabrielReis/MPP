public class Pinguim extends Animal{

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
    String msg = String.format("O pinguim %s faz Kakakakaka!", getNome());
        System.out.println(msg);
    }
    
}
